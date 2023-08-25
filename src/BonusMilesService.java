public class BonusMilesService {
    public int calculate (int price) {
        int mile = 20;
        int reselt;
        if (price > 0) {
            reselt = (price / mile);
        } else {
            reselt = 0;
        }

        return reselt;
    }
}
