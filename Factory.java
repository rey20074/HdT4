public class Factory{

  /*
  *Regresa la instancia de una clase Stack segun se eliga
  */
  public Stack getStack(String stackType) {

    Stack<String> stk = null;

    if(stackType == null) {
      return null;
    }

    if(stackType.equalsIgnoreCase("ArrayList")) {
      stk = new StackArrayList<String>();

      System.out.println("Se instancio un Stack de ArrayLists");

    } else if (stackType.equalsIgnoreCase("List")) {
      
      stk = new StackList<String>();

      System.out.println("Se instancio un Stack de Listas");

    } else if (stackType.equalsIgnoreCase("Vector")) {

      stk = new StackVector<String>();

      System.out.println("Se instancio un Stack de Vector");

    } 

    return stk;

  }

  /*
  *Regresa la instancia de una LinkedList segun se eliga.
  */
  public LinkedList getList(String stackType) {

    LinkedList<String> list = null;

    if(stackType == null) {
      return null;
    }

    if(stackType.equalsIgnoreCase("Single")) {
      list = new SingleLinked<String>();

      System.out.println("Se instancion una Linked List simple");
    }

    else if(stackType.equalsIgnoreCase("Double")){
      list = new DoubleLinked<String>();

      System.out.println("Se instancion una Linked List double");
    }

    return list;

  }

}