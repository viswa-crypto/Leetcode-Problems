class Solution {
    public String reverseWords(String s) {
        String arr[] = s.trim().split("\\s+");
        List<String>lst= Arrays.asList(arr);
        Collections.reverse(lst);
        String res = String.join(" ",lst);
        return res;
    }
}