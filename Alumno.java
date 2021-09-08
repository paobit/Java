/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication385herencia;

/**
 *
 * @author ITMaster
 */
public class Alumno extends Persona
{
    private int legajo;
    private int nota;

    public Alumno(int legajo, int nota, int documento, String nombre, int edad, char sexo)
    {
        super(documento, nombre, edad, sexo);
        this.legajo = legajo;
        this.nota = nota;
    }

    public Alumno()
    {
        super();
        legajo = Datos.numeroRandom(1000,9999);
        nota = Datos.numeroRandom(1,10);
    }

    @Override
    public String toString()
    {
        return super.toString() +  " Alumno{" + "legajo=" + legajo + ", nota=" + nota + '}';
    }

    
    @Override
    public void vota()
    {
        System.out.println("ALUMNO VOTANDO");
    }
    public int getLegajo()
    {
        return legajo;
    }

    public int getNota()
    {
        return nota;
    }

    public void setLegajo(int legajo)
    {
        this.legajo = legajo;
    }

    public void setNota(int nota)
    {
        this.nota = nota;
    }
   
    
    
}
