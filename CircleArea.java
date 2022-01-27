//Lab2 Q1
import java.util.Scanner;
public class CircleArea{
    public static void main(String[] args) 
    {
        final double PI = 3.14159; 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double Area = radius * radius * PI;
        System.out.println("The area for the circle of radius " + radius + " is " + Area);
        input.close();
    }
}
