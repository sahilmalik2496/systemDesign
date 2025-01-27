package machineCoding.carRental;

import java.util.Date;

public class CarRentalApp {
    public static void main(String[] args) {
        CarRentalService service = new CarRentalService();
        Car car1 = new Car("1", "Toyota", "Corolla", 50);
        Car car2 = new Car("2", "Honda", "Civic", 60);
        service.addCar(car1);
        service.addCar(car2);

        Customer customer = new Customer("C1", "John Doe");

        Date startDate = new Date(); // Assuming today as start date
        Date endDate = new Date(startDate.getTime() + 2 * 24 * 60 * 60 * 1000); // 2 days later
        customer.rentCar(car1, startDate, endDate);

        customer.returnCar(car1);
    }
}
