import java.util.*;

//bubble sort 
public class sort {
    // bubble sort
    public static void bubblesort(int nums[]) { // time complexity of bubble sort is O(n^2)
        for (int turns = 0; turns < nums.length - 1; turns++) {
            for (int j = 0; j < nums.length - 1 - turns; j++) {
                if (nums[j] < nums[j + 1]) {
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                }
            }
        }
    }

    public static void printnums(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    // selection sort
    // little little same but logic is differert
    public static void selectionsort(int nums[]) {// time complexity of selection sort is O(n^2)
        for (int i = 0; i < nums.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minpos] > nums[j]) {
                    minpos = j;
                }
            }
            // swap
            int temp = nums[minpos];
            nums[minpos] = nums[i];
            nums[i] = temp;

        }

    }

    // insertion sort
    public static void insertionsort(int nums[]) {// time complexity of insertion sort is O(n^2)
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i - 1;
            // finding the current positon to insert
            while (prev >= 0 && nums[prev] > curr) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            // insertion
            nums[prev + 1] = curr;
        }
    }

    // insertion sort
    // import.java.util.Arrays;
    // time complexity of inbiult sort is O(nlogn) which is way less than bubble
    // selection and insertion sort
    // syntax is:- Arrays.sort(arrray name)
    public static void countingsort(int nums[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[j] = j;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 3,6,2,1,8,7,4,5,3,1};
        // Arrays.sort(nums, Collections.reverseOrder());
        Arrays.sort(nums);
        // countingsort(nums);
        printnums(nums);

    }

}
