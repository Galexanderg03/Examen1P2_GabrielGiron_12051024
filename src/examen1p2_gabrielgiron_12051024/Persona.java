/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_gabrielgiron_12051024;

import java.util.Random;

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
    private int StatsTotal = 0;
    private boolean TieneSquad = false;

    public Persona(String Nombre, String Poder, String Debilidad, String HeroeOVillano, int Fuerza, int Mental, int Fisica) {
        this.Nombre = Nombre;
        this.Poder = Poder;
        this.Debilidad = Debilidad;
        this.HeroeOVillano = HeroeOVillano;
        this.Fuerza = Fuerza;
        this.Mental = Mental;
        this.Fisica = Fisica;
        StatsTotal = Fuerza + Mental + Fisica;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getStatsTotal() {
        return StatsTotal;
    }

    public void setStatsTotal(int StatsTotal) {
        this.StatsTotal = StatsTotal;
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
        return "Nombre=" + Nombre + ", Poder=" + Poder + ", Debilidad=" + Debilidad + ", HeroeOVillano=" + HeroeOVillano + ", Fuerza=" + Fuerza + ", Mental=" + Mental + ", Fisica=" + Fisica + ", TieneSquad=" + TieneSquad + '}';
    }
    
    public void FinalChance(Persona P1, Persona P2)
    {
        Random R = new Random();
        int a = 1+R.nextInt(3);
        int b = 1+R.nextInt(3);
        while(a == b)
            b = 1+R.nextInt(3);
        
        if(P1 instanceof PersonaNormal)
        {
            if(a == 1)
                P1.setFuerza(getFuerza() + (getFuerza()/2));
            else if (a == 2)
                P1.setFisica(getFisica() + (getFisica()/2));
            else if (a == 3)
                P1.setMental(getMental() + (getMental()/2));
        }
        else if(P1 instanceof SuperHumano)
        {
            if(a == 1)
                P1.setFuerza(getFuerza() * 4);
            else if (a == 2)
                P1.setFisica(getFisica() * 4);
            else if (a == 3)
                P1.setMental(getMental() * 4);
            
            if(b == 1)
                P1.setFuerza(getFuerza()/2);
            else if (b == 2)
                P1.setFisica(getFisica()/2);
            else if (b == 3)
                P1.setMental(getMental()/2);
        }
        else if(P1 instanceof Radioactivo)
        {
            if(a == 1)
                P1.setFuerza(getFuerza() * 4);
            else if (a == 2)
                P1.setFisica(getFisica() * 4);
            else if (a == 3)
                P1.setMental(getMental() * 4);
        }
        else if(P1 instanceof Mutante)
        {
            if(a == 1)
            P1.setFuerza(P1.getFuerza() * 2);
        else if (a == 2)
            P1.setFisica(P1.getFisica() * 2);
        else if (a == 3)
            P1.setMental(P1.getMental() * 2);

        if(b == 1)
            P2.setFuerza(P2.getFuerza()/2);
        else if (b == 2)
            P2.setFisica(P2.getFisica()/2);
        else if (b == 3)
            P2.setMental(P2.getMental()/2);
        }
        else if(P1 instanceof Deidad)
        {
            P1.setFuerza(P1.getFuerza() * 4);
        P1.setFisica(P1.getFisica() * 4);
        P1.setMental(P1.getMental() * 4);
        
        P2.setFisica(P2.getFisica()/2);
        P2.setFuerza(P2.getFuerza()/2);
        P2.setMental(P2.getMental()/2);
        }
        else if(P2 instanceof Alien)
        {
            if(a == 1)
            P2.setFuerza(P2.getFuerza()/2);
        else if (a == 2)
            P2.setFisica(P2.getFisica()/2);
        else if (a == 3)
            P2.setMental(P2.getMental()/2);

        if(b == 1)
            P2.setFuerza(P2.getFuerza()/2);
        else if (b == 2)
            P2.setFisica(P2.getFisica()/2);
        else if (b == 3)
            P2.setMental(P2.getMental()/2);
        }
    }
    
    
}
