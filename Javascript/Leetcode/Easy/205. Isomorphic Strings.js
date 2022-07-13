//https://leetcode.com/problems/isomorphic-strings/
//Hash Table, String

const isIsomorphic = function(s,t) {
    let answer=true;
    let map1= new Map();
    let map2=new Map();

    for(let i=0;i<s.length;i++){
        if(!map1.has(s[i])){
            map1.set(s[i],t[i]);
        }
        else{
            if(map1.get(s[i])!==t[i])
                return false;
        }
        if(!map2.has(t[i])){
            map2.set(t[i],s[i]);
        }
        else{
            if(map2.get(t[i])!==s[i])
                return false;
        }
    }
    return answer;
};
