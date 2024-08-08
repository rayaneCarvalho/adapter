package org.example.conversor;

import org.example.conversor.ArquivoMidia;
import org.example.conversor.ConversorVhsAdapter;
import org.example.conversor.Gerenciamento;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GerenciamentoTest {

    @Test
    void deveConverterArquivoVHSParaMP4() {
        ArquivoMidia arquivoMidia = new ArquivoMidia("video.vhs");
        ConversorVhsAdapter adaptador = new ConversorVhsAdapter(arquivoMidia);
        Gerenciamento gerenciamento = new Gerenciamento(adaptador);

        gerenciamento.setArquivo("video.vhs");

        assertEquals("video.mp4", gerenciamento.getNomeArquivo());
    }

    @Test
    void naoDeveConverterArquivoNaoVHS() {
        ArquivoMidia arquivoMidia = new ArquivoMidia("musica.mp3");
        ConversorVhsAdapter adaptador = new ConversorVhsAdapter(arquivoMidia);
        Gerenciamento gerenciamento = new Gerenciamento(adaptador);

        gerenciamento.setArquivo("musica.mp3");

        assertEquals("musica.mp3", gerenciamento.getNomeArquivo());
    }
}
