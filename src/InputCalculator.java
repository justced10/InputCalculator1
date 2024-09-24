import java.util.Scanner;

public class InputCalculator {



    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);



        int sum = 0;

        int count = 0;



        while (true) {

            System.out.print("Enter a number: ");

            String input = scanner.nextLine();



            try {

                int number = Integer.parseInt(input);

                sum += number;

                count++;

            } catch (NumberFormatException e) {

                break; // Exit the loop if input is not an integer

            }

        }



        long average = count == 0 ? 0 : Math.round((double) sum / count);



        System.out.println("SUM = " + sum + " AVG = " + average);

    }



    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

}