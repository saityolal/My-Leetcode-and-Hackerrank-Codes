import java.util.*;

public class Sort {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int loop = scan.nextInt();
        Student[] students = new Student[loop];
        int i = 0;
        while (loop-- > 0) {
            students[i] = new Student(scan.nextInt(), scan.next(), scan.nextDouble());
            i++;
        }
        Arrays.sort(students, new Checker());
        for (Student student : students) {
            System.out.println(student.id + " " + student.name + " " + student.cgpa);
        }
        scan.close();
    }
}

class Checker implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s2.cgpa > s1.cgpa) {
            return 1;
        } else if (s2.cgpa < s1.cgpa) {
            return -1;
        } else {
            if (s2.name.compareTo(s1.name) > 0) {
                return 1;
            } else if (s2.name.compareTo(s1.name) < 0) {
                return -1;
            } else {
                if (s2.id > s1.id) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }

    }
}

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

}