import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListObjectSortExmple {
 public static void mai(String[] args) {
     List<Person> people = new ArrayList<>();
     people.add(new Person("Sachin", 47));
     people.add(new Person("Chris", 34));
     people.add(new Person("Rajeev", 25));
     people.add(new Person("David", 31));

     System.out.println("Preson List : " + people);

     people.sort((Person1, Person2) -> {
         return Person1.getAge() - Person2.getAge();
     });
     people.sort(Comparator.comparing(Person::getAge));

     System.out.println("Sorted Person List by Age : " + people);
     Collections.sort(people, Comparator.comparing(Person::getName));
     System.out.println("Sorted Person List by Nmae : " + people);
 }
}
