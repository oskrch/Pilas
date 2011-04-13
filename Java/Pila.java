/**
 *
 * @author Juan Pablo Castrill�n
 *
 */

import javax.swing.JOptionPane;

public class Pila {
    private int tope=-1;
    private int [] pila;
    private int max =0;

    /**
     * Constructor por defecto
     */

    public Pila(){

        pila = new int[5];
        max = pila.length-1;
        System.out.println("Creada Pila por defecto "+pila.length+"posibles elementos");

    }

    /**
     * Constructor que recibe como parametro el tamaño de la pila
     */

    public Pila (int x){

        pila = new int [x];
        max = pila.length-1;
        System.out.println("Creada Pila de longitud "+ pila.length);
    }

    /**
     * Metodo que nos dice si la pila esta vacia
     */
    public boolean PilaVacia(){
        if (tope==-1)
            return true;
        else
            return false;
    }

    /**
     * Metodo que nos dice si la pila esta vacia
     */
    public boolean PilaLlena(){
        if (tope==max)
            return true;
        else
            return false;
    }

    /**
     * Método que nos ingresa un dato en la Pila
     */

    public void push() {
        if (!PilaLlena()){
            tope++;
            pila[tope]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para ingresar a la pila: "));
        }
        else
            System.out.println("No se puede ingresar datos a la Pila, está llena");
    }
    /**
     * Método que recibe como parametro el numero´que se va ingresar a la Pila.
     */

    public void push(int num) {
        if (!PilaLlena()){
            tope++;
            pila[tope]=num;
        }
        else
            System.out.println("No se puede ingresar datos a la Pila, está llena");
    }

    /**
     * Método que nos quita un elemento de la Pila
     */

    public void pop(){
        if (!PilaVacia()){
            tope=tope-1;
            pila[tope+1]=0;
        }
        else
            System.out.println("No se puede elimanar datos de la Pila, está Vacía");
    }

    /**
     * Método que muestra los valores que hay en la Pila
     */
    public void MostrarPila(){
        if(!PilaVacia())
            for (int i=0; i<=tope; i++)
                System.out.println(pila[i]);
        else
            System.out.println("Pila Vacia");
    }
}