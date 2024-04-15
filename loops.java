//23/04/2023
//while loop
/* 
public class loops{
    public static void main(String [] args){
        int counter =0;
        while (counter < 10){
            System.out.println("jesus loves you ! ");
            counter ++; // counter ++ mean that declared variable in cremented by 1.
        }
        System.out.println("printed 10 times ");
    }

}
*/
/*import java.util.*;
public class loops{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to enter" );
        int n = sc.nextInt();
        int counter =1;
        while (counter <= n){
            System.out.print(counter +" "  );
            counter ++;

        }
        System.out.println();
    }
}
*/
// program to calculate sum of an number
/* 
import java.util.*;
public class loops{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int i = 1;
        while (i<=n){
            sum=sum +i;
            i++;
        }
        System.out.println("sum of an entred number is "+ sum);
    }
}
*/
// for loop
/* 
public class loops{
    public static void main(String [] args){
       // for (int n=1; n<=4 ; n++){
        //System.out.println(" * * * *  ");
        //}
        int n=1;
        while (n<=4){
            System.out.println("****");
            n++;
        }
    }

}
*/
// progrma to reverse the number 
/* 
public class loops{
    public static void main (String[]args){
        int n = 28112002;
        while(n>0){
            int LastDigit = n % 10;
            System.out.print(LastDigit + " ");
            n = n / 10;
        }
       
    }
}
*/

//do while loop
/*public class loops{
    public static void main(String [] args){
        int counter=1;
        do{
            System.out.println(" do while loop");
            counter++;

        }while(counter<=10);

    }
}*/
// in do while loops here work is done first and then condition is checked 
/*public class loops{
    public static void main(String[]args){
        for(int i=1;i<=6;i++){
            if(i==5){
                break;
            }
            
            System.out.println(i); 
        }
        
System.out.println("example of break statement");
}
}*/
//program to print the number from the user until multiple of 10
/*public class loops{
    public static void main(String [] argd){
      Scanner sc= new Scanner(System.in);
      do{
        //to make more intutive we are asking the user to enter the number 
        System.out.println("Enter any Number :  " );
        long a = sc.nextLong();
        if (a%10==0){
            break;
        }
        System.out.println(a);

      }while(true);
    
    }
} */
// continue keyword 
//it is used to skip an iteration or an number 
/* 
public class loops{
    public static void main(String[] args){
        for (int i=1; i<=6;i++){
            if(i==6){
            continue;
            }
            System.out.println(i);
        }
    }
}
*/
/*public class loops{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        
        do{
System.out.print("enter the number: ");
            int a = sc.nextInt();
            if (a%10==0){
                continue;
            }
            System.out.println("the entered number was:  " + a);

        }while(true);
       
        
    }
}*/

//program to check whether the given number is prime or  not
/*public class loops{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        if(a==2){
            System.out.println(a + " is prime number ");
        }
         boolean isPrinme =true;
        for(int i=2; i<=Math.sqrt(a); i++){
        if (a % i ==0){
            isPrinme=false;

        }

       }
       if(isPrinme == true){
        System.out.println("a is a prime number ");
       }
       else{
        System.out.println("a is not a prime number ");
       }

    }
}*/
// Write a program that reads a set of integers,and then prints the sum of the even and odd integers.
/*
public class loops{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
       int number;
       int choice;
       int oddsum=0;
       int evensum=0;
       do{
        System.out.println("Enter any number ");
        number = sc.nextInt();

        if (number % 2 == 0 ){
            evensum += number;

        }else{
            oddsum += number;
        }
        System.out.println("to continue press 1 or 0 to exit ");
        choice = sc.nextInt();


       }while(choice == 1);
       System.out.println("sum of odd numbers are " +  oddsum);
       System.out.println("sum of even numbers are "+ evensum);
       System.out.println("Program executed sucessfully");
    }
}
*/

// program to print a table of n 
/*public class loops{
    public static void main(String[] args){
      int i = 0;
        
    }
}
*/

//program to print multiplication table of any number 
/*import java.util.*;
public class loops {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print(" Enter the Number to show the table : ");
        int n  = sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(n +  " * "  + i + " = "  + n*i );

        }

    }
}
*/

//*************************************paterns ***************************
/* 
public class loops {
    // nested loops meaing loop ke andhar loop
    public static void main(String[] aegs) {
        int n = 4;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("program executed sucessfully");
    }
}`
*/
//half pyramid pattern

/*public class loops {
    //functions defining 
    public static void helloworld(){
        System.out.println("Hotel Raina ");
    }
    public static void main(String[] args) {
       //program for integer pattern 
        /*  int n = 4;
        for (int line = 1; line <= n; line++) {
            // printing numbers
            for (int number = 1; number <=line; number++) {
                System.out.print(number);
            }
            System.out.println();   
        }
        */
        //program for charactrer pattern 
       /* 
        int n=4;
        char ch='A';
        for (int line=1;line<=n;line++){
            for (int number=1;number<=line;number++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

helloworld();

    }
}
*/
//function and methods
/* 

import java.util.Scanner;

public class loops{
    public static void hotelraina(){
        System.out.println("Hotel Raina ");
        
    }
    public static int calculatesum(int a, int b){ //here whatever is written in int the curly brackets they are parameters
         
        int sum =a+b;
        System.out.println("sum is : "+sum);
        return sum;
        
    }
    public static void main(String[]args){ 
        // public static is access modifier
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        calculatesum(a, b); //calling an function is also known as arguments  
       
       
    }
}
*/
/* 
public class loops{
    public static void swap(int a, int b){
         int temp= a;

       a=b;
       b=temp;
      
    }
    public static void main(String[]args){
       int a = 10;
       int b= 8;
       //swap function
       System.out.println(" here is where the function is being called ");
       swap(a, b); 
       System.out.println(" value of a is : " + a);
       System.out.println(" value of b is : " + b);


    }
}
*/
// call by value is a copy  of a value whereas call by reference is showing original value  

