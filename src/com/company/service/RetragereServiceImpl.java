package com.company.service;

import com.company.dto.ContClient;
import com.company.exception.NotEnoughMoneyException;
import com.company.repository.RetragereRepository;
import com.company.repository.RetragereRepositoryImpl;



public class RetragereServiceImpl implements RetragereService {

    RetragereRepository retragereRepository;

    public RetragereServiceImpl() {

        retragereRepository = new RetragereRepositoryImpl();
    }


    public void retragere(ContClient contClient) throws NotEnoughMoneyException {

        retragereRepository.retragere(contClient);
    }


}
