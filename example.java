import java.util.Scanner;

public class example {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Name = ");

        String name = scanner.nextLine();

        System.out.println("Lastname = ");

        String lastname = scanner.nextLine();

        System.out.println("Age = ");
        int age = scanner.nextInt();
        System.out.println("Name = " + name + "Lastname = "+ lastname+ "Age = "+ age );

        System.out.println("a = ");
        int a = scanner.nextInt();
        System.out.println("b = ");
        int b = scanner.nextInt();
        System.out.println("c = ");
        int c = scanner.nextInt();
        
        System.out.println("Result = " + (a+b+c)/3);

         a = 10;
        a += 5;
        System.out.println(a);


        System.out.println("Age = ");
        int agenummber = scanner.nextInt();
        System.out.println("Number =  " + agenummber);

        System.out.print("Kilo = ");
        double kilo = scanner.nextDouble();

        System.out.println("Kilo = " + kilo);


    }
}
