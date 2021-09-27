package ejercicio4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CartaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearMazo(HashSet<Carta> m) { //metodo para llenar el mazo con 40 cartas (aun vacias)
        do {
            for (Integer i = 0; i < 40; i++) { //el viejo y confiable for
                Carta c = new Carta();// se crean 40 objetos
                CartaService.asignarPalo(c);
                CartaService.asignarValores(c);
                m.add(c); // se agregan al conjunto
            }
        } while (m.size() != 40); //bucleo hasta que sean 40 las cartas. porque si hay iguales se eliminan

    }

    public static void asignarValores(Carta c) {
        c.setNumero((int) (Math.random() * 12 + 1));
        if (c.getNumero() == 8 | c.getNumero() == 9) {
            CartaService.asignarValores(c);
        }
    }

    public static void asignarPalo(Carta c) {
        Integer random = (int) (Math.random() * 4 + 1);
        switch (random) {
            case 1:
                c.setPalo("Espada");
                break;
            case 2:
                c.setPalo("Basto");
                break;
            case 3:
                c.setPalo("Oro");
                break;
            case 4:
                c.setPalo("Copa");
        }
    }

    public void mostrarBaraja(HashSet<Carta> c) {
        for (Carta carta : c) {
            System.out.println(carta.getNumero() + " de " + carta.getPalo());
        }
    }

    public void cartasDisponibles(HashSet<Carta> m) {
        System.out.println("Quedan " + m.size() + " cartas en el mazo todavia");
    }

    public void siguienteCarta(HashSet<Carta> m, HashSet<Carta> md) {
        if (m.isEmpty()) {
            System.out.println("No hay mas cartas para dar");
        } else {
            Iterator<Carta> iterador = m.iterator(); // iterador creado con el HashSet
            Carta it = iterador.next(); // a variable "it" se le asigna el siguiente valor del iterador del HashSet
            System.out.println("La carta es " + it.getNumero() + " de " + it.getPalo());
            m.remove(it); //lo removemos (el metodo remove es sobre el hashSet, y ahi pasamos el "it" creado
            md.add(it);
            if (m.isEmpty()) {
                System.out.println("Esa fue la ultima carta");
            }

        }
    }

    public void darCartas(HashSet<Carta> m, HashSet<Carta> md) {
        Integer cartas;
        do {
            System.out.println("Indique la cantidad de cartas a repartir(minimo 1 carta)");
            cartas = leer.nextInt();
            if (cartas < 1) {
                System.out.println("Incorrecto");
            }
        } while (cartas < 1);
        if (cartas > m.size()) {
            System.out.println("No hay esa cantidad de cartas");
        } else {
            for (int i = 0; i < cartas; i++) {
                Iterator<Carta> iterador = m.iterator();
                Carta it = iterador.next();
                System.out.println("la carta es " + it.getNumero() + " de " + it.getPalo());
                m.remove(it);
                md.add(it);
            }
        }
    }

    public void cartasMonton(HashSet<Carta> md) {
        if (md.isEmpty()) {
            System.out.println("El mazo descarte aún está vacio");
        } else {
            System.out.println("Las cartas del mazo descarte son ");
            for (Carta carta : md) {
                System.out.println(carta.getNumero() + " de " + carta.getPalo());
            }
        }
    }
    
    public void barajar(HashSet<Carta>m){
        CartaService cs = new CartaService ();
        m.clear();
        System.out.println(m.size());
        cs.crearMazo(m);
    }
    }
    

