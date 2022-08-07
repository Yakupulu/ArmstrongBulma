import java.util.Scanner;

//100-10000 arası armstrong bulma

public class Odev2 {
    public static void main(String[] args) {



        for (int i = 100; i < 10000; i++) {
            int counter = 0,result = 0;
            int iTemp = i;
            int value;


            while (iTemp != 0) {
                iTemp /= 10;
                counter++;
            }
            iTemp = i;
            while (iTemp != 0) {
                value = iTemp % 10;
                int pow = 1;
                for (int k = 1; k <= counter; k++) {
                    pow *= value;
                }
                result += pow;
                iTemp /= 10;
            }

            if (result == i) {
                System.out.println(i + "   bir armstrong sayidir.");
            }


        }
    }
}
