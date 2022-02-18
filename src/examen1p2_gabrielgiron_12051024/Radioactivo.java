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
    
    
}
