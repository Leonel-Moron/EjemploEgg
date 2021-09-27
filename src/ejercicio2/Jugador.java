
package ejercicio2;


public class Jugador {
    //atributos privados
    
    private Integer ID;
    private String nombre;
    private Boolean mojado;

    
    //constructor vacio
    public Jugador(){}
    
    //constructor parametros
    public Jugador(Integer ID, String nombre, Boolean mojado) {
        this.ID = ID;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre + " "+ID;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "ID=" + ID + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
    
}
