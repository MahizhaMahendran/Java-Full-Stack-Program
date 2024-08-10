import java.util.Scanner;
public class CompareObjects {
String name;
CompareObjects(String name) {
this.name = name;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter name for first object: ");
String name1 = scanner.nextLine();
System.out.print("Enter name for second object: ");
String name2 = scanner.nextLine();
CompareObjects obj1 = new CompareObjects(name1);
CompareObjects obj2 = new CompareObjects(name2);
System.out.println("First Object: " + obj1.name);
System.out.println("Second Object: " + obj2.name);
if (obj1.equals(obj2)) {
System.out.println("Objects are equal.");
} else {
System.out.println("Objects are not equal.");
}
}
@Override
public boolean equals(Object obj) {
if (this == obj) return true;
if (obj == null || getClass() != obj.getClass()) return false;
CompareObjects that = (CompareObjects) obj;
return name.equals(that.name);
}
}
