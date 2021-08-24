package ru.isys.trainings.homework7.task1;

import java.util.*;
import java.util.function.Consumer;

public class LinkList<T> {
    private ListItem<T> head = null;
    private int size = 0;


    private static class ListItem<T> {
        private T data;
        private ListItem<T> next;

        public ListItem(T data) {
            this.data = data;
            this.next = null;
        }

        public ListItem(T data, ListItem<T> next) {
            this(data);
            this.next = next;
        }
    }

    private class ListIterator implements Iterator<T> {

        private LinkList.ListItem<T> next;
        private int nextIndex;

        public ListIterator() {
            this.next = head;
            this.nextIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return nextIndex < size;
        }

        @Override
        public T next() {
            if (!hasNext())
                throw new NoSuchElementException();

            ListItem<T> lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.data;
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }

        @Override
        public void forEachRemaining(Consumer<? super T> action) {
            Iterator.super.forEachRemaining(action);
        }
    }

    public void add(T elem) {
        add(size, elem);
    }

    public void add(int index, T elem) {
        if (this.size != 0) {
            isRightIndex(index);
        }

        ListItem<T> current = head;
        int position = 0;
        ListItem<T> newItem = new ListItem<>(elem);

        if (index == 0) {
            newItem.next = head;
            head = newItem;
            this.size++;
            return;
        }

        while (current.next != null) {
            if (position == index - 1) {
                break;
            }
            position++;
            current = current.next;
        }

        newItem.next = current.next;
        current.next = newItem;

        this.size++;
    }

    public T get(int index) {
        isRightIndex(index);
        ListItem<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void set(int index, T elem) {
        isRightIndex(index);

        ListItem<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = elem;
    }

    private void isRightIndex(int index) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("Index is less then 0 or bigger then size is");
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index is less then 0 or bigger then size is");
        }

        if (index == 0) {
            head = head.next;
            this.size--;
        } else {
            ListItem<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            current.next = current.next.next;
        }
        this.size--;

    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void clear() {
        this.head = null;
        this.size = 0;
    }

    public void forEach(Consumer<T> consumer) {
        new ListIterator().forEachRemaining(consumer);
    }

}
