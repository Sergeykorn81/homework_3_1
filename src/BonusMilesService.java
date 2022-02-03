public class BonusMilesService {
    public int calculate(int cost) {

        int price = cost;
        int bonusMiles = price / 20;
        return bonusMiles;
    }
}
