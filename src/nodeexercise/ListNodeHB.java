/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodeexercise;

/**
 *
 * @author Hardikkumar Bhakta <your.name at your.org>
 */
class ListNodeHB {
    NodeHB listNodeHB;
    public ListNodeHB() {
        listNodeHB = null;
    }
    private NodeHB createNewNode(int value){
        return new NodeHB(value);
    }
    public void add(int value) {
        if (this.listNodeHB == null) {
            this.listNodeHB = createNewNode(value);
        } else {
            NodeHB tempNode = this.listNodeHB;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = createNewNode(value);
        }
    }
    
    public void removeDuplicate() {
       NodeHB tempNode = listNodeHB;
       NodeHB prevNode = null;
       NodeHB tmpNode = null;
       while (tempNode.next != null) {
           if (tempNode.value == tempNode.next.value) {
               prevNode = tempNode;
               tmpNode = tempNode.next;
               prevNode.next = tmpNode.next;
               tmpNode.next = null;
               continue;
           }
           tempNode = tempNode.next;
       }
    }
    public void displayList() {
        if (!isEmpty()) {
            NodeHB hbList = listNodeHB;
            while (hbList != null) {
                System.out.print(hbList.value + " ");
                hbList = hbList.next;
            }
            System.out.println();
        }
    }
    
    public void clearMemory() {
        if (!isEmpty()) {
            
        }
    }
    
    private boolean isEmpty() {
        return listNodeHB == null;
    }
}
