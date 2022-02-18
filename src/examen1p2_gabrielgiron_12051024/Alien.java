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
    
}
