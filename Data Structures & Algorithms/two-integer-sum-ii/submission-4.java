class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int head = 0;
        int tail = len -1;

        while(head<=tail){
            if(numbers[head]+numbers[tail] == target){
                return new int[]{head+1,tail+1};
            }
            else if(numbers[head] + numbers[tail] < target){
                head++;
            }
            else{
                tail--;
            }
            
        }

        return new int[]{};
    }
}
