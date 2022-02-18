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
public class Alien extends Extraterrestre{
    private String Planeta;

    public Alien(String Planeta, String Nombre, String Poder, String Debilidad, String HeroeOVillano, int Fuerza, int Mental, int Fisica) {
        super(Nombre, Poder, Debilidad, HeroeOVillano, Fuerza, Mental, Fisica);
        this.Planeta = Planeta;
    }

    public String getPlaneta() {
        return Planeta;
    }

    public void setPlaneta(String Planeta) {
        this.Planeta = Planeta;
    }

    @Override
    public String toString() {
        return "Alien{" + "Planeta=" + Planeta + '}';
    }
    
    public void FinalChance(Persona P1, Persona P2)
    {
        Random R = new Random();
        int a = 1+R.nextInt(3);
        int b = 1+R.nextInt(3);
        while(a == b)
            b = 1+R.nextInt(3);
        
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
