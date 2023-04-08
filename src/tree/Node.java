/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author Admin
 */
public class Node<T extends Comparable> {

    protected T el;
    protected Node<T> left, right;

    public Node() {
        left = null;
        right = null;
    }

    public Node(T element, Node<T> left, Node<T> right) {
        el = element;
        this.left = left;
        this.right = right;
    }

}
