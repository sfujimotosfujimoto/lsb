package com.sfujimoto.domain;
/* sfujimoto: 2017/03/23 17:56 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;


@Entity
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String body;
    private Date postedOn;

    // Author
    @ManyToOne
    private Author author;



    // private no arg constructor is needed by JPA
    private Post() {

    }

    // our public constructor makes sure a title is set when creating a new Post
    public Post(String title) {
        this.setTitle(title);
    }


    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(Date postedOn) {
        this.postedOn = postedOn;
    }
}
