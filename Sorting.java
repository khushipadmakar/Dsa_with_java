import java.util.*;
public class Sorting {

// bubblesort
//     public static void bubblesort(int arr[]){
//         for (int i = 0 ; i< arr.length-1 ; i++){
//             for (int j = 0; j< arr.length-1-i; j++){
//                 if (arr[j]> arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp ;
//                 }
//             }
//         }
//     }
//         public static void printarr(int arr[]){
//             for(int i =  0; i< arr.length; i++){
//              System.out.println(arr[i]+ " ");
//             }
//             System.out.println();
//         }
// public static void main(String[] args) {
//     int arr[ ] = { 2,68,3,9,4,26,12};
//     bubblesort(arr);
//     printarr(arr);
// }


 //SELECTION SORTING
//  public static void selectionsort(int arr[]){
//         for( int i = 0; i<arr.length-1; i++){
//             int minpos = i;
//             for (int j =0; j< arr.length; j++){
//                 if (arr[minpos] < arr[j]){
//                     minpos = j;
//                 }
//             }
//             int temp = arr[minpos];
//                     arr[minpos] = arr[i];
//                     arr[i] = temp;
//         }
//  }
//  public static void printarr(int arr[]){
//     for(int i =  0; i< arr.length; i++){
//      System.out.println(arr[i]+ " ");
//     }
//     System.out.println();
// }
// public static void main(String[] args) {
// int arr[ ] = { 2,68,3,9,4,26,12};
// selectionsort(arr);
// printarr(arr);
// }




//INSERTION SORT 
 //  public static void insertion(int arr[]){         
//         for(int i =1; i< arr.length; i++){
//              int curr = arr[i];
//              int prev  = i-1;
//                // find correct position
//              while(prev >= 0 && arr[prev]> curr){
//                   arr[prev+1] = arr[prev];
//                   prev--;
//              }
//              //insertion 
//              arr[prev+1] = curr;
//         }
//     }
//     public static void print(int arr[]){
//         for(int i =0; i<arr.length; i++){
// System.out.println(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int arr[] ={3,6,9,5,66,98,7,4};
//         insertion(arr);
//         print(arr);
//     }






    
}
