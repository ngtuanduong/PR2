package tut10.xfile;

import java.util.ArrayList;
import java.util.List;

public class XFileDemo {
    public static void main(String[] args) {
        byte[] data = XFile.read("mickey.gif");
        XFile.write("output",data);

        List<Student> list = new ArrayList<>();
        list.add(new Student("duong",7,"cntt"));
        list.add(new Student("tuan",9,"fmt"));
        list.add(new Student("dinh",8,"tqw"));

        XFile.writeObject("output",list);




    }
}
