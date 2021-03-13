package com.company.repository;

import com.company.dto.ContClient;
import com.company.exception.WrongPinException;
import com.company.utils.ReadPinUtil;
import com.company.utils.ScannerWrapper;


public class SchimbarePinRepositoryImpl implements SchimbarePinRepository {

    boolean pin = true;
    String codPinUtilizator;


    public void schimbarePin(ContClient contClient) {

        try {
            ReadPinUtil.introducerePin(contClient);
        } catch (WrongPinException wrongPinException) {
            pin = false;
            wrongPinException.getMessage();
        }

        contClient.istoric.add("Schimbare PIN");

        if (pin) {
            System.out.println("Introduceti noul cod PIN: ");
            codPinUtilizator = ScannerWrapper.next();
            contClient.setCodPin(codPinUtilizator);
            System.out.println("Codul PIN a fost schimbat cu succes!\n");
        }
    }
}



