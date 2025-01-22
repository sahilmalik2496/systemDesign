package machineCoding.airlineManagement;

class Passenger {
    private String passengerId;
    private String name;
    private String contactNumber;
    private String email;

    public Passenger(String passengerId, String name, String contactNumber, String email) {
        this.passengerId = passengerId;
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    // Getters
    public String getPassengerId() {
        return passengerId;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerId='" + passengerId + '\'' +
                ", name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
