//https://leetcode.com/problems/longest-palindrome/

/**
 * @param {string} s
 * @return {number}
 */
 const longestPalindrome = function(s) {
    let answer=0;
    let map=new Map();

    for(let i=0;i<s.length;i++){
        map.set(s[i],map.get(s[i])+1||1);
        if(map.get(s[i])%2===0)
            answer+=2;
    }
    if(s.length>answer)
        answer++;

    return answer;
};
