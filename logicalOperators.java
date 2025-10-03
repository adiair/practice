public class logicalOperators{
    public static void main(String[] args){
        //&& logical AND : true if both conditions are true
        //|| logical OR : true if at least one condition is true
        //! logical NOT : reverses the result (true becomes false)

        int a = 10;
        int b = 25;
        int c = 20;

        // largest among these
        if(a > b && a > c){
            System.out.println("the a is the greatest : " + a);
        }else if(b> c && b>a){
            System.out.println("b is greater: " + b);
        }
        else{
            System.out.println("c is greater : "+ c);
        }
    }
}