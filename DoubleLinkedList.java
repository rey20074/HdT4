import java.util.*;

public class DoubleLinkedList<E> {

  class Node<E>{  
    E data;  
    Node previous;  
    Node next;  
  
    public Node(E data) {  
      this.data = data;  
    }  

    public Node(E data, Node next, Node prev) {  
      this.data = data;  
      this.next = next;
      previous = prev;
    }  
  }  
  
  //Represent the head and tail of the doubly linked list  
  Node head, tail = null;  

  //metodo push
  
  public void pushList(E value){
    //se crea el nodo
    Node<E> newNode = new Node(value, this.head, null);
    //se comprueba la existencia de nodos en la lista
    if(this.head != null) {
      //si ya existian el nuevo nodo agarra la primera posicion
      this.head.previous = newNode;
    //si no hay nodos se crea el primero
    } else {
      this.tail = newNode;
    }
    // el nuevo nodo como cabeza de la lista
    this.head = newNode;
  }

  //pop que quita el primer elemento de la lista
  public E popList() {  
    //si no hay datos no retorna nada
    if(this.head==null) { 
      return null; 
    }

    E oldHeadValue = (E) this.head.data;
    this.head = this.head.next;
    //se comprueba si solo es un nodo
    if(this.head!=null) {
      this.head.previous = null;
    } else {
      this.tail = null;
    }
    //se regresa el anterior primer nodo ya borrado
    return oldHeadValue;

  }

  public String toString(){
    return "La cabeza del nodo es "+head+" y la cola del nodo es "+tail;
  }
}