package com.sfujimoto.domain;
/* sfujimoto: 2017/03/23 18:00 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;

    // posts
    @OneToMany(mappedBy = "author") // who is the owner
    private List<Post> posts;


    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    private Author() {

    }

    private Author(String first, String last) {
        this.setFirstName(first);
        this.setLastName(last);

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
