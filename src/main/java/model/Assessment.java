package model;

public abstract class Assessment {
    private final String title;
    private final boolean aiPermitted;
    private final double weight;

    public Assessment(String title, boolean aiPermitted, double weight) {
        this.title = title;
        this.aiPermitted = aiPermitted;
        this.weight = weight;
    }

    public String getTitle() { return title; }
    public boolean isAiPermitted() { return aiPermitted; }
    public double getWeight() { return weight; }

    public abstract double getMark();
    public abstract String getDetails();
}