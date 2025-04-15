package org.example;

public class SinglyLinkedList<E> {
    private Node<E> head;
    private int size;

    public SinglyLinkedList() {
    }

    public void add(E value) {
        Node<E> node = new Node<>(value);

        if (size == 0) {
            head = node;
        } else {
            Node<E> current = head;
            while (current.next != null) {
        // for (int i = 1; i < size; i++) {
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }

    public void add(int idx, E value) {
        if (idx < 0 || idx > size) {
            throw new IndexOutOfBoundsException(idx);
        }

        Node<E> node = new Node<>(value);
        if (idx == 0) {
            if (size != 0) {
                node.next = head;
            }
            head = node;
        } else {
            Node<E> current = head;

            for (int i = 1; i < idx; i++) {
                current = current.next;
            }

            if (idx == size) {
                current.next = node;
            } else {
                current.next = node;
                node.next = current.next;
            }
        }

        size++;
    }

    public E remove(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException(idx);
        }

        E oldValue;
        if (idx == 0) {
            oldValue = head.value;
            head = head.next;
        } else {
            Node<E> current = head;

            for (int i = 1; i < idx; i++) {
                current = current.next;
            }
            oldValue = current.next.value;
            current.next = current.next.next;
        }
        size--;

    }

    public E get(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException(idx);
        }

        Node<E> current = head;

        for (int i = 0; i < idx; i++) {
            current = current.next;
        }

        return current.value;
    }

    public E set(int idx, E value) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException(idx);
        }

        Node<E> current = head;

        for (int i = 0; i < idx; i++) {
                current = current.next;
        }
         E oldValue = current.value;
        current.value = value;
        return oldValue;

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public static class Node<E> {
        private E value;
        private Node<E> next;

        public Node(E value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }
}
