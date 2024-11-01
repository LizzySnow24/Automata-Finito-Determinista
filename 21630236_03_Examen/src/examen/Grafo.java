package examen;
import java.util.Scanner;
/**
 * Frida Elizabeth González García. 21630236.
 * Programa que valida cadenas con un Automata Finito Determinista
 */
public class Grafo {

     Scanner s = new Scanner(System.in);
     Nodo nodoPri; //Puntero de inicio de mi lista principal de procesos
     Lista lisPri; // puntero de inicio de mi lists de adyacencia
     Cadena cadePri; // puntero de inicio de mi lista de cadena.

    public Grafo() {
        nodoPri = null;
        lisPri = null;
    }

    public boolean Vacio() {
        boolean Esta = false;
        if (nodoPri == null) {
            Esta = true;
        }
        return Esta;
    }

    public boolean VacioAris() {
        boolean Esta = false;
        if (lisPri == null) {
            Esta = true;
        }
        return Esta;
    }
    //metodo para crear un nodo de mi lista enlazada de procesos.
    public void InsertarNodo(String dato, String Final) {
        Nodo NodoNuevo = new Nodo(dato, Final);
        if (Vacio() == true) {
            nodoPri = NodoNuevo; //nodoPri apunta al nuevo nodo
        } else {
            Nodo Actual = nodoPri; 
            while (Actual.siguiente != null) {
                Actual = Actual.siguiente; //actual se mueve hasta que llegue al nodo final
            }
            Actual.siguiente = NodoNuevo; //inserta el nodo al final
        }
    }
    //método que busca el proceso en mi lista enlazada
    public Nodo BuscarOrigen(String Origen) {
        Nodo temp = nodoPri;
        while (temp != null) {
            if (Origen.equals(temp.getDato())) {  // compara si coincide el que ingreso el usuario con uno de la lista de procesos
                System.out.println("Si encontro el origen"); // Se encontró el origen
                return temp;
            }
            temp = temp.getSiguiente();
        }
        System.out.println("No encontro el origen"); // No se encontró el origen
        return null;
    }   
    //metodo para crear nodo que simula un arista, es decir, guarda la dirección del proceso.
    public void CrearArista(Nodo origen, String destino, String letra) {
        Nodo nodoDestino = BuscarOrigen(destino); //Busco el destino y guardo la dirección en un objeto de tipo Nodo
        
        if (nodoDestino != null) {
            Lista nuevaArista = new Lista(nodoDestino, letra); //creo mi arista, donde nodoDestino es la dirección y letra el alfabeto
                                                                          // es decir, voy a B con 0
            if (origen.lista == null) {
                origen.lista = nuevaArista;
            } else {
                Lista actual = origen.lista;
                while (actual.sig != null) {
                    actual = actual.sig;
                }
                actual.sig = nuevaArista;
            }
        } else {
            System.out.println("No existe el Destino");
        }
    }
    //metodo que separa la cadena que me ingresa el usuario para validar 
    public void SepararCadena(String Cadena) {
        cadePri = null; //reiniciar la lista cada que llame el metodo.

        for (int i = 0; i < Cadena.length(); i++) {
            char caracter = Cadena.charAt(i);
            Cadena nuevaLetra = new Cadena(String.valueOf(caracter)); // guardo mi letra en un nodo de mi lista enlazada
            if (cadePri == null) {
                cadePri = nuevaLetra;
            } else {
                Cadena actual = cadePri;
                while (actual.Sig != null) {
                    actual = actual.Sig;
                }
                actual.Sig = nuevaLetra;
            }
        }
    }
    // metodo para mostrar la lista de la cadena 
    public void Mostrar() {
        Cadena Recorrido = cadePri;
        while (Recorrido != null) {
            System.out.println(Recorrido.getDato());
            Recorrido = Recorrido.Sig;
        }
    }
    //Metodo que verifica si coincide la letra y si es de estado final
    public boolean Comparar(Nodo nodoActual, Cadena listaCadena) {
        if (listaCadena == null) {
            // Llegamos al final de la cadena, verifica si el nodo actual es un estado final.
            return nodoActual != null && nodoActual.getFinal().equalsIgnoreCase("Si");
        }

        String letraCadena = listaCadena.getDato();
        Lista listaDireccion = nodoActual.lista;

        while (listaDireccion != null) {
            if (listaDireccion.getLetra().equals(letraCadena)) {
                // Coincide la letra, intenta avanzar al siguiente nodo de la cadena y nodo de destino.
                if (Comparar(listaDireccion.getDestino(), listaCadena.Sig)) {
                    return true; // Cadena válida encontrada
                }
            }
            listaDireccion = listaDireccion.sig;
        }

        // Si no encuentra coincidencias, la cadena no es válida
        return false;
    }

  /*  public static void main(String[] args) {
        String numNodo = "";
        String estadoFinal = "";

        Nodo nodoAct = nodoPri;
        System.out.println("Ingrese numero de nodos");
        int nodo = s.nextInt();

        for (int j = 0; j < nodo; j++) {
            System.out.println("Ingrese nodo: " + (j + 1));
            numNodo = s.next();
            System.out.println("El nodo " + numNodo + " es de Estado Final?");
            estadoFinal = s.next();

            InsertarNodo(numNodo, estadoFinal);
        }
        System.out.println("Núm de destinos a agregar");
        int numDes = s.nextInt();

        for (int j = 0; j < numDes; j++) {

            System.out.println("Ingresa Origen: ");
            String origen = s.next();
            System.out.println("Ingrese Destino");
            String destino = s.next();

            System.out.println("Ingresa Letra: ");
            String letra = s.next();

            // Buscar el nodo de origen para cada conexión
            Nodo nodoOrigen = BuscarOrigen(origen);

            if (nodoOrigen != null && letra != "*") {
                // Crear un nuevo nodo para cada destino y conectarlo
                CrearArista(nodoOrigen, destino, letra);
            } else {
                System.out.println("No existe el Origen");
            }
        }
        Recorrer();
        String Cadena = "";
        String Aprob = "si";

        while (!Aprob.equalsIgnoreCase("no")) {
            System.out.println("Desea ingresar una cadena (si/no): ");
            Aprob = s.next();

            if (Aprob.equalsIgnoreCase("si")) {
                System.out.println("Ingrese la cadena a evaluar: ");
                Cadena = s.next();
                SepararCadena(Cadena);
                Mostrar();
                if (Comparar(nodoPri, cadePri)) {
                    System.out.println("Cadena Válida :) ");
                } else {
                    System.out.println("Cadena no válida :( ");
                }
            }
        }
    } */
}
