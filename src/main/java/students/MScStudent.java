package students;

import model.AIProject;
import model.DesignViva;
import model.ProgrammingTest;

public class MScStudent extends Student {
    public MScStudent(String cid) {
        super(cid);
        addAssessment(new ProgrammingTest(cid, 0.25));
        addAssessment(new AIProject(cid, 0.45));
        addAssessment(new DesignViva(cid, 0.30));
    }

    @Override
    public String getType() { return "MSc"; }
}