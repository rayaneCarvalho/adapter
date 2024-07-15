package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AvaliacaoAdapterTest {

    @Test
    void deveAtualizarAvaliacaoBaseadoNoTipoProva() {
        AvaliacaoTipo avaliacaoTipo = new AvaliacaoTipo();
        AvaliacaoAdapter adapter = new AvaliacaoAdapter(avaliacaoTipo);

        MonitorDeProva monitor = new MonitorDeProva();
        monitor.registrarObservador(adapter);

        monitor.setTipoProva("Fluência");
        assertEquals("A", avaliacaoTipo.getTipoProva());

        monitor.setTipoProva("Lançamento de Resposta");
        assertEquals("B", avaliacaoTipo.getTipoProva());

        monitor.setTipoProva("Prova Digital");
        assertEquals("C", avaliacaoTipo.getTipoProva());

        monitor.setTipoProva("Prova Impressa");
        assertEquals("D", avaliacaoTipo.getTipoProva());
    }
}
