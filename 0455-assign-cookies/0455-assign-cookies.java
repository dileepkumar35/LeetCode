class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int gLength = g.length;
        int sLength = s.length;
        int contentChildren = 0, cookieIndex = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        while (contentChildren < sLength && cookieIndex < gLength) {
            if (g[cookieIndex] <= s[contentChildren]) {
                cookieIndex++;
            }
            contentChildren++;
        }
        return cookieIndex;
    }
}