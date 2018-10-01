package week3.ClassWork;

public class EmployeeTest {
    public static void main(String[] args){
        Employee emp1 = new Employee();
        emp1.name = "Ivan";
        emp1.salary = 500;

        Employee emp2 = new Employee();
        emp2.name = "Vasia";
        emp2.salary = 1000;

        Employee emp3 = new Employee();
        emp3.name = "Petro";
        emp3.salary = 1500;

        Employee[] empArray = new Employee[3];

        empArray[0] = emp1;
        empArray[1] = emp2;
        empArray[2] = emp3;

        int sum = 0;

        for(int i = 0; i < empArray.length; i++ ){
            sum += empArray[i].salary;
        }
        System.out.println(sum);


    }

}
