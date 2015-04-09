package com.endpoints.tutorial;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Endpoints_polymer_material_tutorialServlet extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse resp)
          throws IOException {
    resp.setContentType("text/plain");
    resp.getWriter().println("Hello, world");
    com.google.appengine.repackaged.org.codehaus.jackson.JsonFactory a;
  }
}
