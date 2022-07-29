package homework1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        // First task
        byte number = 123;
        int number2 = 321;
        int result = number - number2;
        System.out.println(result);

        //Second task


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of puonds: ");
        float pounds = sc.nextFloat();
        double kilograms = pounds * 0.454;
        System.out.println("It turns out " + kilograms + " kilograms");

        //Third task
        System.out.print("Enter the amount to be calculated: ");
        int sum = sc.nextInt();
        System.out.print("How many years: ");
        int months = sc.nextInt();
        System.out.print("How many percent: ");
        int percent1 = sc.nextInt();
        double percent = percent1 / 100;

    }
}