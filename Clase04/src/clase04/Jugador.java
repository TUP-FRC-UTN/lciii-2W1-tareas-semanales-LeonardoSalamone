
package clase04;


public class Jugador {
    
    private String nombre;
    private int posicion;
    private int nroCamiseta;
    private int cantPartidosJugados;
    private int porcentajeEstadoFisico;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public int getCantPartidosJugados() {
        return cantPartidosJugados;
    }

    public void setCantPartidosJugados(int cantPartidosJugados) {
        this.cantPartidosJugados = cantPartidosJugados;
    }

    public int getPorcentajeEstadoFisico() {
        return porcentajeEstadoFisico;
    }

    public void setPorcentajeEstadoFisico(int porcentajeEstadoFisico) {
        this.porcentajeEstadoFisico = porcentajeEstadoFisico;
    }

    
    
    public Jugador(String nombre, int posicion, int nroCamiseta, int cantPartidosJugados, int porcentajeEstadoFisico) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.nroCamiseta = nroCamiseta;
        this.cantPartidosJugados = cantPartidosJugados;
        this.porcentajeEstadoFisico = porcentajeEstadoFisico;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", posicion=" + posicion + ", nroCamiseta=" + nroCamiseta + ", cantPartidosJugados=" + cantPartidosJugados + ", porcentajeEstadoFisico=" + porcentajeEstadoFisico + '}';
    }
    
    
}
