package ua.edu.ucu.smartarr;

import java.util.*;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator{

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
    }

    @Override
    public Object[] toArray() {
        ArrayList<Object> objectList = new ArrayList<Object>(Arrays.asList(smartArray.toArray()));

        System.out.println(objectList);

        LinkedHashSet<Object> hashSet = new LinkedHashSet<>(objectList);

        ArrayList<Object> listWithoutDuplicates = new ArrayList<Object>(hashSet);

        return listWithoutDuplicates.toArray();
    }

    @Override
    public String operationDescription() {
        return "deletes all equal elements";
    }

    @Override
    public int size() {
        return smartArray.size();
    }
}
