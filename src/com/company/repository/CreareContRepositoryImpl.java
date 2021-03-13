package com.company.repository;

import com.company.dto.ContClient;
import java.util.UUID;



public class CreareContRepositoryImpl implements CreareContRepository {


    public void creareCont(ContClient contClient) {

        contClient.setClientId(UUID.randomUUID());
        contClient.setCodPin("0000");
        contClient.setContCreat(true);
        contClient.setSoldClient(0);
    }
}
