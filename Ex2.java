
public class Ex2 {

       public static double f(double[] poly, double x) {
            double sum=0;
              for (int i = poly.length - 1; i >= 0; i--) {

                     sum+=poly[i]*Math.pow(x,i); 
                     System.out.println(sum);
              }
             return sum;     



       }
       public static String poly(double[] poly) {
              String ans = "";
              double[] arr = { 2, 0, 3, -1 };
              for (int i = arr.length - 1; i >= 0; i--) {
                     if (arr[i] != 0 && i != 0) {
                            ans += arr[i] + "x" + "^" + i + "+";
                     }
                     if (arr[i] != 0 && i == 0) {
                            ans += arr[i];
                     }
              }
              int y = ans.length() - 1;
              if (ans.charAt(y) == '+')
                     ans = ans.substring(0, y);

              return ans;

       }

       // public static double root(double[] p, double x1, double x2, double eps) {


       // }

       // public static double[] add(double[] p1, double[] p2) {


       // }

       // public static double[] derivative(double[] po) {
       // }


       public static void main(String[] args) {
              String ans = "";
              double[] arr = { 2, 0, 3, -1 };
              for (int i = arr.length - 1; i >= 0; i--) {
                     if (arr[i] != 0 && i != 0) {
                            ans += arr[i] + "x" + "^" + i + "+";
                     }
                     if (arr[i] != 0 && i == 0) {
                            ans += arr[i];
                     }
              }
              int y = ans.length() - 1;
              if (ans.charAt(y) == '+')
                     ans = ans.substring(0, y);

              System.out.println("here is ans >> "+ ans);


       }
}