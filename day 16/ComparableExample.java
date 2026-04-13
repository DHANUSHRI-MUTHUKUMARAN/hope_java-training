import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Student implements Comparable<Student> {
    int id;
    String name;
    int mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.mark, other.mark);
    }
    public String toString() {
        return "Student{name='" + name + "', mark=" + mark + "}";
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();

        student.add(new Student("Alice", 20));
        student.add(new Student("Bob", 22));
        student.add(new Student("Charlie", 19));            
        Collections.sort(student);
    }
}
