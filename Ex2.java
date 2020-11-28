import java.lang.reflect.Array;

public class Ex2 {
       public static double f(double[] poly, double x) {
              double sum = 0;
              for (int i = poly.length - 1; i >= 0; i--) {

                     sum += poly[i] * Math.pow(x, i);
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

       public static double root(double[] p, double x1, double x2, double eps) {

              // if (f(p,x1) * f(p,x2) >= 0) {
              // System.out.println("You have not assumed" + " right x1 and x2");
              // return;
              // }

              double c = x1;
              while ((x2 - x1) >= eps) {
                     // Find middle point
                     c = (x1 + x2) / 2;

                     // Check if middle point is root
                     if (f(p, c) == 0.0)
                            break;

                     // Decide the side to repeat the steps
                     else if (f(p, c) * f(p, x1) < 0)
                            x2 = c;
                     else
                            x1 = c;
              }
              // prints value of c upto 4 decimal places
              // System.out.printf("The value of root is : %.4f", c);
              return c;
       }

       public static double[] add(double[] p1, double[] p2) {
              int maxlentharr;
              int minlentharr;
              if(p1.length>p2.length){
                     maxlentharr=p1.length;
                     minlentharr=p2.length;
              }else{
                     maxlentharr=p2.length;
                     minlentharr=p1.length;
              }
              double[] Array = new double[maxlentharr];
              for (int i = 0; i < Array.length; i++) {
                     Array[i]=0;
                     }
              if((p1.length>p2.length)){
                     for (int i = 0; i < maxlentharr; i++) {
                            Array[i]+=p1[i];
                     }
              }
                     if((p2.length>p1.length)){
                     for (int i = 0; i < minlentharr; i++) {
                            Array[i]+=p2[i];
                     }
              }

                 return Array;
                 
        }

        public static double[] mul(double[] p1, double[] p2) {
        }
        int maxlentharr,minlentharr;
        if(p1.length>p2.length){
               maxlentharr=p1.length;
               minlentharr=p2.length;
        }else{
               maxlentharr=p2.length;
               minlentharr=p1.length;
        }
        for(i=0,j=0;i<maxlentharr&&j<minlentharr;i++,j++){

        }







       public static double[] derivative(double[] po) {





       }

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

              System.out.println("here is ans >> " + ans);

       }
}