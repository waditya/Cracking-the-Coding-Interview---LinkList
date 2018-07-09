/* Pass in the had of the linklist and the value to partition around
Written by - Aditya Wagholikar. 
Date - 7 Jul 2018. */

LinkListNode partition(LinkListNode node, int partition){
    LinkListNode beforeStart = null;
    LinkListNode beforeEnd = null;
    LinkListNode afterStart = null;
    LinkListNode afterEnd = null;
  
  /* Partition List*/
  
    while(node!= null){
           
      if(node.data < partition){
           /*Insert node into the end of before list*/
        
            if(beforeStart == null){
              beforeStart = node;
              beforeEnd = beforeStart;
            } else {
              beforeEnd.next = node;
              beforeEnd = node;
            }
      }else{
          /* Insert node into end of after list*/
        
          if(afterStart == null){
              afterStart = node;
              afterEnd = afterStart;
          }else{
              afterEnd.next = node;
              afterEnd = node;               
          }
      }
      node = next;
    }
    
    if(beforeStart == null){
        return afterStart;
    }
  
    /* Merge before list and after list*/
  
    beforeEnd.next = afterStart;
    return beforeStart;
}
