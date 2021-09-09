package src.main.java.gof.filter;

import java.util.List;

public class OrCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> first = criteria.meetCriteria(persons);
        List<Person> other = otherCriteria.meetCriteria(persons);

        first.forEach(person -> {
            if (!other.contains(person)){
                other.add(person);
            }
        });

        return other;
    }
}
