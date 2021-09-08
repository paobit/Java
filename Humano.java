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
public class Humano extends Object
{
    public static final char SEXO_M = 'M';
    public static final char SEXO_F = 'F';
    
    private int edad;
    private char sexo;

    public Humano(int edad, char sexo)
    {
        super();//LLAMAR AL CONSTRUCTOR DEL PADRE
        this.edad = edad;
        this.sexo = sexo;
    }

    public void camina()
    {
        System.out.println("HUMANO CAMINANDO");
    }
    
    public Humano()
    {//CREAR UN HUMANO RANDOM!!!!!
        super();
        edad = Datos.numeroRandom(15, 100);
        sexo = obtenerSexo();
    }

    @Override
    public String toString()
    {
        return "Humano{" + "edad=" + edad + ", sexo=" + sexo + '}';
    }

    public int getEdad()
    {
        return edad;
    }

    public char getSexo()
    {
        return sexo;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }
    
public char obtenerSexo()
    {
        int numero;
        char s;
        numero=Datos.numeroRandom(1, 2);//1=M, 2=F
        if(numero==1)
            s=SEXO_M;
        else
            s=SEXO_F;
        return s;
    }

}
