/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author Admin
 * @param <T>
 */
public class BST< T extends Comparable> {

    protected Node<T> root = null;

    public BST() {

    }

    public void clear() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(T el) {
        if (root == null) {
            root = new Node<T>(el, null, null);
            return;
        }
        Node<T> p = root, prev = null;
        while (p != null) {
            prev = p;
            if (p.el.compareTo(el) < 0) {
                p = p.right;

            } else {
                p = p.left;
            }
        }
        if (prev.el.compareTo(el) < 0) {
            prev.right = new Node<T>(el, null, null);
        } else {
            prev.left = new Node<T>(el, null, null);
        }
    }

    public T search(T el) {
        Node<T> p = root;
        while (p != null) {
            if (el.compareTo(p.el) == 0) {
                return p.el;
            } else if (el.compareTo(p.el) < 0) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        return null;
    }

    public void deleteByMerging(T el) {
        Node<T> p = root, prev = null;
        while (p != null && p.el.compareTo(el) != 0) {
            prev = p;
            if (p.el.compareTo(el) < 0) {
                p = p.right;
            } else {
                p = p.left;
            }
        }
        Node<T> node = p;
        Node<T> tmp;
        if(p!=null &&p.el.compareTo(el)==0){
            if(node.right==null){
                node=node.left;
            }else if(node.left==null){
                node=node.right;
            }else{
                tmp=node.left;
                while(tmp.right!=null){
                    tmp=tmp.right;
                }
                tmp.right=node.right;
                node=node.left;
            }
            if(p==root){
                root=node;
            }else if(prev.left==p){
                prev.left=node;
            }else{
                prev.right=node;
            }
        }else if(root!=null){
            System.out.println("Element "+el+" is not int the tree");
        }else{
            System.out.println("The tree is empty");
        }
    }
    public void visit(Node<T> p){
        System.out.println(p.el);
    }
    protected void inorder(Node<T> p){
        if(p!=null){
            inorder(p.left);
            visit(p);
            inorder(p.right);
        }
    }
    public void inorder(){
        inorder(root);
    }
}
