package Interface1;

public class Student implements Comparable<Student>{

    private int Maths;

    public Student(int Maths){
        this.Maths = Maths;
    }

    public int getPhysics() {
        return Maths;
    }

    public void setPhysics(int Maths) {
        this.Maths = Maths;
    }

    @Override
    public int compareTo(Student st) {
        if(this.Maths == st.Maths)
            return 0;
        else if(this.Maths>st.Maths){
            return 1;
        }
        else
            return -1;
    }


    }
