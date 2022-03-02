package org.citygml.ade.opendrive.model.linearReferencing;

import java.util.ArrayList;
import java.util.Collection;

public class ReferenceableTypeList<T extends ReferenceableType> extends ArrayList<T> {

    public ReferenceableTypeList() {
    }

    public ReferenceableTypeList(Collection<? extends T> c) {
        this.addCollection(c);
    }

    public ReferenceableTypeList(int initialCapacity) {
        super(initialCapacity);
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
        if (super.size() == 0)
            return super.add(t);

        try {
            Double s_new = t.getLinearReferencing().getObject().getPositionExpression().getObject().
                    getDistanceExpression().getObject().getDistanceAlong().getValue();
            for (int i = 0; i < super.size(); ++i) {
                Double s_tmp = super.get(i).getLinearReferencing().getObject().getPositionExpression().getObject().
                        getDistanceExpression().getObject().getDistanceAlong().getValue();
                if (s_new < s_tmp) {
                    super.add(i, t);
                    return true;
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        return super.add(t);
    }
}
