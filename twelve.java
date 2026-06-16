public class twelve {
    public static void main(String args[]) {

        // Pattern print.
        // *
        // * *
        // * * *
        // * * * *

        // for(int i = 1;i <= 4;i++){
        // for(int j = 1;j <= i;j++)
        // {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Pattern print.
        // * * * *
        // * * *
        // * *
        // *

        // for(int i = 4;i >= 1;i--){
        // for(int j = i;j >= 1;j--){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Pattern print.
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4

        // for(int i = 1;i <= 4;i++){
        // for(int j = 1;j <= i;j++){
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }

        // Pattern print.
        //    *
        //   * *
        //  * * *
        // * * * *

        for(int i = 1;i <= 4;i++){
            for(int s = 4;s >= i;s--)
                System.out.print(" ");
            {
            for(int j = 1;j <= i;j++)
                System.out.print("* ");
            
            System.out.println();
            }
        }
    }
}
