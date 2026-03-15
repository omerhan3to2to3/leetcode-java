import java.util.Arrays;

class Solution {
    public char findTheDifference(String s, String t) {
        // Stringleri char array'e çeviriyoruz
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        // Karakter dizilerini sıralıyoruz
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        int i = 0;
        // sChars üzerinden dönüyoruz
        while (i < sChars.length) {
            if (sChars[i] != tChars[i]) {
                return tChars[i];
            }
            i++;
        }
        
        // Eğer döngü bittiyse, farklı olan karakter t'nin son karakteridir
        return tChars[i];
    }
}