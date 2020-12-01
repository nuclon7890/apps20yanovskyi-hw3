package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator implements MyFunction  {
    private MyFunction func;

    public MapDecorator(SmartArray smartArray, MyFunction func) {

        super(smartArray);
        this.func = func;

    }

    @Override
    public Object apply(Object t) {
        return null;
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