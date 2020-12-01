package ua.edu.ucu.smartarr;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;

// Base array for decorators
public class BaseArray implements SmartArray {
    @Getter
    @Setter
    public ArrayList<Object> arrayList;


    public BaseArray(Object[] values) {
        this.arrayList = new ArrayList(Arrays.asList(values));
    }

    @Override
    public Object[] toArray() {

        return arrayList.toArray();
    }

    @Override
    public String operationDescription() {
        final String s = "creating BaseArray";
        return s;
    }

    @Override
    public int size() {
        return arrayList.size();
    }
}

