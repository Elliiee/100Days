public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee)


    public EmployeeNode removeFromFront(){
        if (isEmpty()){
            return null;
        }
    }

    public int getSize(){
        return size;
    }

    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        if (tail == null){
            head = node;
        }
        else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("HEAD ->");
        while (current != null){
            System.out.print(current);
            System.out.print(" ->");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
