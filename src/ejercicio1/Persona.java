
package ejercicio1;


public class Persona {
    //atributos privados
    String nombre;
    String apellido;
    Integer edad;
    Integer documento;
    Perro perro;
    
    
    //Constructor vacio
    
    public Persona(){}
    
    //Constructor por parametro
    
    public Persona(String n, String a, Integer e, Integer d, Perro p){
    this.nombre= n;
    this.apellido= a;
    this.edad= e;
    this.documento= d;
    this.perro= p;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

   

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perro=" + perro + '}';
    }
    
    
}
