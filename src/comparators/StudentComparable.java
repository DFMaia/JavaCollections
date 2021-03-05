package comparators;

public class StudentComparable implements Comparable<StudentComparable>{

    private final String name;
    private final Integer age;

    public StudentComparable(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString(){
        return name + " - " + age;
    }

    @Override
    public int compareTo(StudentComparable o) {
        return this.getAge() - o.getAge();
    }
}