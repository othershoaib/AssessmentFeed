package model;

import assessments.AssessmentFeed;

public class AIProject extends Assessment {
    private double functionality;
    private double verification;

    public AIProject(String cid, double weight) {
        super(AssessmentFeed.AI_PROJECT, true, weight);
        functionality = AssessmentFeed.getResult(cid, AssessmentFeed.AI_PROJECT, AssessmentFeed.FUNCTIONALITY_MARK);
        verification = AssessmentFeed.getResult(cid, AssessmentFeed.AI_PROJECT, AssessmentFeed.VERIFICATION_MARK);
    }

    @Override
    public double getMark() {
        return ( (0.4 * functionality) +(0.6 * verification) );
    }

    @Override
    public String getDetails() {
        return String.format("%s: %.2f%%, %s: %.2f%%", AssessmentFeed.FUNCTIONALITY_MARK, functionality, AssessmentFeed.VERIFICATION_MARK, verification);
    }
}