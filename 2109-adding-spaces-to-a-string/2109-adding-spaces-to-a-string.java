class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder a = new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++)
        {
                if(j<spaces.length && i == spaces[j])
                {
                    a.append(" ");
                    j++;
                }
                a.append(s.charAt(i));
        }
        return a.toString();
    }
}