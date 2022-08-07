import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, numberCounter = 0;
        int tempNumber;
        int basValue;
        int pow = 1;
        int result = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi giriniz:");
        number = inp.nextInt();
        tempNumber = number;


        //basamak Sayısı
        while (tempNumber != 0) {
            tempNumber /= 10;
            numberCounter++;
        }

        tempNumber = number;
        //basamak değerinini basamak sayısı üssünü alma

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            pow = 1;
            for (int i = 1; i <= numberCounter; i++) {
                pow *= basValue;
            }
            result += pow;
            tempNumber /= 10;
        }

        if (result==number){
            System.out.println(number+" bir armstrong sayidir.");
        }else{
            System.out.println(number+" bir armstrong sayi degildir.");
        }

    }
}

