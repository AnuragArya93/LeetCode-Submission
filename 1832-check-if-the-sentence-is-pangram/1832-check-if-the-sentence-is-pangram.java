class Solution {
    public boolean checkIfPangram(String sentence) {
        int count=0;
         boolean[] a = new boolean[26];
            Arrays.fill(a, false); 
            for(char c :  sentence.toCharArray()){
                int idx=c-'a';
                if(a[idx]==false){
                    a[idx]=true;
                    count++;
                    if(count==26){
                        return true;
                     }
                    }
                }
                return count==26;
            }
    
}