
public class Main {
    public static void main(String[] args) {
        System.out.println(exp(3,3));
    }
    //exp(3,4) => 81
    /*
        exp(3,4) = 3*exp(3,3)
        exp(3,3) = 3*exp(3,2)
        exp(3,2) = 3*exp(3,1)
        exp(3,1) = 3*exp(3,0)
        exp(3,0) = 1
        exp(3,1) = 3*1
        exp(3,2) = 3*3
        exp(3,3) = 3*9
        exp(3,4) = 3*27

     */

    //write a recursive method that raises x to the m-th power
    public static int exp(int x, int m){
        if(m==0){
            return 1;
        }
        return x*exp(x,m-1);
    }










    //Write a recursive method that prints numbers 1...n in descending order
    public static void descending(int n){
        if(n>0){
            System.out.println(n);
            descending(n-1);
        }

    }


}
