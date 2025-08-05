class Solution {
    public static boolean num( char x)
    {
        if(Character.isDigit(x) || x>='a' && x<='z' || x>='A' && x<='Z')
        {
            return true ;
        }
        return false;
    }
    public boolean isPalindrome(String s) {
        int n=s.length()-1;
        String a="";
        for(int i=0;i<=n;i++){
            if(num(s.charAt(i))){
                a=a+(s.charAt(i)); 
            }
        }
    
        a=a.toLowerCase();
        int size  = a.length();
        for(int i=0;i<size;i++)
        {
            if(a.charAt(i) != a.charAt(size-i-1))
            {
                return false;
            }
        }
        return true;
    }
   
}