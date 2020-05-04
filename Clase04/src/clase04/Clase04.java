
package clase04;

import java.util.Scanner;


public class Clase04 {

    public static void main(String[] args) {
     
        Jugador [] equipo;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de jugadores: ");
        int cantidad = sc.nextInt();
        
        equipo = new Jugador [cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese nombre jugador " + i + ":");
            sc.nextLine();
            String nombre = sc.nextLine();
            
            System.out.println("Ingrese posicion del jugador " + i + ":");
            int posicion = sc.nextInt();
            
            System.out.println("Ingrese nro Camiseta del jugador " + i + ":");
            int nroCamiseta = sc.nextInt();
            
            System.out.println("Ingrese cantidad de partidos jugados " + i + ":");
            int cantPartJug = sc.nextInt();
            
            System.out.println("Ingrese estado fisico del jugador " + i + ":");
            int porcEstFis = sc.nextInt();
            
            equipo [i] = new Jugador (nombre, posicion, nroCamiseta, cantPartJug, porcEstFis);
        }
        
        //muestra contenido del vector
        for (int i = 0; i < equipo.length; i++) {
            System.out.println(equipo[i]);
        }
        
        int cantMenos10Partidos = 0;
        for (int i = 0; i < equipo.length; i++) {
            if(equipo[i].getCantPartidosJugados() < 10)
                cantMenos10Partidos++;
        }
        
        System.out.println("Cantidad de jugadores con menos de 10 partidos: " + cantMenos10Partidos);
        
        Jugador J = equipo[0];
        
        for (int i = 0; i < equipo.length; i++) {
            if(equipo[i].getCantPartidosJugados()> J.getCantPartidosJugados())
            {
                J=equipo[i];
            }
            
        }
        
        System.out.println("El jugador con mas partidos jugados es : " + J.toString());
        
        int acum=0;
        for (int i = 0; i < equipo.length; i++) {
            acum+=equipo[i].getPorcentajeEstadoFisico();
        }
        
        double prom = (double)acum / equipo.length;
        
        System.out.println("El promedio de estado fisico del equipo es: " + prom);
        
        /*Persona [] personas = new Persona [3];
        
        personas [0] = new Persona("juan", 20);
        personas [0] = new Persona("pedro", 30);
        personas [0] = new Persona("pablo", 40);
        
        double promedio = 0;
        int suma = 0;
        
        for (int i = 0; i < personas.length; i++) {
            suma += personas[i].decimeEdad();
        }
        
        promedio = (double)suma / personas.length;
        System.out.println("El promedio de edades es: " + promedio);
       */
        
        /*
        int[] vector;
        vector = new int[3];
        
        vector[0] = 4;
        vector[1] = 5;
        vector[2] = 6;
        
        double promedio = 0;
        int suma = 0;
        
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i]; 
            
        }
        
        promedio = (double)suma/vector.length;
        
        System.out.println("El promedio es: " + promedio);
*/
    }
    
}
