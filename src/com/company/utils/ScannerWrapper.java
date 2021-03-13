package com.company.utils;
import java.util.Scanner;


public class ScannerWrapper {

   private   static Scanner scanner = new Scanner(System.in);

    public static String next() {
        return scanner.next();
    }

    public static float nextFloat() {
        return scanner.nextFloat();
    }


}
