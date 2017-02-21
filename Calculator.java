import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    int num1;
    int num2;
    int answer;
    String operation;

    Scanner input = new Scanner(System.in);

    System.out.println("Please Enter The First Number");
    num1 = input.nextInt();

    System.out.println("Please Enter The Second Number");
    num2 = input.nextInt();

    Scanner op = new Scanner (System.in);

    System.out.println("Please Enter The Operation");
    operation = op.next();

    if (operation.equals("+"))
    {
        answer = add(num1, num2); 
        System.out.println("Your Answer is "+ answer);
    }
    else 
    {
        System.out.println("No other operations supported at this point");
    }
  }
  
    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }
    
}
