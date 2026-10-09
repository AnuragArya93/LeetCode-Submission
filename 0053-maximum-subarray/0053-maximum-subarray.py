class Solution(object):
    def maxSubArray(self, nums):
       maxSum=nums[0]
       currentSum=nums[0]
       for i in nums[1:]:
        if currentSum<0:
            currentSum=0
        currentSum=currentSum+i
        if maxSum<currentSum:
            maxSum=currentSum
       return maxSum
