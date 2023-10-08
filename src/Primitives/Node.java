/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primitives;

import Worker.Worker;

/**
 *
 * @author Andres
 */
public class Node {
    
    private Worker data;
    private Node pNext;

    public Node(Worker data) {
        this.data = data;
    }

    public Worker getData() {
        return data;
    }

    public void setData(Worker data) {
        this.data = data;
    }

    public Node getpNext() {
        return pNext;
    }

    public void setpNext(Node pNext) {
        this.pNext = pNext;
    }
    
    
    
}
