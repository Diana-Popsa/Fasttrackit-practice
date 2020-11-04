package ro.temaCurs5;

import java.util.Objects;

public class Assignment {
    private String uniqueID;
    private Integer courseNumber;
    private String assignmentTitle;
    private String assignmentDescription;
    private DifficultyLevel type;

    public void setCourseNumber(Integer courseNumber) {
        this.courseNumber = courseNumber;
    }

    public DifficultyLevel getType() {
        return type;
    }

    public void setType(DifficultyLevel type) {
        this.type = type;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getAssignmentTitle() {
        return assignmentTitle;
    }

    public void setAssignmentTitle(String assignmentTitle) {
        this.assignmentTitle = assignmentTitle;
    }

    public String getAssignmentDescription() {
        return assignmentDescription;
    }

    public void setAssignmentDescription(String assignmentDescription) {
        this.assignmentDescription = assignmentDescription;
    }


    @Override
    public int hashCode() {
        return Objects.hash(uniqueID);
    }

    @Override
    public String toString() {
        return "\nAssignment{" +
                "UniqueID=" + uniqueID +
                ", courseNumber=" + courseNumber +
                ", assignmentTitle='" + assignmentTitle + '\'' +
                ", assignmentDescription='" + assignmentDescription + '\'' +
                ", difficultyLevel='" + type + '\'' +
                '}';
    }



}
