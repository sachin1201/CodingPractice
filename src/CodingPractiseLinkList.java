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

        boolean isExist = list.search(4);
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

        public boolean search(int i) {



            return false;
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
