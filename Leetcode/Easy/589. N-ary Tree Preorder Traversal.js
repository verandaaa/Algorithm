//https://leetcode.com/problems/n-ary-tree-preorder-traversal/

/**
 * // Definition for a Node.
 * function Node(val, children) {
 *    this.val = val;
 *    this.children = children;
 * };
 */

/**
 * @param {Node|null} root
 * @return {number[]}
 */
const preorder = function(root) {
    let answer;
    
    answer = recursion(root,answer);
    
    return answer;
};

const recursion = function(root,answer=[]){
    if(!root)
        return answer;
    else{
        answer.push(root.val);
        for(let x of root.children){
            recursion(x, answer);
        }   
    }
    return answer;
}
