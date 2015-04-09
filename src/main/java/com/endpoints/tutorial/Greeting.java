package com.endpoints.tutorial;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class Greeting {

  @Id
  public Long id;

  public Greeting() {
  }

  public Greeting(String text, Integer avatarId) {
    this.text = text;
    this.avatarId = avatarId;
  }
  @Index
  public String text;
  @Index
  public Integer avatarId;
}
