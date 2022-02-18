/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_gabrielgiron_12051024;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Galex
 */
public class Examen1P2_GabrielGiron_12051024 {
static ArrayList<Persona> Personas = new ArrayList();
static ArrayList<Escuadron> Escuadrones = new ArrayList();
static ArrayList<Universo> Universos = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = -1;
        while(opcion != 0)
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu\n"
                            + "0)Salir\n"
                            + "1)Crear Persona\n"
                            + "2)Crear Escuadron\n"
                            + "3)Crear Universo\n"
                            + "4)Listar Personas\n"
                            + "5)Listar Escuadrones\n"
                            + "6)Listar Universos\n"
                            + "7)Agregar Miembros a un Squad\n"
                            + "8)Agregar Squads a un Universo\n"
            ));
            switch(opcion)
            {
                case 1:
                {
                    break;
                }
                default: JOptionPane.showMessageDialog(null, "Opcion Ingresada no valida");
            }
        }
    }
    
    public void CrearPersona()
    {
        String Name = JOptionPane.showInputDialog("Ingrese el nombre");
        int cent = 0;
        for (int i = 0; i < Personas.size(); i++) {
            if(Personas.get(i).getNombre().equals(Name))
            {
                cent = 1;
                break;
            }
        }
        if(cent == 1)
            JOptionPane.showMessageDialog(null, "Ya Existe una Persona con ese nombre");
        else
        {
            String Poder = JOptionPane.showInputDialog("Ingrese el Poder");
            String Debilidad = JOptionPane.showInputDialog("Ingrese la Debilidad");
            String Alignment = HeroeOVillano();
            int Fuerza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los puntos de Fuerza\n 0/150"));
            int Mental = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los puntos de Habilidad Mental\n"+Fuerza+"/150"));
            int Fisica = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los puntos de Habilidad Fisica\n"+(Fuerza+Mental)+"/150"));
            if(Fuerza + Mental + Fisica < 100)
            {
                JOptionPane.showMessageDialog(null, "Esta Persona no tiene suficientes parametros para ser un heroe o villano");
            }
            else if(Fuerza + Mental + Fisica > 150)
            {
                JOptionPane.showMessageDialog(null, "Tienes mas parametros que otros heroes, eso es trampa");
            }
            else
            {
                int op = Integer.parseInt(JOptionPane.showInputDialog(
                        "Ingrese una Opcion para crear el tipo de persona\n"
                        + "1)Persona Normal\n"
                                + "2)Mutante\n"
                                + "3)SuperHumano\n"
                                + "4)PorAccidenteRadioactivo\n"
                                + "5)ExtraTerrestre"
                ));
                switch(op)
                {
                    case 1:
                    {
                        Persona P = new PersonaNormal(Name,Poder,Debilidad,Alignment,Fuerza,Mental,Fisica);
                        Personas.add(P);
                        JOptionPane.showMessageDialog(null, "Persona Normal Creado Exitosamente");
                        break;
                    }
                    case 2:
                    {
                        Persona M = new Mutante(Name,Poder,Debilidad,Alignment,Fuerza,Mental,Fisica);
                        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos factores mutantes tiene"));
                        for (int i = 0; i < a; i++) {
                            String FM = JOptionPane.showInputDialog("Ingrese el nombre del factor mutante");
                            ((Mutante)M).getFactoresMutantes().add(FM);
                        }
                        Personas.add(M);
                        JOptionPane.showMessageDialog(null, "Mutante Creado Exitosamente");
                        break;
                    }
                    case 3:
                    {
                        String powa = JOptionPane.showInputDialog("Ingrese el nombre del superpoder");
                        Persona P = new SuperHumano(powa,Name,Poder,Debilidad,Alignment,Fuerza,Mental,Fisica);
                        Personas.add(P);
                        JOptionPane.showMessageDialog(null, "SuperHumano Creado Exitosamente");
                        break;
                    }
                    case 4:
                    {
                        int e = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos años tenia cuando sucedio el accidente"));
                        String accidente = JOptionPane.showInputDialog("Ingrese el tipo de accidente");
                        Persona P = new Radioactivo(e,accidente,Name,Poder,Debilidad,Alignment,Fuerza,Mental,Fisica);
                        Personas.add(P);
                        JOptionPane.showMessageDialog(null, "Radioactivo Creado Exitosamente");
                        break;
                    }
                    case 5:
                    {
                        int o = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion\n"
                                + "1)Deidad\n2)Alien"));
                        if(o==1)
                        {
                            String mitologia = JOptionPane.showInputDialog("Ingrese el tipo de accidente");
                            boolean C = false;
                            int a = Integer.parseInt(JOptionPane.showInputDialog("Tiene Creyentes?\n1)Si\n2)No"));
                            if(a==1)
                                C = true;
                            else if(a == 2)
                                C = false;
                            Extraterrestre P = new Deidad(mitologia,C,Name,Poder,Debilidad,Alignment,Fuerza,Mental,Fisica);
                            Personas.add(P);
                            JOptionPane.showMessageDialog(null, "Deidad Creado Exitosamente");
                        }
                        else if(o == 2)
                        {
                            
                        }
                        break;
                    }
                }
            }
        }
    }
    
    public String HeroeOVillano()
    {
        String A = "";
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion\n"
                + "Heroe o Villano?\n"
                + "1) Heroe\n"
                + "2)Villano\n"
        ));
        if(opcion == 1)
        {
            A = "Heroe";
        }
        else if(opcion == 2)
        {
            A = "Villano";
        }
        return A;
    }
}
