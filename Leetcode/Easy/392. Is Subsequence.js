//https://leetcode.com/problems/is-subsequence/

const isSubsequence = function(s,t) {
    let answer=true;
    let start=0;
    
    for(let i=0;i<s.length;i++){
        const index=t.indexOf(s[i],start);
        if(index>=0)
            start=index+1;
        else
            return false;
    }
    return answer;
};
