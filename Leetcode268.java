class Solution {
    public int missingNumber(int[] nums) {
        int totalsum=0;
        for(int num: nums)
        {
             totalsum +=num;
        }
        int n=nums.length;
        int formulaSum=n*(n+1)/2;
        return formulaSum-totalsum;
    }
}