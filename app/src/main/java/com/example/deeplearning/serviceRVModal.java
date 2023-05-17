package com.example.deeplearning;

public class serviceRVModal {

    private String heading;
    private String text;

    public serviceRVModal(String h, String t) {
        this.heading = h;
        this.text = t;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String h) {
        this.heading = h;
    }

    public String getText() {
        return text;
    }

    public void setText(String t) {
        text = t;
    }
}