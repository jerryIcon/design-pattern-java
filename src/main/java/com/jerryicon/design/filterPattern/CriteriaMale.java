package com.jerryicon.design.filterPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author JerryIcon
 * @date 2024/7/4 下午4:49
 */
public class CriteriaMale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        ArrayList<Person> people = new ArrayList<>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                people.add(person);
            }
        }
        return people;
    }
}
