// import java.util.Scanner;

// public class matrices {
//     public static boolean search(int matrices[][], int key){
//          for (int i = 0; i < matrices.length; i++) {
//             for (int j = 0; j < matrices[0].length; j++) {
//                 if (matrices[i][j]==key){
//                     System.out.println("Element found at ( " + i+ " , " + j + " )");
//                     return true;
//                 }
//             }

//         }
//         System.out.println("element not found ");
//         return false;

//     }

//     public static void main(String[] args) {
//         int matrices[][] = new int[3][3];
//         int n = 3, m =3;
//         Scanner sc = new Scanner(System.in);
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 matrices[i][j] = sc.nextInt();

//             }
//         }
//         // output
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(matrices[i][j] + " ");
//             }
//             System.out.println();
//         }
//         search(matrices, 9);

//     }

// }

// *************************************code for Spiral Matrix
// public class matrices {
//     public static void spiral(int Matrix[][]) {
//         int startrow = 0;
//         int startcol = 0;
//         int endrow = Matrix.length-1;
//         int endcol = Matrix[0].length-1;
//         while (startrow <= endrow && startcol <= endcol) {
//             // top
//             for (int j = startcol; j <= endcol; j++) {
//                 System.out.print(Matrix[startrow][j] + " ");
//             }
//             // right
//             for (int i = startrow + 1; i <= endrow; i++) {
//                 System.out.print(Matrix[i][endcol] + " ");
//             }
//             // bottom
//             for (int j = endcol - 1; j >= startcol ; j--) {
//                 if (startrow == endrow) {
//                     break;
//                 }
//                 System.out.print(Matrix[endrow][j] + " ");
//             }
//             // left
//             for (int i = endrow - 1; i >= startrow + 1; i--) {
//                 if (startcol == endcol) {
//                     break;
//                 }
//                 System.out.print(Matrix[i][startcol] + " ");
//             }

//             startcol++;
//             startrow++;
//             endcol--;
//             endrow--;

//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int Matrix[][] = { { 1, 2, 3, 4 },
//                 { 5, 6, 7, 8 },
//                 { 9, 10, 11, 12 },
//                 { 13, 14, 15, 16 } };
//         spiral(Matrix);
//     }
// }

//
//code for diagonal sum
// public class matrices {
//     public static int diagonalsum(int Matrix[][]){
//          int sum=0;
//         for (int i=0;i<=Matrix.length;i++){
//             for(int j=0;j<Matrix[0].length;j++){
//                 if(i==j){
//                     sum+=Matrix[i][j];
//                 }else if(i+j==Matrix.length-1){
//                      sum+=Matrix[i][j];
//                 }
//             }
//         }
//         for(int i=0;i<Matrix.length;i++){
//             sum+=Matrix[i][i];
//             if(i!=Matrix.length-i-1){
//                 sum+=Matrix[i][Matrix.length-i-1];
//             }
//         }
//         return sum;
//     }
//     public static boolean staircase(int Matrix[][], int key){
//         int row=0, col=Matrix[0].length-1;
//         while(row<=Matrix.length&& col>=0){
//             if(key==Matrix[row][col]){
//                 System.out.println("element found at: ( "+ row +","+col+" )");
//                 return true;

//             }
//             else if(key< Matrix[row][col]){
//                 col--;
//             }else{
//                 row++;
//             }

//         }
//         System.out.println("Element found at");
//         return false;
//     }
//     public static void main(String[] args) {
//         int Matrix[][] = { { 10, 20, 30, 40 },
//                 { 15, 25, 35, 45 },
//                 { 27, 29, 37, 48 },
//                 { 32, 33, 39, 50 } };
//                 int key =25;
//                 System.out.println(staircase(Matrix, key));
//     }
// }

//code for practice 
// public class matrices {
//     public static void main(String[] args) {
//         int array[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
//         int count = 0;
//         for (int i = 0; i < array.length; i++) {
//             for (int j = 0; j < array[0].length; j++) {
//                 if (array[i][j] == 7) {
//                     count++;
//                 }
//             }
//         }
//         System.out.println("count of 7 is " + count);

//     }
// }
// public class matrices {
//     public static void main(String[]args){
//         int nums[][]={{1,4,9},{11,4,3},{2,2,3}};
//         int sum=0;
//         for (int j=0;j<nums[0].length;j++){
//             sum+=nums[1][j];
            
//         }
//         System.out.println("the sum is: "+sum);
//     }
// }
