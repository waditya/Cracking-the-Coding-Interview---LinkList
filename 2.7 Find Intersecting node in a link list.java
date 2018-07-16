/* Intersection in a link list - Determine the common node (intersection) by reference
Written By - Aditya Wagholikar. */

LinkedListNode findIntersection(LinkedListNode list1, LinkedListNode list2){
  if(list1 == null || list2 == null){
    //If either of the list is null, return null i.e. there is no intersection
    return null;
  }
  
  /*Get tail and lengths of linklist*/
  
  Result result1 = getTailAndLength(list1);
  Result result2 = getTailAndLength(list2);
  
  /* If the tail nodes do not match, there is no intersection */
  
  if(result1.tail != result2.tail){
    return null;
  }
  
}
