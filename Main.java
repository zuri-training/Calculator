import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  
  Scanner scanner = new Scanner(System.in);
  System.out.println("Welcome to Calculator program");
  System.out.print("Type first number \n");
  int first = Integer.parseInt(scanner.nextLine());
  System.out.print("Type second number \n");
  int second = Integer.parseInt(scanner.nextLine());
  System.out.print("What would you like to do? +,-,%,*,/ \n"); 
  String sign = scanner.nextLine();
  if (sign.equals("+")) {
    System.out.println(first + second);
  }
    else if (sign.equals("-")) {
    System.out.println(first + second);
  }
    else if (sign.equals("/")) {
    System.out.println(first / second);
  }
    else if (sign.equals("*")) {
    System.out.println(first * second);
  }
    else if (sign.equals("%")) {
    System.out.println(first % second);
  }
    else{
      System.out.println("Please type a valid operator");
        main(args);
    }

    

  scanner.close();
  }
}