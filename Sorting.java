import java.util.*;
public class Sorting {

// bubblesort
    public static void bubblesort(int arr[]){
        for (int i = 0 ; i< arr.length-1 ; i++){
            for (int j = 0; j< arr.length-1-i; j++){
                if (arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
            }
        }
    }
        public static void printarr(int arr[]){
            for(int i =  0; i< arr.length; i++){
             System.out.println(arr[i]+ " ");
            }
            System.out.println();
        }
public static void main(String[] args) {
    int arr[ ] = { 2,68,3,9,4,26,12};
    bubblesort(arr);
    printarr(arr);
}






 
 //SELECTION SORTING
 public static void selectionsort(int arr[]){
        for( int i = 0; i<arr.length-1; i++){
            int minpos = i;
            for (int j =0; j< arr.length; j++){
                if (arr[minpos] < arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
                    arr[minpos] = arr[i];
                    arr[i] = temp;
        }
 }
 public static void printarr(int arr[]){
    for(int i =  0; i< arr.length; i++){
     System.out.println(arr[i]+ " ");
    }
    System.out.println();
}
public static void main(String[] args) {
int arr[ ] = { 2,68,3,9,4,26,12};
selectionsort(arr);
printarr(arr);
}



 

//INSERTION SORT 
  public static void insertion(int arr[]){         
        for(int i =1; i< arr.length; i++){
             int curr = arr[i];
             int prev  = i-1;
               // find correct position
             while(prev >= 0 && arr[prev]> curr){
                  arr[prev+1] = arr[prev];
                  prev--;
             }
             //insertion 
             arr[prev+1] = curr;
        }
    }
    public static void print(int arr[]){
        for(int i =0; i<arr.length; i++){
System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] ={3,6,9,5,66,98,7,4};
        insertion(arr);
        print(arr);
    }




 // Quick sort
public static void printarr(int arr[]){
    for (int i = 0; i<arr.length; i++){
      System.out.print(arr[i]+ " ");
    }
    System.out.println();
}
public static void quicksort(int arr[], int si, int ei){
    if(si>= ei){
        return;
    }
    int pIdx = partition(arr, si, ei);
    quicksort(arr, si, pIdx-1);
    quicksort(arr, pIdx+1, ei);
}
public static int partition(int arr[] ,int si, int ei){
    int pivot = arr[ei];
    int i = si-1;
    for(int j = si; j<ei; j++){
        if (arr[j] <= pivot){
            i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;   
    } 
}
int temp = arr[i + 1];
arr[i + 1] = arr[ei];
arr[ei] = temp;
return i+1;
}
public static void main(String[] args) {
    int arr[] = {5,8,9,6,4,3,21,7,1,0};
    quicksort(arr, 0, arr.length-1);
    printarr(arr);
}


//Mearge sort
public static void printarr(int arr[]){
    for (int i = 0; i<arr.length-1; i++){
      System.out.print(arr[i]+ " ");
    }
    System.out.println();
}
public static void meargesort(int arr[], int si, int ei){
    if (si >= ei){ // base 
        return;
    }
     int mid = si+ (ei-si)/2;
    meargesort(arr, si, mid); // left
    meargesort(arr, mid+1, ei); // right
    mearge(arr, si, mid , ei); //mearge left + right
}
public static void mearge(int arr[], int si, int mid, int ei){
int temp[]= new int[ei-si+1];
int i = si;   //iterate start left
int j = mid+1;  // iterate start right
int k =0;       // iterate temp 
while (i<= mid && j<= ei) {
       if(arr[i] < arr[j]) {
        temp[k] = arr[i];
        i++;
       }   else {
        temp[k] = arr[j];
        j++;
       }
       k++;
}
// left part me bache huye elm
while (i <= mid) {
    temp[k++] = arr[i++];
}
// right part me bache huye elm
while (j<= ei) {
    temp[k++] = arr[j++];
}
for( k= 0, i= si;  k< temp.length; k++, i++){
    arr[i] = temp[k];
}
}
public static void main(String[] args) {
    int arr[] = {1,3,7,6,9,-1,-5,-6,-4,0,5,3,6};
    meargesort(arr,0,arr.length-1);
    printarr(arr);
}
 




    
}
