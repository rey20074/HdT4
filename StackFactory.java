public class StackFactory {

  public Stack getStack(String stackType) {
    

    return (Stack)StackVector.newInstance();

    /*if(stackType == null) {
      return null;
    }

    if(stackType.equalsIgnoreCase("ArrayList")) {

      System.out.println("Se instancio un Stack de ArrayLists");
    } else if (stackType.equalsIgnoreCase("List")) {

      System.out.println("Se instancio un Stack de Listas");
    } else if (stackType.equalsIgnoreCase("Vector")) {
      
      return new StackVector();
      System.out.println("Se instancio un Stack de Vector");
    }*/

  }

}