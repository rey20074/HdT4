import java.util.*;

public class StackList<E> implements Stack<E>{


    List<E> datos = new ArrayList<E>();

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

        E elementopopeado = datos.get(datos.size() - 1);
        datos.remove(elementopopeado);
        return elementopopeado;

    }

    /**
     * Devuelve el ultimo objeto ingresado
     * @return
     */
    public E peek() {

        E ultimoelemento = datos.get(datos.size() - 1);
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