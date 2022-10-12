package com.directi.training.srp.exercice_refactored;


public class CarFormatter
{
    private final CarManager _carManager;

    public CarFormatter(CarManager carManager)
    {
        _carManager = CarManager;
    }
    public String getCarsNames()
    {
            StringBuilder sb = new StringBuilder();
            for (Car car : _carManager._carsDb) {
                sb.append(car.getBrand());
                sb.append(" ");
                sb.append(car.getModel());
                sb.append(", ");
            }
            return sb.substring(0, sb.length() - 2);
    }

}