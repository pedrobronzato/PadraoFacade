package org.example;

public class Objeto extends MontagemFase{
    private static Objeto objeto = new Objeto();

    public Objeto() {};

    public static Objeto getInstance(){ return objeto; }
}
