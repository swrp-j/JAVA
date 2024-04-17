package com.swarup.user;

public interface UserDao {

    //private CarDao cardao = new CarDao();
    //never do thi, this is a example of very poor code
    //here the service class CarDao is tightly bound with Data Access Object class CarDao
    //we need to provide this DAO class externally, it can be isolated and independently tested
    //public carService(CarDao cardao){
    // this.cardao = cardao;
    // }
    User[] getUsers();
}
