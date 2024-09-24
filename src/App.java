import java.util.Scanner;



public class App {



    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }



    private static void inputThenPrintSumAndAverage() {

        int sum = 0;

        int count = 0;

        Scanner input = new Scanner(System.in);



        while (true) {

            System.out.print("Enter a number: ");

            try {

                int num = Integer.parseInt(input.nextLine());

                sum += num;

                count++;

            } catch (NumberFormatException e) {

                break;  // Break loop when input is not an integer

            }

        }



        long average = 0;

        if (count > 0) {

            average = Math.round((double) sum / count);  // Calculate the average and round it

        }



        System.out.println("SUM = " + sum + " AVG = " + average);

    }

}

