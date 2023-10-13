package ru.netology.domain;

public class PosterProperties {

    private int PosterID;
    private String PosterName;

    public int getPosterID() {
        return PosterID;
    }

    public void setPosterID(int posterID) {
        PosterID = posterID;
    }

    public String getPosterName() {
        return PosterName;
    }

    public void setPosterName(String posterName) {
        PosterName = posterName;
    }

    public PosterProperties(int posterID, String posterName) {
        PosterID = posterID;
        PosterName = posterName;
    }

    public PosterProperties() {

    }


}
