package com.globant.maria.practica.modelo;

public class Tablero {
    
    private Casilla[][] casillas;

    public Tablero(){
        casillas = new Casilla[8][8];
        inicializarCasillas();
    }

    private void inicializarCasillas() {
        String columnas = "abcdefg";
        Color color = Color.NEGRO;
        for (int c = 0; c < columnas.length(); c++){
            if (c % 2 == 0){
                color = Color.NEGRO;
            } else{
                color = Color.BLANCO;
            }
            for (int f = 0; f < 8; f++) {
                casillas[c][f] = new Casilla(columnas.charAt(c), f + 1, color);

                if (color == Color.NEGRO){
                    color = Color.BLANCO;
                } else {
                    color = Color.NEGRO;
                }
            }
        }
    }
}
