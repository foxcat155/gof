package src.main.java.gof.filter;

import java.util.List;

public class AndCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;


    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> people = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(people);
    }
}
