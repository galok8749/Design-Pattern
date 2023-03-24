package creational.prototype;

import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        // use clone method to get the Employee object
        Employees empNew = (Employees) emps.clone();
        Employees empNew1 = (Employees) emps.clone();

        List<String> list = empNew.getEmpList();
        list.add("John");
        List<String> list1 = empNew1.getEmpList();
        list1.add("Deepak");

        System.out.println("emps List: " + emps.getEmpList());
        System.out.println("empNew List: " + list);
        System.out.println("empsNew1 List: " + list1);
    }
}
