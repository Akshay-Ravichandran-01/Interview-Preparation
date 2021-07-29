```
import java.util.*;

class Program {
  public String runLengthEncoding(String string) {
  	
		StringBuilder encodedStringCharacters = new StringBuilder();
		int length = 1;
		
		for(int i = 1; i < string.length(); i++){
			char currentLetter = string.charAt(i);
			char previousLetter = string.charAt(i-1);
			
			if((currentLetter != previousLetter) || (length == 9)){
				encodedStringCharacters.append(Integer.toString(length));
				encodedStringCharacters.append(previousLetter);
				length = 0;
			}
			
			length += 1;
		}
		
		encodedStringCharacters.append(Integer.toString(length));
		encodedStringCharacters.append(string.charAt(string.length()-1));
		 
    return encodedStringCharacters.toString();
  }
}

```
