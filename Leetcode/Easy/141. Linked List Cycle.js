//https://leetcode.com/problems/linked-list-cycle/

/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {ListNode}
 */
const hasCycle = function(head) {
    let answer=false;

    while(head){
        if(head.val===null){
            answer=true;
            break;
        }
        head.val=null;
        head=head.next;
    }

    return answer;
};
