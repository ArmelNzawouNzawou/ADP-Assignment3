package za.ac.cput;

public class Faculty {

    //Encapsulation
    private String facultyName  ;
    private String facultyColor ;

    public Faculty(String facultyName,String facultyColor) {
        this.facultyName = facultyName;
        this.facultyColor = facultyColor;
    }

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


    public  void  termDates () {

        System.out.println("Academic Year: 2020");
        System.out.println("\t Term 1: 03 February - 20 March");
        System.out.println("\t Term 2: 06 April - 15 May ");
        System.out.println("\t Term 3: 13 July - 28 August");
        System.out.println("\t Term 4: 07 September - 11 December ");


    }





     }






