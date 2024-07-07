package com.jerryicon.design.iteratorPattern;

public class NameRepository implements Container{

    private String[] names = {"A","B","C","D"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();

    }

    private class NameIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return names[index++];
        }
    }
}
