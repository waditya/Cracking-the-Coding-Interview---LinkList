/*2.4 Delete Middle Node
Written by -  Aditya Wagholikar */

boolean deleteNode(LinkedListNode node){
  if(node  == null || node.next == null){
      return false; 
  }
  node.data = node.next.data;
  node.next = node.next.next;
  return true;
}
