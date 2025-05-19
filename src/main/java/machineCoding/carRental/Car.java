package machineCoding.carRental;

class Car {
    private String carID;
    private String make;
    private String model;
    int rentalPricePerDay;
    private String status; // available, booked, under maintenance

    public Car(String carID, String make, String model, int rentalPricePerDay) {
        this.carID = carID;
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
        this.status = "available";
    }

    public boolean isAvailable() {
        return status.equals("available");
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDetails() {
        return carID + " " + make + " " + model + " Price per day: " + rentalPricePerDay;
    }
}

