
package ejercicio2;

public class RevolverService {
    
    public Revolver llenarRevolver(Revolver r){
        r.setPosicionActual((int) (Math.random()*6+1));
        System.out.println(r.getPosicionActual());
        r.setPosicionAgua((int)(Math.random()*6+1));
        System.out.println(r.getPosicionAgua());
        return r;
        
    }
    public Boolean mojar(Revolver r){
        Boolean disparo= false;
        if(r.getPosicionActual().equals(r.getPosicionAgua())){
            disparo = true;
        }
        return disparo;
       
    }
    public void siguienteChorro(Revolver r){
        r.setPosicionActual(r.getPosicionActual()+1);
        if(r.getPosicionActual()>6){
            r.setPosicionActual(1); 
        }
    }
}
