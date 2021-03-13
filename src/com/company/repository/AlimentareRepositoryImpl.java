package com.company.repository;

import com.company.dto.ContClient;
import com.company.utils.ScannerWrapper;
import java.util.UUID;


public class AlimentareRepositoryImpl implements AlimentareRepository {

    float sold;
    TranzactiiRepository tranzactiiRepository;


    public void alimentare() { // o sa am nevoie si de acest constructor gol

    }

    public void alimentare(ContClient contClient) {

        sold = contClient.getSoldClient();
        contClient.istoric.add("Alimentare");

        float soldAdaugare = 0.f;
        System.out.println("Introduceti suma pe care doriti s-o adaugati: ");
        soldAdaugare = ScannerWrapper.nextFloat();

        contClient.setSoldClient(sold + soldAdaugare);

        tranzactiiRepository = new TranzactiiRepositoryImpl(sold, sold + soldAdaugare, soldAdaugare, "Alimentare", true);
        contClient.tranzactieMap.put(UUID.randomUUID(), tranzactiiRepository);
        System.out.printf("Soldul adaugat de dvs este: %.2f, iar soldul total este: %.2f \n", soldAdaugare, contClient.getSoldClient());
    }
}

