boolean isPalindrome(LinkListNode head){
  int len = lengthOfList(head);
  Result p = isPalindromeRecurse(head, len);
  return p.result;
    
}
