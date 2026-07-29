class Solution:
    def findErrorNums(self, nums):
        count = [0] * (len(nums) + 1)

        # Count the frequency of each number
        for num in nums:
            count[num] += 1

        ans = [0, 0]

        # Find duplicate and missing numbers
        for i in range(1, len(nums) + 1):
            if count[i] == 2:
                ans[0] = i
            elif count[i] == 0:
                ans[1] = i

        return ans
        