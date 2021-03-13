package com.company.service;

import com.company.dto.ContClient;
import com.company.repository.SchimbarePinRepository;
import com.company.repository.SchimbarePinRepositoryImpl;


public class SchimbarePinServiceImpl implements SchimbarePinService {

    SchimbarePinRepository schimbarePinRepository;

    public SchimbarePinServiceImpl() {

        schimbarePinRepository = new SchimbarePinRepositoryImpl();
    }

    public void schimbarePin(ContClient contClient) {

        schimbarePinRepository.schimbarePin(contClient);
    }

}
