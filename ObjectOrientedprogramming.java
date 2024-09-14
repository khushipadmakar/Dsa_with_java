
public class ObjectOrientedprogramming {

//       public static void main(String[] args) {
//         pen s = new pen();
//         s.changecolor("blue");
//         System.out.println(s.color);
//         System.out.println(s.tip); 
//       }
// }
// class pen{
//     String color ;
//     int tip;
//     void changecolor(String newcolor){
//       color = newcolor;
//     }
//     void changetip(int newtip){
//       tip = newtip;
//     }
// }


// object and class
// public static void main(String[] args) {
//    student s = new student();
//     s.biodata("chahat","vidisha","government",123,32706,10);
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the name =");
//     s.name = sc.next();
//     System.out.println("Enter the address =");
//     s.address = sc.next();
//     System.out.println("Enter the schoolname =");
//     s.schoolname = sc.next();
//     System.out.println("Enter the roll number =");
//     s.roll = sc.nextInt();
//     System.out.println("Enter the scholar number =");
//     s.scholarno = sc.nextInt();
//     System.out.println("Enter the standard =");
//     s.standard = sc.nextInt();
//     System.out.println("your name is :"+s.name);
//     System.out.println("your address is :"+s.address);
//     System.out.println("School name :"+s.schoolname);
//     System.out.println("roll number :"+s.roll);
//     System.out.println("Scholar number :"+s.scholarno);
//     System.out.println("class :"+s.standard);
// }
// }
// class student {
//     String name;
//     String address;
//     String schoolname;
//     int roll ;
//     int scholarno ;
//     int standard  ;
// void biodata(String newname , String newaddress , String newschoolname , int newroll ,int newscholarno ,int newstandard){
//         this.name = newname;
//         this.address = newaddress;
//         this.schoolname = newschoolname;
//         this.roll = newroll;
//         this.scholarno = newscholarno;
//         this.standard = newstandard;
//     }
// }


// Getter and setter method
// public static void main(String[] args) {
//     student s = new student();
//      Scanner sc = new Scanner(System.in);
//      System.out.println("Enter the name =");
//      s.name = sc.next();
//      System.out.println("Enter the address =");
//      s.address = sc.next();
//      System.out.println("Enter the roll number =");
//      s.roll = sc.nextInt();
//      System.out.println("your name is :"+s.name);
//      System.out.println("your address is :"+s.address);
//      System.out.println("roll number :"+s.roll);
//      s.setter("chahat","dewas", 123);
//      System.out.println(s.getter1());
//      System.out.println(s.getter2());
//      System.out.println(s.getter3());
//  }
//  }
//  class student {
//      String name;
//      String address;
//      int roll ;
//   void setter(String newname , String newaddress , int newroll){
//         name = newname;
//         address = newaddress;
//         roll = newroll;
//  }
//  int getter1 (){
//     return this.roll;
//  }
//  String getter2 (){
//     return this.name ;
//  }
//  String getter3 (){
//     return this.address ;
//  }      
//  }
 

// Encapsulaton 
// public static void main(String[] args) {
//     person p = new person();
//     p.setname("khuhsi");
//     p.setage(19);
//     System.out.println(p.getname());
//     System.out.println(p.getage());
//     // becoouse name is private do not accesss with object
//     System.out.println(p.name);
// }
// }
// class person{
// private String name;
// private int age;
// public void setname(String newname){
//     this.name = newname;
// }
// public String getname(){
//     return this.name;
// }
// public void setage(int newage){
//     this.age = newage;
// }
// public int getage(){
//     return this.age;
// }
// }


//  constructor 
//1. non parametric condtructor
// 2. perametric constructor 
// 3. copy constructor


// copy constructor
// public static void main(String[] args) {
//     student s1 = new student ();
//     s1.name = "khushi";
//     s1.age = 19;
//     System.out.println(s1.name);
//     System.out.println(s1.age);
//     student s2 = new student(s1);
// }
// }
// class student {
//    String name;
//    int age;
//     student(student s1){
//     this.name = s1.name;
//     this.age = s1.age;
//  }
// }


