//https://leetcode.com/problems/binary-search/

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
const search = function(nums, target) {
    let answer=-1;
    let left=0, right=nums.length-1;
    let mid;
    
    while(left<=right){
        mid=parseInt((left+right)/2);
        if(nums[mid]===target){
            answer=mid;
            break;
        }
        else if(nums[mid]>target)
            right=mid-1;
        else if(nums[mid]<target)
            left=mid+1;
    }
    
    return answer;
};
