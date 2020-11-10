package ro.fasttrackit.temaCurs5siCurs6;

import java.util.Comparator;

public class CourseAndAssignmentTitle implements Comparator<Assignment> {

    @Override
    public int compare(Assignment a1, Assignment a2) {
        int comparison = 0;
        comparison = Integer.compare(a1.getCourseNumber(), (a2.getCourseNumber()));
        if (comparison == 0) {
            comparison = a1.getAssignmentTitle().compareTo(a2.getAssignmentTitle());
        }

        return comparison;
    }
}