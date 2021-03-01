import java.util.*;

public class DoubleLinked<E> implements LinkedList<E> {
  
  DoubleLinkedList<E> dlist = new DoubleLinkedList<E>();

  //Represent the head and tail of the doubly linked list  
  Node head, tail = null;  

  //ingresa un nuevo primer elemento
  public void push(E value) {
    dlist.pushList(value);
  }

  //remueve el primer elemento de la lista y lo almacena
  public E pop() {
    return dlist.popList();
  }

}