
package ejercicio1;


public class Perro {
    //atributos privado
    String Nombre;
    String Raza;
    Integer Edad;
    Double Tamaño;
    
    //Constructor Vacio
    public Perro(){}
    
    //Constructor por parametros
    public Perro(String n, String r, Integer e, Double t){
    this.Nombre = n;
    this.Raza = r;
    this.Edad = e;
    this.Tamaño = t;
    
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public Double getTamaño() {
        return Tamaño;
    }

    public void setTamaño(Double Tamaño) {
        this.Tamaño = Tamaño;
    }

    @Override
    public String toString() {
        return "Nombre=" + Nombre + ", Raza=" + Raza + ", Edad=" + Edad + ", Tama\u00f1o=" + Tamaño + '}';
    }
    
    
}
