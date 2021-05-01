package sandoval;

import java.util.ArrayList;

public class VacationCalculator {
    public static void main(String[] args) {
        VacationCalculator vc = new VacationCalculator();

        float japanCost = vc.calculateVacationCost(Destination.Japan, 5);
        float mexicoCost = vc.calculateVacationCost(Destination.Mexico, 3);
        float europeCost = vc.calculateVacationCost(Destination.Europe, 7);

        System.out.format(String.format("Total cost for trip to Japan:  $%.2f%n", japanCost));
        System.out.format(String.format("Total cost for trip to Mexico: $%.2f%n", mexicoCost));
        System.out.format(String.format("Total cost for trip to Europe: $%.2f%n", europeCost));
    }
    public float calculateVacationCost(Destination dest, int totalNights) {
        List<Expense> iterate = new ArrayList<Expense>();
        iterate.add(new Cruise(dest));
        iterate.add(new Dining(dest, totalNights));
        iterate.add(new Lodging(dest, totalNights));

        float totalCost = tallyExpenses(iterate);
        return totalCost;
    }
    private float tallyExpenses(List<Expense> expenses) {
        float totalCost = 0;

        for(Expense e : expenses) {
            totalCost += e.getCost();
        }

        return totalCost;
    }

}