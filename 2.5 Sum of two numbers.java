/*2.5 Sum of Two Numbers
Written By - Aditya Wagholikar*/

LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2, int carry){
  if(l1 == null && l2 == null & carry ==0){
    return null
  }
  
  lln result = new LinkedListNode();
  
  int value = carry;
  
  if(l1 != null){
    value = value + l1.data;
  }
  
  if(l2 != null){
    value = value + l2.data;
  }
  
  result.data = value%10;/*Unit digit of a number*/
  
  /*Recursion*/
  
  if(l1!= null || l2! null){
    LinkedListNode more = addLists(l1 == null? null : l1.next, l2 == null? null : l2.next, value >=10? 1: 0);
  }
  
  return result;
}
