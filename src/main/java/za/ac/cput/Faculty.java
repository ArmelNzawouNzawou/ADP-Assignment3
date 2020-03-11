package za.ac.cput;

public class Faculty {

    //Encapsulation
    private String facultyName = "Informatics and Design";
    private String facultyColor ="Red";



    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyColor() {
        return facultyColor;
    }

    public void setFacultyColor(String facultyColor) {
        this.facultyColor = facultyColor;
    }



    public  static void academicYear () {

        String year = "Year: 2020";
        String Semester = "Semester: 1";

        System.out.println(year);
        System.out.println(Semester);

    }


    public void function() {
        System.out.println("A Faculty: includes many departments ");
    }


//    public static void main (String[]args ) {
//
////
////        Faculty fac = new Faculty();
////
////    fac.setFacultyName("Faculty Name: Informatics and Design");
////    System.out.println(fac.getFacultyName());
////
////    fac.setFacultyColor(" Faculty Color: Red");
////    System.out.println(fac.getFacultyColor());
//
//
//
//
//
//
//}

}
