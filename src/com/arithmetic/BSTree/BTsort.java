package com.arithmetic.BSTree;

/**
 * @author cx
 * @Time 2020/3/11 16:35
 * @Description 二叉排序树
 */
public class BTsort {
//    private Node root = null;

//    /**查找二叉树中是否有key值*/
//    public boolean searchKey(int key)
//    {
//        Node current = root;
//        while (current != null)
//        {
//            if (key == current.getValue()) return true;
//            else if (key < current.getValue()) current = current.getLeft();
//            else current = current.getRight();
//        }
//        return false;
//    }
//
//    public void insert(int key)
//    {
//        Node p = root;
//        /**记录查找节点的前一个节点*/
//        Node prev = null;
//        while (p != null)
//        {
//            prev = p;
//            if (key < p.getValue()) p = p.getLeft();
//            else if(key > p.getValue()) p = p.getRight();
//            else return;
//        }
//        if (root == null) root = new Node(key);
//        else if (key < prev.getValue()) prev.setLeft(new Node(key));
//        else prev.setRight(new Node(key));
//    }
//    public void delete(int key)
//    {
//        delete(root,key);
//    }
//    private boolean delete(Node node,int key)
//    {
//        if (Node == null) return false;
//        else
//        {
//            if (key == node.getValue()) return delete(Node);
//            else if (key < node.getValue()) return delete(node.getLeft(),key);
//            else return delete(node.getRight(),key);
//        }
//    }

    /**
     * @description 将指定的元素插入二插排序树中
     *
     * @param root,key
     * @return null
     */
    public static void BinarySort(Node root,int key)
    {
        /**得到根节点中的元素*/
        int value = root.getValue();
            if (key < value)
            {
                if (root.getLeft() == null)
                {
                    Node node = new Node(key);
                    root.setLeft(node);
                }
                else
                {
                    BinarySort(root.getLeft(),key);
                }
            }
            else if (key > value)
            {
                if (root.getRight() == null)
                {
                    Node node = new Node(key);
                    root.setRight(node);
                }else
                {
                    BinarySort(root.getRight(), key);
                }
            }
    }

    /**
     * @description 遍历二叉树找到查找的值
     *
     * @param root
     * @param key
     * @return true or false
     */
    public static boolean BinarySearch(Node root,int key)
    {
        if (root == null) return false;
        else if (root.getValue() == key) return true;
        else if (root.getValue() > key) return BinarySearch(root.getLeft(),key);
        else  return BinarySearch(root.getRight(),key);
    }

    /**
     * @description 中序遍历二叉树
     *
     * @param
     * @return
     */
    public static void inOrder(Node root)
    {
        if (root != null)
        {
            inOrder(root.getLeft());
            System.out.print(root.getValue()+" ");
            inOrder(root.getRight());
        }
    }

    public static void main(String[] args) {
        int[] array = {19,12,3,22,6,7,21,11,43};
        Node root = new Node(array[0]);
        for (int i = 1; i < array.length; i++)
        {
            BinarySort(root,array[i]);
        }
        if (BinarySearch(root,12))
        {
            System.out.println("二叉树中存在此元素！");
        }else
        {
            System.out.println("二叉树中不存在此元素！");
        }
        inOrder(root);
    }

}
