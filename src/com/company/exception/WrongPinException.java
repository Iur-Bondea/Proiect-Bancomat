package com.company.exception;

public class WrongPinException extends Exception {

    public WrongPinException() {
        super ("Numarul de incercari s-a terminat, PIN gresit de 3 ori\n\n");
    }

}
