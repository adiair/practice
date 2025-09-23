public class factorial{
    public static int Fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*Fact(n-1);
        }
    }
    
    public static void main(String [] args){
        int n = 4;
        int result = Fact(n);
        System.out.println("factorial : " + result);
    }
}