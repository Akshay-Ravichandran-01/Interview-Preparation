```
import java.util.*;

class Program {
  public static boolean isPalindrome(String str) {
    
		int low = 0;
		int high = str.length() - 1;
		
		while(low <= high){
			if(str.charAt(low) == str.charAt(high)){
				low++;
				high--;
			}
			else{
				return false;
			}
		}
		
		return true;
		
  }
}

```
