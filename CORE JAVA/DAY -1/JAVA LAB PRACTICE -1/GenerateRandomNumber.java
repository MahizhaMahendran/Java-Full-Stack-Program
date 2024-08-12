import java.util.Random;
import java.util.Scanner;
public class GenerateRandomNumber {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the upper bound for random number: ");
int upperBound = scanner.nextInt();
Random random = new Random();
int randomNumber = random.nextInt(upperBound);
System.out.println("Random Number between 0 and " + (upperBound - 1) + ": " + randomNumber);
}
}
