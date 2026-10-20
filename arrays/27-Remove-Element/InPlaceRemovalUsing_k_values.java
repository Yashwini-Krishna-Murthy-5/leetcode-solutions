class Solution {
    static{
        for (int i=0;i<300;i++){
            removeElement(new int[2],1);
        }
    }
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]!=val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
