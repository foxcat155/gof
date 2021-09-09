package src.main.java.gof.filter;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(person -> Objects.equals(person.getMaritalStatus(), "single")).collect(Collectors.toList());
    }
}
