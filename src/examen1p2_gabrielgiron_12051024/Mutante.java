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
public class Mutante extends Persona{
    ArrayList<String> FactoresMutantes = new ArrayList();

    public Mutante(String Nombre, String Poder, String Debilidad, String HeroeOVillano, int Fuerza, int Mental, int Fisica) {
        super(Nombre, Poder, Debilidad, HeroeOVillano, Fuerza, Mental, Fisica);
    }

    public ArrayList<String> getFactoresMutantes() {
        return FactoresMutantes;
    }

    public void setFactoresMutantes(ArrayList<String> FactoresMutantes) {
        this.FactoresMutantes = FactoresMutantes;
    }

    @Override
    public String toString() {
        return super.toString() + " Mutante{" + "FactoresMutantes=" + FactoresMutantes + '}';
    }
    
}
