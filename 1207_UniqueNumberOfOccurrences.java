class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> st = new HashSet<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : arr){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }
            else{
                hm.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(st.contains(entry.getValue())) return false;
            else st.add(entry.getValue());
        }
        return true;
    }
}