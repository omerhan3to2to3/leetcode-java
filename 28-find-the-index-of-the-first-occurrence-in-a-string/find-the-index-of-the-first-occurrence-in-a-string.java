class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0, j = 0,match =1,k;
        while(i< (haystack.length()-needle.length()+1)){
            j=0;
            match = 1;
            if(haystack.charAt(i) == needle.charAt(j) && haystack.charAt(i+ needle.length() -1 ) == needle.charAt(j + needle.length()-1 ) ){
                k=i;
                while(j < needle.length() && match == 1){
                    if(haystack.charAt(k) != needle.charAt(j)){
                        j=0;
                        match = 0;
                    }
                    k++;
                    j++;
                }if(match==1){
                    return (k-needle.length());
                }
            }
            i++;
        }
        return -1;
    }
}