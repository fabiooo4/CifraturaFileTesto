package com.irimie;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Shirororo parola = new Shirororo("Cesare.txt", "Cifrato.txt");
        parola.encrypt();
    }
}
