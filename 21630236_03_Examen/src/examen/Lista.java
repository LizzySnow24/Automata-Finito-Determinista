package examen;
//import static examen.Grafo.VacioAris;

/**
 *
 * @author frida
 */
public class Lista {
    Nodo destino; //aqui guardo las direcciones de los nodos destino 
    String Letra; // con que letra voy a mi destino
    Lista sig;
    Grafo G = new Grafo();

    public Lista(Nodo destino, String Letra) {
        this.destino = destino;
        this.Letra = Letra;
        this.sig =null;
    }
    //Aqui es cuando le pido la letra, ejemplo: A con que va B;
    public void Arista(Nodo Destino, String letra) {
        Lista NuevoAris = new Lista(null, letra);
        if (G.lisPri == null) {
            G.lisPri = NuevoAris;
        } else {
            Lista Actual = G.lisPri;
            while (Actual.sig != null) {
                Actual = Actual.sig;
            }
            Actual.sig = NuevoAris;
        }
    }    

    public Nodo getDestino() {
        return destino;
    }

    public void setDestino(Nodo destino) {
        this.destino = destino;
    }

    public String getLetra() {
        return Letra;
    }

    public void setLetra(String Letra) {
        this.Letra = Letra;
    }    

    public Lista getSig() {
        return sig;
    }

    public void setSig(Lista sig) {
        this.sig = sig;
    }    
}
