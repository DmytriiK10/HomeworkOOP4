import java.util.Scanner;
public class ConverterTemperature {
    public static void main(String[] args) {
            System.out.print("Введіть 2 рази температуру в Цельсіях: ");
            Scanner ss = new Scanner(System.in);
            double cel = ss.nextDouble();
            double cal = ss.nextDouble();
            double farRez = convertcelsiusToFarengate(cel);
            double celRez = conveertcelsiusToCalvins(cel);
            System.out.println("Фаренгейти= " + farRez);
            System.out.println("Кельвіни= " + celRez);

        }

        public static double convertcelsiusToFarengate(double cel) {
            return (cel * 1.8) + 32;
        }

        public static double conveertcelsiusToCalvins(double cel) {
            return (cel + 273.15);
        }


}