                                       // INHERITANC
//single inheritance
// public static void main(String[] args) {
//     college c = new college();
//     c.collename();
//     student s = new student();
//    s.collename();
//    s.schoolname();
// }
// }
// class college {
//     void collename(){
//     System.out.println("college name = Samrat ashok technological insititute vidisha  ");
//     }
// }
// class student extends college {
//     void schoolname(){
//         System.out.println("School name = government girls school betul");
//     }
// }



// multilevel inheritance
// public static void main(String[] args) {
//     multilevel s1 = new multilevel();
//     s1.country();
//     multi4 s2 = new multi4();
//     s2.country();
//     s2.state();
//     s2.city();
//     s2.urbon();
//     s2.rular();
// }
// }
// class multilevel {
//  void country (){
//     System.out.println("country name = India");
//  }
// }
// class multi1 extends multilevel {
//     void  state() {
//         System.out.println("sate name = MP");
//     }
// }
// class multi2 extends multi1 {
//     void city () {
//         System.out.println("CITY NAME = betul");
//     }
// }
// class multi3 extends multi2 {
//     void urbon (){
//         System.out.println("urbon name = betul bazar");
//     }
// }
// class multi4 extends multi3 {
//     void rular (){
//         System.out.println("rular name = aarul");
//     }
// }


// hierarical inheritance 
// public static void main(String[] args) {
//     multilevel s = new multilevel();
//     s.country();
//     multi1 s1 = new multi1();
//     s1.country();
//     s1.state();
//     multi2 s2 = new multi2();
//     s2.country();
//     s2.city();
//     multi3 s3 = new multi3();
//     s3.country();
//     s3.urbon();
//     multi4 s4 = new multi4();
//     s4.country();
//     s4.rular();
// }
// }
// class multilevel {
//  void country (){
//     System.out.println("country name = India");
//  }
// }
// class multi1 extends multilevel {
//     void  state() {
//         System.out.println("sate name = MP");
//     }
// }
// class multi2 extends multilevel {
//     void city () {
//         System.out.println("CITY NAME = betul");
//     }
// }
// class multi3 extends multilevel {
//     void urbon (){
//         System.out.println("urbon name = betul bazar");
//     }
// }
// class multi4 extends multilevel {
//     void rular (){
//         System.out.println("rular name = aarul");
//     }
// }



//Hybrid inheritance
// public static void main(String[] args) {
//     multilevel s = new multilevel();
//     s.country();
//     multi1 s1 = new multi1();
//     s1.country();
//     s1.state();
//     multi2 s2 = new multi2();
//     s2.country();
//     s2.city();
//     multi3 s3 = new multi3();
//     s3.country();
//     s3.urbon();
//     s3.city();
// }
// }
// class multilevel {
//  void country (){
//     System.out.println("country name = India");
//  }
// }
// class multi1 extends multilevel {
//     void  state() {
//         System.out.println("sate name = MP");
//     }
// }
// class multi2 extends multilevel {
//     void city () {
//         System.out.println("CITY NAME = betul");
//     }
// }
// class multi3 extends multi2 {
//     void urbon (){
//         System.out.println("urbon name = betul bazar");
//     }
// }




// polymorphism

// compile time = method overloding = same name different parameter
// public static void main(String[] args) {
//   overloading o = new overloading();
//   o.sum(2,5);
//   o.sum(2,4,6);
// }
// }
// class overloading {
//     int sum(int a, int b){
//         int c  = a+b;
//         System.out.println(c);
//         return c;
//     }
//     int sum (int a, int b, int c){
//         int d = a+b+c;
//         System.out.println(d);
//         return a+b+c;
//     }
// }



// runtime  = method overriding = same name and same parameter 
// public static void main(String[] args) {
//     overloading o = new overloading();
//     o.sum(2,5);
//     o.sum(2,4);
//   }
//   }
//   class overloading {
//       int sum(int a, int b){
//           int c  = a+b;
//           System.out.println(c);
//           return c;
//       }
//       float sum (float a, float b){
//           float d = a+b;
//           System.out.println(d);
//           return d;
//       }
//   }


// abstract in java
// public static void main(String[] args) {
//     Horse h = new Horse();
//     h.eat();
//     h.walk();
//     Cat c = new Cat();
//     c.eat();
//     c.walk(); 
// }
// }
// abstract class animal {
//     void eat(){
//         System.out.println("Animal eats...");
//     }
//    abstract void walk();
// }
// class Horse extends animal{
//    void walk(){
//     System.out.println("laps in 4 lags");
//    }
// }
// class Cat extends animal{
//     void walk(){
//      System.out.println("laps in 2 lags");
//     }
//  }



// Interfaces 
// public static void main(String[] args) {
//     multi1 m = new multi1();
//     m.country();
// }
// }
// interface multilevel {
//  void country ();
// }
// class  multi1 implements multilevel {
//     public void  country() {
//         System.out.println("India");
//     }
// }
// class multi2 implements multilevel {
//     public void country () {
//         System.out.println("South korea");
//     }
// }



// static keyword 
}