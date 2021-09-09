package src.main.java.gof.filter;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CriteriaMale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(person -> Objects.equals(person.getGender(), "male")).collect(Collectors.toList());
    }
}
