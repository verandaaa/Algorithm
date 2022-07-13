//https://leetcode.com/problems/binary-tree-level-order-traversal/

/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[][]}
 */
const levelOrder = function (root) {
    let answer = [];
    let queue = [root];
    
    if(root===null)
        return answer;

    while (queue.length) {
        let tmp = [];
        const queue_len=queue.length;
        for(let i=0;i<queue_len;i++) {
            const parent = queue.shift();
            tmp.push(parent.val);
            if (parent.left)
                queue.push(parent.left);
            if (parent.right)
                queue.push(parent.right);
        }
        answer.push(tmp);
    }
    return answer;
};
