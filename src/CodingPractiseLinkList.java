public class CodingPractiseLinkList {
    public static void main(String[] args) {
        CodingPractiseLinkList obj = new CodingPractiseLinkList();
        obj.useMyLinkList();
    }

    private void useMyLinkList() {
        MyLinkList list = new MyLinkList();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.delete(6);
        list.show();
        String str = list.search(6);
        System.out.println(str);
        list.deleteAtIndex(2);
        list.show();
        list.addAtIndex(2);
        list.show();

    }

    class MyLinkList {
        ListNode head;
        public MyLinkList() {
            this.head = null;
        }
        public void add(int value) {
            ListNode node = new ListNode(value);
            if (head == null) {
                head = node;
            } else {
                //find out last node of linklist and append new node after that
                ListNode lastNode = head;
                while (lastNode.next != null) {
                    lastNode = lastNode.next;
                }
                lastNode.next = node;
            }
        }
        public void show() {
            ListNode node = head;
            while (node.next != null) {
                System.out.println(node.value);
                node = node.next;
            }
            System.out.println(node.value);
        }

        public void delete(int i) {
            ListNode node = head;
            ListNode prev = head;
            while (node.value != i) {
                prev = node;
                node = node.next;
                if (node == null) {
                    break;
                }
            }
            if (node != null) {
                prev.next = node.next;
            } else {
                System.out.println("Node is not found in list");
            }
        }

        public String search(int key) {
            ListNode node = head;
            int count = 1;
            while(node.value != key && node.next != null) {
                node = node.next;
                count++;
            }
            if(node.value == key) {
                return count + "th element in list is the searched number";
            } else {
                return "Searched number is not present in list";
            }
        }

        public void deleteAtIndex(int index) {
            ListNode node = head;
            int count = 1;
            ListNode prev = head;
            while(count < index && node.next != null){
                prev= node;
                node = node.next;
                count++;
            }
            if(count == 1) {
                head = head.next;
            }
            else if(count < index && node.next == null) {
                System.out.println("given index is not available in list");
            }
            else {
                prev.next = node.next;
            }
        }

        public void addAtIndex(int index) {
            ListNode node = head;
            int count = 1;
            ListNode prev = head;
            while(count < index && node.next != null){
                prev= node;
                node = node.next;
                count++;
            }
            if(count == 1) {
                head.value = 20;
                head.next = prev;
            }
            else if(count < index && node.next == null) {
                System.out.println("given index is not available in list");
            }
            else {
                ListNode temp = null;
                temp.value = 20;
                temp.next = node;
                prev.next = temp;
            }
        }
    }

    class ListNode {
        int value;
        ListNode next = null;

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }
}
