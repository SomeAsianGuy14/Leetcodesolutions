class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int out = 0;
        for(int i = left; i <= right; i++) {
            if(vowel(words[i].charAt(0)) && vowel(words[i].charAt(words[i].length()-1)))
                out++;
        }
        return out;
    }

    public boolean vowel(char x) {
        return x == 'a' || x =='e' || x == 'i' || x == 'o' || x == 'u';
    }
}
