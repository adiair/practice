
import java.util.*;

public class thirdOct{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] marks = new int[n];
        // System.out.println("enter the marks according to rollnumber : ");
        // for(int i=0; i<n;i++){
        //     marks[i] = sc.nextInt();
        // }
        // sc.close();
        // for(int i=0;i<n;i++){
            //     if(marks[i] < 35){
                //         System.out.println("less than 35 : " + i + " rollnumber");
                //     }
                // }
                
        System.out.print("enter length of array : ");
        int n = sc.nextInt();
        
        System.out.println("enter elements : ");
        int[] arr = new int[n];
        for(int i=0; i<n ; i++ ){
            //taking input
            arr[i] = sc.nextInt();
        }
        sc.close();

        //sum of all elements
        int sum = arr[0];
        for(int i=1 ; i<n ; i++){
            sum = sum + arr[i];
        }
        System.out.println("the sum of all the elements : " + sum);

    }
}