import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex2 {
       public static double f(double[] poly, double x) {
              // //-----------------------
              double sum = 0;
              for (int i = poly.length - 1; i >= 0; i--) {

                     sum += poly[i] * Math.pow(x, i);
                     System.out.println(sum);
              }
              return sum;
              // //-----------------------

       }

       public static String poly(double[] poly) {
              // //-----------------------
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
              // //-----------------------
       }

       // public static double root(double[] p, double x1, double x2, double eps) {

       // // if (f(p,x1) * f(p,x2) >= 0) {
       // // System.out.println("You have not assumed" + " right x1 and x2");
       // // return;
       // // }
       // //-----------------------------//
       double c = x1;while((x2-x1)>=eps)
       {
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
       // //--------------------------------------------------
       // }

       public static double[] add(double[] p1, double[] p2) {
       //        //-----------------------
              int maxlentharr;
              int minlentharr;
              if (p1.length > p2.length) {
                     maxlentharr = p1.length;
                     minlentharr = p2.length;
              } else {
                     maxlentharr = p2.length;
                     minlentharr = p1.length;
              }
              double[] Array = new double[maxlentharr];
              for (int i = 0; i < Array.length; i++) {
                     Array[i] = 0;
              }
              if ((p1.length > p2.length)) {
                     for (int i = 0; i < maxlentharr; i++) {
                            Array[i] += p1[i];
                     }
              }
              if ((p2.length > p1.length)) {
                     for (int i = 0; i < minlentharr; i++) {
                            Array[i] += p2[i];
                     }
              }

              return Array;
       //        //-----------------------

       }

       public static double[] mul(double[] p1, double[] p2) {
       //        //-----------------------
       double[] p1 = { 2, 3, 4 };
       double[] p2 = { 2, 3 };
       int maxlentharr, minlentharr, fin=0, lin;
       if (p1.length > p2.length) {
           maxlentharr = p1.length;
           minlentharr = p2.length;
       } else {
           maxlentharr = p2.length;
           minlentharr = p1.length;
       }
       lin=maxlentharr;
       double[] Array = new double[maxlentharr + minlentharr];
       for (int i = 0; i < Array.length; i++) {
           Array[i] = 0;
       }
       String son=Arrays.toString(Array);
       System.out.println(son);

       for (int k = 0; k < p1.length; k++) {
           for (int j = 0; j < p2.length; j++) {
               Array[j + k] +=(p1[k] * p2[j]);

           }
           System.out.println(Arrays.toString(Array));
       }
       for (int i = 0; Array[i]==0; i++) {
          // if (Array[i] != 0) {
               fin = i;
            //   break;
         //  }
       }
       for (int i = (Array.length )- 1; Array[i]== 0; i--) {
          // if (Array[i] != 0) {
               lin = i;
          //    // break;
         //  }
       }
     //  System.out.println("------------------");
       for (double element : Array) {
           System.out.println("------------------");
           System.out.println(element);
       }


       double[] copy = Arrays.copyOfRange(Array, fin, lin); 
       for (double i : copy) 
           System.out.print(i + "  "); 
 
       System.out.println(); 




       //        //-----------------------
       }

       public static double[] derivative(double[] po) {
        double D[] = new double[po.length-1];
        for(int i = 1; i < po.length; i++){
        D[i-1] = po[i]*i;
       }
       return D;
}

       public static void main(String[] args) {
            
       }
}