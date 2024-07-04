package com.jerryicon.design.filterPattern;

import java.util.Collections;
import java.util.List;

/**
 * @author JerryIcon
 * @date 2024/7/4 下午5:12
 */
public class OrCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteria = criteria.meetCriteria(persons);
        List<Person> otherCriteria = criteria.meetCriteria(persons);
        for(Person person : otherCriteria){
            if(!firstCriteria.contains(person)){
                firstCriteria.add(person);
            }
        }
        return firstCriteria;
    }
}
