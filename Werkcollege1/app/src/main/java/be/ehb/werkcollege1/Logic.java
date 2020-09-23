package be.ehb.werkcollege1;

public class Logic {
    private int nextRandom;
    private int currentRandom;
    private int score;

    public Logic() {
        resetScore();
        setCurrentRandom(generateRandom());
        setNextRandom(generateRandom());
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void increaseScore() {
        score++;
    }

    public void resetScore() {
        setScore(0);
    }

    public int getNextRandom() {
        return nextRandom;
    }

    public void setNextRandom(int nextRandom) {
        this.nextRandom = nextRandom;
    }

    public int generateRandom() {
        return (int)(Math.random() * 12 + 1);
    }

    public int getCurrentRandom() {
        return currentRandom;
    }

    public void setCurrentRandom(int currentRandom) {
        this.currentRandom = currentRandom;
    }
}
