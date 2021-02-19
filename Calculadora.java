

/**
 * Clase que maneja el funcionamiento de calculadora, implementa la interfaz de
 * CalculadoraGeneral.
 * @author
 */

public class Calculadora implements CalculadoraGeneral{
    
    /**
     * Este sera el almacenamiento que se utilizara para procesar el calculo
     */

    private StackVector<String> stack = new StackVector<String>();
    public StackFactory<"Vector"> Factory = new StackFactory<"Vector">();

    /**
     * Metodo que se encargara de correr el calculo en notacion postfix
     * @param expresion
     * @return
     */
    public String Calculo(String expresion) {
        
        int sizeExpresion = expresion.replace(" ", "").length();
        String expresioncortada = expresion.replace(" ", "");

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
}
