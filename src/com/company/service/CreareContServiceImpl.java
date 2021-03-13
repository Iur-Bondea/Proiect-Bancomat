package com.company.service;

import com.company.dto.ContClient;
import com.company.repository.CreareContRepository;
import com.company.repository.CreareContRepositoryImpl;



public class CreareContServiceImpl implements CreareContService {

    CreareContRepository creareContRepository;

    public CreareContServiceImpl() { creareContRepository = new CreareContRepositoryImpl(); }

    public void creareCont(ContClient contClient) {
      creareContRepository.creareCont(contClient);
    }
}
