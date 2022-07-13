//https://leetcode.com/problems/find-pivot-index/
//Array, Prefix Sum

const pivotIndex = function(nums) {
    let answer=-1;
    const total=nums.reduce((acc,cur)=>acc+cur,0);
    let lt_sum=0, rt_sum=total-nums[0];

    for(let i=0;i<nums.length;i++){
        if(lt_sum===rt_sum){
            answer=i;
            break;
        }
        else{
            lt_sum+=nums[i];
            rt_sum-=nums[i+1];
        }
    }

    return answer;
};
