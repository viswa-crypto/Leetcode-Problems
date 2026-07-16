class Solution {
    public long gcdSum(int[] nums) {
        int max = nums[0];
        int res[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] > max)
            {
                max = nums[i];
                res[i] = gcd(max,nums[i]);
            }
            else
            {
                res[i] = gcd(max ,nums[i]);
            }
        }
        Arrays.sort(res);
        // for(int x:res) System.out.print(x+" ");
        int st=0,end=nums.length-1;
        long sum =0;
        while(st<end){
            sum+=gcd(res[st],res[end]);
            st++;
            end--;
        }
        return sum;
    }
    public int  gcd(int a,int b)
    {
        if(b == 0) return a;
        return(gcd(b,a%b));
    }
}