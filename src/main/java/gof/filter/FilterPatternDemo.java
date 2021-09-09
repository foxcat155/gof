package src.main.java.gof.filter;

import java.util.ArrayList;
import java.util.List;


/**
 * 过滤器模式
 * 过滤器模式（Filter Pattern）或标准模式（Criteria Pattern）是一种设计模式，这种模式允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算
 * 以解耦的方式把它们连接起来。这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准。
 *
 * 实现
 * 我们将创建一个 Person 对象、Criteria 接口和实现了该接口的实体类，来过滤 Person 对象的列表。CriteriaPatternDemo 类使用 Criteria 对象，
 * 基于各种标准和它们的结合来过滤 Person 对象的列表。
 */
public class FilterPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","male", "single"));
        persons.add(new Person("John","male", "married"));
        persons.add(new Person("Laura","female", "married"));
        persons.add(new Person("Diana","female", "single"));
        persons.add(new Person("Mike","male", "single"));
        persons.add(new Person("Bobby","male", "single"));

        CriteriaSingle single = new CriteriaSingle();
        CriteriaFemale female = new CriteriaFemale();
        CriteriaMale male = new CriteriaMale();
        AndCriteria andCriteria = new AndCriteria(single, male);
        OrCriteria orCriteria = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(andCriteria.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(orCriteria.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }

}
