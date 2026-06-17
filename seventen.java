public class seventen {
  static boolean isEven(int a){
    if(a % 2 == 0){
        return true;
    }
    else{
        return false;
    }
  }
  public static void main(String[] args) {
        boolean result = isEven(11);
        System.out.println(result);
  }
}
