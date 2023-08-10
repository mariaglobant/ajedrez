package com.globant.maria.practica.modelo;

public class Reina extends Pieza {
    public Reina(Color color, Casilla posicion) {
        super(color, posicion);
    }
    
    @Override
    public boolean esMovimientoValido(Casilla destino) {
        int difFila = Math.abs(destino.getFila() - getPosicion().getFila());
        int difColumna = Math.abs(destino.getColumna() - getPosicion().getColumna());

        // Movimiento en línea recta o diagonal
        return difFila == 0 || difColumna == 0 || difFila == difColumna;
    }
}
