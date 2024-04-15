// public class hello{
//     public static void main(String args[]){
//        System.out.println("hello world "); 
//        System.out.println("hello world "); 
//        System.out.println("hello world "); 
//     }
// }
/*
import java.util.*;
public class hello{
    
    public static void main(String [] args){
        //long a=1;
        //long b=a;
        //taking inout 
        Scanner sc  =new Scanner(System.in);
        byte input =sc.nextByte();
        System.out.print(input);
    }
}*/
//type caasting
//aisa value jo jabardsti dalna hi  for eg type converzions can be done in floowing order=> byte-> int-> float-> long->double 
/*import java.util.*;
public class hello{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextByte();
        System.out.println(input);
        }

}*/

//type promotion
// in type conversion remember to write the data type before the value for eg int it=(int) (a + b + c)
/*import java.util.*;

public class hello{
    public static void main(String[]args){
       // char a='x';
        //char b='y';
        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(b-a);
        //byte a=23;
        //float c=32.32f;
        //char z='z';
        //byte bt= (byte) (a + z + c);
        //System.out.println(bt);
        byte b= 32;
        byte bt=(byte) (b);
        System.out.println(bt);


    }
   

}*/
//problem for practice 

//Inaprogram,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers.
/*import java.util.*;
public class hello{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b =  sc.nextInt();
        int c = sc.nextInt();
        int sum = a+b+c;
        int avg = sum/3;
        System.out.println("average of three numbers are "+avg);

    }
}
*/

// problem no 2
/*import java.util.*;
public class hello{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int square =  side*side;
        System.out.println(square);

    }
}
*/
// import java.util.*;

// public class hello {
//     public static void main(String [] args){

//         Scanner sc = new Scanner(System.in);
//         float a = sc.nextFloat();
//         float b = sc.nextFloat();
//         float c = sc.nextFloat();
//         float sum = a+b+c;
        
//         System.out.println("total of pen pencil and eraser is:- "+sum);
//         float newtotal= sum+(0.18f*sum);
    
//         System.out.println("you total amount inclusive of all taxes " + newtotal);
       

//     }
// }


///////////////////////////////////////////////////////////////////////////////////////////
// operators
//arithmatic operaotrs 
//binary operators
/* 
public class hello{
    public static void main(String [] args ){
        int A = 14;
        int B = 7;

        System.out.println("MODULUS OF AN AND B " + (A%B));
    }
}
*/
//unary operators
/* 
public class hello{
    public static void main(String [] args){
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
    }
}
*/
// 18/4/2023
//relational operators 
// they are ==, !=, (greatear than)>, <(less than), >=, <=.
/* public class hello{
    public static void main(String [] args){
        int A = 10;
        int B = 0;
        System.out.println((A>=B));
    }
}*/
// logical operators they are &&(legal and ) ||(legal or) and !(legal not)
/*public class hello{
    public static void main(String [] args){
        //int A = 10;
        //int B = 5;
        System.out.println( !(10<5) ); 
    }
} 
*/
//program for assignment operators
// they are =, -=, +=,*=,/=.

/*public class hello{
    public static void main(String [] args){
        int A =25;
        A*=5;
        System.out.println(A);
    }
}*/
/* 
public class hello{
    public static void maon(String [] args){
       // int x=2, y=5;
        //int exp1 = ( x * y / x );
        //int exp2 = ( x * ( y / x ) );
        //System.out.println(exp1+",");
        //System.out.println(exp2);

    
    int X = 2, y = 5;
    int exp1 = (X * y / X ) ;
    int exp2 = (X * (y / X) ) ;
    System. out.println(exp1 + ",");
    System. out.print(exp2);
    }
}
*/
//22/04/2023
// conditional statements
 
// import java.util.*;
// public class hello {
//     public static void main(String [] args){
//        Scanner sc= new Scanner(System.in);
//        int income  = sc.nextInt();
//        int tax;
//        if(income <500000) {
//        tax = 0 ;
//     }
//        else if (income>500000 && income<1000000){
//        tax = (int) (income*0.2);
//        }
//        else{
//         tax= (int) (income*0.3);
//        }
//        System.out.println("your total tax is : "+ tax);
        
//     }
// }
/* 
public class hello{
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        //ternary operator
        String type=((a>=35))?"pass":"fail";
        System.out.println(type);
    }
}
*/
//program to find that the given number is positive or 
/* 
public class hello{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number : ");
        int a = sc.nextInt();
        
        
        if (a<=0){
            System.out.println("the entred  number is negative : ");
        }
        else if (a>0 && a<1000000000){
            System.out.println("the entred number is positive : ");
       
        }
        else{
            System.out.println("the entred number is not an number : ");
        }
    }
}
*/
//code to check wheter you have fever or not 

/*ublic class hello{
    public static void main(String [] args){
        double temp = 100.3;
        if (temp>=100){
            System.out.println("you have fever of  "+ temp);
        }
        else{
            System.out.println("you dont have fever");
        }

    }
}
*/

//write a program to to input week number (1-7) and to output the day 
/* 
public class hello{
    public static void main(String[] args){
        int day =5;
        switch (day){
            case 1: 
            System.out.println("monday");
            break;
            case 2 :
            System.out.println("tuesday");
            break;
            case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
        }
    }
}
*/
// java program to check wheater the given year is a leap year or not 
/* 
public class hello{
    public static void main(String []args ){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the year you want to enter:");
        int  year = sc.nextInt();
        boolean X = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean Z = ((year % 100 == 0) && (year % 400 == 0)) ;
         if (X && (y || Z) ) {
             System. out.println (year + " is  a leap year");
         } 
         else {
            System.out.println (year + " is not a leap year");
         }
        
    }
}
*/

