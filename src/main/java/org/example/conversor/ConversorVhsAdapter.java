package org.example.conversor;

public class ConversorVhsAdapter implements IConversorMidia {

    private ArquivoMidia arquivoMidia;

    public ConversorVhsAdapter(ArquivoMidia arquivoMidia) {
        this.arquivoMidia = arquivoMidia;
    }

    @Override
    public void converter(String nomeArquivo) {
        if (nomeArquivo.endsWith(".vhs")) {
            arquivoMidia.setNomeArquivo(nomeArquivo.substring(0, nomeArquivo.length() - 4) + ".mp4");
        } else {
            arquivoMidia.setNomeArquivo(nomeArquivo);
        }
    }

    @Override
    public String getNomeArquivo() {
        return arquivoMidia.getNomeArquivo();
    }
}
