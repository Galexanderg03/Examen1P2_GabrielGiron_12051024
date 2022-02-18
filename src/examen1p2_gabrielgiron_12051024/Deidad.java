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
public class Deidad extends Extraterrestre{
    private String Mitologia;
    private boolean TieneCreyentes;

    public Deidad(String Mitologia, boolean TieneCreyentes, String Nombre, String Poder, String Debilidad, String HeroeOVillano, int Fuerza, int Mental, int Fisica) {
        super(Nombre, Poder, Debilidad, HeroeOVillano, Fuerza, Mental, Fisica);
        this.Mitologia = Mitologia;
        this.TieneCreyentes = TieneCreyentes;
    }

    public String getMitologia() {
        return Mitologia;
    }

    public void setMitologia(String Mitologia) {
        this.Mitologia = Mitologia;
    }

    public boolean isTieneCreyentes() {
        return TieneCreyentes;
    }

    public void setTieneCreyentes(boolean TieneCreyentes) {
        this.TieneCreyentes = TieneCreyentes;
    }
    
    public void FinalChance(Persona P1, Persona P2)
    {
        P1.setFuerza(P1.getFuerza() * 4);
        P1.setFisica(P1.getFisica() * 4);
        P1.setMental(P1.getMental() * 4);
        
        P2.setFisica(P2.getFisica()/2);
        P2.setFuerza(P2.getFuerza()/2);
        P2.setMental(P2.getMental()/2);
    }
}
