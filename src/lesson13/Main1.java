package lesson13;

import java.util.HashMap;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {

        Student student = new Student("Damir", 22);
        Student student2 = new Student("Vasua", 23);
        Student student3 = new Student("Dima", 24);
        Student student4 = new Student("Kolya", 25);

        Map<Student, Integer> mapStudent = new HashMap<>();
        mapStudent.put(student, 5);
        mapStudent.put(student2, 4);
        mapStudent.put(student3, 2);
        mapStudent.put(student4, 4);
        mapStudent.putIfAbsent(student,4);
        System.out.println(mapStudent.containsKey(student));
        student.setAge(23);
        System.out.println(mapStudent.containsKey(student));
//
//        for (Map.Entry<Student, Integer> m : mapStudent.entrySet()) {
//            System.out.println("key= " + m.getKey() + " value= " + m.getValue());
//        }
//        System.out.println(mapStudent.get(student));

    }
}
