package ro.fasttrackit.temaCurs5siCurs6;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {

        Assignment language = new Assignment();
        language.setAssignmentTitle("English");

        Assignment sport = new Assignment();
        sport.setAssignmentTitle("Sport");

        Assignment math = new Assignment();
        math.setAssignmentTitle("Math");

        Assignment relax = new Assignment();
        relax.setAssignmentTitle("Relax");

      //  String courseNumberAndDifficulty =

        Map<String, Assignment> assignmentMap = new HashMap<String, Assignment>();
        assignmentMap.put("1" + "easy", language);
        assignmentMap.put("5" + "advanced", math);
        assignmentMap.put("3" + "medium", sport);
        assignmentMap.put("8" + "easy", relax);

      //  System.out.println("\nMAP" + assignmentMap);
        System.out.println("\n HashMap + concatenated " + assignmentMap.get("5" + "advanced"));


    }
}
