package epam.task.third.sort;

import epam.task.third.comparators.ConeComparator;
import epam.task.third.entities.Cone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ConeListSort {
    public List<Cone> sort(List<Cone> cones, ConeComparator comparator) {
        List<Cone> result = new ArrayList<>();
        result.addAll(cones);
        result.sort(comparator);
        return result;
    }
}
