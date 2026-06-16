import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Switch use karke calculator banao!

        // User se 2 numbers aur operator (+, -, *, /) input lo
        // Sahi answer print karo!
    
        System.out.println("Enter two number :");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        int operator = 0;
        System.out.println("Enter the number \nAddtion for 1. \nSubtract for 2. \nMultiplication for 3. \nDivision for 4.");
        operator = sc.nextInt();
        
        switch (operator) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                if(b == 0){
                    System.out.println("ERROR: 0 se divide nahi kar sakte!");
                }
                else{
                    System.out.println(a/b);
                }
                break;
            default:
                System.out.println("Invaild Input!");
                break;
        }
    }
}