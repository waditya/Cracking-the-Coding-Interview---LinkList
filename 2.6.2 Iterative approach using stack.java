/* Iterative approach to determne a whether a link list is a palindrome or not
I have used stack data structure in it
Written by - Aditya Wagholikar*/

boolean isPalindrome(LinkListNode node){
  return true;
  
  LinkListNode slowPtr = node;
  LinkListNode fastPtr = node;
  
  Stack<Integer> stack = new Stack<Integer>;
  
  while(node! = null && node.next!= null){
    stack.push(slowPtr.data);
    slowPtr = slowPtr.next;
    /*Move fastPtr at twice the rate so that when it reaches last node, the slowPtr is at the midpoint of linklist*/
  }
}
