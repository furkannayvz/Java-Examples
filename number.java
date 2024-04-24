import java.util.Scanner;

public class number {
    public static void main(String[] args) {

        int number;
        int percent;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Number = ");
        
        number = scanner.nextInt();

        System.out.println("Percent = ");

        percent = scanner.nextInt();

        float a;

        a = (number * percent)/100;

        System.out.println(a);


    }
}
