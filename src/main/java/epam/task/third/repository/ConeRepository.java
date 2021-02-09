package epam.task.third.repository;

import epam.task.third.entities.Cone;
import epam.task.third.entities.Point;
import epam.task.third.generator.IdGenerator;
import epam.task.third.specifications.edit.ConeEditSpecification;

import java.util.HashMap;
import java.util.Map;

public class ConeRepository {

    private Map<Integer, Cone> coneMap = new HashMap<>();
    private IdGenerator generator = IdGenerator.getGenerator();

    public ConeRepository(Map<Integer, Cone> coneMap) {
        this.coneMap = coneMap;
        this.generator = IdGenerator.getGenerator();
    }

    public void addCone(Cone cone) {
        Integer id = generator.getId();
        Point baseCentre = cone.getBaseCentre();
        Point apexPoint = cone.getApexPoint();
        Double radius = cone.getRadius();
        Cone identifiedCone = new Cone(baseCentre,apexPoint,radius,id);
        coneMap.put(id,identifiedCone);
    }

    public void removeCone(Integer id){
        coneMap.remove(id);
    }

    public void update(Cone cone, ConeEditSpecification editSpecification) {
        for (Cone mapCone : coneMap.values()) {
            if(mapCone.equals(cone)){
                editSpecification.edit(mapCone);
            }
        }
    }

}
