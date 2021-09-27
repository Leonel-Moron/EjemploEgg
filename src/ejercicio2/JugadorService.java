
package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class JugadorService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearJugadores(ArrayList<Jugador> players){ // metodo para ir creando jugadores y recibe un Juego obj para ir seteandolo
        
        Jugador j = new Jugador();
        Integer jugadores;
        System.out.println("Indique cantidad de jugadores");
        jugadores = leer.nextInt();
        for(int i=0; i<jugadores;i++){
            
            j.setID(i+1); // seteo el ID por posicion de iteracion
            System.out.println("Indique nombre de Jugador");
            j.setNombre(leer.next()); //seteo nombre
            players.add(j); // al objeto creado lo paso a una lista
            

        }       
}
    
    public void disparo(Revolver r, Juego j){
    RevolverService rs = new RevolverService();
    
    j.getJugadores();
   
    rs.mojar(r);
    rs.siguienteChorro(r);
    }
}
