import java.util.Scanner;
public class ImperialMetric2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the minimum number of feet(not less than 0): ");
        int number = input.nextInt();
        System.out.println("Enter the maximum number of feet(not more than 30): ");
        int num = input.nextInt();
//      this Prints the solid line
        System.out.print("\n   |    0\"    1\"    2\"    3\"    4\"    5\"    6\"    7\"     8\"    9\"  10\"   11\" \n");

        //check the range from the first number
        for (int m = number; m <= num; m++) {
            // format the output
            System.out.print(m + "'" + " |");
            // to figure the meters
            for (int inches = 0; inches < 12; ) {
                System.out.printf("%6.3f", (m * 12 + inches) * 0.0254);
                inches++;
            }
            System.out.println("");
        }

    }
}
//        for (double feet = number, meters = 20.0; feet <= num; feet++, meters += 5, feet = (feet*12)*0.0254) {
//            System.out.printf("%4.1f |", feet);
//            System.out.printf("%6.3f", footToMeter(feet));
//            System.out.printf("%6.3f |", footToMeter(feet));
//            System.out.printf("%-11.1f", meters);
//            System.out.printf("%7.3f\n", meterToFoot(meters));
//
//            input.close();
//        }
//
//
//    }
//
//    /**
//     *
//     * @param foot takes in distance as feet
//     * @return value as meter using simple calculation of 0.305 * feet
//     */
//    public static double footToMeter(double foot) {
//        return 0.305 * foot;
//    }
//
//    /**
//     *
//     * @param meter takes in distance as meter
//     * @return value as feet using calculation of 3.279 * meter
//     */
//
//    public static double meterToFoot(double meter) {
//        return 3.279 * meter;
//
//
//    }

