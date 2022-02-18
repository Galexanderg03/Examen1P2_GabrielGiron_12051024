/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_gabrielgiron_12051024;

import java.util.ArrayList;
import java.util.Collections;
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
                            + "7)Eliminar Persona\n"
                            + "8)Eliminar Escuadron\n"
                            + "9)Eliminar Universo\n"
                            + "10)Modificar Persona\n"
                            + "11)Modificar Escuadron\n"
                            + "12)Modificar Universos"
                            + "13)Agregar Miembros a un Squad\n"
                            + "14)Agregar Squads a un Universo\n"
            ));
            switch(opcion)
            {
                case 1:
                {
                    if(Universos.size() == 0)
                    {
                        JOptionPane.showMessageDialog(null, "Debes Crear un Universo Primero");
                    }
                    else
                    {
                        CrearPersona();
                    }
                    break;
                }
                case 2:
                {
                    if(Personas.size() == 0)
                    {
                        JOptionPane.showMessageDialog(null, "Debes Crear una Persona Primero");
                    }
                    else
                    {
                        CrearEscuadron();
                    }
                    break;
                }
                case 3:
                {
                    CrearUniverso();
                    break;
                }
                case 4:
                {
                    JOptionPane.showMessageDialog(null, Listar(Personas));
                    break;
                }
                case 5:
                {
                    JOptionPane.showMessageDialog(null, Listar(Escuadrones));
                    break;
                }
                case 6:
                {
                    JOptionPane.showMessageDialog(null, Listar(Universos));
                    break;
                }
                case 7:
                {
                    Eliminar(Personas);
                    break;
                }
                case 8:
                {
                    Eliminar(Escuadrones);
                    break;
                }
                case 9:
                {
                    Eliminar(Universos);
                    break;
                }
                case 10:
                {
                    if(Personas.size() == 0)
                    {
                        JOptionPane.showMessageDialog(null, "Debes Crear una Persona Primero");
                    }
                    else
                    {
                        Modificar(Personas);
                    }
                    break;
                }
                case 11:
                {
                    if(Escuadrones.size() == 0)
                    {
                        JOptionPane.showMessageDialog(null, "Debes Crear un Escuadron Primero");
                    }
                    else
                    {
                        Modificar(Escuadrones);
                    }
                    break;
                }
                case 12:
                {
                    if(Universos.size() == 0)
                    {
                        JOptionPane.showMessageDialog(null, "Debes Crear un Universo Primero");
                    }
                    else
                    {
                        Modificar(Universos);
                    }
                    break;
                }
                case 13:
                {
                    
                }
                default: JOptionPane.showMessageDialog(null, "Opcion Ingresada no valida");
            }
        }
    }
    
    public static void CrearPersona()
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
                            String mitologia = JOptionPane.showInputDialog("Ingrese la mitologia");
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
                            String Planeta = JOptionPane.showInputDialog("Ingrese el nombre del planeta");
                            Extraterrestre P = new Alien(Planeta,Name,Poder,Debilidad,Alignment,Fuerza,Mental,Fisica);
                            Personas.add(P);
                            JOptionPane.showMessageDialog(null, "Alien Creado Exitosamente");
                        }
                        break;
                    }
                }
            }
        }
    }
    
    public static void CrearEscuadron()
    {
        String Name = JOptionPane.showInputDialog("Ingrese el nombre");
        int cent = 0;
        for (int i = 0; i < Escuadrones.size(); i++) {
            if(Escuadrones.get(i).getNombre().equals(Name))
            {
                cent = 1;
                break;
            }
        }
        if(cent == 1)
            JOptionPane.showMessageDialog(null, "Ya Existe un Escuadron con ese nombre");
        else
        {
            String Base = JOptionPane.showInputDialog("Ingrese el nombre de la base");
            String HeroeOVillanos = HeroeOVillano();
            Persona Lider;
            int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion de la persona en la lista"));
            if(pos < Personas.size())
            {
                Lider = Personas.get(pos);
                Personas.get(pos).setTieneSquad(true);
                Escuadron E = new Escuadron(Name,Base,Lider,HeroeOVillanos);
                E.getMiembros().add(Lider);
                JOptionPane.showMessageDialog(null, "Escuadron Creado Exitosamente");
            }
        }
    }
    
    public static void CrearUniverso()
    {
        String Name = JOptionPane.showInputDialog("Ingrese el nombre");
        int cent = 0;
        for (int i = 0; i < Universos.size(); i++) {
            if(Universos.get(i).getNombre().equals(Name))
            {
                cent = 1;
                break;
            }
        }
        if(cent == 1)
            JOptionPane.showMessageDialog(null, "Ya Existe un Universo con ese nombre");
        else
        {
            Universo U = new Universo(Name);
            Universos.add(U);
            JOptionPane.showMessageDialog(null, "Universo Creado Exitosamente");
        }
    }
   
    public static String Listar(ArrayList Lista)
    {
        Collections.sort(Lista);
        String Salida = "";
        for (int i = 0; i < Lista.size(); i++) {
            Salida = Salida + "[" + i + "]" + Lista.get(i).toString() + "\n";
        }
        return Salida;
    }
    
    public static void Eliminar(ArrayList Lista)
    {
        int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion de lo que se eliminara"));
        if(pos < Lista.size())
        {
            Lista.remove(pos);
            JOptionPane.showMessageDialog(null, "Eliminado Exitosamente");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Opcion no valida");
        }
    }
    
    public static void Modificar(ArrayList Lista)
    {
        String L = Listar(Lista);
        int pos = Integer.parseInt(JOptionPane.showInputDialog(L+"\n"+"Ingrese la posicion de lo que se modificara"));
        if(pos < Lista.size())
        {
            if(Lista.get(pos) instanceof Persona)
            {
                int Fuerza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los puntos de Fuerza\n 0/150"));
                int Mental = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los puntos de Habilidad Mental\n"+Fuerza+"/150"));
                int Fisica = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los puntos de Habilidad Fisica\n"+(Fuerza+Mental)+"/150"));
                if(Fuerza + Mental + Fisica < 100)
                {
                    JOptionPane.showMessageDialog(null, "Tiene Menos Parametros de lo Requerido, No se Modificara Nada");
                }
                else if(Fuerza + Mental + Fisica > 150)
                {
                    JOptionPane.showMessageDialog(null, "Tienes mas parametros de lo requerido, eso es trampa, No Se Modificara Nada");
                }
                else
                {
                    ((Persona)Lista.get(pos)).setFisica(Fisica);
                    ((Persona)Lista.get(pos)).setFuerza(Fuerza);
                    ((Persona)Lista.get(pos)).setMental(Mental);
                    JOptionPane.showMessageDialog(null, "Modificado Exitosamente");
                }
            }
            else if(Lista.get(pos) instanceof Escuadron)
            {
                String Base = JOptionPane.showInputDialog("Ingrese el nombre de la base");
                String Li = Listar(((Escuadron)Lista.get(pos)).getMiembros());
                int posi = Integer.parseInt(JOptionPane.showInputDialog(Li+"\n"+"Ingrese la posicion del miembro que sera el nuevo lider"));
                if(posi < ((Escuadron)Lista.get(pos)).getMiembros().size())
                {
                    Persona P = ((Escuadron)Lista.get(pos)).getMiembros().get(posi);
                    ((Escuadron)Lista.get(pos)).setBase(Base);
                    ((Escuadron)Lista.get(pos)).setLider(P);
                    JOptionPane.showMessageDialog(null, "Modificado Exitosamente");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                }
            }
            else if(Lista.get(pos) instanceof Universo)
            {
                String Name = JOptionPane.showInputDialog("Ingrese el nombre");
                int cent = 0;
                for (int i = 0; i < Universos.size(); i++) {
                    if(Universos.get(i).getNombre().equals(Name))
                    {
                        cent = 1;
                        break;
                    }
                }
                if(cent == 1)
                    JOptionPane.showMessageDialog(null, "Ya Existe un Universo con ese nombre");
                else
                {
                    Universos.get(pos).setNombre(Name);
                    JOptionPane.showMessageDialog(null, "Universo Modificado Exitosamente");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Opcion no valida");
        }
    }
    
    public static String HeroeOVillano()
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
