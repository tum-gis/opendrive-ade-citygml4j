package org.citygml.ade.opendrive.model.lane;

import org.citygml.ade.opendrive.model.road.OpenDRIVELaneSection;
import org.citygml.ade.opendrive.model.road.OpenDRIVERoad;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.function.Function;

public class OpenDRIVELaneList<T extends OpenDRIVELaneProperty> extends ArrayList<T> {

//    @FunctionalInterface
//    public interface ComparingFunction<T> {
//        public Boolean bGreaterA(T a, T b);
//    }

    private Comparator<T> comparator;

    public OpenDRIVELaneList(Comparator<T> comparator){
        this.comparator = comparator;
    }

    public OpenDRIVELaneList(Collection<? extends T> c, Comparator<T> comparator) {
//        super(c);
        this.comparator = comparator;
        this.addCollection(c);
    }

    public OpenDRIVELaneList(int initialCapacity, Comparator<T> comparator) {
        super(initialCapacity);
        this.comparator = comparator;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
//        return super.addAll(c);
        return this.addCollection(c);
    }

    private boolean addCollection(Collection<? extends T> c) {
        try {
            for (T item : c) {
                this.add(item);
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    @Override
    public boolean add(T t) {
        return this.add(t, this.comparator);
    }

    private boolean add(T t, Comparator<T> comparator) {
        if (super.size() == 0)
            return super.add(t);

        try {
            for (int i = 0; i < super.size(); i++) {
//                if (t.getLaneID() < super.get(i).getLaneID())
                if (comparator.compare(t, super.get(i)) >= 0) {
                    super.add(i, t);
                    return true;
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            return super.add(t);
        }

        return super.add(t);
    }
}
