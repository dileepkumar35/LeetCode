class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int gLength = g.length;
        int sLength = s.length;
        int l = 0, r = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        while (l < sLength && r < gLength) {
            if (g[r] <= s[l]) {
                r = r + 1;
            }
            l = l + 1;
        }
        return r;
    }
}