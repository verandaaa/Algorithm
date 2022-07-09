//https://leetcode.com/problems/longest-palindrome/

/**
 * @param {string} s
 * @return {number}
 */
 const longestPalindrome = function(s) {
    let answer=0;
    let max=0;
    let check=0;
    let map=new Map();

    for(let i=0;i<s.length;i++){
        map.set(s[i],map.get(s[i])+1||1);
    }
    for(let value of map.values()){
        if(value%2===0)
            answer+=value;
        else{
            answer+=value-1;
            check=1;
        }
    }
    if(check===1)
        answer++;

    return answer;
};
