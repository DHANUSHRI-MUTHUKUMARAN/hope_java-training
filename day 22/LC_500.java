class Solution {
    public String[] findWords(String[] words) {
        Set<Character> fr = Set.of('q','w','e','r','t','y','u','i','o','p');
        Set<Character> sr = Set.of('a','s','d','f','g','h','j','k','l');
        Set<Character> tr = Set.of('z','x','c','v','b','n','m');
        List<String> res = new ArrayList<>();

        for(String word:words){
            String lower = word.toLowerCase();
            if(fr.contains(lower.charAt(0))){
                int i=1;
                for(;i<lower.length();i++){
                    if(!fr.contains(lower.charAt(i))) break;
                }
                if(i == lower.length()) res.add(word);
            }
            else if(sr.contains(lower.charAt(0))){
                int i =1;
                for(;i<lower.length();i++){
                    if(!sr.contains(lower.charAt(i))) break;
                }
                if(i == lower.length()) res.add(word);
            }
            else{
                int i=1;
                for(;i<lower.length();i++){
                    if(!tr.contains(lower.charAt(i))) break;
                }
                if(i == lower.length()) res.add(word);
            }
        }
        return res.toArray(new String[0]);
        
    }
}