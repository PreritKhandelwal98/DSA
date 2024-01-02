import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ans = 'N';

        do {
            System.out.print("Enter Number to show the start pattern: ");
            int input = in.nextInt();

            switch (input) {
                case 1 -> pattern1.pattern1(5);
                case 2 -> pattern2.pattern2(5);
                case 3 -> pattern3.pattern3(5);
                case 4 -> pattern4.pattern4(5);
                case 5 -> pattern5.pattern5(5);
                case 6 -> pattern6.pattern6(5);
                case 7 -> pattern7.pattern7(5);
                case 8 -> pattern8.pattern8(5);
                case 9 -> pattern9.pattern9(5);
                case 10 -> pattern10.pattern10(5);
                case 11 -> pattern11.pattern11(5);
                case 21 -> pattern21.pattern21(5);
                case 22 -> pattern22.pattern22(5);
                case 26 -> pattern26.pattern26(5);
                case 33 -> pattern33.pattern33(5);
                case 35 -> pattern35.pattern35(5);
                default -> System.out.println("Wrong Input");
            }

            System.out.print("Do you want to continue? (Y/N): ");
            ans = in.next().charAt(0);
        } while (ans == 'Y' || ans == 'y');
    }
}
