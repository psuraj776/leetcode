public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for(int i=0;i<strs[0].length() && flag==false;i++){
            char c = strs[0].charAt(i);
            for(String s : strs){
                if(i>=s.length() || s.charAt(i) != c){
                    flag=true;
                }
            }
            if(!flag) sb.append(c);
        }
        String res = String.valueOf(sb);
        return res;
    }