class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int a = 1; a < n; a++) {
            int b = n - a;
            if (isNoZero(a) && isNoZero(b)) {
                return new int[]{a, b};
            }
        }
        return new int[]{}; // theoretically won't reach here
    }
    
    private boolean isNoZero(int x) {
        while (x > 0) {
            if (x % 10 == 0) return false; // agar koi digit 0 mila
            x /= 10;
        }
        return true;
    }
}
