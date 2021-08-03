public int lengthOfLongestSubstring(String s) {
        if(s.length()<2)return s.length();
        int omax=1;
        int x=1;
        HashMap<Character, Integer>map=new HashMap<>();
        map.put(s.charAt(0),0);
        //longest strings ending here
        for(int i=1; i<s.length();i++){
            char ch=s.charAt(i);
            if(!map.containsKey(ch)){
                x+=1;
            }
            else{
                int idx=map.get(ch);
                if(i-idx> x){
                    x+=1;
                }
                else{
                    x=i-idx;
                }
            }
            
            omax=Math.max(omax, x);
            map.put(ch,i);
            
        }
        return omax;
        
    }