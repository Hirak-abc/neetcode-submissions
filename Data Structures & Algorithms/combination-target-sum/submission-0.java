class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backtrack(0, nums, target, new ArrayList<>());
        return result;
    }

    void backtrack(int index, int[] nums, int target, List<Integer> curr) {
        if (target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }

        if (target < 0) return;

        for (int i = index; i < nums.length; i++) {
            curr.add(nums[i]);
            backtrack(i, nums, target - nums[i], curr);
            curr.remove(curr.size() - 1);
        }
    }
}