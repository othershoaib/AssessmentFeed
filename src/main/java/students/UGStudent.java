package students;

import model.AIProject;
import model.ProgrammingTest;

public class UGStudent extends Student {
    public UGStudent(String cid) {
        super(cid);
        addAssessment(new ProgrammingTest(cid, 0.30));
        addAssessment(new AIProject(cid, 0.70));
    }

    @Override
    public String getType() { return "UG"; }
}