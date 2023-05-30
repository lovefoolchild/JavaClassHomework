package class26;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the
highest salary. Output should be in the below format
John Smith=$100000
 */
public class HW2 {
    public static void main(String[] args) {
        Map<String, Integer> employee = new TreeMap<>();
        employee.put("Uncle Lazer", 80000);
        employee.put("William Montgomery", 180000);
        employee.put("Hans Kim", 102000);
        employee.put("David Lucas", 90000);
        employee.put("Red Band", 99000);

        String maxSalaryEmployee = "";
        int maxSalary = 0;

        for (var employees : employee.entrySet()) {
            String name = employees.getKey();
            int salary = employees.getValue();

            if (salary > maxSalary){
                maxSalary = salary;
                maxSalaryEmployee = name;
            }
        }
        System.out.println(maxSalaryEmployee + "=$" + maxSalary);
    }
}
