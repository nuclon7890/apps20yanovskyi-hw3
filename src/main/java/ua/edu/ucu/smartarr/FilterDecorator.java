package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.ArrayList;
import java.util.Arrays;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator implements MyPredicate {
    private MyPredicate pr;

    public FilterDecorator(SmartArray smartArray, MyPredicate pr) {

        super(smartArray);
        this.pr = pr;
    }

    @Override
    public boolean test(Object t) {
        return ((Integer) t) > 0;
    }

    @Override
    public Object[] toArray() {
        ArrayList<Object> objectList = new ArrayList<Object>(Arrays.asList(smartArray.toArray()));
        ArrayList<Object> newArray = new ArrayList<>();
        for (Object obj : objectList) {
            if (pr.test(obj)) {
                newArray.add(obj);
            }
        }
        return newArray.toArray();

    }

    @Override
    public String operationDescription() {
        return "deletes all elements which does not satisfy test";
    }

    @Override
    public int size() {
        return smartArray.size();
    }
}
