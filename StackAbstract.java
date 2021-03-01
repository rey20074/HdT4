public abstract class StackAbstract<E> implements Stack {

    /**
     * Permite almacenar dentro del stack un objeto
     *
     * @param data
     * @return
     */
    public void push(Object data) {

    }

    /**
     * Permite sacar del stack el ultimo objeto que se ingreso
     * @return
     */
    public E pop(){

        return null;
    }

    /**
     * Devuelve un valor true si el almacenamiento stack esta vacio y false si esta lleno
     * @return
     */
    public boolean empty(){

        return false;
    }

    /**
     * Devuelve el ultimo objeto que se ingreso al stack
     * @return
     */
    public E peek(){

        return null;
    }

    /**
     * Devuelve el tamaño del almacenamiento stack
     * @return
     */
    public int size(){

        return 0;
    }
}