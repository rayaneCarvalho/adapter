package org.example;

import java.util.List;
import java.util.ArrayList;

public class MonitorDeProva implements Subject {
    private List<Observer> observadores;
    private String tipoProva;

    public MonitorDeProva() {
        this.observadores = new ArrayList<>();
    }

    public void setTipoProva(String tipoProva) {
        this.tipoProva = tipoProva;
        notificarObservadores();
    }

    @Override
    public void registrarObservador(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.atualizar(tipoProva);
        }
    }
}


