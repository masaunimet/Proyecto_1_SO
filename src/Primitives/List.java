/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primitives;

import Store.Drive;
import Worker.Worker;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class List {

    private Node pFirst;
    private Node pLast;
    private int size;

    public List() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public List(Node pFirst) {
        this.pFirst = pFirst;
        this.pLast = pFirst;
        this.size = 1;
    }

    public boolean isEmpty() {
        return pFirst == null;
    }

    public void empty() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    /*
    Agragegar a la lista y empieza a trabajar
     */
    public void addToList(Worker data) {
        Node pNew = new Node(data);

        if (this.isEmpty()) {
            this.pFirst = pNew;
            this.pLast = pNew;
        } else {
            this.pLast.setpNext(pNew);
            this.pLast = pNew;
        }
        pNew.getData().start();
        this.size++;

    }

    /*
    Quitar de la lista al ultimo elemento, y retorna un booleano para decir que lo puedo eliminar
     */
    public boolean removeLast(Drive drive) {
        try {
            drive.getProducerMutex().acquire();
            drive.getConsumerMutex().acquire();
            if (this.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se puede quitar mas trabajadores de este tipo debido a que no hay");
                return false;
            } else {
                if (this.size == 1) {
                    this.pFirst.getData().interrupt();
                    this.empty();
                    return true;
                } else {
                    Node pAux = this.pFirst;
                    for (int i = 0; i < this.size; i++) {
                        if (pAux.getpNext().equals(this.pLast)) {
                            this.pLast.getData().interrupt();
                            this.pLast = pAux;
                            this.size--;
                            return true;
                        }
                        pAux = pAux.getpNext();
                    }
                }
            }
            drive.getConsumerMutex().release();
            drive.getProducerMutex().release();
        } catch (InterruptedException ex) {
            Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Node getpFirst() {
        return pFirst;
    }

    public void setpFirst(Node pFirst) {
        this.pFirst = pFirst;
    }

    public Node getpLast() {
        return pLast;
    }

    public void setpLast(Node pLast) {
        this.pLast = pLast;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
