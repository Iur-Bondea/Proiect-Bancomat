package com.company.exception;


public class NotEnoughMoneyException extends Exception {

    public NotEnoughMoneyException() {
        super("Sold insuficient!!\n\n");
    }
}
