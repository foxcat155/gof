package src.main.java.gof.filter;

import java.util.List;

public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);
}
