


package javaapplication385herencia;

import java.util.ArrayList;


public class Test
{


    public static void main(String[] args)
    {
        Humano h = new Humano();
        
        System.out.println("h: " + h);
        
        Persona p = new Persona();
        
        System.out.println("p: " + p);
        
        Alumno a = new Alumno();
        
        System.out.println("a: " + a);
        
        h.camina();
        p.camina();
        p.vota();
        a.camina();
        a.vota();
        
        
        
        Humano t = new Alumno(1010,7,21458741,"juana",45,'F');
       
        
        
        System.out.println("t " + t);
        
        Alumno at = (Alumno) t;
        
      ArrayList<Humano> todos;   
     ArrayList<Humano> listaPersonas;
     ArrayList<Humano> listaAlumnos;
     
     
     todos = crearUnlista(10);
     
     listaPersonas = dameLasPersonas(todos);
     //listaAlumnos = dameLosAlumnos(todos);
     
     mostrar("LISTA DE TODOS",todos);
     mostrar("LISTA DE PERSONAS",listaPersonas);
     //mostrar("LISTA DE ALUMNOS",listaAlumnos);
     
     
     
       
    }

    private static ArrayList<Humano> crearUnlista(int laCantidad)
    {
       ArrayList<Humano> x = new ArrayList();
       
        for (int i = 0; i < laCantidad; i++)
        {
            double por = Math.random();
            
            if (por<0.33)
            {
                x.add(new Alumno());
            }
            else
            {
                if(por < 0.66)
                {
                    x.add(new Persona());
                }
                else
                {
                    x.add(new Rapero());
                }
            }
        }
       
       return x;
    }

    
    
    private static ArrayList<Humano> dameLasPersonas(ArrayList<Humano> todos)
    {
        ArrayList<Humano> x = new ArrayList();
        
        for (int i = 0; i < todos.size(); i++)
        {
            if (todos.get(i) instanceof Persona) 
            {
                x.add(todos.get(i));
            }
        }        
        return x;
    }

    private static void dameLosAlumnos(ArrayList<Humano> todos)
    {
     for(int i=0; i<todos.size()-1; i++)
     {
         System.out.println(todos.get(i).toString()); 
     }
    }

    private static void mostrar(String titulo, ArrayList<Humano> unaLista)
    {
        System.out.println(titulo);
        for (int i = 0; i < unaLista.size(); i++) 
        {
            System.out.println(unaLista.get(i).toString());
        }
    }
    
    
}
