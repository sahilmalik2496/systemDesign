package machineCoding.carRental;

import java.util.Date;

class Rental {
    private Customer customer;
    Car car;
    private Date startDate;
    private Date endDate;
    private double totalAmount;

    public Rental(Customer customer, Car car, Date startDate, Date endDate) {
        this.customer = customer;
        this.car = car;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void calculateAmount() {
        long days = (endDate.getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24);
        totalAmount = days * car.rentalPricePerDay;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
