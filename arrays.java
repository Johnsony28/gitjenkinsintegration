//import java.util.*;
// public class arrays {
//     public static void main(String[]args){
//         //creating an array
//         // int marks [] = new int[50];
//         // int numbers[] = {1,2,3}; 
//         // String cars[]= {"ciaz","city","creta"};

//         //input and output if an array 
// int marks[]=new int[10];
// // Scanner sc= new Scanner(System.in);
// // marks[0]= sc.nextInt();
// // marks[1]= sc.nextInt();
// // marks[2]=sc.nextInt();
// // System.out.println("phy: "+ marks[0]);
// // System.out.println("chem: "+ marks[1]);

// // System.out.println("math: "+ marks[2]);
// // //update an element in the array 
// // int percentage = (marks[0]+ marks[1]+marks[2])/3; 
// // System.out.println("percentage is  " +percentage + "%");
//         // length 0f an array 
//         System.out.println("length of marks is : " + marks.length );

//     } 

// }

// public class arrays {
//     public static void update(int marks[], int nonchangeable) {
//         nonchangeable=10;
//         for (int i = 0; i < marks.length; i++) {
//             marks[i] = marks[i] + 1;
//             // for (int i=0; i<=phones.length;i++){
//             // phones[i]= phones[i]+1;

//             // }

//         }
//     }

//     public static void main(String[] args) {
//         int marks[] = { 98, 98, 99 };
//         int nonchangeable=5;
//         update(marks, nonchangeable);
//         System.out.println(nonchangeable);
//         // print our marks
//         for (int i = 0; i < marks.length; i++) {
//             System.out.print(marks[i] + " ");

//         }
//         System.out.println();

//     }

// }

// linear search
// key = 2,4,6,8,10,12,53,54

// public class arrays{
//     public static int linearsearch(int search[], int key){
//            for (int i=0;i<=search.length;i++){
//             if(search[i]==key){
//                 return i;
//             }

//         }
//         return -1;

//     }
//     public static void main(String[]args){
//         int search[]={2,4,6,8,10,12,20,53,54};
//         int key = 5;
//         int index = linearsearch(search, key);
//         if (index== -1){
//             System.out.println(" Value not found ");
//         } else{
//             System.out.println("The key is : " +index);
//         }

//     }
// }
// program to find the largest number in an array 
// import java.util.*;
// public class arrays{
//     public static int find(int numbers[]){
//         int largest=Integer.MIN_VALUE;
//         int smallest=Integer.MAX_VALUE;
//         for (int i=0; i<numbers.length;i++){
//             if (largest<numbers[i]){
//                 largest=numbers[i];
//             }
//             if (smallest>numbers[i]){
//                 smallest=numbers[i];
//             }
//         }
//         System.out.println("the smallest value is : " + smallest);
//         return largest;

//     }

//     public static void main(String[] args){
//         int numbers []= {0,2,4,6,8};
//     System.out.println("the largest value is : " + find(numbers));

//     }
// }
//bineary search 
//imp for interviews 

// public class arrays {
//     public static int binary_search(int number[], int key ) {
//         int start=0, end= number.length-1;
//         while(start<= end){
//             int mid= (start+end)/2;
//             if (number[mid]==key){
//                 return mid;
//             }
//             if(number[mid]<key){//right search 
//                 start=mid+1;
//             }else{
//                 end =mid-1; //left search 
//             }
//         }
// return -1;
//     }

//     public static void main(String[] args) {
//         int number[] = {  4, 8, 10, 12, 14, 16 };
//         int key =16;
//         System.out.println("the value is : "+binary_search(number, key));
//     }
// }

//reverse array 

// public class arrays{
//     public static void reverse(int numbers[]){
//         int first=0, last = numbers.length-1;
//         while(first< last ){
//             int temp= numbers[last];
//             numbers[last]= numbers[first];
//             numbers[first]= temp;

//             first++;
//             last--;

//         } 
//     }
//     public static void main(String[] args){
//         int numbers[]= {10,9,8,7,6,5,4,3,2,1,0};
//         reverse(numbers);

//         for (int i=0;i<numbers.length;i++){
//             System.out.print(numbers[i]+" ");
//         }
//         System.out.println();
//     }
// }
//prpgram to print the pairs of an array 

// public class arrays{
//     public static void pairs(int number[]){
//         int tp=0;
//         for(int i=0;i<number.length;i++){
//             int current= number[i];
//             for(int j=i+1;j<number.length;j++){
//                 System.out.print("(" + current + "," + number[j] +")" );
//            tp++;
//             }
//            System.out.println();
//         }
//         System.out.println("total pairs is: "+ tp);
        
//     }
//     public static void main(String[]args){
//         int number[]={2,4,6,8,10};
//     pairs(number);

//     }
// }

//program to print sub arrays of an array
public class arrays{
    public static void subarray(int numbers[]){
        int totalsubarray=0;
      
        for(int i=0; i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end= j;
                 
                for(int k=start; k<= end; k++){
                  // int sum = i+j;
                    System.out.print(numbers[k]+" " );
                }
                totalsubarray++;
                System.out.println();
            }
            System.out.println();
        }
System.out.println("total sub arrays is: "+ totalsubarray);

    }
    public static void main(String[]args){
        int numbers[]= {2,4,6,8,10};
        subarray(numbers);
    }
}
//program for max sub array brute force method 
// public class arrays{
//     public static void maxsubarray(int numbers[]){
//         int currsum=0;
//         int maxvalue=Integer.MIN_VALUE;
      
