import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase que hace pruebas unitarias de las clases relacionadas al LinkedList
 * @author Andres de la Roca
 * @author Jose Reyes
 */
public class LinkedListTest {

    public SingleLinked<String> singlestack = new SingleLinked<String>();
    public DoubleLinked<String> doublestack = new DoubleLinked<String>();

    /*
    *Chequea que se haga push y pop a un string dado en una linked list simple.
    */
    @Test
    public void TestPushPopSingle() {
        singlestack.push("Prueba1");
        assertEquals("Prueba1", singlestack.pop());
    }

    /*
    *Chequea que se haga push y pop a un string dado en una linked list doble.
    */
    @Test
    public void TestPushPopDouble(){
        doublestack.push("Touhou");
        assertEquals("Touhou", doublestack.peek());
    }



}