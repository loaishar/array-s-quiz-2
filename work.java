public class work {

       public static void main(String[] args) {
              String ans = " ";
              double[] arr = { 2,0,3,-1};
              for (int i = arr.length - 1; i >= 0; i--) {
                     if (arr[i] != 0 && i!=0) {
                            ans += arr[i]+"x"+"^"+i+"+";
                     }
                     if (arr[i] != 0 && i==0) {
                            ans+=arr[i];
                     }
              }
              int y= ans.length()-1;
              if(ans.charAt(y)=='+')
              ans =ans.substring(0,y);

              System.out.println(ans);
       }
}