class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        String res ="";
        char arr[] = s.toCharArray();
        for(char x : arr)
        {
            map.put(x ,map.getOrDefault(x,0)+1);
        }
         Map<Character, Integer> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey, 
                        Map.Entry::getValue,
                        (oldVal, newVal) -> oldVal, 
                        LinkedHashMap::new
                ));
        for(Map.Entry<Character,Integer> en : sortedMap.entrySet())
        {
            int n = en.getValue();
            for(int i=0;i<n;i++) res+=en.getKey();
        }
        return res;
    }
}