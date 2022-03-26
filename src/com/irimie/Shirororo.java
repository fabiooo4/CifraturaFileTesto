package com.irimie;

import java.io.*;

public class Shirororo {
    // Attributi
    private String fileLettura = "Cesare.txt";
    private String fileScrittura = "Cifrato.txt";

    // Costruttore
    public Shirororo(String fileLettura, String fileScrittura) {
        this.fileLettura = fileLettura;
        this.fileScrittura = fileScrittura;
    }

    // Getter e Setter
    public String getFileLettura() {
        return fileLettura;
    }

    public void setFileLettura(String fileLettura) {
        this.fileLettura = fileLettura;
    }

    public String getFileScrittura() {
        return fileScrittura;
    }

    public void setFileScrittura(String fileScrittura) {
        this.fileScrittura = fileScrittura;
    }

    // Metodi

    //A Java Program to illustrate Caesar Cipher Technique
    // Encrypts text using a shift od s
    public void encrypt() throws IOException
    {

        BufferedReader reader = new BufferedReader(new FileReader(this.fileLettura));
        PrintWriter writer = new PrintWriter(new FileWriter(this.fileScrittura, false));

        String line;

        while((line = reader.readLine()) != null) {

            String[] t = line.split("/");

            String text = t[0];
            int offset = Integer.parseInt(t[1]);

            StringBuilder result = new StringBuilder();
            for (char character : text.toCharArray()) {
                if (character != ' ') {
                    int originalAlphabetPosition = character - 'a';
                    int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
                    char newCharacter = (char) ('a' + newAlphabetPosition);
                    result.append(newCharacter);
                } else {
                    result.append(character);
                }
            }

            writer.println(result);
        }
        writer.close();
        reader.close();
    }
}
