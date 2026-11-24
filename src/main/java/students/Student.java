package students;

import assessments.AssessmentFeed;
import model.Assessment;

import java.util.ArrayList;
import java.util.List;

public abstract class Student {
    private final String cid;
    private final String name;
    private final List<Assessment> assessments = new ArrayList<>();

    public Student(String cid) {
        this.cid = cid;
        this.name = AssessmentFeed.getStudentName(cid);
    }

    public abstract String getType();

    protected void addAssessment(Assessment assessment) {
        assessments.add(assessment);
    }

    public String getCid() { return cid; }
    public String getName() { return name; }

    public List<Assessment> getAssessments() {
        return assessments;
    }

    public Assessment getAssessment(String title) {
        for (Assessment a : assessments) {
            if (a.getTitle().equals(title)) return a;
        }
        return null;
    }

    public double getModuleMark() {
        double total = 0;
        for (Assessment a : assessments) {
            total += a.getWeight() * a.getMark();
        }
        return total;
    }

    public double getAiAverage() {
        return 0;
    }

    public double getNonAiAverage() {
        return 0;
    }


}