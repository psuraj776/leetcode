class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        //int[][] count = new int[n][26];
        List<List<String>> ans = new ArrayList<>();
        if(strs.length == 1){
            List<String> toadd = new ArrayList<>();
            toadd.add(strs[0]);
            ans.add(toadd);
            return ans;
        }
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String s : strs){
            char[] ar = s.toCharArray();
            Arrays.sort(ar);
            String temp = new String(ar);
            if(!hm.containsKey(temp)){
                List<String> toadd = new ArrayList<>();
                toadd.add(s);
                hm.put(temp, toadd);
            }
            else{
                List<String> toadd = hm.get(temp);
                toadd.add(s);
                hm.put(temp, toadd);
            }
        }
        for(Map.Entry<String, List<String>> e : hm.entrySet()){
            ans.add(e.getValue());
        }
        return ans;
    }
}
