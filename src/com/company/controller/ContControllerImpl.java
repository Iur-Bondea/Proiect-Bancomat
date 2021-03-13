package com.company.controller;

import com.company.dto.ContClient;
import com.company.exception.NotEnoughMoneyException;
import com.company.service.*;


public class ContControllerImpl implements ContController {


    private CreareContService creareContService;
    private RetragereService retragereService;
    private SchimbarePinService schimbarePinService;
    private AlimentareService alimentareService;
    private TranzactiiService tranzactiiService;


    public ContControllerImpl() {
        creareContService = new CreareContServiceImpl();
        retragereService = new RetragereServiceImpl();
        schimbarePinService = new SchimbarePinServiceImpl();
        alimentareService = new AlimentareServiceImpl();
        tranzactiiService = new TranzactiiServiceImpl();
    }


    public void creareCont(ContClient contClient) {
        creareContService.creareCont(contClient);
    }

    public void retragere(ContClient contClient) {  // prind exceptia in controller
        try {
            retragereService.retragere(contClient);
        } catch (NotEnoughMoneyException notEnoughMoneyException) {
            System.out.println(notEnoughMoneyException.getMessage());
        }
    }

    public void alimentare(ContClient contClient) {
        alimentareService.alimentare(contClient);
    }

    public void schimbarePin(ContClient contClient) {
        schimbarePinService.schimbarePin(contClient);
    }

    public void tranzactii(ContClient contClient) {
        tranzactiiService.tranzactii(contClient);
    }


}
