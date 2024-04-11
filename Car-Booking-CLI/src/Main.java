import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int ch;
        do{
            System.out.println("1 - Book car ");
            System.out.println("2 - view all user Booked Cars ");
            System.out.println("3 - View all Bookings ");
            System.out.println("4 - View Available Cars");
            System.out.println("5 - View Available Electric Cars ");
            System.out.println("6 - View all Users");
            System.out.println("7 - Exit");
            Scanner scanner = new Scanner(System.in);
            ch = scanner.nextInt();
            switch (ch){
                case 1:
                    BookCar.book();
                    break;
                case 2:break;
                case 3:break;
                case 4:
                    Display.displayAvailableCars();
                    break;
                case 5:
                    Display.displayElectricCars();
                    break;
                case 6:

                    Display.displayUser();
                    break;
            }
        }while(ch !=7);


    }
}