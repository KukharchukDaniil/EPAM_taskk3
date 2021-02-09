package epam.task.third.repository;

import epam.task.third.entities.Cone;
import epam.task.third.generator.IdGenerator;
import epam.task.third.specifications.edit.ConeEditSpecification;
import epam.task.third.specifications.sorting.ConeSortingSpecification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConeRepository {

    private Map<Integer, Cone> coneMap = new HashMap<>();
    private IdGenerator generator = IdGenerator.getInstance();

    public ConeRepository(){}
    public ConeRepository(Map<Integer, Cone> coneMap) {
        this.coneMap = coneMap;
        this.generator = IdGenerator.getInstance();
    }

    public void addCone(Cone cone) throws CloneNotSupportedException {
        Cone clonedCone = (Cone) cone.clone();
        coneMap.put(clonedCone.getId(), clonedCone);
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

    public List<Cone> query(ConeSortingSpecification specification) {
        List<Cone> cones = new ArrayList<>();
        for (Cone value : coneMap.values()) {
            if(specification.isSpecified(value)){
                cones.add(value);
            }
        }
        return cones;
    }

}
