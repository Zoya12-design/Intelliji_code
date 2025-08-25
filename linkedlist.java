
    class node{
        int data;
        node next;

        node(int d){
            this.data = d;
            this.next = null;
        }
    }
    class linkedlist{
    public static  node head;


    // add data
    public void adddata(int d){
        node newnode = new node(d);
        if(head == null){
            head = newnode;
        }else{
            node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    // print all
    public void printall(){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println("null");

    }

    // add front
    public void addfront(int d){
        node newnode = new node(d);
        if(head ==null){
            head = newnode;
        }else {
          newnode.next = head;
          head = newnode;

        }
    }

    // remove first item
    public void removefirstitem(){
        if(head == null){
            System.out.println("null");
        }else {
            head = head.next;
        }
    }

    //remove back item
        public static void  removebackitem(){
        //if node id empty
        if(head == null){
            System.out.println("null");

            // if node has only one element
        }else if(head.next == null) {
            head = null;
        }
        node temp = head;
        while(temp.next.next != null){
                temp = temp.next;

        }
        temp.next = null;
        }

     //print first item
     public static void printfirstitem(){
        if(head == null){
            System.out.println("list is empty");
        }else
            System.out.println(head.data);
     }

     //print last item
        public static void printbackitem(){
        if(head == null){
            System.out.println("list is empty");
        }else {
            node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            if(temp.next == null){
                System.out.println(temp.data);
            }
        }
        }
     //add to back
     public static void addtoback(int d){
        node newnode = new node(d);
        if(head == null){
            head = newnode;
        }else
        {
            node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
     }

     // find key
        public boolean  iskeyinlist(int d){
            node temp = head;
            while(temp != null){

                if(temp.data == d){
                    return true;
                    }
                temp = temp.next;
                }
            return false;
        }

     // remove key from the list
     public static void removekey(int d){
        if(head == null){
            System.out.println("list is empty");
            return;

        }
        if(head.data == d){
            head= head.next;
            return;
        }

        node temp = head;
        while(temp.next != null){
            if(temp.next.data == d){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }

         System.out.println("key "+d+" not found in list");
     }

     // check if list empty
        public boolean islistempty() {
            if (head == null) {
                return true;
            }
            return false;
        }


        // add new node before node
        public static void addnodebeforenode(int key,int d) {
            node newnode = new node(d);
            if (head == null) {
                head = newnode;
            }

            if (head.data == key) {
                newnode.next = head;
                head = newnode;
                return;
            }


            node temp = head;
            while (temp.next != null) {
                if (temp.next.data == key) {
                    newnode.next = temp.next;
                    temp.next = newnode;
                    return;
                }
                temp = temp.next;
            }
        }





    //main function
    public static void main(String args[]){
        linkedlist list = new linkedlist();
        list.adddata(1);
        list.adddata(2);
        list.adddata(3);
        list.adddata(4);
        list.adddata(5);

        list.printall();

        list.addfront(10);
        list.printall();
        list.removefirstitem();
        list.printall();
        list.removebackitem();
        list.printall();
        list.printfirstitem();
        list.printbackitem();
        list.addtoback(35);
        list.printall();
        System.out.println(list.iskeyinlist(3));
        list.removekey(3);
        list.printall();
        System.out.println(list.islistempty());
        list.addnodebeforenode(2,66);
        list.printall();
    }
}
