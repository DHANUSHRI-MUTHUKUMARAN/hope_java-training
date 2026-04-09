class Solution {
    public int firstUniqChar(String s) {
        int flag=0;
        for(int i=0;i<s.length();i++){
            boolean isun = true;
            for(int j=0;j<s.length();j++){
                if(i!=j && s.charAt(i) == s.charAt(j)){
                    isun =false;
                    break;
                }
            }
            if(isun)
                return i;
        }
        return -1;
    }
}