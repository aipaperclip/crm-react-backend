package com.vaadin.tutorial.crm.entity;

import javax.persistence.*;

@Entity
public class User extends AbstractEntity {
  private String name;
  private String password;

  // @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)

  public User() {
  }

  public User(String name, String password) {
    setName(name);
    setPassword(password);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}