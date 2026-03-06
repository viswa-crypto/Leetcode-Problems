class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.length() == 1 && s.charAt(0) == '1') return true;
        // char arr[] = s.toCharArray();
        // Arrays.sort(arr);
        // int start =0,end = s.length()-1;
        // while(start<=end)
        // {
        //     char temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = temp;
        //     start++;
        //     end--;
        // }
        // String x = new String(arr);
        for(int i  =0;i<s.length()-1;i++){
            if(s.charAt(i) == '0' && s.charAt(i+1) == '1') return false;
        }
        // return s.equals(x);
        return true;
    }
}