class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.get(i).size(); j++) {
                int diagonal = i + j;

                while (list.size() <= diagonal) {
                    list.add(0);
                }
            }
        }

        int maxDiagonal = 0;
        for (int i = 0; i < nums.size(); i++) {
            maxDiagonal = Math.max(maxDiagonal,
                    i + nums.get(i).size() - 1);
        }

        List<List<Integer>> diagonals = new ArrayList<>();

        for (int i = 0; i <= maxDiagonal; i++) {
            diagonals.add(new ArrayList<>());
        }

        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.get(i).size(); j++) {
                diagonals.get(i + j).add(nums.get(i).get(j));
            }
        }

        int[] ans = new int[nums.stream().mapToInt(List::size).sum()];
        int k = 0;

        for (List<Integer> diagonal : diagonals) {
            for (int j = diagonal.size() - 1; j >= 0; j--) {
                ans[k++] = diagonal.get(j);
            }
        }

        return ans;
    }
}