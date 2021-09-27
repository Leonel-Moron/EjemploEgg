
package ejercicio2;

import java.util.ArrayList;


public class Juego {
    //atributos privados
    private ArrayList <Jugador> Jugadores;
    private Revolver Revolver;

    //constructores
    public Juego(){}
    
    
    public Juego(ArrayList Jugadores, Revolver Revolver) {
        this.Jugadores = Jugadores;
        this.Revolver = Revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(ArrayList<Jugador> Jugadores) {
        this.Jugadores = Jugadores;
    }

    public Revolver getRevolver() {
        return Revolver;
    }

    public void setRevolver(Revolver Revolver) {
        this.Revolver = Revolver;
    }
    
    
    
}
