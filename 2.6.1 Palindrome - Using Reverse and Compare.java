boolean isPalindrome(LinkedListNode head){
  LinkedListNode reversed = reverseAndClone(LinkedListNode head);
  return isEqual(head, reversed);
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
