public static int reverseNumber(int num){
        int digit = 0;
        int result = 0;
        while(num > 0){
            digit = num % 10;
            num = num / 10;
            result = result * 10 + digit;
        }
        return result;
    } 
    public static void main(String[] args) {
        int finalresult = reverseNumber(1234);
        System.out.println("Reverse number is : "+finalresult);
    }
