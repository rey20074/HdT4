

/**
 * Clase que maneja el funcionamiento de calculadora, implementa la interfaz de
 * CalculadoraGeneral.
 * @author Andres de la Roca
 * @author Jose Reyes
 */

public class Calculadora implements CalculadoraGeneral{
    
    /**
     * Este sera el almacenamiento que se utilizara para procesar el calculo
     */

    
    Factory factory = new Factory();
    
    int opcion=0;
    
    //Stack<String> stack = factory.getStack("Vector");
    //Vector, ArrayList y List

    //LinkedList<String> stack = factory.getList("Single");
    LinkedList<String> stack = factory.getList("Double");
    

    /**
     * Metodo que se encargara de correr el calculo en notacion postfix
     * @param expresion
     * @return
     */
    public String Calculo(String expresion) {
        System.out.println("Expresion antes de conversion: " + expresion);
        expresion = convertidor(expresion);
        System.out.println("Expresion despues de conversion: " + expresion);
        
        int sizeExpresion = expresion.replace(" ", "").length();
        String expresioncortada = expresion.replace(" ", "");

        System.out.println("Expresion acortada: " + expresioncortada);

        for (int i = 0; i < sizeExpresion; i++) {
            String num = expresioncortada.substring(i, i+1);
            boolean evaluar = evaluate(num);

            if(num.equals("+") && evaluar){
                String OperandoA = stack.pop();
                int OperandoAConvertido = Integer.parseInt(OperandoA);
                String OperandoB = stack.pop();
                int OperandoBConvertido = Integer.parseInt(OperandoB);
                int resultado = OperandoAConvertido + OperandoBConvertido;
                num = Integer.toString(resultado);
                

            } else if(num.equals("-") && evaluar){
                String OperandoA = stack.pop();
                int OperandoAConvertido = Integer.parseInt(OperandoA);
                String OperandoB = stack.pop();
                int OperandoBConvertido = Integer.parseInt(OperandoB);
                int resultado = OperandoAConvertido - OperandoBConvertido;
                num = Integer.toString(resultado);
                

            }else if(num.equals("*") && evaluar){
                String OperandoA = stack.pop();
                int OperandoAConvertido = Integer.parseInt(OperandoA);
                String OperandoB = stack.pop();
                int OperandoBConvertido = Integer.parseInt(OperandoB);
                int resultado = OperandoAConvertido * OperandoBConvertido;
                num = Integer.toString(resultado);

            }else if (num.equals("/") && evaluar){
                String OperandoA = stack.pop();
                int OperandoAConvertido = Integer.parseInt(OperandoA);
                String OperandoB = stack.pop();
                int OperandoBConvertido = Integer.parseInt(OperandoB);
                int resultado = OperandoAConvertido / OperandoBConvertido;
                num = Integer.toString(resultado);
                

            }
            System.out.println(num);

            stack.push(num);
        }

        return stack.pop();

    }

    /**
     * Metodo que se encarga de evaluar que tipo de operador es el que se esta utilizando
     * @param operator
     * @return
     */
    private boolean evaluate(String operator) {

        switch (operator) {

            case "+" : {
                return true;
            }

            case "-" : {
                return true;
            }

            case "*" : {
                return true;
            }

            case "/" : {
                return true;
            }

            default : {
                return false;
            }

        }


    }

    /*
    Método que se encarga de realizar el Patrón de diseño Singleton
    */
    private static Calculadora unica = null;

    public static Calculadora getInstance() 
    { 
        if (unica == null){
          unica = new Calculadora(); 
          System.out.println("La calculadora ha sido creada");  
        } 
        else{
          System.out.println("Ya hay una calculadora existente");
        }
        return unica; 
        
    }

    /*
    *Metodo que se encarga de revisar un caracter y regresar un valor determinado segun si este es +, -, * o /.
    */
    private int Prec(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    } 

    /*
    *Metodo que se encarga de convertir una expresion infix dada a postfix para posteriormente ser procesada por el metodo calculo
    */
    private String convertidor(String exp) 
    { 
       //Almacena en un String la expresion
        String result = new String(""); 
          
        
        StackVector<Character> stack = new StackVector<Character>();

        //Se realizan chequeos para ver que tipo de operacion es
        for (int i = 0; i<exp.length(); ++i) 
        { 
            char c = exp.charAt(i); 
              
             
            if (Character.isLetterOrDigit(c)) 
                result += c; 
               
            
            else if (c == '(') 
                stack.push(c); 
              
             
            else if (c == ')') 
            { 
                while (!stack.empty() &&  
                        stack.peek() != '(') 
                    result += stack.pop(); 
                  
                    stack.pop(); 
            } 
            else 
            { 
                while (!stack.empty() && Prec(c) <= Prec(stack.peek())){ 
                    
                    result += stack.pop(); 
             } 
                stack.push(c); 
            } 
       
        } 
       
        
        while (!stack.empty()){ 
            if(stack.peek() == '(') 
                return "Invalid Expression"; 
            result += stack.pop(); 
         } 
        return result; 
    } 


}
