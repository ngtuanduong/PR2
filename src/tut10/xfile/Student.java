package tut10.xfile;

import java.io.Serializable;

public class Student implements Serializable {
    String name;
    int mark;
    String faculty;

    public Student(String name, int mark, String faculty) {
        this.name = name;
        this.mark = mark;
        this.faculty = faculty;
    }

    public static boolean isValidName (String name){
        return name != null && name.length() <= 50 && name.matches("^[a-zA-Z]+$") ;
    }
    public static boolean isValidMark (int mark) {
        return mark >= 0 && mark <= 10;
    }
    public static boolean isValidFaculty (String faculty) {
        return faculty != null && faculty.length() <= 50 && faculty.matches("^[a-zA-Z]+$") ;
    }
}
