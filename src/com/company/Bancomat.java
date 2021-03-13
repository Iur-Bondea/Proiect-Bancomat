package com.company;



import com.company.controller.ContController;
import com.company.controller.ContControllerImpl;
import com.company.dto.ContClient;

import java.util.Scanner;


public class Bancomat {


    ContController contController = new ContControllerImpl();
    ContClient contClient = new ContClient();


    public void startBancomat() {

        contController.creareCont(contClient); // acesta va seta codul PIN la "0000" si va seta soldClient la 0, acesta va fi creat o singura data

        Scanner alegere = new Scanner(System.in);
        String alegereaFacuta;

        do {

              System.out.printf("Te rugam sa alegi una din urmatoarele optiuni: \n" +
                                "Pentru alimentare tasteaza:  alimentare \n" +
                                "Pentru retaregere tasteaza: retragere \n" +
                                "Pentru schimbare PIN tasteaza : schimbarePIN \n" +
                                "Pentru istoric tasteaza : istoric \n" +
                                "Pentru tranzactii tasteaza : tranzactii \n" +
                                "Pentru oprire tasteaza : stop \n");

            alegereaFacuta = alegere.next();

            if (alegereaFacuta.equals("alimentare")) {
                contController.alimentare(contClient);
            } else if (alegereaFacuta.equals("retragere")) {
                contController.retragere(contClient);
            } else if (alegereaFacuta.equals(("schimbarePIN")))
                contController.schimbarePin(contClient);
            else if (alegereaFacuta.equals("istoric"))
                System.out.println(contClient.istoric);
            else if (alegereaFacuta.equals("tranzactii")) {
                contController.tranzactii(contClient);
            } else {
                alegereaFacuta = "stop";
            }
        } while (!alegereaFacuta.equals("stop"));
    }
}
