package machineCoding.carRental;

import java.util.Date;

class Customer {
    private String customerID;
    private String name;

    public Customer(String customerID, String name) {
        this.customerID = customerID;
        this.name = name;
    }

    public void rentCar(Car car, Date startDate, Date endDate) {
        if (car.isAvailable()) {
            car.setStatus("booked");
            Rental rental = new Rental(this, car, startDate, endDate);
            rental.calculateAmount();
            System.out.println("Rental confirmed! Total Amount: " + rental.getTotalAmount());
        } else {
            System.out.println("Car is not available.");
        }
    }

    public void returnCar(Car car) {
        car.setStatus("available");
        System.out.println("Car returned.");
    }
}
