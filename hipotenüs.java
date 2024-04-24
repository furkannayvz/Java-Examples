import java.util.Scanner;

public class hipotenüs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a , b;
        double c;

        System.out.println("a = ");

        a = scanner.nextInt();

        System.out.println("b = ");

        b = scanner.nextInt();

        c = Math.sqrt(a*a + b*b);

        System.out.println(c);


        int a = 10;

        if(a < 40){

            System.out.println("a");
        }
        
        if((a < 30) && (a > 5)){

            System.out.println("b");
        } 

    }
}
