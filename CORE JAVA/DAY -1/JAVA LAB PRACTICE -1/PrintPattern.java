import java.util.Scanner;
public class PrintPattern {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of rows: ");
int rows = scanner.nextInt();
System.out.println("Printing pattern:");
for (int i = 1; i <= rows; i++) {
for (int j = 1; j <= i; j++) {
System.out.print("* ");
}
System.out.println();
}
}
}
