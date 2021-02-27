class Node<E> {
    //
    public E data;
    public Node<E> next;

    //Imprime los datos dentro del nodo
    public void displayNodeData() {
        System.out.println("{ " + data + " } ");
    }

    public E getData(){
      return data;
    }
}
 
public class SingleLinkedList<E> {
    private Node<E> head;
 
    public boolean isEmpty() {
        return (head == null);
    }
 
    // used to insert a node at the start of linked list
    public void insertFirst(E data) {
        Node<E> newNode = new Node<E>();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }
 
    // used to delete node from start of linked list
    public Node deleteFirst() {
        Node<E> temp = head;
        head = head.next;
        return temp;
    }
 
    // Use to delete node after particular node
    public void deleteAfter(Node after) {
        Node<E> temp = head;
        while (temp.next != null && temp.data != after.data) {
            temp = temp.next;
        }
        if (temp.next != null)
            temp.next = temp.next.next;
    }

    public E getTopData() {
      return head.getData();
    }
}
 