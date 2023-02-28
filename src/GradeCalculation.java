import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        System.out.println("Enter Your Score and we'll tell you what grade you got.");

        Scanner scoreInput = new Scanner(System.in);
        double score;
        String x = "";
        boolean exit = false;


        do {
            System.out.print("Enter score Here (Press 'x' to exit program): ");
            if (scoreInput.hasNextDouble()){
                score = scoreInput.nextDouble();
                if (score > 100){
                    System.out.println("Your teacher lied.\nWe don't acknowledge extra credit.\nTry Again");
                }
                else if (score >= 93 && score <=100) {
                    System.out.println("You got an A");
                }
                else if (score >= 90 && score <93) {
                    System.out.println("You got an A-");
                }
                else if (score >= 87 && score <90) {
                    System.out.println("You got an B+");
                }
                else if (score >= 83 && score <87) {
                    System.out.println("You got an B");
                }
                else if (score >= 80 && score <83) {
                    System.out.println("You got an B-");
                }
                else if (score >= 77 && score <80) {
                    System.out.println("You got an C+");
                }
                else if (score >= 73 && score <77) {
                    System.out.println("You got an C");
                }
                else if (score >= 70 && score <73) {
                    System.out.println("You got an C-");
                }
                else if (score >= 65 && score <70) {
                    System.out.println("You got an D");
                }
                else if (score < 65) {
                    System.out.println("You got an F");
                }

            }
            else {
                x = scoreInput.next();
                if (x.equals("x") || x.equals("X")){
                    exit = true;
                    System.out.println("Goodbye!!");
                }
                else {
                    System.out.println("Need to Submit a valid option.");
                }
            }
        }
        while (!exit);

    }
}
