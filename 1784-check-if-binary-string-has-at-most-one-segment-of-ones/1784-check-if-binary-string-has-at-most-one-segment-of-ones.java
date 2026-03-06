class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.length() == 1 && s.charAt(0) == '1') return true;
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        int start =0,end = s.length()-1;
        while(start<=end)
        {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        String x = new String(arr);
        return s.equals(x);
    }
}