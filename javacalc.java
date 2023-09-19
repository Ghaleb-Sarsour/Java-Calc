import java.util.Scanner;

public class javacalc{

    public static void main(String[]args){
        
        System.out.println("Welcome to the Java Calculator");

        //Creating the scanner input
        Scanner mathinput = new Scanner(System.in);

        //Asking and Gathering User Input
        System.out.print("Input your equation: ");
        
        
        Double num1input = mathinput.nextDouble();
        String opinput = mathinput.next();
        Double num2input = mathinput.nextDouble();
        double ans = mathcalculation(num1input, opinput, num2input);

        System.out.print(ans);
    }

    public static double mathcalculation(double num1, String op, double num2){
        if (op.equals("+")){
            return (double)num1 + num2;
        }
        else if (op.equals("-")){
            return (double)num1 - num2;
        }
        else if (op.equals("*")){
            return (double)num1*num2;
        }
        else if (op.equals("/")){
            return (double)num1/num2;
        }
        else if (op.equals("%")){
            return (double)num1%num2;
        }
        else{
            return 0.1;
        }
    }

}