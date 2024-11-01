package examen;
/**
 *
 * @author frida
 */
public class Cadena {
    String Dato;
    Cadena Sig;

    public Cadena(String Dato) {
        this.Dato = Dato;
        this.Sig = null;
    }
    
    public String getDato() {
        return Dato;
    }

    public void setDato(String Dato) {
        this.Dato = Dato;
    }

    public Cadena getSig() {
        return Sig;
    }

    public void setSig(Cadena Sig) {
        this.Sig = Sig;
    }      
}
