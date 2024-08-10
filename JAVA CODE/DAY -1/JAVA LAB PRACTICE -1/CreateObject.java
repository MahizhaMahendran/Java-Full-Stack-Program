import java.util.Scanner;
public class CreateObject {
String name;
CreateObject(String name) {
this.name = name;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a name for the object: ");
String name = scanner.nextLine();
CreateObject obj = new CreateObject(name);
System.out.println("Object created with name: " + obj.name);
}
}
