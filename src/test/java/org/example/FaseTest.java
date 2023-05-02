package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FaseTest {
    @Test
    void deveRetornarFalhaCarregamentoCenario() {
        Fase fase = new Fase();
        Cenario.getInstance().addFaseComBug(fase);

        assertEquals(false, fase.verificarCarregamento());
    }

    @Test
    void deveRetornarFalhaCarregamentoTexturas() {
        Fase fase = new Fase();
        Textura.getInstance().addFaseComBug(fase);

        assertEquals(false, fase.verificarCarregamento());
    }

    @Test
    void deveRetornarFalhaCarregamentoObjetos() {
        Fase fase = new Fase();
        Objeto.getInstance().addFaseComBug(fase);

        assertEquals(false, fase.verificarCarregamento());
    }

    @Test
    void deveRetornarFaseSemBugs() {
        Fase fase = new Fase();

        assertEquals(true, fase.verificarCarregamento());
    }
}