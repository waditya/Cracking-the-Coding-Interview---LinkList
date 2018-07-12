boolean isPalindrome(LinkListNode head){
  int len = lengthOfList(head);
  Result p = isPalindromeRecurse(head, len);
  return p.result;    
}

int lengthOfList(LinkedListNode node){
  int size = 0;
  while(node != null){
    size++;
    node = node.next;
  }
  return size;
}

class Result{
  public LinkedListNode node;
  public boolean result;
}
