package mortal.algorithm.com.node;

/**
 * @author mortal
 * @create 2021/8/16 18:06
 */
public class NodeTest {

//    public static void main(String[] args) {
//        ListNode listNode1 = create(new ListNode(9),0);
//        ListNode listNode2 = create(new ListNode(1),9);
//        System.err.println("start");
//        ListNode listNode = addTwoNumbers(listNode1, listNode2);//打印输出
//        while(listNode!=null){
//            System.err.println("节点:"+listNode.val);
//            listNode=listNode.next;
//        }
//        System.err.println("done");
//    }
//
//    public static ListNode create(ListNode nodeSta,int count){
//        ListNode nextNode;                           //声明一个变量用来在移动过程中指向当前节点
//        nextNode=nodeSta;                            //指向首节点
//
//        //创建链表
//        for(int i=1;i<count;i++){
//            ListNode node = new ListNode(9);         //生成新的节点
//            nextNode.next=node;                      //把心节点连起来
//            nextNode=nextNode.next;                  //当前节点往后移动
//        } //当for循环完成之后 nextNode指向最后一个节点，
//        nextNode=nodeSta;
//        return nextNode;
//    }
//    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//        int l1add = 0;
//        int la10 = 1;
//        ListNode head = l1;
//        while (null != head) {
//            l1add += (head.val * la10);
//            la10 *= 10;
//            head = head.next;
//        }
//        int l2add = 0;
//        int lb10 = 1;
//        ListNode head2 = l2;
//        while (null != head2) {
//            l2add += (head2.val * lb10);
//            lb10 *= 10;
//            head2 = head2.next;
//        }
//        int result = l2add + l1add;
//        System.err.println(result);
//        if(result==0){
//            return new ListNode(0, null);
//        }
//        ListNode first = null, last = null, newNode;
//        //创建链表
//        while (result >0) {
//            int temp = 0;
//            if (result >=10) {
//                temp = result % 10;
//            } else {
//                temp = result;
//            }
//            result = result / 10;
//            System.err.println(result);
//            newNode = new ListNode(temp);
//            newNode.next = null;
//            if (first == null) {
//                first = newNode;
//                last = newNode;
//            } else {
//                last.next = newNode;
//                last = newNode;
//            }
//        }
//
//        return first;
//    }
}
