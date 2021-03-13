package com.company.service;

import com.company.dto.ContClient;


public class TranzactiiServiceImpl implements TranzactiiService {

    ContClient contClient;

    public TranzactiiServiceImpl() {
        contClient = new ContClient();
    }


    public void tranzactii(ContClient contClient) {

        contClient.istoric.add("Tranzactii");
        contClient.afisareTranzactii();
    }
}
