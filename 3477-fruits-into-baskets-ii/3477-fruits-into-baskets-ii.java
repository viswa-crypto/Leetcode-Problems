class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int rem = 0;
        for(int i=0;i<fruits.length;i++)
        {
            int visit = 0;
            for(int j=0;j<baskets.length;j++)
            {
              if(baskets[j]>=fruits[i])
              {
                baskets[j] = 0;
                visit = 1;
                break;
              }
            }
            if(visit==0) rem++;
        }
        return rem;
    }
}