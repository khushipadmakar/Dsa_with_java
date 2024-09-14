public class str {
    
    public static void ispalindrome(String str){
       int n =str.length();
       
       for( int i = 0; i<str.length()/2; i++){
         
       if (str.charAt(i) == str.charAt(n-1-i)){
         System.out.println("number is palindrom");
       }
       else {
         System.out.println("number is not palindrom");
       }
    }}
   
    public static void main(String[] args) {
      String str = "raccar";
      ispalindrome(str);
      System.out.println();
    }
   
}

