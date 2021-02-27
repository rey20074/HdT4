import java.util.Vector;

/**
 * Clase de stack que implementa la interfaz StackVector, esta clase se encargara
 * del funcionamiento del almacenamiento de la calculadora.
 * @author Andres de la Roca
 * @author Jose Reyes
 */

public class StackVector<E> implements Stack<E> {
    
    Vector<E> datos = new Vector<E>();

    /**
     * Mete el objeto ingresado como parametro al stack
     * @param num
     */
    public void push(E num) {

        datos.add(num);
        
    }

    /**
     * Elimina el ultimo objeto ingresado del stack y lo devuelve
     * @return
     */
    public E pop() {

        E elementopopeado = datos.lastElement();
        datos.remove(elementopopeado);
        return elementopopeado;

    }

    /**
     * Devuelve el ultimo objeto ingresado
     * @return
     */
    public E peek() {

        E ultimoelemento = datos.lastElement();
        return ultimoelemento;

    }

    /**
     * Devuelve un valor boolean, true si el stack esta vacio y false si este se encuentra con algun objeto dentro
     * @return
     */
    public boolean empty() {

        return datos.isEmpty();

    }

    /**
     * Devuelve un integer que representa la cantidad de objetos ingresados en el stack
     * @return
     */
    public int size() {

        return datos.size();

    }
    
}
