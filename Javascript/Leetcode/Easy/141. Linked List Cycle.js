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
    let set=new Set();

    while(head){
        if(set.has(head)){
            answer=true;
            break;
        }
        set.add(head);
        head=head.next;
    }

    return answer;
};
