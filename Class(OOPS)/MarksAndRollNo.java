class RollNo{
    int rollno;
    RollNo(){
        rollno=0;
    }
    RollNo(int r){
        rollno = r ;
    }
    RollNo(RollNo r){
        rollno = r.rollno;
    }
    void show(){
        System.out.println("Roll no is = "+rollno);
    }
}

class Exam extends RollNo{
    double marks;
    Exam(){
        marks = 0.0;
    }
    Exam(int r,double m){
        super(r);
        marks = m;
    }
    Exam(Exam m){
        super(m);
        marks = m.marks;
    }
    void show(){
        super.show();
        System.out.println("Marks = "+marks);
    }
}
class Student extends Exam{
    String name;
    Student(){
        name = "Unknown";
    }
    Student(int r , double m , String s){
        super(r,m);
        name = s;
    }
    Student(Student s){
        super(s);
        name = s.name;
    }
    void show(){
        super.show();
        System.out.println("Name = "+name);
    }
}

public class MarksAndRollNo {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student(41,81,"Prerit");
        Student s3 = new Student(s2);

        s1.show();
        s2.show();
        s3.show();
    }
}
