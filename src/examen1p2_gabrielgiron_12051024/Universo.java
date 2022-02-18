/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_gabrielgiron_12051024;

import java.util.ArrayList;

/**
 *
 * @author Galex
 */
public class Universo {
    private String Nombre;
    ArrayList<Escuadron> Squads = new ArrayList();

    public Universo(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Escuadron> getSquads() {
        return Squads;
    }

    public void setSquads(ArrayList<Escuadron> Squads) {
        this.Squads = Squads;
    }

    @Override
    public String toString() {
        return "Universo{" + "Nombre=" + Nombre + ", Squads=" + Squads + '}';
    }
    
    
}
