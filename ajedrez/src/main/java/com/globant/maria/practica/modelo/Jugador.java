package com.globant.maria.practica.modelo;

public class Jugador {
    
    private String nombre;
    private Color color;

    public Jugador(){
        this("Sin nombre", Color.BLANCO);
    }

    public Jugador(String nombre){
        this(nombre, Color.BLANCO);
    }
    public Jugador(String nombre, Color color){
        this.nombre = nombre;
        this.color = color;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Color getColor() {
        return color;
    }


    public void setColor(Color color) {
        this.color = color;
    }

    
}
