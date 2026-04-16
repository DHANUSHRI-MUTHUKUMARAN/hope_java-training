import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int id;
    String name;
    int mark;

    public Student(String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', mark=" + mark + "}";
    }
}
public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();

        student.add(new Student("Alice", 20));
        student.add(new Student("Bob", 22));
        student.add(new Student("Charlie", 19));     
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.mark, s2.mark);
            }
        };       
        Collections.sort((java.util.List<T>) student, (s1, s2) -> Integer.compare(s1.mark, s2.mark));
    }
}