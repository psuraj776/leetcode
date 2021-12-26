class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<pieces.length;i++){
            hm.put(pieces[i][0],i);
        }
        int index=0;
        while(index<arr.length){
            if(!hm.containsKey(arr[index])) return false;
            int len=pieces[hm.get(arr[index])].length;
            int first=hm.get(arr[index]);
            int i=0;
            while(i<len&&index<arr.length){
                if(pieces[first][i]!=arr[index]) return false;
                i++;
                index++;
            }
        }
        return true;
    }
}
