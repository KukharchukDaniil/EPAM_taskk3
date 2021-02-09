package epam.task.third.specifications.sorting;

import epam.task.third.entities.Cone;

public class ConeIdSortingSpecification implements ConeSortingSpecification {
    private final Integer ID;

    public ConeIdSortingSpecification(Integer id) {
        ID = id;
    }

    @Override
    public boolean isSpecified(Cone cone) {
        return ID.equals(cone.getID());
    }
}
