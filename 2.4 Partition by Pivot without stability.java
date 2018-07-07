/* Pass in the had of the linklist and the value to partition around without stability
Written by - Aditya Wagholikar 
Date - 7 Jul 2018 */

LinkListNode partition(LinkListNode node, int partition){
    LinkListNode head = node;
    LinkListNode tail = node;
  
    while(node != null){
        LinkListNode next = node.next;
      
        if (node.data < partition){
            /* Insert Node at the head*/
          
            node.next = head;
            head = node;
        }else{
            /*Insert node at the tail*/
            tail.next = node;
            tail = node;
        }
        node = next;
    }
    tail.next = null;
  
    /*The head has changed , so we need to 
    return it to the user*/
  return;
}
