/*2.4 Delete Middle Node
Written by --  Aditya Wagholikar */

boolean deleteNode(LinkedListNode node){
  //Return False if the given node is NULL or the last node
  if(node  == null || node.next == null){
      return false; 
  }
  //Copy data of next node in current node
  node.data = node.next.data;
  //Copy the refernce of next node's next  to current nodes next
  node.next = node.next.next;
  return true;
}
