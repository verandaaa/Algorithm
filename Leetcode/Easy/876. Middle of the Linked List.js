//https://leetcode.com/problems/middle-of-the-linked-list/submissions/

/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
const middleNode = function(head) {
    let answer;
    let arr=[];

    while(head){
        arr.push(head);
        head=head.next;
    }
    answer=arr[Math.floor(arr.length/2)];

    return answer;
};
