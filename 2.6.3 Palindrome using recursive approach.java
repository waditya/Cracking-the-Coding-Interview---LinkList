/*Palindrome Check using Recursion*/
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

/*Custom class definition for Class Result*/

class Result{
  public LinkedListNode node;
  public boolean result;
}

Result isPalindrome(LinkListNode head, int length){
  //Condition  for even number of nodes
  if(head == null || length <= 0){
    return new Result(head, true);
  }else if(length == 1){
    //Condition for Odd Number of Nodes
    return new Result(head.next, true);
  }
  
  /*Recurse on sublist*/
  
  Result res = isPalindromeRecurse(head.next, length-2);
  
  /*If child calls are not palindrome, pass back a failure*/
  
  if(!res.result || res.node == null){
    return res;
  }
  
  /*Check if it matches corresponding node on the other side*/
  
  res.result = (head.data == res.node.data);
  
  /*Return corresponding node*/
  
  res.node = res.node.next;
  
  return res;
}
