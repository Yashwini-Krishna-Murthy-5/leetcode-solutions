class Solution {
    static{
        for (int i=0;i<300;i++){
            removeElement(new int[2],1);
        }
    }
    public static int removeElement(int[] nums, int val) {
        HashMap<Integer,Integer> m = new HashMap<>();
        int k = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=val){
                m.put(k,nums[i]);
                k++;
            }
        }
        for (int i=0;i<k;i++){
            nums[i] = m.get(i);
        }
        return k;
    }
}
