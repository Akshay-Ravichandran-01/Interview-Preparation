```
import java.util.*;

class Program {
  public static void removeKthNodeFromEnd(LinkedList head, int k) {
    
		LinkedList fast = head;
		LinkedList slow = head;
		
		for(int i = 0; i < k; i++){
			fast = fast.next;	
		}
		
		if(fast == null){
			head.value = head.next.value;
			head.next = head.next.next;
			return;
		}
		
		while(fast.next != null){
			fast = fast.next;
			slow = slow.next;
		}
	
		slow.next = slow.next.next;
		
  }

  static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }
}

```
