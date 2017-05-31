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

    public Article(){}
    public Article(int id, String summary, String description){
        this.id = id;
        this.summary = summary;
        this.description = description;
    }

    @Id
    @Column(name="atc_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "atc_summary", nullable = true)
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Column(name = "atc_desc", nullable = true)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
