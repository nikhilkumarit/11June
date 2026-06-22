public class function {
    // Q.5
    // public static int factorial(int a){
    //     int fact = 1;
    //     for(int i = a;i > 0;i--){
    //          fact = fact * i;
    //     }
    //     return fact;
    // }
    // public static void main(String[] args) {
    //     int result = factorial(5);
    //     System.out.println("Factorail of is : "+result);
    // }

    // Q.6

    // public static int countVowels(String str){
    //     int count = 0;
    //     for(int i = 0;i < str.length();i++){
    //         char ch = Character.toLowerCase(str.charAt(i));
        
    //         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    // public static void main(String[] args) {
    //     int result = countVowels("HELLO WORLD");
    //     System.out.println(+result);
    // }

    // Q.7
    // public static int area(int side){
    //     return side * side;
    // }
    // public static int area(int length,int width){
    //     return length * width;
    // }
    // public static void main(String[] args) {
    //     int result1 = area(10);
    //     System.out.println("Area of square is : "+result1);

    //     int result2 = area(10, 20);
    //     System.out.println("Area of rectangle is : "+result2);
    // }

    // Q.8

    // public static boolean isPrime(int num){
    //     for(int i = 2; i < num; i++){
    //         if(num % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     boolean result = isPrime(7);
    //     System.out.println(result);
    // }

    // Q.9

    // public static int reverseNumber(int num){
    //     int digit = 0;
    //     int result = 0;
    //     while(num > 0){
    //         digit = num % 10;
    //         num = num / 10;
    //         result = result * 10 + digit;
    //     }
    //     return result;
    // } 
    // public static void main(String[] args) {
    //     int finalresult = reverseNumber(1234);
    //     System.out.println("Reverse number is : "+finalresult);
    // }

    // Q.10

    public static void fibonacci(int num){
        int a = 0;
        int b = 1;
        int c;
        System.out.print(+a+ " " +b+ " ");

        for(int i = 2;i < num;i++){
            c = a + b;
            System.out.print(c+ " ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        fibonacci(7);
        
    }
}
