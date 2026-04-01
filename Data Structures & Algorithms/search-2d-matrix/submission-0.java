

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int index = IntStream.range(0, m * n)
                .filter(i -> matrix[i / n][i % n] == target)
                .findFirst()
                .orElse(-1);

        return index != -1;
    }
}