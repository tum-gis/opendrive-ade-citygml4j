package org.citygml.ade.opendrive.model.lane;

import org.citygml.ade.opendrive.model.road.OpenDRIVELaneSection;
import org.citygml.ade.opendrive.model.road.OpenDRIVERoad;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function;

public class LaneList<T extends OpenDRIVELaneProperty> extends ArrayList<T> {

//    @FunctionalInterface
//    public interface ComparingFunction<T> {
//        public Boolean bGreaterA(T a, T b);
//    }

    private Comparator<T> comparator;

    public LaneList(Comparator<T> comparator){
        this.comparator = comparator;
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
