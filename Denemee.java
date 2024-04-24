public class Denemee {
    public static void main(String[] args) {

        int exam1 = 50;
        int exam2 = 70;
        int lastexam = 90;

        int result = (exam1 + exam2 + lastexam)/3;
        System.out.println("Result = " + result);


        int add = lastexam - exam1;
        System.out.println(add);

        int a = 10;
        a += 5;
        System.out.println(a);

        int number1 = 5;
        int number2 = 6;

        boolean sonuc = number1 == number2;
        boolean sonuc2 = number1 != number2;
        boolean sonuc3 = number2 < number1;
        System.out.println(sonuc);

        int b = 5;
        int c = 3;

        boolean sonucc = b > c && c < 9;
        boolean sonucc1 = b > 2 || b > 50;
        boolean sonucc2 = b > 9 ? true : false;
        String sonucc3 = c < b ? "Yes" : "No";

        System.out.println(sonucc);

        

}
}
