import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        // System.out.println("Give your name");

        // String answer = in.nextLine();

        // System.out.println("Hi " + answer + "!");

        String answer1 = "";
        System.out.println("Please give the value of the 1st number ");
        answer1 = in.nextLine();

        String answer2 = "";
        System.out.println("Please give the value of the 2st number ");
        answer2 = in.nextLine();

        int result = 0;
        result = Integer.parseInt(answer1) * Integer.parseInt(answer2);
        System.out.println("The sum is " + result);

    }
}
