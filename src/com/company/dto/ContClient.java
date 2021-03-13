package com.company.dto;

import com.company.repository.TranzactiiRepository;
import java.util.*;


public class ContClient {

    public Map<UUID, TranzactiiRepository> tranzactieMap = new HashMap<>();
    public List<String> istoric = new ArrayList<>();

    private String codPin;
    private UUID clientId;
    private float soldClient;
    boolean contCreat = false;


    public void setCodPin(String codPin) {
        this.codPin = codPin;
    }

    public String getCodPin() {
        return codPin;
    }

    public UUID getClientId() {
        return clientId;
    }

    public void setClientId(UUID clientId) {
        this.clientId = clientId;
    }

    public float getSoldClient() {
        return soldClient;
    }

    public void setSoldClient(float soldClient) {
        this.soldClient = soldClient;
    }

    public void setContCreat(boolean contCreat) {
        this.contCreat = contCreat;
    }


    public void afisareTranzactii() {

        for (Map.Entry<UUID, TranzactiiRepository> en : tranzactieMap.entrySet()) {
            System.out.print("UUID: ");
            System.out.print(en.getKey());
            System.out.print(en.getValue());
            System.out.print("\n");
        }
    }
}
