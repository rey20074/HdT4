import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Clase driver que hace el funcionamiento de la calculadora
 * @author Andres de la Roca
 * @author Jose Reyes
 */

public class DriverCalculadora {
    
    /**
     * Metodo main que correra la calculadora con notacion postfix
     * @param args
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Calculadora calc = new Calculadora();
        
        //Segunda Calculadora que comprueba el patrón de diseño Singleton
        Calculadora calc2= new Calculadora();

        //Al llamar a los métodos nos damos cuenta que solo una calculadora se creo porque ya existía otra
        calc.getInstance();
        calc2.getInstance();


        /*//Prueba de las doublelinkedlist
        DoubleLinkedList<Integer> dList = new DoubleLinkedList();  
        //Add nodes to the list  
        dList.addNode(1);  
        dList.addNode(2);  
        dList.addNode(3);  
        dList.addNode(4);  
        dList.addNode(5);  
  
        //Displays the nodes present in the list  
        dList.display();*/


        boolean run = true;

        while (run) {

            try {
                
                System.out.println("\nBienvenido a la calculadora de notacion Postfix");

                System.out.println("\nElige una opcion");
                System.out.println("1. Calcular la operacion del archivo de texto");
                System.out.println("2. Salir");
        
                int opcion = scan.nextInt();
        
                if(opcion == 1){
                    String datos = "";
                    datos = new String(Files.readAllBytes(Paths.get("datos.txt")));

                    System.out.println("El resultado es: " + calc.Calculo(datos));
                } else if (opcion == 2) {
                    System.out.println("Hasta luego!");
                    run = false;
                } else {
                    System.out.println("Se ingreso una opcion invalida, intentelo de nuevo");
                }



            } catch (InputMismatchException e) {
                System.err.println("Eligio una opcion incorrecta");
                scan.nextLine();
            } catch (NoSuchElementException e) {
                System.err.println("La operacion ingresada es invalida, intente usar el formato correcto de notacion postfix");
                scan.nextLine();
            } catch (IOException e) {
                System.out.println("No se logro detectar el archivo");
                scan.nextLine();
            }
            


        }

    }

}
