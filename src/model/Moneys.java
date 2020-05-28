package model;

public class Moneys {
    float inputM;
    float rate;

    public Moneys() {
    }

    public Moneys(float inputM, float rate) {
        this.inputM = inputM;
        this.rate = rate;
    }

    public float getInputM() {
        return inputM;
    }

    public void setInputM(float inputM) {
        this.inputM = inputM;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
}
