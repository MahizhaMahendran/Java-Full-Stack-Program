import java.util.Scanner;
public class PeakCheck {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the value of a: ");
int a = scanner.nextInt();
System.out.print("Enter the value of b: ");
int b = scanner.nextInt();
if (a > b) {
System.out.println("a is the peak.");
} else if (b > a) {
System.out.println("b is the peak.");
} else {
System.out.println("Both a and b are peaks (equal values).");
}
scanner.close();
}
}