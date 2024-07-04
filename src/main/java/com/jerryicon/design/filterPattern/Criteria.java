package com.jerryicon.design.filterPattern;

import java.util.List;

/**
 * @author JerryIcon
 * @date 2024/7/4 下午4:48
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);
}
