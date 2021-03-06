class Solution {
    public String validIPAddress(String IP) {
        if(IP.contains(".")){
            if(IP.charAt(0)=='.'||IP.charAt(IP.length()-1)=='.') return "Neither";
            String[] ar=IP.split("\\.");
            if(ar.length!=4) return "Neither";
            for(int i=0;i<ar.length;i++){
                String temp=ar[i];
                if(temp==null || temp.length()==0) return "Neither";
                int temp_num=0;
                for(int j=0;j<temp.length();j++){
                    int temp_x = temp.charAt(j)-'0';
                    if(temp_x<0 || temp_x>9) return "Neither";
                    temp_num = temp_num*10+temp_x;
                }
                if(temp_num!=0&&temp.charAt(0)=='0') return "Neither";
                if(temp_num<0 || temp_num>255) return "Neither";
                if(temp_num==0&&temp.length()>1) return "Neither";
            }
            return "IPv4";
        }
        if(IP.contains(":")){
            if(IP.charAt(0)==':'||IP.charAt(IP.length()-1)==':') return "Neither";
            String[] ar=IP.split(":");
            if(ar.length!=8) return "Neither";
            for(int i=0;i<ar.length;i++){
                String temp=ar[i];
                if(temp==null || temp.length()==0) return "Neither";
                if(temp.length()>=5) return "Neither";
                if(i==0&&temp.charAt(0)=='0') return "Neither";
                for(int j=0;j<temp.length();j++){
                    if(temp.charAt(j)-'0'>=0 && temp.charAt(j)-'0'<=9){
                        continue;
                    }
                    else if(temp.charAt(j)>='A' && temp.charAt(j)<='Z'){
                        if(temp.charAt(j)>'F') return "Neither";
                    }
                    else if(temp.charAt(j)>='a' && temp.charAt(j)<='z'){
                        if(temp.charAt(j)>'f') return "Neither";
                    }
                    else{
                        System.out.print(temp.charAt(j)-'0');
                        return "Neither";
                    }
                }
            }
            return "IPv6";
        }
        return "Neither";
    }
}
