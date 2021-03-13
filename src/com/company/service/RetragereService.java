package com.company.service;

import com.company.dto.ContClient;
import com.company.exception.NotEnoughMoneyException;


public interface RetragereService {

    void  retragere(ContClient contClient) throws NotEnoughMoneyException;
}
