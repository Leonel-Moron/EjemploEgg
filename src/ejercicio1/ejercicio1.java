/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package ejercicio1;

import java.util.ArrayList;


public class ejercicio1 {

    public static void main(String[] args) {
        
        PerroService ds = new PerroService();
        PersonaService ps = new PersonaService();
        ArrayList<Persona> listaPersona = new ArrayList();
        
        
        // Resuelvo con parametros
        Perro dog1 = new Perro("Lucho","Callejero",15,22.);
        Perro dog2 = new Perro("Firulais","Callejero",6, 15.);
    
        Persona p1 = new Persona("Leonel","Moron",30,36149459,dog1);
        Persona p2 = new Persona("Jaime","Alvarez",75, 22321456, dog2);
        //imprimo desde personas y su ToString (recordar insert code)
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
        
        //Resuelvo con listas e ingreso de datos
        for(int i =0;i<2;i++){
        ps.crearPersona();
        
        }
    }
    
}
