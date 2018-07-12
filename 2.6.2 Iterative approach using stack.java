/* Iterative approach to determne a whether a link list is a palindrome or not
I have used stack data structure in it
Written by - Aditya Wagholikar*/

boolean isPalindrome(LinkListNode node){
  
  
  LinkListNode slowPtr = node;
  LinkListNode fastPtr = node;
  int top;
  
  Stack<Integer> stack = new Stack<Integer>;
  
  while(node! = null && node.next!= null){
    stack.push(slowPtr.data);
    slowPtr = slowPtr.next;
    /*Move fastPtr at twice the rate so that when it reaches last node, the slowPtr is at the midpoint of linklist*/
    
    fastPtr= fastPtr.next.next; 
    
  }
  /*If link list has odd nodes, the slowPtr is at one node before the middle node and fastPtr is at the last node 
  and not the null node after it. Move the slowPtr to the middle of the link list*/
  
  if(fastPtr != null){
    slowPtr = slowPtr.next;
  }
  
  //Now compare the second half of linklist (using slowPtr) with the value in stack
  
  while(slwoPtr != null){
    top = stack.pop().intValue;
    if(top != slowPtr.data){
      return false;
    }
    slowPtr = slowPtr.next;
  }
  return true;
}
