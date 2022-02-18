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
public class Escuadron {
    private String Base;
    private Persona Lider;
    private String HeroesOVillanos;
    private ArrayList<Persona> Miembros = new ArrayList();

    public Escuadron(String Base, Persona Lider, String HeroesOVillanos) {
        this.Base = Base;
        this.Lider = Lider;
        this.HeroesOVillanos = HeroesOVillanos;
    }

    public String getBase() {
        return Base;
    }

    public void setBase(String Base) {
        this.Base = Base;
    }

    public Persona getLider() {
        return Lider;
    }

    public void setLider(Persona Lider) {
        this.Lider = Lider;
    }

    public String getHeroesOVillanos() {
        return HeroesOVillanos;
    }

    public void setHeroesOVillanos(String HeroesOVillanos) {
        this.HeroesOVillanos = HeroesOVillanos;
    }

    public ArrayList<Persona> getMiembros() {
        return Miembros;
    }

    public void setMiembros(ArrayList<Persona> Miembros) {
        this.Miembros = Miembros;
    }

    @Override
    public String toString() {
        return "Escuadron{" + "Base=" + Base + ", Lider=" + Lider + ", HeroesOVillanos=" + HeroesOVillanos + ", Miembros=" + Miembros + '}';
    }
    
}
