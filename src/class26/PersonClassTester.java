package class26;

import java.util.LinkedHashMap;
import java.util.Map;

public class PersonClassTester {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Person> personMap = new LinkedHashMap<>();
        Person person1 = new Person("Jimmy", "McGil", 47, 200000);
        Person person2 = new Person("Tony", "Hinchcliffe", 38, 250000);
        Person person3 = new Person("Joe", "Rogan", 45, 400000);
        Person person4 = new Person("Minnie", "Mouse", 65, 280000);

        personMap.put(1, person1);
        personMap.put(2, person2);
        personMap.put(3, person3);
        personMap.put(4, person4);

        for (Map.Entry<Integer, Person> entry : personMap.entrySet()){
            int personId = entry.getKey();
            Person person = entry.getValue();
            System.out.println("Person ID: "+personId);
            person.printUserDetails();
        }
    }
}
