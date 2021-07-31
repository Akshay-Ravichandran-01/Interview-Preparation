```
import java.util.*;

class Program {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
		
		LinkedList currentNode = linkedList;
		
		while(currentNode != null && currentNode.next != null){
			if(currentNode.value == currentNode.next.value){
				currentNode.next = currentNode.next.next;
			}
			else{
				currentNode = currentNode.next;
			}
		}
		
		return linkedList;
  }
}

```
