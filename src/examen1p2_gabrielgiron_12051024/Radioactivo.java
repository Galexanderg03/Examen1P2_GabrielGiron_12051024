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
public class Radioactivo extends Persona{
    private int EdadAccidente;
    private String TipoAccidente;

    public Radioactivo(int EdadAccidente, String TipoAccidente, String Nombre, String Poder, String Debilidad, String HeroeOVillano, int Fuerza, int Mental, int Fisica) {
        super(Nombre, Poder, Debilidad, HeroeOVillano, Fuerza, Mental, Fisica);
        this.EdadAccidente = EdadAccidente;
        this.TipoAccidente = TipoAccidente;
    }

    public int getEdadAccidente() {
        return EdadAccidente;
    }

    public void setEdadAccidente(int EdadAccidente) {
        this.EdadAccidente = EdadAccidente;
    }

    public String getTipoAccidente() {
        return TipoAccidente;
    }

    public void setTipoAccidente(String TipoAccidente) {
        this.TipoAccidente = TipoAccidente;
    }

    @Override
    public String toString() {
        return super.toString() + " Radioactivo{" + "EdadAccidente=" + EdadAccidente + ", TipoAccidente=" + TipoAccidente + '}';
    }
    
    public void FinalChance(Persona P1, Persona P2)
    {
        Random R = new Random();
        int a = 1+R.nextInt(3);
        int b = 1+R.nextInt(3);
        while(a == b)
            b = 1+R.nextInt(3);

        if(a == 1)
            P1.setFuerza(P1.getFuerza() * 4);
        else if (a == 2)
            P1.setFisica(P1.getFisica() * 4);
        else if (a == 3)
            P1.setMental(P1.getMental() * 4);

    }
    
}
