package org.example;

public class ExibidorDeTipoProva implements Observer {
    private String tipoProva;

    @Override
    public void atualizar(String tipoProva) {
        this.tipoProva = tipoProva;
        exibir();
    }

    public void exibir() {
        System.out.println("Tipo de prova atual: " + tipoProva);
    }
}


