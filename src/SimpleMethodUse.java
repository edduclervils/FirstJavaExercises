import java.util.Scanner;

public class SimpleMethodUse {
    public static void main(String[] args) {
        double firstInput, secondInput;

        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        while(!inputs.hasNextDouble()){
            System.out.println("Not a Number.\nTry Again.\n");
            inputs.next();
        }
        firstInput = inputs.nextFloat();
        System.out.print("Enter another Number: ");
        while(!inputs.hasNextDouble()){
            System.out.println("Not a Number.\nTry Again.");
            inputs.next();
        }
        secondInput = inputs.nextFloat();

        System.out.println("The Greater number is "+ Math.max(firstInput,secondInput));

        System.out.println("The Sum of the numbers is "+ Math.addExact((long)firstInput,(long)secondInput));

        System.out.println("The Product of the numbers is "+ Math.multiplyExact((long)firstInput,(long)secondInput));

    }
}
