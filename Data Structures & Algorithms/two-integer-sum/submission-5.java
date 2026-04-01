class Solution {
    public int[] twoSum(int[] nums, int target) {
        
    ArrayList<Integer> arr = new ArrayList<Integer>();

    for(int i = 0; i < nums.length; i++){
        int req = target - nums[i];

        for(int j = i + 1; j < nums.length; j++){
            if (nums[j] == req){
                return new int[] {i, j};
            }
        }
    }

    return null;

    }
}
