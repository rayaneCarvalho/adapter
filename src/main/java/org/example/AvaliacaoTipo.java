package org.example;

public class AvaliacaoTipo implements IAvaliacao {
    private String tipoProva;

    @Override
    public String getTipoProva() {
        return this.tipoProva;
    }

    @Override
    public void setTipoProva(String tipoProva) {
        this.tipoProva = tipoProva;
    }
}

