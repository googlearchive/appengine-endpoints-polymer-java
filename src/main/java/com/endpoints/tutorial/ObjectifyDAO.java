package com.endpoints.tutorial;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;

public class ObjectifyDAO {

  // register all @Entity classes

  static {
    ObjectifyService.register(Greeting.class);
  }

  // proxy for Objectify

  static Objectify ofy() {
    return ObjectifyService.ofy();
  }
}
