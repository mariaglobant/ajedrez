package com.globant.maria.practica.modelo;

public class Peon extends Pieza {
    public Peon(Color color, Casilla posicion) {
        super(color, posicion);
    }
    
    @Override
    public boolean esMovimientoValido(Casilla destino) {
        int difFila = Math.abs(destino.getFila() - getPosicion().getFila());
        int difColumna = Math.abs(destino.getColumna() - getPosicion().getColumna());

        if (getColor() == Color.BLANCO) {
            if (difFila == 1 && difColumna == 0 && destino.getFila() > getPosicion().getFila()) {
                return true;
            }
        } else {
            if (difFila == 1 && difColumna == 0 && destino.getFila() < getPosicion().getFila()) {
                return true;
            }
        }

        // Captura en diagonal
        if (difFila == 1 && difColumna == 1) {
            return true;
        }

        return false;
    }
}

