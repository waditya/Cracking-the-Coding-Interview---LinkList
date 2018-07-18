/*Loops - Detect loops in linkedlist using fast runner and slow runner approach
Written by - Aditya Wagholikar.*/

LinkedListNode findBeginningNode(LinkedListNode head){
  LinkedListNode ptrSlow = head;
  LinkedListNode ptrFast = head;
  
  /*Find the meeting point. It should be LOOP_LENGTH - k steps into the linkedlist*/
  
  while(ptrFast != null && ptrFast.next!= null){
    ptrSlow = sptrSlow.next;
    ptrFast = ptrFast.next.next;
    
    if(ptrSlow == ptrFast){
      //This happens either in case of loop  intersection or nodes reaching end of linked list (which do not have loop)
      break;
    }
  }
  
  /*Error check - no meeting point and therefore no loop*/
  
  if(fast == null || fast.next == null){
    return null;
  }
  
  /*Move slowPtr to head. Keep fast at meeting point. Each are k steps from the loop start. 
  If they move at same pace, they must meet at loop start*/
  
  slowPtr = head;
  
  while(slowPtr != fastPtr){
    slowPtr = slowPtr.next;
    fastPtr = fastPtr.next;
  }
  
  /*Both now point to the same starting point of the LOOP*/
  
  return fastPtr;
}

