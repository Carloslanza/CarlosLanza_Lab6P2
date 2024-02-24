package carloslanza_lab6p2;

import java.util.ArrayList;

public class Equipo {
    private String pais;
    private String nombre;
    private String ciudad;
    private String estadio;
    private ArrayList<Jugador> jugadores = new ArrayList<>();

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    @Override
    public String toString() {
        return "Equipo{" + "pais=" + pais + ", nombre=" + nombre + ", ciudad=" + ciudad + ", estadio=" + estadio + '}';
    }
    
}
