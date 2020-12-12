package ro.fasttrackit.temaCurs5siCurs6;

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
                ", difficultyLevel='" + type + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Assignment that = (Assignment) o;

        if (uniqueID != null ? !uniqueID.equals(that.uniqueID) : that.uniqueID != null) return false;
        if (courseNumber != null ? !courseNumber.equals(that.courseNumber) : that.courseNumber != null) return false;
        if (assignmentTitle != null ? !assignmentTitle.equals(that.assignmentTitle) : that.assignmentTitle != null)
            return false;
        if (assignmentDescription != null ? !assignmentDescription.equals(that.assignmentDescription) : that.assignmentDescription != null)
            return false;
        return type == that.type;
    }
}
