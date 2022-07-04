public class Solution {
    /**
     * 删除排序数组中的重复项
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
//        边界条件判断
        if (nums.length == 0 || nums == null)
            return 0;
//        双指针
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            //如果左指针和右指针指向的值一样，说明有重复的，
            //这个时候，左指针不动，右指针继续往右移。如果他俩
            //指向的值不一样就把右指针指向的值往前挪
            if (nums[left]!=nums[right]){
                nums[++left]=nums[right];
            }
        }
        return ++left;
    }


}