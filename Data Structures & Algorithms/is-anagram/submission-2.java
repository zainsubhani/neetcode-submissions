class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length() )
        {
            return false;
        }
        int [] tFreq = new int [26];
        int [] sFreq = new int [26];

        for(int i=0;i<s.length();i++)
        {
            tFreq[t.charAt(i)-'a']++;
            sFreq[s.charAt(i)-'a']++;


        }

        return Arrays.equals(tFreq,sFreq); 



    }
}
