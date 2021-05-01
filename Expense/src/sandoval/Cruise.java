package sandoval;

public class Cruise implements Expense {
    Destination _dest;

    public Cruise(Destination dest) {
        _dest = dest;
    }
    public float getCost() {

        // Enums work great with switch statements
        switch (_dest) {
            case Mexico:
                return 1000.00f;
            case Europe:
                return 2000.00f;
            case Japan:
                return 3000.00f;
            default:
                return 0.0f;
        }
    }
}
