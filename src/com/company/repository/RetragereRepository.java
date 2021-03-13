package com.company.repository;

import com.company.dto.ContClient;
import com.company.exception.NotEnoughMoneyException;


public interface RetragereRepository {

    void  retragere(ContClient contClient) throws NotEnoughMoneyException;

}
