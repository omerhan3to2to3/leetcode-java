class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        char[] merged = new char[n1 + n2];
        
        int i = 0; 
        int j = 0; 
        
        while (i < n1 || i < n2) {
            if (i < n1) {
                merged[j++] = word1.charAt(i);
            }
            if (i < n2) {
                merged[j++] = word2.charAt(i);
            }
            i++;
        }
        
        return new String(merged); 
    }
}