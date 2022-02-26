package org.citygml.ade.opendrive.model.linearReferencing;

import java.util.ArrayList;

public class ReferenceableTypeList<T extends ReferenceableType> extends ArrayList<T> {
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
                if (s_new < s_tmp)
                    super.add(i, t);
                return true;
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        return super.add(t);
    }
}
