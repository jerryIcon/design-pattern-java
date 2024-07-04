package com.jerryicon.design.filterPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author JerryIcon
 * @date 2024/7/4 下午4:51
 */
public class CriteriaFemale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        ArrayList<Person> people = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                people.add(person);
            }
        }
        return people;
    }
}
