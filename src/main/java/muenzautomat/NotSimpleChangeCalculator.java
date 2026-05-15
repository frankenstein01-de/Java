package muenzautomat;

public class NotSimpleChangeCalculator implements ChangeCalculator {
    private static final int[] VALUES={
            1,
            2,
            5,
            10,
            20,
            50,
            100,
            200};

    @Override
    public int[] getChange(int euros, int cent){
        int preis=euros*100+cent;
        int[]result = new int[VALUES.length];
        for(int i=VALUES.length-1;i>=0;i--){
            int aktuelleMünze=VALUES[i];
            if(preis>=aktuelleMünze){
                result[i]=preis/aktuelleMünze;
                preis = preis%aktuelleMünze;

            }
        }
        return result;

    }

}
