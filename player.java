import java.util.*;

class PlayerBO
{
  void binarySearch(int player[], int first, int last, int key){  
   int mid = (first + last)/2;
   while( first <= last ){
      if ( arr[mid] < key ){
        first = mid + 1;
      }else if ( arr[mid] == key ){
        System.out.println("Element is found at index: " + mid);
        break;
      }else{
         last = mid - 1;
      }
      mid = (first + last)/2;
   }
   if ( first > last ){
      System.out.println("Element is not found!");
   }
  void searchByName(ques1 player[],String name,int r)
  {
    if()
  }
}
