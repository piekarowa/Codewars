//package com.example.codewars.exam;
//
//import java.util.Collection;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class StreamMethods {
//    /*
//    Get the employee with given ID
//     */
//    public static Optional<Employee> getEmployeeById(Collection<Employee> employees, Integer id){
//        Optional<Employee> employeeById = employees.stream()
//                .filter(employee -> employee.getId().equals(id))
//                .findFirst();
//        return employeeById;
//    }
//
//    /*
//    Return the total amount of money required to pay all given employees
//     */
//    public static Integer getTotalSalaryBudget(Collection<Employee> employees){
//        int totalSalaryBudget = employees.stream()
//                .mapToInt(Employee::getSalary)
//                .sum();
//        return totalSalaryBudget;
//
//    }
//
//    /*
//    Get the best earning employee
//     */
//    public static Optional<Employee> getBestEarningEmployee(Collection<Employee> employees){
//        Employee bestEarningEmployee = employees.stream()
//                .max((emp1, emp2) -> emp1.getSalary().compareTo(emp2.getSalary()))
//                .get();
//        return Optional.of(bestEarningEmployee);
//    }
//
//    /*
//    Get names of all employees of given role
//     */
//    public static Stream<String> getNamesOfEmployeesOfRole(Collection<Employee> employees, EmployeeRole role){
//        List<Employee> amesOfEmpOfRole = employees.stream()
//                .filter(employee -> employee.getRole().equals(role))
//
//
//        return (Stream<String>) amesOfEmpOfRole;
//
//
//
//    }
//
//    /*
//    Get the average value of salaries of all employees of given role
//     */
//    public static Double getAverageSalaryOfRole(Collection<Employee> employees, EmployeeRole role){
//        double asDouble = employees.stream()
//                .filter(employee -> employee.getRole().equals(role))
//                .mapToInt(employee -> employee.getSalary())
//                .average()
//                .getAsDouble();
//        return asDouble;
//    }
//
//    /*
//    Get the role that has the least employees
//     */
//    public static Optional<EmployeeRole> getRoleWithLeastEmployees(Collection<Employee> employees){
//
//        employees.stream()
//                .map(Employee::getRole)
//                .count()
//
//    }
//
//    /*
//    Get the division with the greatest pay gap between its manager and employees
//    Pay Gap formula: Manager_Salary - Average_Employees_Salary
//     */
//    public static Optional<Division> getDivisionWithGreatestManagerEmployeePayGap(Collection<Division> divisions){
//
//    }
//
//    /*
//    Get the best earning employee of given role out of all divisions
//     */
//    public static Optional<Employee> getBestEarningEmployeeOfRole(Collection<Division> divisions, EmployeeRole role){
//        Optional<Employee> first = divisions.stream()
//                .flatMap(division -> division.getEmployees().stream())
//                .sorted(Comparator.comparing(Employee::getSalary).reversed())
//                .findFirst();
//        return first;
//
//    }
//}