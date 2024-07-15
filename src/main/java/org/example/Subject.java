package org.example;

import java.util.List;
import java.util.ArrayList;

public interface Subject {
    void registrarObservador(Observer o);
    void removerObservador(Observer o);
    void notificarObservadores();
}


