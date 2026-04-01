class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int currArea = 0;

        while (left < right) {

            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int area = width * h;

            currArea = Math.max(currArea, area);

           
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return currArea;
    }
}