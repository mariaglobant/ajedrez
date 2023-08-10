package com.globant.maria.practica.modelo;

public class Alfil extends Pieza {
    public Alfil(Color color, Casilla posicion) {
        super(color, posicion);
    }
    
    @Override
    public boolean esMovimientoValido(Casilla destino) {
        int difFila = Math.abs(destino.getFila() - getPosicion().getFila());
        int difColumna = Math.abs(destino.getColumna() - getPosicion().getColumna());

        // Movimiento diagonal
        return difFila == difColumna;
    }
}
