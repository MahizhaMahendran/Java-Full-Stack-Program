import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = scanner.nextLine();
String reversedStr = new StringBuilder(str).reverse().toString();
System.out.println("Original String: " + str);
System.out.println("Reversed String: " + reversedStr);
if (str.equals(reversedStr))
System.out.println(str + " is a palindrome.");
else
System.out.println(str + " is not a palindrome.");
}
}
