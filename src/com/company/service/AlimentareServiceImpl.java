package com.company.service;

import com.company.dto.ContClient;
import com.company.repository.AlimentareRepository;
import com.company.repository.AlimentareRepositoryImpl;



public class AlimentareServiceImpl implements AlimentareService {

    AlimentareRepository alimentareRepository;
    ContClient contClient;

    public AlimentareServiceImpl() {
        alimentareRepository = new AlimentareRepositoryImpl();
    }


    public void alimentare(ContClient contClient) {

        alimentareRepository.alimentare(contClient);

    }
}
