package com.swarup.car;

public class CarServices {
    public final CarDao carDao = new CarDao();

    public Car[] getAllCars() {
        return carDao.getCars();
    }

    public Car getCar(int regNumber){

        for (Car car : getAllCars()){
            if(regNumber == car.getRegNum()){
                return car;
            }
        }
        throw new IllegalStateException(String.format("Car with reg %s not found", regNumber));

    }
    public Car[] getAllElectricCar(){
        //count how many electric cars are there in total
        int count = 0;
        for (Car allCar : getAllCars()) {
            if(allCar.isElectric){
                count++;
            }
        }
        Car[] electricCar = new Car[count];
        int index = 0;
        for (Car allCar : getAllCars()) {
                if(allCar.isElectric){
                    electricCar[index] = allCar;
                    index++;
                }
        }
        return electricCar;
    }

}
