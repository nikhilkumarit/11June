public class nineteen {

    // Q.1
    // public static int square(int a){
    // return a * a;
    // }
    // public static void main(String [] args){
    // int result = square(10);
    // System.out.println("Square is : "+result);
    // }

    // Q.2
    // public static boolean isPositive(int num){

    // if(num < 0){
    // return false;
    // }
    // else{
    // return true;
    // }

    // }
    // public static void main(String[] args) {
    // boolean result = isPositive(0);
    // System.out.println("Result is : "+result);
    // }

    // Q.3
    // public static void printTable(int num){
    // for(int i = 1;i <= 10;i++){
    // System.out.println(+num+ " x " +i+ " = "+(num*i));
    // }
    // }
    // public static void main(String[] args) {
    // printTable(10);
    // }

    // Q.4
    public static int isMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        int result = isMax(10, 7, 6);
        System.out.println(+result + " is big.");
    }
}
