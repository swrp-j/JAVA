import java.util.Scanner;
import java.util.UUID;

public class BookCar {
      static  int book(){
          int flag = 0;
          Booking booking = null;



          if(Display.displayAvailableCars()!=0){

                 System.out.println("select a car: ");
                 Scanner scanner = new Scanner(System.in);
                 int regcar = scanner.nextInt();
                 Display.displayUser();
                 System.out.println("select a user: ");

                 String userId = scanner.next();
                 System.out.println(userId);

              for (int i = 0; i < booking.car.length; i++) {
                  Car tempcar = booking.car[i];
                  if (regcar == tempcar.regNum) {
                      flag =1;
                      tempcar.isBooked = true;
                  } else {
                      flag = 0;
                      System.out.println("invalid reg no");

                  }
                  if (flag == 0) return flag;
              }
              for (int i = 0; i < booking.car.length; i++) {
                  User tempuser = booking.user[i];
                  if(userId.equals( tempuser.uniqueId)) {
                      flag = 1;
                      tempuser.hasBooked = true;
                  }
                  else {
                      flag = 0;
                      System.out.println("invalid user id");
                  }
              }if (flag ==0 ) return flag;
        }

            return flag;
      }
}
