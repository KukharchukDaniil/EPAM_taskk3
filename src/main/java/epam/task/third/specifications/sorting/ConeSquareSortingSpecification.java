package epam.task.third.specifications.sorting;

import epam.task.third.entities.Cone;
import epam.task.third.logic.ConeLogic;

public class ConeSquareSortingSpecification implements ConeSortingSpecification {
    private final Double lowerBorder;
    private final Double upperBorder;
    private ConeLogic coneLogic = new ConeLogic();
    public ConeSquareSortingSpecification(Double lowerBorder, Double upperBorder) {
        this.lowerBorder = lowerBorder;
        this.upperBorder = upperBorder;
        this.coneLogic = new ConeLogic();
    }

    @Override
    public boolean isSpecified(Cone cone) {
        Double square = coneLogic.calculateSquare(cone);
        return lowerBorder <= square && square >= upperBorder;
    }

}
