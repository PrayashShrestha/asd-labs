package edu.mum.cs.cs525.labs.skeleton;

public class Organization {
    public static void main(String[] args) {
        Manager ceo = new Manager("Alice", 90000, 20000);
        Manager vp = new Manager("Arif", 90000, 20000);

        ceo.addHire(vp);
        ceo.addHire(new Employee("Charlie", 50000));
        ceo.addHire(new Employee("Dana", 55000));

        vp.addHire(new Employee("Madhusodan", 50000));
        vp.addHire(new Employee("Dana2", 55000));

        HireCounterConsumer counter = new HireCounterConsumer();
        ceo.accept(counter);
        System.out.println("Total Hires: " + counter.getCount());

        TotalSalaryConsumer salaryCounter = new TotalSalaryConsumer();
        ceo.accept(salaryCounter);
        System.out.println("Total Salaries: $" + salaryCounter.getTotalSalary());
    }
}
