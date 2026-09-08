class Solution:
    def rob(self, nums: List[int]) -> int:
        n = len(nums)

        if n == 1:
            return nums[0]

        def rob_linear(arr):
            m = len(arr)

            if m == 1:
                return arr[0]

            dp = [0] * m

            dp[0] = arr[0]
            dp[1] = max(arr[0], arr[1])

            for i in range(2, m):
                pick = arr[i] + dp[i - 2]
                leave = dp[i - 1]

                dp[i] = max(pick, leave)

            return dp[m - 1]

        # Case 1: Don't rob the last house
        case1 = rob_linear(nums[:-1])

        # Case 2: Don't rob the first house
        case2 = rob_linear(nums[1:])

        return max(case1, case2)