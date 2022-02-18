/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_gabrielgiron_12051024;

/**
 *
 * @author Galex
 */
public class Persona {
    private String Nombre;
    private String Poder;
    private String Debilidad;
    private String HeroeOVillano;
    private int Fuerza;
    private int Mental;
    private int Fisica;
    private boolean TieneSquad = false;

    public Persona(String Nombre, String Poder, String Debilidad, String HeroeOVillano, int Fuerza, int Mental, int Fisica) {
        this.Nombre = Nombre;
        this.Poder = Poder;
        this.Debilidad = Debilidad;
        this.HeroeOVillano = HeroeOVillano;
        this.Fuerza = Fuerza;
        this.Mental = Mental;
        this.Fisica = Fisica;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPoder() {
        return Poder;
    }

    public void setPoder(String Poder) {
        this.Poder = Poder;
    }

    public String getDebilidad() {
        return Debilidad;
    }

    public void setDebilidad(String Debilidad) {
        this.Debilidad = Debilidad;
    }

    public String getHeroeOVillano() {
        return HeroeOVillano;
    }

    public void setHeroeOVillano(String HeroeOVillano) {
        this.HeroeOVillano = HeroeOVillano;
    }

    public int getFuerza() {
        return Fuerza;
    }

    public void setFuerza(int Fuerza) {
        this.Fuerza = Fuerza;
    }

    public int getMental() {
        return Mental;
    }

    public void setMental(int Mental) {
        this.Mental = Mental;
    }

    public int getFisica() {
        return Fisica;
    }

    public void setFisica(int Fisica) {
        this.Fisica = Fisica;
    }

    public boolean isTieneSquad() {
        return TieneSquad;
    }

    public void setTieneSquad(boolean TieneSquad) {
        this.TieneSquad = TieneSquad;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Poder=" + Poder + ", Debilidad=" + Debilidad + ", HeroeOVillano=" + HeroeOVillano + ", Fuerza=" + Fuerza + ", Mental=" + Mental + ", Fisica=" + Fisica + ", TieneSquad=" + TieneSquad + '}';
    }
    
    
}
