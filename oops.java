
public class oops {

    public static void main(String[] args) {
        // Pen p1=new Pen(); //here we created an object called pen
        // p1.setcolor("Blue");
        // p1.settip(3);
        // System.out.println(p1.getcolor());
        // System.out.println(p1.gettip());

        // Bankaccount b1=new Bankaccount();
        // b1.Username= "john";
        // b1.setpassword("johnjoshua ");
        // System.out.println(b1.Username );
        // student s1 = new student();
        // s1.name = "john";
        // s1.rollno = 53;
        // s1.password = "john";

        // s1.marks[0] = 100;
        // s1.marks[1] = 95;
        // s1.marks[2] = 90;

        // student s2 = new student(s1);//copy
        // s2.password = "xyz";
        // s2.marks[1] = 55;
        // for (int i = 0; i < 3; i++) {
        // System.out.println(s1.marks[i]);
        // }

        // Mammal tomy = new Mammal();
        // tomy.eats();
        // tomy.walk();
        // tomy.legs = 4;
        // System.out.println(tomy.legs);
        // Fish shark = new Fish();
        // shark.height();
        // shark.swim();
        // whale whale = new whale();
        // whale.bloodtype();
        // eagle eagle = new eagle();
        // eagle.fly();
        // eagle.brave();
        // humans joel= new humans();
        // joel.legs=2;
        // joel.walk();
        // joel.brain();
    // calculator cal=new calculator();
    // System.out.println(cal.sum(4, 4));
    // System.out.println(cal.sum((float)4.1, (float)4.9));
    // System.out.println(cal.sum(3, 05, 9));
//     King k = new King();
// k.moves();
// Queen Q=new Queen();
// Q.moves();


// System.out.println(" ///////////////////////  ");
// jovin j1 = new jovin();
// j1.Schoolname="SJEHS";

// jovin j2=new jovin();
// System.out.println(j2.Schoolname);

Sony s1= new Sony();


    }
}

class Pen {

    private String color;
    private int tip;

    String getcolor() {
        return this.color;
    }

    int gettip() {
        return this.tip;
    }

    void setcolor(String newcolor) {
        color = newcolor;

    }

    void settip(int newtip) {
        tip = newtip;
        System.out.println();
    }
}

// class Bankaccount{
// public String Username;
// private String Password;

// public void setpassword(String pwd){
// Password= pwd;
// }
// }
class student {
    String name;
    int rollno;
    String password;
    int age;
    int marks[];

    // copy constructor
    // example of shallow copy constructor
    // student(student s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // this.rollno = s1.rollno;
    // this.marks = s1.marks;
    // }
    student(student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    student() {
        marks = new int[3];
        System.out.println("constructor is called .......");
    }// example of non parametersed constructor

    student(String name) {
        this.name = name;
    }

    student(int age) {
        this.age = age;

    }
    // the above mentioned two functions are called parameterised constructor
}

// pareent class or base class
class Animals {
    String color;

    void eats() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breathes");
    }

    void height() {
        System.out.println("176cm");
    }
    void brain(){
        System.out.println("smart enough ");
    }
}

// derived class or sub class
class Mammal extends Animals {
    int legs;

    void walk() {
        System.out.println("can able to walk");
    }
}

class Fish extends Animals {
    String breed;

    void swim() {
        System.out.println("abiltiy to swim ");
    }

    void size() {
        System.out.println("very big");
    }
}

class birds extends Animals {
    void fly() {
        System.out.println("ability to fly ");
    }
}

class shark extends Fish {

    void fin() {
        System.out.println("shark fin anteena ! ");
    }
}

class whale extends Fish {
    void bloodtype(){
        System.out.println("warm blodded");
    }

}
class eagle extends birds{
    void brave(){
        System.out.println("eagles are fearless");
    }
}
class Dog extends Mammal{
    int legs;
    void communication(){
        System.out.println("they bark");
    }
}
class humans extends Mammal{
    int legs;
    void brain(){
        System.out.println("ruler of the earth in terms of species ");
    }
}


class calculator{
    int sum(int a, int b ){
        return a*b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int  sum(int a,int b, int c){
return a+b+c;
    }
}
abstract class Nayathodan{

    String color;
    Nayathodan(){
          System.out.println("parent class called");
    }

    void eat(){
        System.out.println("only know to eat only ");
    }
    abstract void run();
}
class Sony extends Nayathodan{
    
    String color;
    Sony (){
        super();
          System.out.println("child class called");
    }
    void run(){
        System.out.println("runs like husain bolt ! ");
    }
}

interface chessplayer{
    void moves();

}
class Queen implements chessplayer{
    public  void moves(){
        System.out.println("up down left right diagonal ");
    }
}
class Rook implements chessplayer{
    public  void moves(){
        System.out.println("up down left right  ");
    }
}
class King implements chessplayer{
    public  void moves(){
        System.out.println("up down left right diagonal : king");
    }
}

class jovin {
    int percentage(int p,int c, int m){
        return (p+c+m)/3;
        
    }
String name;
int rollno;
static String Schoolname;
void setname(String name){
    this.name=name;
}
String getname(){
    return this.name;
}

}