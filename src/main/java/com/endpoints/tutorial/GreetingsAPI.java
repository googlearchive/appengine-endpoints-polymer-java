package com.endpoints.tutorial;

import java.util.Date;
import java.util.Random;

import static com.endpoints.tutorial.ObjectifyDAO.ofy;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Nullable;
import com.google.api.server.spi.config.Named;
import com.googlecode.objectify.Key;

@Api(
        name = "greetings", /* mandatory, otherwise replaced with "myapi"*/
        version = "v1",
        description = "A simple and polite API"
)
public class GreetingsAPI {

  @ApiMethod(name = "hello")
  public Greeting hello(@Nullable @Named("who") String who) {
    String text = new String("Hello ").concat(who == null ? "" : who);
    Greeting g = ofy().load().type(Greeting.class).filter("text", text).first().now();
    if (g == null) {
      g = new Greeting(text, new Random(new Date().getTime()).nextInt(16));
      Key<Greeting> gkey = ofy().save().entity(g).now();
      g.id = gkey.getId();
    }
    return g;
  }
}
