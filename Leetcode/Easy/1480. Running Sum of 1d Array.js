//https://leetcode.com/problems/running-sum-of-1d-array/
//Array, Prefix Sum

const runningSum = function(nums) {
    let answer=[nums[0]];

    for(let i=1;i<nums.length;i++){
        answer.push(answer[i-1]+nums[i]);
    }

    return answer;
    
};
