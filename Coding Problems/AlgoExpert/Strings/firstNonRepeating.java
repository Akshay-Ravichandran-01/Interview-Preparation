import java.util.*;

class Program {

  public int firstNonRepeatingCharacter(String string) {
    
		HashMap<Character, Integer> freq = new HashMap<Character, Integer>();
		
		for(int idx = 0; idx < string.length(); idx++){
			char c = string.charAt(idx);
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}
		
		for(int idx = 0; idx < string.length(); idx++){
			char c = string.charAt(idx);
			if(freq.get(c) == 1){
				return idx;
			}
		}
		
    return -1;
  }
}
