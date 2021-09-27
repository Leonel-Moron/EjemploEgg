
package ejercicio4;

import java.util.Objects;


public class Carta {
    //atributos privados
    private Integer numero;
    private String palo;

    public Carta() {
    }

    public Carta(Integer numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.numero);
        hash = 13 * hash + Objects.hashCode(this.palo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (!Objects.equals(this.palo, other.palo)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }



    
    @Override
    public String toString() {
        return "Carta: " + "numero: " + numero + ", palo: " + palo + "";
    }
    
}
