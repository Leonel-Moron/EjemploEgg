
package ejercicio1;

import java.util.Scanner;

public class PersonaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public void crearPersona(){
        Persona p = new Persona();
        System.out.println("Ingrese nombre");
        p.setNombre(leer.next());
        System.out.println("Ingrese apellido");
        p.setApellido(leer.next());
        System.out.println("Ingrese edad");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese DNI");
        p.setDocumento(leer.nextInt());
        //desde metodo de Persona llamo a metodo de Perro para setearlo
        p.setPerro(PerroService.crearPerro());
    }
    
    
}
