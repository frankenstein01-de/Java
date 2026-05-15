package muenzautomat;

import java.lang.invoke.LambdaMetafactory;

/** Die nachfolgende Klasse beinhaltet einen sehr einfachen
 * Algorithmus zur Ermittlung des Wechselgelds: Es wird
 * der gesamte Betrag in 1-Cent-Muenzen ausgegeben.
 */ 
public class SimpleChangeCalculator implements ChangeCalculator {

	private static final int[] VALUES={
			1,
			2,
			5,
			10,
			20,
			50,
			100,
			200
	};
	@Override
	public int[] getChange(int euros, int cent)
	{
		int amount = euros*100+cent;
		int[]result = new int[VALUES.length];
		for(int i= VALUES.length-1;i>=0;i--){
			int coin = VALUES[i];
			if(amount>=coin){
				result[i]=amount/coin;
				amount=amount%coin;
			}
		}
		return result;
	}
}
