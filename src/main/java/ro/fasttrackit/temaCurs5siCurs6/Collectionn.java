package ro.fasttrackit.temaCurs5siCurs6;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collectionn {// should have used HashSet - it has unique elements

    // which are determined by the object's equals
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


        //TEMA CURS 6
        System.out.println("\n1.1 Streams sort after Unique IDs: ");
        List<String> streamIdList = assignments
                .stream()
                .map(singleAssignment -> singleAssignment.getUniqueID())
                .peek(System.out::println)
                .collect(Collectors.toList());


        System.out.println("\n1.2 Streams sort after Difficulty Level");
        assignments
                .stream()
                .filter(singleType -> singleType.getType().equals(DifficultyLevel.EASY) || singleType.getType().equals(DifficultyLevel.MEDIUM))
                .peek(System.out::println)
                .collect(Collectors.toList());
        //not working   .forEach(singleType -> System.out.println("\n1.2 Streams sort after Difficulty Level "+ assignments));


        System.out.println("\n 1.4 Return HashMap having unique IDs as Keys and Assignments as values.:");
        Map<String, Assignment> streamHashMap2 = assignments
                .stream()
                .collect(Collectors.toMap(Assignment::getUniqueID, Function.identity()));
        for (var i : streamHashMap2.entrySet()) {
            System.out.println(String.format(" Key is: %s. %n Value is: %s", i.getKey(), i.getValue()));
        }
    }


}
