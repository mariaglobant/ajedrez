package com.globant.maria.practica.modelo;

public class Rey extends Pieza {
    public Rey(Color color, Casilla posicion) {
        super(color, posicion);
    }
    
    @Override
    public boolean esMovimientoValido(Casilla destino) {
        int difFila = Math.abs(destino.getFila() - getPosicion().getFila());
        int difColumna = Math.abs(destino.getColumna() - getPosicion().getColumna());

        // Movimiento de una casilla en cualquier dirección
        return difFila <= 1 && difColumna <= 1;
    }
}

