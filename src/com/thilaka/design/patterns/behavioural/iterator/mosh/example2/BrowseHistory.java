package com.thilaka.design.patterns.behavioural.iterator.mosh.example2;

public class BrowseHistory {

    private String[] urls = new String[10];
    private int index;

    public void push(String url){
        urls[index++] = url;
    }

    public String pop(){
        return urls[--index];
    }

    public Iterator<String> createIterator(){
        return new ArrayIterator(this);
    }

    public class ArrayIterator implements Iterator<String> {

        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history){
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.index);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
