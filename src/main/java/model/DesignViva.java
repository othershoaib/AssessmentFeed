package model;

import assessments.AssessmentFeed;

public class DesignViva extends Assessment {
    private double design;
    private double explanation;

    public DesignViva(String cid, double weight) {
        super(AssessmentFeed.DESIGN_VIVA, false, weight);
        design = AssessmentFeed.getResult(cid, AssessmentFeed.DESIGN_VIVA, AssessmentFeed.DESIGN_MARK);
        explanation = AssessmentFeed.getResult(cid, AssessmentFeed.DESIGN_VIVA, AssessmentFeed.EXPLANATION_MARK);
    }

    @Override
    public double getMark() {
        return ((0.5 * design) + (0.5 * explanation));
    }

    @Override
    public String getDetails() {
        return String.format("%s: %.2f%%, %s: %.2f%%", AssessmentFeed.DESIGN_MARK, design, AssessmentFeed.EXPLANATION_MARK, explanation);
    }
}