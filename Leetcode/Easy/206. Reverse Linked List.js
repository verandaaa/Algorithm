//https://leetcode.com/problems/reverse-linked-list/

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
 const reverseList = function(head) {
    const answer= new ListNode();
    let answer_cur=answer;

    while(head){
        let node = new ListNode(head.val);
        node.next=answer_cur.next;
        answer_cur.next=node;
        head=head.next;
    }

    return answer.next;
};
