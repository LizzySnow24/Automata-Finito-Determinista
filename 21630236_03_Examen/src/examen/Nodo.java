package examen;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author frida
 */
public class Nodo {
    String dato; //nombre de mi proceso origen
    String Final; // acepta si o no, en caso de que si sea de estado final o no.
    Lista lista; // guarda mi lista de direcciones
    Nodo siguiente; // apunta al siguiente 

    public Nodo(String dato,String Final) {
        this.dato = dato;
        this.Final = Final;
        this.lista = null;
        this.siguiente=null;
    }

    public String getFinal() {
        return Final;
    }

    public void setFinal(String Final) {
        this.Final = Final;
    }    

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Lista getLista() {
        return lista;
    }

    public void setLista(Lista lista) {
        this.lista = lista;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }     
    
}
