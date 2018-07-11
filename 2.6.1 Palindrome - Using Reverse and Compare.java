boolean isPalindrome(LinkedListNode head){
  LinkedListNode reversed = reverseAndClone(LinkedListNode head);
  return isEqual(head, reversed);
}

LinkedListNode reverseAndClone(LinkedListNode node){
}
