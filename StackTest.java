import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase que hace pruebas unitarias de la clase StackVector
 * @author Andres de la Roca
 */
public class StackTest {

    public StackVector<String> stack = new StackVector<String>();


    @Test
    public void TestPushPop() {
        stack.push("Prueba1");
        assertEquals("Prueba1", stack.pop());
    }

    @Test
    public void TestPeek(){
        stack.push("Touhou");
        assertEquals("Touhou", stack.peek());
    }

    @Test
    public void Testsize() {
        stack.push("CR7");
        stack.push("Binario");
        stack.push("Avicii");
        stack.push("Jeepeta");
        assertEquals(4, stack.size());
    }

    @Test public void TestEmpty() {
        assertEquals(true, stack.empty());
        stack.push("Hola");
        assertEquals(false, stack.empty());
    }

}
