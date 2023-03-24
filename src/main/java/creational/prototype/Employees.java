package creational.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employees {
    private List<String> empList;

    public Employees() {
        empList = new ArrayList<>();
    }
    public Employees(List<String> list) {
        this.empList = list;
    }
    public void loadData() {
        // read all employee from database
        empList.add("Alok");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }
    public List<String> getEmpList() {
        return empList;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for(String s : this.getEmpList()) {
            temp.add(s);
        }
        return new Employees(temp);
    }
}
