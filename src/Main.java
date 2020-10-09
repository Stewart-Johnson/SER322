import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Computer Database");
        System.out.println("");
        System.out.println("Menu Options:");
        System.out.println("1. add gpu");
        System.out.println("2. add cpu");
        System.out.println("3. add ram ");
        System.out.println("4. add motherboard");
        System.out.println("5. add brand");
        System.out.println("6. delete gpu");
        System.out.println("7. delete cpu");
        System.out.println("8. delete ram ");
        System.out.println("9. delete motherboard");
        System.out.println("10. delete brand");
        System.out.println("11. update gpu");
        System.out.println("12. update cpu");
        System.out.println("13. update ram ");
        System.out.println("14. update motherboard");
        System.out.println("15. update brand");
        System.out.println("16. special query 1");
        System.out.println("17. special query 2");
        System.out.println("18. special query 3");
        System.out.println("19. sepcial query 4");
        System.out.println("20. special query 5");
        System.out.println("");
        System.out.print("Please select an option from 1-20\r\n");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int input = Integer.parseInt(br.readLine());

            if(input < 0 || input > 21) {
                System.out.println("You have entered an invalid selection, please try again\r\n");
            } else if(input == 22) {
                System.out.println("You have quit the program\r\n");
                System.exit(1);
            } else {
                System.out.println("You have entered " + input + "\r\n");
            }
        } catch (IOException ioe) {
            System.out.println("IO error trying to read your input!\r\n");
            System.exit(1);
        }
    }
}
