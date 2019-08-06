import java.util.HashMap;

public class FindFrequency {

	public static int[] findFreqArray(int [] arr) {
		//Big O of n
		int [] freq = new int [11];
		for (int i : arr) {
			freq[i] += 1;
		}
		return freq;
	}
	
	public static HashMap<Integer, Integer> findFreqHash(int [] arr){
		//Big O of n
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			if(map.containsKey(i)) {
				map.replace(i, map.get(i) + 1);
			}
			else {
				map.put(i, 1);
			}
		}
		return map;
		
	}
	
}
