package machineCoding.elevatorSystem;

public class ElevatorSystem {
    public static void main(String[] args) {
        ElevatorController controller = new ElevatorController(2);

        controller.requestElevator(3, Direction.UP);
        controller.requestElevator(5, Direction.DOWN);

        controller.runElevators();
    }
}
