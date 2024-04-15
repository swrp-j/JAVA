public class Display {
    Booking.getUser();


     void displayUser(){
        UserDao.getusers

    }
    static int displayElectricCars(){
        int flag = 0;
        Booking booking = new Booking();
        for (int i = 0; i < booking.car.length; i++) {
            if(booking.car[i].isElectric){
                displayCar(i);
                flag = 1;

            }
        }
        return flag;
    }
    static int displayAvailableCars(){
        int flag = 0;
        Booking booking = new Booking();
        for (int i = 0; i < booking.car.length; i++) {
            if(!booking.car[i].isBooked) {
                displayCar(i);
                flag = 1;
            }
        }
        if(flag ==0){
            System.out.println("No Cars are Available");
        }
        return flag;
    }

    static void displayBookedCars(){
        int flag = 0;
        Booking booking = new Booking();
        for (int i = 0; i < booking.car.length; i++) {
            if(booking.car[i].isBooked) {
                System.out.println("");
                flag = 1;
            }
        }
        if(flag == -0){
            System.out.println("No Cars are Available");
        }
    }

    private static void displayCar(int i) {
        Booking booking = new Booking();
        Car car = booking.car[i];
        System.out.println("regNo.: "+car.regNum + " brand: "+ car.brand+ " price: "+ car.price+" isElectric: " + car.isElectric);

    }


}
