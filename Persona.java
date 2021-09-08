
package javaapplication385herencia;


public class Persona extends Humano
{
    private int documento;
    private String nombre;

    public Persona(int documento, String nombre, int edad, char sexo)
    {
        super(edad, sexo);
        this.documento = documento;
        this.nombre = nombre;
    }

    public Persona()
    {//CREAR UNA PERSONA RANDOM!!!!!
        super();
        documento = Datos.numeroRandom(10000000,40000000);
        nombre = nombreRandom();
    }

    public void vota()
    {
        System.out.println("PERSONA VOTANDO");
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " Persona{" + "documento=" + documento + ", nombre=" + nombre + '}';
    }

    public int getDocumento()
    {
        return documento;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setDocumento(int documento)
    {
        this.documento = documento;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String nombreRandom()
    {
        String mf;//mf= masculino femenino
        if(this.getSexo()=='M')
            mf=nombreMasculino();
        else
        {
            mf=nombreFemenino();
        }
            
        return mf;
          
    }
    
    private String nombreMasculino()
    {
        int p;
        int u;
        
        String []nombresMasculinos={"Juan","Pedro","Pepe"};//u y p muestra 2 nombres
        do{
            p=Datos.numeroRandom(0, nombresMasculinos.length-1);
            u=Datos.numeroRandom(0, nombresMasculinos.length-1);
            
        }
        while (p==u);
         return nombresMasculinos[p]+","+nombresMasculinos[u];
    }
    
    private String nombreFemenino()
    {
        int p;
        int u;
        
        String []nombresFemeninos={"Juana","Pedra","Peppa"};//u y p muestra 2 nombres
        do{
            p=Datos.numeroRandom(0, nombresFemeninos.length-1);
            u=Datos.numeroRandom(0, nombresFemeninos.length-1);
            
        }
        while (p==u);
         return nombresFemeninos[p]+","+nombresFemeninos[u];
    }
    
}
