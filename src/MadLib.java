import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        List<String> libs = new ArrayList<>();
        Scanner madInputs = new Scanner(System.in);

        System.out.println("Enter an object");
        libs.add(madInputs.nextLine());
        System.out.println("Enter an adjective");
        libs.add(madInputs.nextLine());
        System.out.println("Enter an animal");
        libs.add(madInputs.nextLine());
        System.out.println("Enter a verb ending in ed");
        libs.add(madInputs.nextLine());
        System.out.println("Enter a feeling");
        libs.add(madInputs.nextLine());

        System.out.println("One day, a man bought a five-thousand dollar "+ libs.get(0) +" for work. On his way to the work the next morning, as he proudly displayed his "+ libs.get(1) +" new "+ libs.get(0) +", a wild "+ libs.get(2) +" came out of nowhere and "+ libs.get(3) +" on his jacket. It was indescribable how "+ libs.get(4) +" the man felt, so he called out of work and took some time for himself. ");

    }
}
