class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int len=1;len<=n/2;len++){
            if(n%len==0){
                String sub =s.substring(0,len);
                String constructed="";

                for(int i =0;i<n/len;i++){
                    constructed +=sub;
                }
                if (constructed.equals(s)) {

                
                    return true;
                }
            }
        }
        return false;
    }
}