package org.example.conversor;

public class Gerenciamento {

    private IConversorMidia conversor;

    public Gerenciamento(IConversorMidia conversor) {
        this.conversor = conversor;
    }

    public void setArquivo(String nomeArquivo) {
        conversor.converter(nomeArquivo);
    }

    public String getNomeArquivo() {
        return conversor.getNomeArquivo();
    }
}
