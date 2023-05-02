package org.example;

public class Cenario extends MontagemFase{
    private static Cenario cenario = new Cenario();

    public Cenario() {};

    public static Cenario getInstance(){ return cenario; }
}
