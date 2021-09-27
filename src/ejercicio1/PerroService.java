
package ejercicio1;

import java.util.Scanner;


public class PerroService {
    
    
    /// STATIC + CLASE (PARA RETORNAR) + METODO .. me permite el static llamar a este metodo desde otras clases
    static Perro crearPerro(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Perro p = new Perro();
        System.out.println("Ingrese nombre del perro");
        p.setNombre(leer.next());
        System.out.println("Ingrese raza del perro");
        p.setRaza(leer.next());
        System.out.println("Ingrese edad del perro");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese tamaño del can");
        p.setTamaño(leer.nextDouble());
        return p;
    }
}
