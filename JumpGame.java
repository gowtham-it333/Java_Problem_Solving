public class JumpGame {
    boolean canJump(int[] nums, int numsSize) {
        int last=0;
        for(int i=0;i<numsSize;i++){
            if(last<i) return false;
            last = last > i+nums[i] ? last : i+nums[i];
        }
        return true;
    }
}
