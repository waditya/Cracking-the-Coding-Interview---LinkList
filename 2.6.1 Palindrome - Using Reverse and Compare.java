boolean isPalindrome(LinkedListNode head){
  LinkedListNode reversed = reverseAndClone(LinkedListNode head);
  return isLinkListEqual(head, reversed);
}

LinkedListNode reverseAndClone(LinkedListNode node){
    LinkedListNode head = null;
    while(node != null){
      LinkedListNode node1 = new LinkedListNode(node.value);
      node1.next = head;
      head = node1;
      node = node.next;
    }
  return head;
}

boolean isLinkListEqual(LinkedListNode l1, LinkedListNode l2){
  while(l1 != null && l1 != null){
    if(l1.value != l2.value){
      return false;
    }
    
    l1 = l1.next;
    l2 = l2.next;
    
  }
  //This ensures that link list with unequal lengths are not equal
  return l1 == null && l2 == null
}
