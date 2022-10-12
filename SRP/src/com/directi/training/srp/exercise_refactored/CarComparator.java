package com.directi.training.srp.exercice_refactored;

public class CarFormatter
{
    private final CarManager _carManager;

    public CarFormatter(CarManager carManager)
    {
        _carManager = CarManager;
    }
    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : _carManager._carsDb) {
           if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                 bestCar = car;
           }
        }
        return bestCar;
    }

}