//         for(int i=0; i<numbers.length;i++){
//             int start = i;
//             for(int j=i;j<numbers.length;j++){
//                 int end= j;
//                 currsum=0;
//                 for(int k=start; k<= end; k++){
//                     currsum+=numbers[k];
//                 }
//                 System.out.println(currsum);
//                 if(maxvalue<currsum){
//                     maxvalue=currsum;
//                 }
//             }
            
//         }
//         System.out.println("max value is : " + maxvalue);
// //System.out.println("total sub arrays is: "+ totalsubarray);

//     }
//     public static void main(String[]args){
//         int numbers[]= {1,-2,6,-1,3};
//         maxsubarray(numbers);
//     }
// }

//kadane algorithm
//program for max sub array using kadane algorithm
// public class arrays{
//     public static void kadane(int number[]){
//         int MS= Integer.MIN_VALUE;
//         int sm=Integer.MIN_VALUE;
//         int CS=0;
//         for (int i=0;i<number.length;i++){
//             CS=CS+number[i];
//             if(CS<0){
//                 CS=0;
//             }
//             if (sm<CS){
//                 sm=CS;
//             }
//             MS= Math.max(CS, MS);
//             sm=Math.min(CS, sm);
//         }
       
       
//         System.out.println("Our maximum subarray is: "+MS);
//         System.out.println("our smallest sub aray is : "+sm);
//     }
//     public static void main(String[]args){
//         int number[]=  {-2,-3,1,2,-3};
//         kadane(number);
//     }
// } 

//trapping rain water 

// public class arrays{
//     public static int trappedrainwater(int height[]){
//         //steps to perform trapped rain water 
//         //calculate left max boundary  
//         int leftmax[]= new int[height.length];
//         leftmax[0]=height[0];
//         for (int i=1;i<height.length;i++){
//             leftmax[i]=Math.max(height [i],leftmax[i-1]);
//         }

//         //calculate right max boundary
//         int rightmax[]=new int[height.length-1];
//         rightmax[height.length-1]=height[height.length-1];
//         for(int i =height.length-2; i>=0;i-- ){
//             rightmax[i]=Math.min(height[i], height[i+1]);
//         }
//         //loop
//         int trappedwater=0;
//     //waterlevel =min(leftmax bound,right max bound)
//     for (int i=0; i<height.length;i++){
//         int waterlevel =Math.min(leftmax[i], rightmax[i]);
//           //trapped water = waterlevel -height[i]
//         trappedwater+= waterlevel - height[i];
//     }
  
//     return trappedwater;
//     }

//     public static void main(String []args){
//         int height[]= {2,4,0,6,3,2,5};
//         System.out.println(trappedrainwater(height));
       
        
//     }
// }

//best time to buy and sell stonks 
// public class arrays {
//     public static int stonks(int prices[]){
//         int buyprice=Integer.MAX_VALUE;
//         int Maxprice=0;
//         for(int i=0; i<prices.length;i++){
//             if (buyprice<prices[i]){
//                 int profit=prices[i]-buyprice;
//                 Maxprice=Math.max(Maxprice, profit );
//             }
//             else {
//                 buyprice=prices[i];
//             }

//         }
//         return Maxprice;
//     }
//     public static void main(String[]args){
//         int prices[]={7,1,5,3,6,4};
//         System.out.println(stonks(prices));
//     }

// }
//****************************************************************************************************************
//arrays assignments
// 1
// public class arrays{
//     public static boolean samevalue(int nums[]){
//         for (int i=0; i<nums.length;i++){
//             for (int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     return true;
//                 }else{
                    
//                 }
//             }
//         } 
//         return false; 
//     }
//     public static void main(String[]args){
//         int nums[]={1,2,3,4};
//         System.out.println(samevalue(nums));
//     }
// }

// 2
// public class arrays{
//     public static int binary_search(int nums[], int key) {
//         int start=0, end= nums.length-1;
//         while(start<=end){
//             int mid =(start+end)/2;
//             if (mid==key){
//                return -1;
//             }
//             if(mid<key){
//                 start=mid+1;//left search
//             }
//             else{
//                 end=mid-1;//right search   
//             }
//         }
//     return key;
//     } 
//     public static void main(String[]args){
//         int nums[]={0,1,2,4,5,6,7};
//         int key=5;
//         System.out.println("the value is: " +binary_search(nums,key));
//     }
// }

//3
// public class arrays {
//     public static int stonks(int prices[]){
//         int buyprice=Integer.MAX_VALUE;
//         int maxvalue=0;
//         for(int i=0; i<prices.length;i++){
//             if(buyprice<prices[i]){
//                 int profit=prices[i]-buyprice;
//                 maxvalue=Math.max(maxvalue, profit);
//             }else{
//                 buyprice=prices[i];
//             }
//         }
//         return maxvalue;
//     }

//     public static void main(String[]args){
//         int prices[]={7,6,4,3,1};
//         System.out.println(stonks(prices));

//     }
// }

//4
// import java.util.*;
// public class arrays{
//     public static int  linear(String menu[], String key){
//         for (int i=0; i<menu.length;i++){
//             if(menu[i]==key){
//                 System.out.print(menu[i] +" "); 
//                 return i;
//             }
//         }
        
//         return -1;
// }
//     public static void main(String[]args){
//         Scanner sc= new Scanner(System.in);
//         String menu[]= {"Dosa", "Appam", "idli"};
//         String key = "idli";
//         System.out.println(linear(menu, key));


//     }
// }