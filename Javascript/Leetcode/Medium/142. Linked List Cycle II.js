//https://leetcode.com/problems/linked-list-cycle-ii/

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
const detectCycle = function(head) {
    let answer=null;
    let set=new Set();

    while(head){
        if(set.has(head)){
            answer=head;
            break;
        }
        set.add(head);
        head=head.next;
    }

    return answer;
};
