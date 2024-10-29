package com.quiz.leetcode;

public class T0002AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode result = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int l1Dig = l1 != null ? l1.val : 0;
            int l2Dig = l2 != null ? l2.val : 0;
            int sum = l1Dig + l2Dig + carry;
            carry = sum / 10;
            dummy.next =  new ListNode(sum % 10);
            dummy = dummy.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return result.next;
    }
}
