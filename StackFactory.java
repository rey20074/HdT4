public class StackFactory<E> {

  public Stack getStack(String stackType) {
    if(stackType == null) {
      return null;
    }
    if(stackType.equalsIgnoreCase("ArrayList")) {
      return new StackArrayList<E>();
      System.out.println("Se instancio un Stack de ArrayList");
    } else if (stackType.equalsIgnoreCase("List")) {
      return new StackList<E>();
      System.out.println("Se instancio un Stack de Listas");
    } else if (stackType.equalsIgnoreCase("Vector")) {
      return new StackVector<E>();
      System.out.println("Se instancio un Stack de Vector");
    }

    return null;
  }

}