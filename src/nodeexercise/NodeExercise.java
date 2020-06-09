/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodeexercise;

/**
 * Prompt: Given the sorted list of numbers, traverse the linked list to remove
 * the node that has duplicate value.
 * @author Hardikkumar Bhakta <your.name at your.org>
 */
public class NodeExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListNodeHB list = new ListNodeHB();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        System.out.print("Given sorted list: ");
        list.displayList();
        
        list.removeDuplicate();
        System.out.print("Removed duplicate list: ");
        list.displayList();
    }
    
}
