class Solution {
    public String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] sym = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String a = "";
        int i=0;
        while(num>0){
            if(num>=values[i]){
            a=a+(sym[i]);
            num-=values[i];
            }
            else{
                i++;
            }
        }
        return a;

        
    }
}