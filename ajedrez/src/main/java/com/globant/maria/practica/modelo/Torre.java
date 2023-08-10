package com.globant.maria.practica.modelo;

public class Torre extends Pieza {
    public Torre(Color color, Casilla posicion) {
        super(color, posicion);
    }
    
    @Override
    public boolean esMovimientoValido(Casilla destino) {
        int difFila = Math.abs(destino.getFila() - getPosicion().getFila());
        int difColumna = Math.abs(destino.getColumna() - getPosicion().getColumna());

        // Movimiento en línea recta (misma fila o misma columna)
        return difFila == 0 || difColumna == 0;
    }
}

