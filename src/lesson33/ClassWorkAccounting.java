package lesson33;


public class ClassWorkAccounting {
    public static void main(String[] args) {
        Company company = new Company(5);


        Employee emp1 = new WageEmployee(165, "George", "Flin", 160, 15.25);
        Employee emp2 = new WageEmployee(254, "Bill", "Johns", 145, 13.50);
        Employee emp3 = new WageEmployee(435, "Clark", "Norton", 173, 15);
        Employee emp4 = new SalesManager(342, "Mary", "Shields", 165, 150000, 0.02);
        Employee emp5 = new SalesManager(255, "James", "Harrison", 117, 180000, 0.02);


        company.addEmployee(emp1);
        company.addEmployee(emp2);
        company.addEmployee(emp3);
        company.addEmployee(emp4);
        company.addEmployee(emp5);

        company.removeEmployee(emp1);


        company.display();

        System.out.println(company.sumSalary());


    }
}
