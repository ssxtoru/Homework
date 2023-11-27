import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Input the number: ");
            int input = scanner.nextInt();

            if (input < 0){
                throw new NegativeNumberException("Number is negative!");
            }else{
                System.out.println("Number is positive");
            }

        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}