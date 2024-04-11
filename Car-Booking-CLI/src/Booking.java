public class Booking {
    //User Data
    User user1 = new User("Micheal");
    User user2 = new User("Jim");
    User user3 = new User("Dwight");
    User user4 = new User("Pam");
    User[] user= {user1, user2, user3, user4};
    public  User[] getUser() {
        return user;
    }
    //car Data
    Car car1 = new Car(1234, 20.1f, "BMW", false);
    Car car2 = new Car(2012, 23.1f, "Audi", false);
    Car car3 = new Car(4211, 40.1f, "Tesla", true);
    Car car4 = new Car(3321, 10.1f, "Honda", true);

    Car[] car = {car1, car2, car3, car4};

    public Car[] getCar() {
        return car;
    }
}


