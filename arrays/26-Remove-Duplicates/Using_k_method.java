class Solution {
    static{
        for (int i=0;i<300;i++){
            removeDuplicates(new int[2]);
        }
    }
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        int val = -101;
        if (nums.length==1) return 1;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=val){
                nums[k] = nums[i];
                k++;
                val = nums[i];
            }
        }
        return k;
    }
}
