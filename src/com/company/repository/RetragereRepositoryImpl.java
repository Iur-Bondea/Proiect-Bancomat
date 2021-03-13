package com.company.repository;

import com.company.dto.ContClient;
import com.company.exception.NotEnoughMoneyException;
import com.company.exception.WrongPinException;
import com.company.utils.ReadPinUtil;
import com.company.utils.ScannerWrapper;
import java.util.UUID;


public class RetragereRepositoryImpl implements RetragereRepository {

    float sumaCerutaDeUtilizator;
    TranzactiiRepository tranzactiiRepository;


    public void retragere(ContClient contClient) throws NotEnoughMoneyException {

        boolean pin = true;
        float soldClient = contClient.getSoldClient();
        contClient.istoric.add("Retragere");
        String codPinUtilizator = "";

        try {
            ReadPinUtil.introducerePin(contClient);
        } catch (WrongPinException wrongPinException){
            pin = false;
            System.out.println(wrongPinException.getMessage());
        }


        if (pin == true) {

            System.out.println("Introduceti suma pe care doriti s-o extrageti: ");
            sumaCerutaDeUtilizator = ScannerWrapper.nextFloat();

            if (sumaCerutaDeUtilizator <= soldClient) {
                // diferenta va fi intre soldul initial - soldul dupa retragere

                soldClient -= sumaCerutaDeUtilizator;

                tranzactiiRepository = new TranzactiiRepositoryImpl(contClient.getSoldClient(), soldClient, sumaCerutaDeUtilizator, "Retragere", true);
                // mai sus obiectul tranzactii se va construii, in care am o metoda toString, iar aceste tranzactii vor fi puse in map
                contClient.tranzactieMap.put(UUID.randomUUID(), tranzactiiRepository);// adaugam obiectul construit
                contClient.setSoldClient(soldClient); // setam noul sold si in Cont Client, nu doar in tranzactii
                System.out.println("Operatiune aprobata, asteptati");
                System.out.printf("Ati extras : %.2f lei din cont, mai aveti %.2f lei in cont\n", sumaCerutaDeUtilizator, soldClient);

            } else {

                // inregistram tranzactia chiar daca nu am putut retrage vreo suma din cont
                tranzactiiRepository = new TranzactiiRepositoryImpl(soldClient, soldClient, 0, "Retragere", false);
                contClient.tranzactieMap.put(UUID.randomUUID(), tranzactiiRepository);
                throw new NotEnoughMoneyException(); // sold insuficient

            }

        } else { // in cazul in care pin-ul este gresit de 3 ori, o sa intregistram si tranzactia nereusita

            tranzactiiRepository = new TranzactiiRepositoryImpl(soldClient, soldClient, 0, "Retragere", false);
            contClient.tranzactieMap.put(UUID.randomUUID(), tranzactiiRepository);

        }
    }
}

