import java.util.Scanner;
//Bir sayının basamak sayılarının toplamını hesaplayan program

public class Odev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int numberValue;
        int result = 0;

        System.out.println("Sayi giriniz:");
        number = input.nextInt();

        while (number != 0) {
            numberValue = number % 10;
            result += numberValue;
            number /= 10;
        }
        System.out.println(result);

    }
}
