// public class divideandconquer{
//     public static void main(String[]args){
        
//     }
// }
//************************************************************************************** */
public class divideandconquer {
    public static void mergesort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // sorting
    public static void sort(int arr[], int si, int ei) {
        // kaam
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2; // or si+ei/2;
        sort(arr, si, mid); // left part
        sort(arr, mid + 1, ei);// right part
        merge(arr, si, mid, ei);
    }

    // merging
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iteraotor for temp arr
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // copy from temp to orignal array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8,-5 };
        sort(arr, 0, arr.length-1);
        mergesort(arr);
        //time complexity of merge sort is O(nlogn)
        //space complexity  is O(n) 
  
    }

}

// code for quick sort

// public class divideandconquer{
//     public static void printarr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void quicksort(int arr[], int si, int ei){
//         //here consodering pivot as the last element
//         if(si>=ei){
//             return;
//         } 
//        int pidx= partition(arr, si,ei);// pidx stands for pivot index
//        quicksort(arr, si, pidx-1);
//        quicksort(arr, pidx+1, ei);

//     }
//     public static int partition(int arr[], int si, int ei){
// int pivot=arr[ei];
// int i = si-1;
// for (int j=si;j<ei;j++){
//     if (arr[j]<=pivot){
//         i++;
//         //swap
//         int temp= arr[j];
//         arr[j]=arr[i];
//         arr[i]=temp;
//     }
// }
// i++;
//  int temp= pivot;
//         arr[ei]=arr[i];
//         arr[i]=temp;
//         return i;
//     } 

//     public static void main(String[]args){
//         int arr[]={6,3,9,2,5-69,70};
//         quicksort(arr, 0, arr.length-1);
//         printarr(arr);
//     }
// }