package za.ac.cput;

//Inheritance
public class Department extends Faculty {

    public String deptName ;
    public String deptHead ;

    public Department(String facultyName,String facultyColor,String deptName,String deptHead) {
        super(facultyName,facultyColor);
        this.deptName = deptName;
        this.deptHead = deptHead;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptHead() {
        return deptHead;
    }

    public void setDeptHead(String deptHead) {
        this.deptHead = deptHead;
    }


    public void departmentFunction() {
        System.out.println("A department may pertain to specific Faculty ");
    }

}





