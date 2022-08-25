package composite;

import java.util.ArrayList;
import java.util.List;


public class HeadDepartment implements Department {

    private Integer id;
    private String name;

    private List<Department> childDepartments;

    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<Department>();
    }

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName() + " contains : ");
        childDepartments.forEach(Department::printDepartmentName);
    }

    public void addDepartMent(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }
}
