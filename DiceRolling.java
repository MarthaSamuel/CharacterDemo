
/**
 * Simulate rolling two six-sided die, keep statistics,we will count the number of times each number of rolls occur
 * 
 *   N11d
 *  Dimgba Martha Otisi 
 * @2020,January
 * @martha_samuel_
 * @author Duke Software Team
 *
 */
import java.util.Random;

public class DiceRolling
{
	public void simulate(int rolls){
		Random rand = new Random();
		//we create an array now.for 2-12 we need at least 11 counters
		//we use 13 because we want the the numbers to rhymr with the position of the array
		//we ignore the 0 and 1 counters
		int [] counts = new int [13];
	

		for(int k=0; k < rolls; k++){
			int d1 = rand.nextInt(6) + 1;
			int d2 = rand.nextInt(6) + 1;
			//this println confirms our counters are running accurately with a small number of times.say 10
			System.out.println("roll is " + d1 + "+" + d2 + "=" + (d1+d2));
			counts[d1+d2] += 1;
		}
		
		for (int k=2; k <=12; k++) {
		    System.out.println(k + "'s=\t" + counts[k] + "\t" + 100.0 * counts[k]/rolls);
		}
		
}

	
	public void simpleSimulate(int rolls){
		Random rand = new Random();
		int twos = 0;
		int twelves = 0;

		for(int k=0; k < rolls; k++){
			int d1 = rand.nextInt(6) + 1;
			int d2 = rand.nextInt(6) + 1;
			if (d1 + d2 == 2){
			    twos += 1;
			}
			else if (d1 + d2 == 12){
			    twelves += 1;    
			}
		}
		
		System.out.println("2's=\t" + twos + "\t" + 100.0 * twos/rolls);
		System.out.println("12's=\t"+twelves+"\t"+100.0*twelves/rolls);
	}

}
