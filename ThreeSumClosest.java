public class ThreeSumClosest {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int closest = nums[0]+nums[1]+nums[2],sum;
            for(int i=0;i<nums.length-2;i++){
                int left = i+1,right=nums.length - 1;
                while(left<right){
                    sum = nums[left] + nums[right] + nums[i];
                    if(Math.abs(sum - target) < Math.abs(closest - target)){
                        closest = sum;
                    }
                    if(sum < target) left++;
                    else if(sum>target) right--;
                    else return closest;
                }
            }
            return closest;
        }

}
