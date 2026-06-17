public class sixteen {
    public static void main(String args[]){

        // String Palindrome check.

        String str = "madam";
        String reverse = "";
        for(int i = str.length()-1;i >= 0;i--){
            reverse = reverse + str.charAt(i);
            System.out.println(reverse);
        }

        if(reverse.equals(str)){
            System.out.println("String is palindrome : "+str);
        }
        else{
            System.out.println("String is not palindrome.");
        }
    }
}