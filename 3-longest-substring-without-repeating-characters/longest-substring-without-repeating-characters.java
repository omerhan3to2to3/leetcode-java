class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0 , right=0 , maxlen=0;
        HashSet<Character> set = new HashSet<>();
        boolean kontrol;
        while ( right < s.length() ){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                maxlen = Math.max(maxlen, right - left);
            }else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxlen;
    }
}