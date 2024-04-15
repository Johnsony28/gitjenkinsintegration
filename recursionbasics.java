import java.util.*;

public class recursionbasics {
  public static void printdec(int n) {
    if (n == 11) {
      System.out.print(n);
      return;
    }
    System.out.print(n + " ");
    printdec(n + 1);

  }

  public static void printinc(int n) {
    if (n == 1) {
      System.out.print(1 + " ");
      return;
    }
    printinc(n - 1);
    System.out.print(n + " ");
  }

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    }
    int fnm1 = factorial(n - 1);
    int fn = n * factorial(n - 1);
    return fn;

  }

  public static int sum(int n) {
    if (n == 1) {
      return 1;
    } 
    int snm1 = sum(n - 1);
    int sn = n + snm1;
    return sn;
  }
  //fibonanci serires of nth 
  public static int fib(int n){
if(n==0||n==1){
  return n;
}

int fnm1= fib(n-1);
int fnm2= fib(n-2);
int fn= fnm1+fnm2;
return fn;
  }
//time complexity of aboce program is linear 

//check if an array is sorrted or not 
public static boolean sort(int arr[], int i){
  if(i==arr.length-1){
    return true; 
  }
  if(arr[i]>arr[i+1] ){
    return false;
  }
  return sort(arr, i+1);
}
  public static void main(String[] args) {
    //int n = 25;
    // printinc(n);
    // System.out.println(fib(25));
    // System.out.println(fib(26));
    int arr[]={1,2,3,5,4};
    System.out.println(sort(arr, 0));
   
  }
}
