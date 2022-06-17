package com.arshdeep.demo.Entities;

import javax.persistence.*;

@Entity
@Table(name = "Severities")
public class Severity {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String  publishedDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String severity;


    public Severity() {
    }


    public Severity(String publishedDate, String severity) {
        this.publishedDate = publishedDate;
        this.severity = severity;
    }

    public String  getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String  publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }
}
