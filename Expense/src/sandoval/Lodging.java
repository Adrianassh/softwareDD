package sandoval;

import javax.print.attribute.standard.Destination;

public class Lodging implements Expense{
    Destination _dest;
    int _totalNights;

    public Lodging(Destination dest, int nights) {
        _dest = dest;
        _totalNights = nights;
    }

    public Lodging(sandoval.Destination dest, int totalNights) {
    }

    public float getCost() {
        switch (_dest) {
            case Mexico:
                return 100.00f * _totalNights;
            case Europe:
                return (200.00f * _totalNights) * 1.10f;
            case Japan:
                return (300.00f * _totalNights) * 1.30f;
            default:
                return 0.0f;
        }
    }
}
