void insertAtPosition(int data, int pos) {
    Node newNode = new Node(data);

    if (pos == 1) {  // agar first pe insert karna ho
        insertBeginning(data);
        return;
    }

    Node temp = head;
    for (int i = 1; i < pos - 1 && temp != null; i++) {
        temp = temp.next;  // position tak jao
    }

    if (temp == null) {
        System.out.println("Invalid position!");
        return;
    }

    newNode.next = temp.next;
    if (temp.next != null) {
        temp.next.prev = newNode; 
    }
    temp.next = newNode;   
    newNode.prev = temp;   