//find product of a and b
/*
public class loops{
    public static int  product(int a, int b){
        int sum = a*b;
        return sum;


    }
    public static void main(String[]args){
        int a = 6;
        int b= 7;
        int prod = product(a, b);
System.out.println("a * b = "+prod);
prod = product(10 , 23);
System.out.println("10 * 23 = " +prod);
    } 
} 
*/
// factorial of an number n
/* 
public class loops{
    public static int factorial(int n ){
        int f= 1;
        for(int i=1; i<=n; i++){
            f=f*i;

        }
        return f ;
    }

    public static int bincoeff(int n, int r){
        int fact_n = factorial(n );
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int bincoeff = fact_n/(fact_r * fact_nmr);
        return bincoeff; 
        
    }


    
    public static void main(String[]args){
       // System.out.println("the factorial is "+ factorial(4));
    System.out.println("The binomial coefficent is : "+bincoeff(5, 2));
        

    }
}
*/
// binomial coefficient 
/* 
public class loops{
  
    public static void main(String[]args){

    }
}
*/
//function overloading 
//function overloading sirf parameters pe depend karti hai return type par nahi 
/* 
public class loops{
    public static int calsum(int a, int b){
        return a+b;

    }
    public static int calsum(int a, int b ,int c){
        return a + b +c ;
    }
    public static float calsum(float a, float b){
        return a+b;

    }
    public static void main(String[]args){
        //System.out.println(calsum(6, 9));
        //System.out.println(calsum(3, 3, 9));
        System.out.println(calsum(4.2f, 4.8f));

    }
}
*/
//very IMP
//cheeck a number is prime or not  
//very imp 
/* 
public class loops{

    public static boolean 
    isPrinme(int n ){
         
         for(int i=2;i<=n-1;i++){
            if(n%i==0){
               return false;

            }
         }
return true;

    }
    public static void primeinrange(int n){
        for (int i=2; i<=n;i++){
            if (isPrinme(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();

    }
    public static void main(String [] args){
        primeinrange(20);

    }
}
*/
//convert from binary to decimal 
/* 
public class loops{
    public static void bintodec(int binum){
        int mynum=binum;
        int pow=0;
        int decnum=0;
        while(binum>0){
            int LastDigit=binum%10;
            decnum=decnum+(LastDigit*(int)Math.pow(2,pow));
            pow++;
            binum=binum/10;
        }
        System.out.println("decimal of " +mynum +" = " + decnum);       

        
    }
    public static void main(String[] rgs){
       bintodec(); 

    }
}
*/
//output  formatting 
// import java .util.*;
// public class loops {

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         Scanner sc=new Scanner(System.in);
//         int java = sc.nextInt();
//         int cpp = sc.nextInt();
//         int python = sc.nextInt();
//     System.out.println("=============================");
//     System.out.println("java        " + java);
//     System.out.println("cpp         " + cpp);
//     System.out.println("python      " + python);
//     System.out.println("============================");
    
//     }
// }

//decimal to binary 
// public class loops{
//     public static void dectobin(int n){
//         int mynum=n ;
//         int pow=0;
//         int binum=0;
//         while(n>0){
//             int rem=n%2;
//             binum=binum+(rem*(int)Math.pow(10, pow));
//             pow++;
//             n=n/2;

//         }
// System.out.println("decimal no of " +mynum+"= " + binum );
//     }
//     public static void main(String[]args){
//         dectobin(3);
//      }
// }

//method scope 

// METHODS scope PLAYS WITH PARAMETERS 
// BLOCK SCOPE PLAYS WITH THE CODE WRITTEN IN  THIS BRACKET{ }

// public class loops{
//     public static void prints(){
//       int a =45;  
//      System.out.println(a);
//     }

//     public static void main (String[]args){
// prints();

//     }
// }

// import java.util.Scanner;

// public class loops{
//     public static void avg3(/*int a, int b, int c*/){
//         int avg;
//         Scanner sc= new Scanner(System.in);
//        System.out.print("enter num 1: ");
//         int a = sc.nextInt();
//           System.out.print("Enter num2: ");
//         int b= sc.nextInt();
//         System.out.print("enter num 3: ");
//          int c= sc.nextInt();
       
//         avg = a+b+c/3;
//         System.out.println("Average of three numbers is = " +avg );
//     }


//     public static boolean isEven(int n ){
//         if (n%2==0){
//            return true;
//         }else{
         
// return false;
//         }

//     }
        
//     public static int sum(int n){
//         int sumof=0;
//         while(n>0){
//             int LastDigit= n%10;
//             sumof+=LastDigit;
//             n/=10;
//         }
// return sumof;


//     }
//     public static void main(String[]args){
//         //System.out.println(isEven(22));
//       // System.out.println(sum(123));
      
//     }
// }

