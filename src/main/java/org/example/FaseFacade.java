package org.example;

public class FaseFacade {
    public static boolean verificarCarregamento(Fase fase){

        if(Cenario.getInstance().verificarFaseComBug(fase)){
            return false;
        }
        if(Objeto.getInstance().verificarFaseComBug(fase)){
            return false;
        }
        if(Textura.getInstance().verificarFaseComBug(fase)){
            return false;
        }
        return true;
    }
}
