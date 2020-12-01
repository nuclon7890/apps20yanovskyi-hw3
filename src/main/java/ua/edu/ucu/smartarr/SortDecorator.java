package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator implements MyComparator {


    public SortDecorator(SmartArray smartArray, MyComparator cmp) {
        super(smartArray);
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public String operationDescription() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}