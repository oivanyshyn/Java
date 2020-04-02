import java.util.Scanner;

public class BeanMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int numberOfBalls = input.nextInt();

        System.out.print("Enter the number of slots in the bean machine: ");
        int numberOfSlots = input.nextInt();

        int[] slots = new int[numberOfSlots + 1];
        String rotation;

        for (int i = 0; i < numberOfBalls; i++) {

            int sum = 0;
            for (int j = 0; j < numberOfSlots; j++) {

                int randomNumber = (int) (Math.random() * 2);
                sum += randomNumber;
                if (randomNumber == 0)
                    rotation = "L";
                else
                    rotation = "R";
                System.out.print(rotation);
            }
            slots[sum]++;
            System.out.println();
        }

        String[] ball = new String[numberOfSlots + 1];
        for (int i = numberOfBalls; i > 0; i--) {
            for (int j = 0; j <= numberOfSlots; j++) {
                if (i == slots[j]) {
                    ball[j] = "O";
                    slots[j]--;
                } else
                    ball[j] = " ";
                System.out.print(ball[j]);
            }
            System.out.println();
        }
    }}