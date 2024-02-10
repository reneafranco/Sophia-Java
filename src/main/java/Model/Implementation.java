package Model;

import java.util.ArrayList;

public class Implementation {

    public static void main(String[] args) {

        ArrayList<Employee> employeeArrayList = new ArrayList<>();

        employeeArrayList.add(new Employee("Raul", "Serrano", 14));
        employeeArrayList.add(new Employee("Steve", "Wild", 6));
        employeeArrayList.add(new Employee("Mariam", "Standford", 4));
        employeeArrayList.add(new Employee("Sam", "Luke", "Programmer", 20));

        System.out.println("Original Employee List:");
        System.out.println(employeeArrayList.toString());

        // Using Bubble Sort to sort employees by age
        employeeBubbleSort(employeeArrayList);

        System.out.println("Employee List After Bubble Sort:");
        System.out.println(employeeArrayList.toString());
    }

    /**
     * Uses the Bubble Sort algorithm to sort employees by age in ascending order.
     *
     * @param employeeArrayList The ArrayList of employees to be sorted.
     */
    private static void employeeBubbleSort(ArrayList<Employee> employeeArrayList) {
        int n = employeeArrayList.size();

        // Outer loop for iterating through the entire list
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparing and swapping employees based on age
            for (int j = 0; j < n - i - 1; j++) {
                // Compare employees by age
                if (employeeArrayList.get(j).getAge() > employeeArrayList.get(j + 1).getAge()) {
                    // Swap employees if needed
                    Employee temp = employeeArrayList.get(j);
                    employeeArrayList.set(j, employeeArrayList.get(j + 1));
                    employeeArrayList.set(j + 1, temp);
                }
            }
        }
    }

    /**
     * Uses the Selection Sort algorithm to sort employees by age in ascending order.
     *
     * @param employees The ArrayList of employees to be sorted.
     */
    private static void orderByAgeInTheCompany(ArrayList<Employee> employees) {
        int n = employees.size();

        // Outer loop for iterating through the entire list
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Inner loop for comparing employees and finding the minimum age
            for (int j = i + 1; j < n; j++) {
                if (employees.get(j).getAge() < employees.get(minIndex).getAge()) {
                    // Update the index of the minimum age
                    minIndex = j;
                }
            }

            // Swap employees with the minimum age
            Employee temp = employees.get(i);
            employees.set(i, employees.get(minIndex));
            employees.set(minIndex, temp);
        }
    }
}
