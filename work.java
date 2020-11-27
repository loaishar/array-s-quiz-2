import java.util.Scanner;

public class work {

       public static String poly(double[] poly) {
              Scanner sc = new Scanner(System.in);
              char x = sc.next().charAt(0);
              String s = Character.toString(x);
              String ans = "";
           //   double[] arr = { 2, 0, 3, -1 };
              for (int i = arr.length - 1; i >= 0; i--) {
                     if (arr[i] != 0 && i != 0) {
                            ans += arr[i] + s + "^" + i + "+";
                     }
                     if (arr[i] != 0 && i == 0) {
                            ans += arr[i];
                     }
              }
              int y = ans.length() - 1;
              if (ans.charAt(y) == '+')
                     ans = ans.substring(0, y)

              return ans;

       }

       

       public static double root (double[] p,double x1,double x2,double eps){

}







public static void main(String[] args) {

}
