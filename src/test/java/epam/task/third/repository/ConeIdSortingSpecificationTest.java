package epam.task.third.repository;


import epam.task.third.specifications.sorting.ConeIdSortingSpecification;
import epam.task.third.specifications.sorting.ConeSortingSpecification;

public class ConeIdSortingSpecificationTest extends ConeSortingSpecificationTest {


    @Override
    public ConeSortingSpecification createSpecification() {
        return new ConeIdSortingSpecification(99);
    }
}
