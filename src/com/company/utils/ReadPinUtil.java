package com.company.utils;


import com.company.dto.ContClient;
import com.company.exception.WrongPinException;

public class ReadPinUtil {


    public static void introducerePin(ContClient contClient) throws WrongPinException {

        String codPinCorect = contClient.getCodPin();

        int nrIncercari = 2; // deoarece citim o data inainte de while
        System.out.println("Introduceti codul PIN: ");
        String codPinUtilizator = ScannerWrapper.next();

        while (nrIncercari > 0 && !codPinUtilizator.equals(codPinCorect)) {

            System.out.println("PIN gresit!"); // daca pun aici exceptia, voi iesi din while din prima data
            nrIncercari--;
            codPinUtilizator = ScannerWrapper.next();

        }
        if (!codPinUtilizator.equals(codPinCorect))
            throw new WrongPinException(); // am pus exceptia la sfarsit, daca utilizatorul greseste de 3 ori
    }
}