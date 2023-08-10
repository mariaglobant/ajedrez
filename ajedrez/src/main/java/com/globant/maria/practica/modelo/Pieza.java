public abstract class Pieza {
    private Color color;
    private Casilla posicion;
    
    public Pieza(Color color, Casilla posicion) {
        this.color = color;
        this.posicion = posicion;
    }
    
    public abstract boolean esMovimientoValido(Casilla destino);
    
    
    public Color getColor() {
        return color;
    }

    public Casilla getPosicion() {
        return posicion;
    }
    
    public void setPosicion(Casilla posicion) {
        this.posicion = posicion;
    }
}
