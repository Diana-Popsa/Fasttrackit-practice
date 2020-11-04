package ro.temaCurs5;

import java.util.Comparator;



public class CourseAndDifficulty implements Comparator<Assignment> {


    @Override
    public int compare( Assignment a1,  Assignment a2) {
         int comparison ;
        comparison = Integer.compare(a1.getCourseNumber(), (a2.getCourseNumber()));
        if (comparison ==0){
            return a1.getType().compareTo(a2.getType());
        } else {
            return comparison;
        }

    }
}
