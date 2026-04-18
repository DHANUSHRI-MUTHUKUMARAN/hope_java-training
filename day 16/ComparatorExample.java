import java.util.*;

class Student {
    String name;
    int mark;

    public Student(String name, int mark) {
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

        // Sorting by marks (ascending)
        student.sort(Comparator.comparingInt(s -> s.mark));

        System.out.println(student);
    }
}