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
public class SuperHumano extends Persona {
    private String SuperPoder;

    public SuperHumano(String SuperPoder, String Nombre, String Poder, String Debilidad, String HeroeOVillano, int Fuerza, int Mental, int Fisica) {
        super(Nombre, Poder, Debilidad, HeroeOVillano, Fuerza, Mental, Fisica);
        this.SuperPoder = SuperPoder;
    }

    public String getSuperPoder() {
        return SuperPoder;
    }

    public void setSuperPoder(String SuperPoder) {
        this.SuperPoder = SuperPoder;
    }

    @Override
    public String toString() {
        return "SuperHumano{" + "SuperPoder=" + SuperPoder + '}';
    }
    
}
