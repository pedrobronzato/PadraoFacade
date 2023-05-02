package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class MontagemFase {
    private List<Fase> fasesComBug = new ArrayList<Fase>();

    public void addFaseComBug(Fase fase){ this.fasesComBug.add(fase); }

    public boolean verificarFaseComBug(Fase fase){ return this.fasesComBug.contains(fase); }
}
