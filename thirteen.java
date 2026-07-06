import java.util.Scanner;

public class thirteen {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int arr [] = {10,20,30,40,50};
        // int sum = 0;
        // int max = arr[0];
        // for(int i = 0;i <= arr.length-1;i++){
        // sum = sum + arr[i];
        // if(arr[i] > max){
        // max = arr[i];
        // }
        // }
        // System.out.println("Sum is : "+sum);
        // System.out.println("Max number is : "+max);

        // Reverse print array.

        // int arr[] = {1,2,3,4,5};
        // for(int i = arr.length-1;i >= 0;i--){
        // System.out.println(arr[i]);
        // }

        // 2D-Array
        // Ek array banao aur Scanner se ek number input lo. Check karo ki wo number
        // array mein hai ya nahi ("Found" / "Not Found" print karo).

        int[][] nums = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j] + " ");
                if (num == nums[i][j]) {
                    found = true;
                }
            }
            System.out.println();
        }
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

    }
}