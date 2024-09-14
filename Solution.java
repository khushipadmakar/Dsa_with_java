// import java.util.* ;
// import java.io.*; 
// import java.util.Scanner;
public class Solution {
    public static void main(String arg []){
    //    calculate the simple interest
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the Pinciple :");
    //     int  P = sc.nextInt(); //principle
    //     System.out.println("Enter the Rate :");
    //     int R = sc.nextInt();//rate 
    //     System.out.println("Enter the Time :");
    //     int T = sc.nextInt();//time
    //     int SI = (P*R*T)/100;
    //     System.out.println("Simple interst is :"+ SI);



        // check the number prime or not 
        // System.out.println("Enter the number b :");
        //  int  b = sc.nextInt();
        // for(int i =2 ; i<n; i++){
        //     if(n % i == 0){   
        //     } else {
        //         System.out.println("Not prime");
        //     }
        // }


// Swape the number
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number a  :");
// int  a = sc.nextInt();
// System.out.println("Enter the number b :");
//  int  b = sc.nextInt();
//  int temp = a;
//  a =b;
//  b =temp;
//  System.out.println("After swap the number a  :" + a);
//  System.out.println("After swap the number b :"+b);


// Swap the number without third variable 
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number a :");
// int  a = sc.nextInt();
// System.out.println("Enter the number b :");
//  int  b = sc.nextInt();
// a = a+b;
// b = a-b;
// a = a-b;
// System.out.println("After swap the number a  :" + a);
//  System.out.println("After swap the number b :"+b);




// Largest of three number 
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number a  :");
// int  a = sc.nextInt();
// System.out.println("Enter the number b :");
//  int  b = sc.nextInt();
//  System.out.println("Enter the number c :");
//  int  c = sc.nextInt();
//  int f1;
//  int f2;
//  if (a > b){
//     f1 = a;
//  }
//  else{
//     f1 = b;
//  }
//  if(b > c){
//     f2 = b;
//  } else {
//     f2 = c;
//  }
// if (f1 > f2){
//     System.out.println("Largest number is "+ f1);
// }else {
//     System.out.println("Largest number is "+f2);
// }


    
// QUSTION NUMBER 6 FIND THE SUM OF ALL N NUMBER
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number n  :");
//  int  n = sc.nextInt();
//  int sum = 0;
//  int count = 0;
//  for (int i = 0; i<=n; i++){
//     sum = sum +i;
//     count ++;
//  }
//  System.out.println(" Sum of all number "+ sum);



// CALCULATE THE AREA OF CIRCLE AND RANCTANGLE , TRINGLE 
// Scanner sc = new Scanner(System.in);
//  System.out.println("Enter the number a  :");
//  int  a = sc.nextInt();
//  System.out.println("Enter the number b :");
//  int  b = sc.nextInt();
// double circle = 3.14*a*a;
// System.out.println("AREA OF CIRCLE "+ circle);
// int ractangle = a *b;
// System.out.println(" AREa of ractangle "+ ractangle);
// double tringle = (a*b)* 1/2;
// System.out.println("AREA OF TRIMGLE "+ tringle);




// fIND THE EVEN NUMBER 
// Scanner sc = new Scanner(System.in);
//  System.out.println("Enter the number n  :");
//  int  n = sc.nextInt();
//  for (int i =0; i<n; i++){
//   if ( i % 2==0){
//     System.out.println(" Even number is "+ i);
//   }
//  }

//CALCULATE THE AVERAGE OF 25 EXAM SCORE
// Scanner sc = new Scanner(System.in);
//  System.out.println("Enter the number a  :");
//  int  a = sc.nextInt();
//  int sum = 0; 
//  int count =0;
//  int avg =0;
//  for ( int i =1; i<= a ; i++){
//     sum = sum +i;   
//   avg = sum / 25;
//   count++; 
//  }
//  System.out.println("The average of 25 Exam score "+ avg);




//INCOME TAX CALCULATE WITH CONDITIONS 
// Scanner sc = new Scanner(System.in);
//  System.out.println("Enter the number income :");
//  int  income = sc.nextInt();
//  if ( income < 5){
//     System.out.println(" No income tax");
//  }
//  else if (income > 5 || income < 10){
//     System.out.println("income tax is "+ income * 20/100);
//  }
//  else {
//     System.out.println("income tax is "+ income *30/100);
//  }

 
//USING SWITCH OPRATOR
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number a  :");
// int  a = sc.nextInt();
// System.out.println("Enter the number b :");
// int  b = sc.nextInt();
// System.out.println("Enter the number  :");
// int  number = sc.nextInt();



// switch(number){
//     case 1: 
//     System.out.println(a+b);
//     break;
//     case 2 :
//      System.out.println(a-b);
//     break;
//     case 3 : 
//     System.out.println(a*b);
//     break;
//     case 4 : 
//     System.out.println(a/b);
//     break;
//     default :
//     System.out.println("operation dose not found"); 
// }



//print prime numbers.
// int i, number, count =0;
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number : ");
// number = sc.nextInt();
// for ( i = 2 ; i <= number/2; i++) {
//     if(number % 2==0){
//         count++;
//         break;
//     }
// }
//     if (count == 0 && number != 1) {
//         System.out.println(number + " is a prime");
//     }
//     else{
//         System.out.println(number +" is not a prime");
//     }
    



// int i , number , exponent ;
// long power = 1;
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number : ");
// number = sc.nextInt();
// Scanner bc = new Scanner(System.in);
// System.out.println("Enter the exponent: ");
//  exponent = bc.nextInt();
// for(i =1 ; i<= exponent; i++){
//     power = power * number ;
// }
// System.out.println(" The numer "+ number + " power " + exponent + " "+ power);



    }
}