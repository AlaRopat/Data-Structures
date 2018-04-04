package com.company.impl;

public class TreeNode<E> {

  private E data;
  private TreeNode<E> parent;
  private TreeNode<E> leftChild;
  private TreeNode<E> rightChild;

  public TreeNode(E data) {
    this.data = data;
  }

  public E getData() {
    return data;
  }

  public void setData(E data) {
    this.data = data;
  }

  public TreeNode<E> getParent() {
    return parent;
  }

  public void setParent(TreeNode<E> parent) {
    this.parent = parent;
  }

  public TreeNode<E> getLeftChild() {
    return leftChild;
  }

  public void setLeftChild(TreeNode<E> leftChild) {
    this.leftChild = leftChild;
  }

  public TreeNode<E> getRightChild() {
    return rightChild;
  }

  public void setRightChild(TreeNode<E> rightChild) {
    this.rightChild = rightChild;
  }
}
