package com.kodingku.fachrilzulfidar.articlelist;

public class Article {

    private String title, writer;

    public Article(String title, String writer) {
        this.title = title;
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
