package com.globant.maria.practica.modelo;

public class Casilla {
    
    private Character columna;
    private Integer fila;
    private Color color;

    public Casilla(Character columna, Integer fila, Color color){
        this.color = color;
        this.columna = columna;
        this.fila = fila;
    }

    public Character getColumna() {
        return columna;
    }

    public Integer getFila() {
        return fila;
    }

    public Color getColor() {
        return color;
    }

    public String toString() {
        return String.format("%c%f",columna, fila).toUpperCase();
    }

}
