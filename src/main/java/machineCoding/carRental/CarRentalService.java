package machineCoding.carRental;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class CarRentalService {
    private List<Car> cars;
    private List<Rental> rentals;

    public CarRentalService() {
        cars = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> findAvailableCars(Date startDate, Date endDate) {
        List<Car> availableCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.isAvailable()) {
                availableCars.add(car);
            }
        }
        return availableCars;
    }

    public void rentCar(Customer customer, Car car, Date startDate, Date endDate) {
        Rental rental = new Rental(customer, car, startDate, endDate);
        rental.calculateAmount();
        rentals.add(rental);
        car.setStatus("booked");
    }

    public void returnCar(Rental rental) {
        rental.car.setStatus("available");
        rentals.remove(rental);
        System.out.println("Car returned and rental ended.");
    }
}
