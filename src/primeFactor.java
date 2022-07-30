import java.util.*;



class Solution {
      public List<Integer> primeFactors(int k){
          List<Integer> temp= new ArrayList();
          for (int j = 2; j * j <= k; j++) {
              if (k % j == 0)
                  temp.add(j);
              while (k % j == 0) k /= j;
          }
          if (k > 1) temp.add(k);
          return temp;
      }

    public static void main(String[] args) {
          Solution s = new Solution();
          System.out.println(s.primeFactors(142351345));
    }
}
