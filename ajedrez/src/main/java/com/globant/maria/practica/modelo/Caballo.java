package com.globant.maria.practica.modelo;

public class Caballo extends Pieza {
    public Caballo(Color color, Casilla posicion) {
        super(color, posicion);
    }
    
    @Override
    public boolean esMovimientoValido(Casilla destino) {
        int difFila = Math.abs(destino.getFila() - getPosicion().getFila());
        int difColumna = Math.abs(destino.getColumna() - getPosicion().getColumna());

        // Movimiento en forma de "L"
        if ((difFila == 2 && difColumna == 1) || (difFila == 1 && difColumna == 2)) {
            return true;
        }

        return false;
    }
}

