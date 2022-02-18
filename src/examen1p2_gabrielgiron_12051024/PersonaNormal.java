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
public class PersonaNormal extends Persona{

    public PersonaNormal(String Nombre, String Poder, String Debilidad, String HeroeOVillano, int Fuerza, int Mental, int Fisica) {
        super(Nombre, Poder, Debilidad, HeroeOVillano, Fuerza, Mental, Fisica);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    public void FinalChance(Persona P1, Persona P2)
    {
        Random R = new Random();
        int a = 1+R.nextInt(3);
        int b = 1+R.nextInt(3);
        while(a == b)
            b = 1+R.nextInt(3);

        if(a == 1)
            P1.setFuerza(P1.getFuerza() + (P1.getFuerza()/2));
        else if (a == 2)
            P1.setFisica(P1.getFisica() + (P1.getFisica()/2));
        else if (a == 3)
            P1.setMental(P1.getMental() + (P1.getMental()/2));
    }
}
