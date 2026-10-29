class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1.0;

        if (n < 0) {
            return 1.0 / myPowPositive(x, -(long)n);
        }

        return myPowPositive(x, n);
    }

    private double myPowPositive(double x, long n) {
        if (n == 0) return 1.0;

        double half = myPowPositive(x, n / 2);
        double ans = half * half;

        if (n % 2 == 1) {
            ans *= x;
        }

        return ans;
    }
}