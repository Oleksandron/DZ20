import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float kel = -273.15f;
        float res;
        System.out.println(" Enter degree: ");
        Scanner in = new Scanner(System.in);
        int cel = in.nextInt();
        System.out.println("Enter system, Fahrenheit - 1 or Kelvin - 2: ");
        int num = in.nextInt();
        if (num == 1) {
            CelsiusToFahrenheit far = new CelsiusToFahrenheit();
            res = cel * 9 / 5 + 32;
            System.out.println("Your temperature " + res + " F");
        } else if (num == 2){
            CelsiusToKelvin info  = new CelsiusToKelvin();
            res = cel + kel;
            System.out.println("Your temperature " + res + " K");
        }
        else System.out.println("Your enter incorrect system");
    }
}
