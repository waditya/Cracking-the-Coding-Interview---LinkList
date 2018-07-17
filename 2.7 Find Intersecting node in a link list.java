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
  
  /*Determine the shorter and longer linked list and assign them appropriate pointers -- shorter and longer*/
  
  LinkedListNode shorter = result1.length < result2.length? list1:list2;
  LinkedListNode longer = result1.length < result2.length? list2:list1;
  
  /*Increment the longer pointer by the difference of lengths*/
  
  longer = getKthNode(longer, Math.abs(result1.length - result2.length));
  /*Increment both the pointers until the intersecting node*/
  
  while(longer != shorter){
    shorter = shorter.next;
    longer = longer.next;
  }
  
  /*Return the intersecting node*/
  //return longer;
  //OR
  return shorter;
  
}

//Class definition

class Result{
  public LinkedListNode tail;
  public int size;
  
  //Over-ride a default constructor
  
  public Result(LinkedListNode tail, int length){
    this.tail = tail;
    this.length = length;
  }
}
