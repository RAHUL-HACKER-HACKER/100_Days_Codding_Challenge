class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0;//here we declare two pointer left and right
        int right=1;
        int index=0;//this varible stores the output index.

        while(right<=nums.length ){
            //for mid 
            if(right<nums.length){ 
//here we again check the right ptr index,otherwise it give arrayindexoutofBoundException.
            if(nums[left]<target && nums[right]>target ){
                 index=(left+right+2)/2;//here we add length of left and right pointer left+1 and right+1 ,
            }
              else if(nums[right]==target){//this conditon satisfies when target elemnt present in array.
                index=right;
            }
            }

            else if(target>nums[nums.length-1]){ 
//this conditon satisfy when target value is greatet than last value of array.
                index=nums.length;

          
            }
        left++;
        right++;
        
        }   
return index;
        
    
    }
}