class Solution {
    public int maximumGain(String s, int x, int y) {
        int res = 0;
        char letters[] = s.toCharArray();
        int n = letters.length;
        int aCnt = 0, bCnt = 0;
        char a = 'a', b = 'b';
        if (x < y) {
            int temp = x;
            x = y;
            y = temp;
            a = 'b';
            b = 'a';
        }
        for (int i = 0; i < n; i++) {
            if (letters[i] == a)
                aCnt++;
            else if (letters[i] == b) {
                if (aCnt > 0) {
                    aCnt--;
                    res += x;
                } else {
                    bCnt++;
                }
            } else {
                res += Math.min(aCnt, bCnt) * y;
                aCnt = 0;
                bCnt = 0;
            }
        }
        if (aCnt != 0) {
            res += Math.min(aCnt, bCnt) * y;
        }
        return res;

    }
}