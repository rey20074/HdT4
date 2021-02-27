public class SingleLinked<E> implements LinkedList<E>{ //implements LinkedList<E>
  

  SingleLinkedList<E> list = new SingleLinkedList<E>();

    //ingresa un nuevo primer elemento
  public void push(E value) {
    list.insertFirst(value);
  }

  //remueve el primer elemento de la lista
  public E pop() {
    E datos = list.getTopData();
    list.deleteFirst();
    return datos;
    
  }
}