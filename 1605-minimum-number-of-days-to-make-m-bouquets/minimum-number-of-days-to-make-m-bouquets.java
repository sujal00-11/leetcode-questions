class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;

        for (int day : bloomDay) {
            left = Math.min(left, day);
            right = Math.max(right, day);
        }

        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canMakeBouquets(bloomDay, m, k, mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

    private boolean canMakeBouquets(int[] bloomDay, int m, int k, int currentDay) {
        int bouquets = 0;
        int flowers = 0;

        for (int day : bloomDay) {
            if (day <= currentDay) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }

        return bouquets >= m;
    }
}