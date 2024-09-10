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

        String answer3 = "";
        System.out.println("Would yu like to calculate the sum or substraction. Please type plus or minus");
        answer3 = in.nextLine();
        int sub = Integer.parseInt(answer1) - Integer.parseInt(answer2);
        int add = Integer.parseInt(answer1) + Integer.parseInt(answer2);
            if (answer3.equals("plus") || answer3.equals("Plus"))
            {
                System.out.println("The result is " + add);
            }

            else if (answer3.equals("minus") || answer3.equals("Minus"))
            {
                System.out.println("The result is " + sub);
            }

        // int result = 0;
        // result = Integer.parseInt(answer1) + Integer.parseInt(answer2);
        //     if (result > 10)
        //     {
        //         System.out.println("The value is greater than 10. It is " + result);
        //     }

    }
}
