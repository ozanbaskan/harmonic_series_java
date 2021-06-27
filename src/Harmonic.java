import java.util.Scanner;

public class Harmonic {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input;
        double sum = 0;
        System.out.print("Enter a number to find harmonic series of: ");
        input = s.nextInt();

        for (int i = 1; i <= input; i++)
        {
            sum += 1.0 / i;
        }
        System.out.printf("The answer is: %f", sum);


    }

}
