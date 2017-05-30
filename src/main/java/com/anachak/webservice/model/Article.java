package com.anachak.webservice.model;

import javax.persistence.*;

/**
 * Created by cheasocheat on 4/6/17.
 */
@Entity
@Table(name = "td_article")
public class Article {
    private int id;
    private String summary;
    private String description;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
