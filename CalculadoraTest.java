import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase que hace pruebas unitarias de la clase calculadora
 * @author Andres de la Roca
 * @author Jose Reyes
 */
public class CalculadoraTest {

    Calculadora calc = new Calculadora();
    
    @Test
    public void testCalcSuma() {
        assertEquals("3", calc.Calculo("2 1 +"));
    }

    @Test
    public void testCalcResta(){
        assertEquals("4", calc.Calculo("4 8 -"));
    }

    @Test
    public void testCalcMulti() {
        assertEquals("12", calc.Calculo("4 3 *"));
    }

    @Test
    public void testCalcDivision(){
        assertEquals("2", calc.Calculo("1 2 /"));
    }

    @Test
    public void testCalcVariado() {
        assertEquals("15", calc.Calculo("1 2 + 4 * 3 +"));
    }
}
