package ro.temaCurs5;

import java.util.*;
import java.util.stream.Collectors;

public class Collectionn {


    public static void main(String[] args) {
        List<Assignment> assignments = new ArrayList<>();

        Assignment language = new Assignment();
        language.setAssignmentTitle("English");
        language.setCourseNumber(1);
        language.setUniqueID(UUID.randomUUID().toString());
        language.setType(DifficultyLevel.EASY);
        assignments.add(language);

        Assignment sport = new Assignment();
        sport.setAssignmentTitle("Sport");
        sport.setCourseNumber(5);
        sport.setUniqueID(UUID.randomUUID().toString());
        sport.setType(DifficultyLevel.MEDIUM);
        assignments.add(sport);

        Assignment math = new Assignment();
        math.setAssignmentTitle("Math");
        math.setCourseNumber(3);
        math.setUniqueID(UUID.randomUUID().toString());
        math.setType(DifficultyLevel.ADVANCED);
        assignments.add(math);

        Assignment relax = new Assignment();
        relax.setAssignmentTitle("Relax");
        relax.setCourseNumber(8);
        relax.setUniqueID(UUID.randomUUID().toString());
        relax.setType(DifficultyLevel.EASY);
        assignments.add(relax);


        System.out.println("Array List before sorting: " + assignments);

//        Comparator <Assignment> compareByCourse = Comparator
//                .comparing(Assignment::getCourseNumber)
//                .thenComparing(Assignment::getType);
//
//        Collections.sort(assignments, compareByCourse);
//
//        System.out.println("\nSorted after Course nr and Assignment title: " + assignments );


        Comparator<Assignment> com = new CourseAndAssignmentTitle();
        assignments.sort(com);
          //  Comparator.comparing((Assignment::getCourseNumber).thenComparing(Assignment::getType));
        System.out.println("\nSorted after Course nr and Assignment title: " + assignments);


        Comparator<Assignment> com2 = new CourseAndDifficulty();
        assignments.sort(com2);
        System.out.println("\n Sorted after Course nr and Difficulty level: " + assignments);


      Map<Integer, DifficultyLevel> assignmentMap = assignments.stream().collect(Collectors.toMap(Assignment::getCourseNumber, Assignment::getType));
        System.out.println("\nMap: " + assignmentMap);
        System.out.println(assignmentMap.get(5));








    }


}
