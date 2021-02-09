package epam.task.third.specifications.sorting;

import epam.task.third.entities.Cone;

public class ConeIdSortingSpecification implements ConeSortingSpecification {
    private static final Integer DEFAULT_ID = 0;
    private Integer id;

    public ConeIdSortingSpecification() {
        this.id = DEFAULT_ID;
    }

    public ConeIdSortingSpecification(Integer id) {
        this.id = id;
    }

    @Override
    public boolean isSpecified(Cone cone) {
        return id.equals(cone.getId());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
