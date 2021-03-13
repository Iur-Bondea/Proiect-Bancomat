package com.company.controller;

import com.company.dto.ContClient;


public interface ContController {

    void creareCont(ContClient contClient);

    void retragere(ContClient contClient);

    void alimentare(ContClient contClient);

    void schimbarePin(ContClient contClient);

    void tranzactii(ContClient contClient);


}
