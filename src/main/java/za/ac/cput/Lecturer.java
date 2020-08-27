package za.ac.cput;

//Inheritance
public class Lecturer extends Faculty {

    public String LecturerName ;
    public String LecturerSurname;


    public Lecturer(String facultyName,String facultyColor,String lecturerName,String lecturerSurname) {
        super(facultyName,facultyColor);
        LecturerName = lecturerName;
        LecturerSurname = lecturerSurname;
    }

    public String getLecturerName() {
        return LecturerName;
    }

    public void setLecturerName(String lecturerName) {
        LecturerName = lecturerName;
    }

    public String getLecturerSurname() {
        return LecturerSurname;
    }

    public void setLecturerSurname(String lecturerSurname) {
        LecturerSurname = lecturerSurname;
    }

    public void lecturerFunction() {
        System.out.println("A Lecturer, from Any Department may teach  many Students ");
    }




}
