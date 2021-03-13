package com.company.repository;

import com.company.dto.ContClient;


public class TranzactiiRepositoryImpl implements TranzactiiRepository {


    float soldInainte;
    float soldDupa;
    float diferenta;
    String tipulTranzactiei;
    boolean tranzactieReusita;


    public TranzactiiRepositoryImpl(float soldInainte, float soldDupa, float diferenta, String tipulTranzactiei, boolean tranzactieReusita) {

        this.soldInainte = soldInainte;
        this.soldDupa = soldDupa;
        this.diferenta = diferenta;
        this.tipulTranzactiei = tipulTranzactiei;
        this.tranzactieReusita = tranzactieReusita;
    }

    public TranzactiiRepositoryImpl() {// o sa am nevoie de acest constructor gol

    }

    @Override
    public String toString() {
        return " TranzactiiRepositoryImpl{" + "soldInainte=" + soldInainte + ", soldDupa=" + soldDupa + ", diferenta=" + diferenta + ", tipulTranzactiei='" + tipulTranzactiei + '\'' + ", tranzactieReusita=" + tranzactieReusita + '}';
    }

    @Override
    public void tranzactii(ContClient contClient) {// trebuie implementata metoda

    }
}
