package com.example.deeplearning;

public class Articles {

    private String heading;
    private String text;

    public Articles(String title, String description) {
        this.heading = title;
        this.text = description;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String title) {
        this.heading = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String description) {
        this.text = description;
    }
}
