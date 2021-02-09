package epam.task.third.repository;

import epam.task.third.specifications.sorting.ConeRadiusSortingSpecification;
import epam.task.third.specifications.sorting.ConeSortingSpecification;

public class ConeRadiusSpecificationTest extends ConeSortingSpecificationTest{
    @Override
    public ConeSortingSpecification createSpecification() {
        return new ConeRadiusSortingSpecification(2.0);
    }
}
