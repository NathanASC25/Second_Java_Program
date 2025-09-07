import java.util.Random;
import java.util.Scanner;
public class Test2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.printf("\nI'm thinking of a number between 1 and 100\n(including both). Can you guess what it is?\n");
        int computerNum = random.nextInt(100) + 1;
        System.out.printf("\n%s", "Type a number: ");
        int guess = scan.nextInt();
        System.out.printf("%s %d\n","Your guess is:", guess);
        int difference = Math.abs(guess - computerNum);
        System.out.printf("\n%s %d", "The number I was thinking of is:", computerNum);
        System.out.printf("\n%s %d\n", "You were off by:", difference);
    }
}