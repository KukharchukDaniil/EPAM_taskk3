package epam.task.third.observer;

import epam.task.third.entities.Cone;
import epam.task.third.entities.ConeParameters;
import epam.task.third.logic.ConeLogic;

public class ConeParametersObserver implements Observer{
    private ConeParameters parameters = new ConeParameters();
    private final ConeLogic coneLogic = new ConeLogic();
    private static ConeParametersObserver instance;
    private ConeParametersObserver() {}

    public static ConeParametersObserver getInstance() {
        if(instance == null){
            instance = new ConeParametersObserver();
        }
        return instance;
    }
    @Override
    public void update(Cone cone) {
        Double square = coneLogic.calculateSquare(cone);
        parameters.setConeSquare(square);
        Double volume = coneLogic.calculateVolume(cone);
        parameters.setConeVolume(volume);
    }
}
