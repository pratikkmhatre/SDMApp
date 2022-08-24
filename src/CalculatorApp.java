

import java.util.Scanner;
public class CalculatorApp {
  
    public static void main(String[] args)
    {
       
        int number1, number2;
  
   
        Scanner sc = new Scanner(System.in);
  
        System.out.println("Enter 2 numbers");
  

        number1 = sc.nextInt();
  
        number2 = sc.nextInt();
  
        System.out.println("Choose any of the below operator\n+\n-\n*\n/");
  
        char operator = sc.next().charAt(0);
  
        double result = 0;
  
        switch (operator) {
  
  
        case '+':
  
            result = number1 + number2;
  
            break;
  
      
        case '-':
  
            result = number1 - number2;
  
            break;
  
  
        case '*':
  
            result = number1 * number2;
  
            break;
  
  
        case '/':
  
            result = number1 / number2;
  
            break;
  
        default:
  
            System.out.println("Invalid Input");
  
            break;
        }
  
        System.out.println("Calculation : "+result);
    }
}