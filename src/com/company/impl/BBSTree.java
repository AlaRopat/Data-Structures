package com.company.impl;

import com.company.abstr.BSTree;

public class BBSTree<E> implements BSTree<E> {

  private static int size;
  private Node <E> root;
  @Override
  public E max() {
    return null;
  }

  @Override
  public E min() {
    return null;
  }

  @Override
  public void add(E data) {

  }

  @Override
  public void remove(E data) {

  }

  @Override
  public int size() {
    return 0;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public boolean contains(E item) {
    return false;
  }

  @Override
  public void print() {

  }

  /**
   * Height is calculated via the following formula
   * height = max(leftSubTreeHeight,rightSubTreeHeight)+1
   *
   * @return -1 if the node is null. Otherwise, return the height
   */

  private int height(Node <E> currentNode) {
    return (currentNode == null) ? -1 : currentNode.getHeight();
  }

  private class Node<E> {

    private E data;
    private Node <E> parent;
    private Node <E> leftChild;
    private Node <E> rightChild;
    private int height;


    public Node(E data) {
      this.data = data;
    }

    public int getHeight() {
      return height;
    }

    public void setHeight(int height) {
      this.height = height;
    }

    public E getData() {
      return data;
    }

    public void setData(E data) {
      this.data = data;
    }

    public Node <E> getParent() {
      return parent;
    }

    public void setParent(Node <E> parent) {
      this.parent = parent;
    }

    public Node <E> getLeftChild() {
      return leftChild;
    }

    public void setLeftChild(Node <E> leftChild) {
      this.leftChild = leftChild;
    }

    public Node <E> getRightChild() {
      return rightChild;
    }

    public void setRightChild(Node <E> rightChild) {
      this.rightChild = rightChild;
    }
  }
}
