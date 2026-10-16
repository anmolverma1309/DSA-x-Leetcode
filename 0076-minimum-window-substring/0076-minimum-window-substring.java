class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int[] map = new int[256];
        for (int i = 0; i < t.length(); i++) 
            map[t.charAt(i)]++;
        int i = 0;
        int minLen = Integer.MAX_VALUE;
        int sIdx = 0;
        int count = 0;
        for (int j = 0; j < n; j++) {
            int right = s.charAt(j);
            if (map[right] > 0)
                count++;
            map[right]--;
            while (count >= t.length()) {
                if (j - i + 1 < minLen) {
                    sIdx = i;
                    minLen = Math.min(minLen, j - i + 1);
                }
                int left = s.charAt(i);
                map[left]++;
                if (map[left] > 0)
                    count--;
                i++;
            }
        }
        if (minLen == Integer.MAX_VALUE)
            minLen = 0;
        return s.substring(sIdx, sIdx + minLen);
    }
}