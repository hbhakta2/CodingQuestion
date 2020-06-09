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
class NodeHB {
    int value;
    NodeHB next;
    public NodeHB(int value) {
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return "NodeHB{" + "value=" + value + '}';
    }
    
}
