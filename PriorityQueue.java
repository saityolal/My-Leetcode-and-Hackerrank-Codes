import java.util.*;

public class PriorityQueue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num_enterence = Integer.parseInt(scan.nextLine());
        //scan.nextLine();//consume rest of the line
        List<Student> students = new ArrayList<>();
    }
}

class Student{
    
    int id;
    String name;
    double cgpa;
    
    Student(int id, String name, double cgpa){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;        
    }
    
    public int getID(){
        return this.id;
    }
    
    public String getName(){
    return this.name;
    }
    public double getCGPA(){
        return this.cgpa;
    }
}


