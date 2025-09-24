// You are given an array of integers. 
// Find the balance point (index) where the sum of elements to 
// the left equals the sum of elements to the right.
//  If no such point exists, return -1.

// Input Format
// The input consists of two lines: The first line contains an integer `N`, 
// and the second line contains `N` space-separated integers representing the array.

// Output Format
// Print the index of the balance point (0-based), or -1 if no balance point exists.

// Example
// Input:
// 7
// 1 2 3 4 3 2 1

// Output:
// 3


import java.util.*;
public class ArrayBalancePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("the answer is : "+balanced(arr));
        sc.close();
    }

    public static int balanced(int[] arr) {
        int n = arr.length;
        if (n==0) return -1;
        if (n==1) return 0;

        int totalSum = 0;
        for(int num : arr){
            totalSum += num;
        }

        int leftSum = 0;
        for(int i=0; i<n ; i++){
            int rightSum = totalSum - leftSum - arr[i];
            //right = total - 0 - i
            if(leftSum == rightSum) return i;

            leftSum += arr[i];
        }

        return -1;
    }
}
