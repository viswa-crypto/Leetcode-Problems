class Solution {
    public boolean isIsomorphic(String s1, String s2) {
       int n = s1.length();
       int a[] = new int[256];
       int b[] = new int[256];
       for(int i=0;i<n;i++)
       {
        if(a[s1.charAt(i)] != b[s2.charAt(i)]) return false;
        a[s1.charAt(i)] = i+1;
        b[s2.charAt(i)] = i+1;
       } 
       return true;
    }
}