import java.sql.SQLOutput;
import java.util.Scanner;
public class Homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number for x: ");
        double x = input.nextDouble();
        System.out.print("Enter number for y: ");
        double y = input.nextDouble();
        System.out.print("Enter number for z: ");
        double z = input.nextDouble();
        if(x<y && y<z) {
            System.out.println("Numbers will increase");
        }
        else if (x>y && y>z) {
            System.out.println("Numbers will decrease");
        }
        else
            System.out.println("Neither");


    }
}
