// You are given a string `S` of length `N` which consists of only uppercase letters. 
// Your task is to print the size of the smallest possible string that can be obtained by 
// deleting a contiguous sequence of substring "AB" and/or "CD" repeatedly any number of times.

// Input Format
// The input consists of two lines: 
// The first line contains an integer `N`, 
// and the second line contains the string `S`.

// Output Format
// Print the size of the smallest possible string.

// Constraints
// 0 ≤ N ≤ 105

// Example
// Input:
// 7
// ACABDBD

// Output:
// 1

import java.util.*;

public class deletingSubsequence{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of the string : ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println(" Enter the String : ");
        String s = sc.nextLine(); 
        sc.close();

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty()&& c=='B'&& stack.peek()=='A'){
                stack.pop();
            }else if(!stack.isEmpty()&& c=='D'&& stack.peek()=='C'){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        System.out.println("the length is : " + stack.size());
    }
}