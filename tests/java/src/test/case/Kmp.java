package test;

public class Kmp {
	public static void main(String[] args) {
    	char[] t={
'a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j',
'a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j',
'a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j',
'a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j',
'a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j',
'a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j',
'a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j',
'a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j',
'a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j',
'a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j',
'a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','a','b','c','d','e','f','g','h','i','j','b','c','a'};
		char[] p={'b','c','a'};
		int ans = Kmp(t, p);
		System.out.println(ans);
    }
	public static int Kmp(char[] t, char[] p) {
		int i = 0; // 主串的位置

        int j = 0; // 模式串的位置

        int[] next = new int[p.length];// next数组为敏感
        next[0] = -1;
        int k = -1;
        while (j < p.length - 1) {
            if (k == -1 || p[j] == p[k]) {
                next[++j] = ++k;
            } else {
                k = next[k];
            }
        }
        i=0;
        j=0;
        while (i < t.length && j < p.length) {
            if (j == -1 || t[i] == p[j]) { // 当j为-1时，要移动的是i，当然j也要归0
                i++;
                j++;
            } else {
                j = next[j]; // j回到指定位置
            }
        }
        int ans=i-j;
        if (j == p.length) {
            System.out.println(ans);
            return ans;
        } else {
            System.out.println(-1);
            return -1;
        }
	}
}