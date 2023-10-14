package ru.netology.domain;

public class PosterManager {
    private PosterProperties[] posters = new PosterProperties[0];
    private int limitPosters = 5;

    public PosterManager() {
    }

    public PosterManager(int limitPosters) {
        this.limitPosters = limitPosters;
    }

    public void savePoster(PosterProperties poster) {
        PosterProperties[] tmp = new PosterProperties[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public PosterProperties[] findLast() {
        int resultLeight;
        if (posters.length < limitPosters) {
            resultLeight = posters.length;
        } else {
            resultLeight = limitPosters;
        }
        PosterProperties[] result = new PosterProperties[resultLeight];
        for (int i = 0; i < resultLeight; i++) {
            result[i] = posters[posters.length - 1 - i];
        }
        return result;
    }

    public PosterProperties[] findAll() {
        return posters;
    }
}