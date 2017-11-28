package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "user_histories")
public class User_History {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_history_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String action;
    private String timestamp;

    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
