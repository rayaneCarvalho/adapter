package org.example;

public class AvaliacaoAdapter extends AvaliacaoProva implements Observer {
    private IAvaliacao avaliacaoTipo;

    public AvaliacaoAdapter(IAvaliacao avaliacaoTipo) {
        this.avaliacaoTipo = avaliacaoTipo;
    }

    @Override
    public void atualizar(String tipoProva) {
        avaliacaoTipo.setTipoProva(tipoProva);
    }

    public String recuperarAvaliacao() {
        String tipoProva = avaliacaoTipo.getTipoProva();
        switch (tipoProva) {
            case "Fluência":
                return "A";
            case "Lançamento de Resposta":
                return "B";
            case "Prova Digital":
                return "C";
            case "Prova Impressa":
                return "D";
            default:
                return "D"; // Padrão
        }
    }
}




