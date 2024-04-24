import java.util.Scanner;

public class pointavarage {
    public static void main(String[] args) {

     
    Scanner scanner = new Scanner(System.in);

    int maths ,physics , software , history, a;

    System.out.println("maths = " );

    maths = scanner.nextInt();

    System.out.println("physics= " );
    
    physics = scanner.nextInt();

    System.out.println("Sofware= " );

    software = scanner.nextInt();

    System.out.println("History = " );

    history = scanner.nextInt();

    System.out.println("A = ");

    a = scanner.nextInt();

    float average;

    average = (maths + software + history + physics)/4;

    System.out.println("Average = " + average);

    



    }
}