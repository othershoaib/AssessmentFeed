package model;

import assessments.AssessmentFeed;

public class ProgrammingTest extends Assessment {

    private final double programMark;
    private final boolean explained;

    public ProgrammingTest(String cid, double weight) {
        super(AssessmentFeed.PROGRAMMING_TEST, false, weight);
        programMark = AssessmentFeed.getResult(cid, AssessmentFeed.PROGRAMMING_TEST, AssessmentFeed.PROGRAM_MARK);
        explained = AssessmentFeed.getResult(cid, AssessmentFeed.PROGRAMMING_TEST, AssessmentFeed.EXPLAINED_SUCCESSFULLY) == 1;
    }

    @Override//cap at 40
    public double getMark() {
        if (explained) {
            return programMark;
        } else if (programMark > 40){
            return 40;
        } else{
            return programMark;
        }

    }

    @Override
    public String getDetails() {
        return String.format("%s: %.2f%%, %s: %s", AssessmentFeed.PROGRAM_MARK, programMark, AssessmentFeed.EXPLAINED_SUCCESSFULLY, explained ? "Yes" : "No");
    }
}