package comparators;

import java.util.Comparator;

public class StudentReverseComparator implements Comparator<StudentComparable> {
    @Override
    public int compare(StudentComparable o1, StudentComparable o2) {
        return o2.getAge() - o2.getAge();
    }
}
