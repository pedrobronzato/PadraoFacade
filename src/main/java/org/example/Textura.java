package org.example;

public class Textura extends MontagemFase {
    private static Textura textura = new Textura();

    public Textura() {};

    public static Textura getInstance(){ return textura; }
}
