package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Administrator Login</title>\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("        <meta content=\"\" name=\"keywords\">\n");
      out.write("        <meta content=\"\" name=\"description\">\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link href=\"img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("        <!-- Google Web Fonts -->\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;500;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Icon Font Stylesheet -->\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Libraries Stylesheet -->\n");
      out.write("        <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"lib/lightbox/css/lightbox.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Customized Bootstrap Stylesheet -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Template Stylesheet -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .g-3, .gx-3 {\n");
      out.write("                --bs-gutter-x: -28rem;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Spinner Start -->\n");
      out.write("        <div id=\"spinner\" class=\"show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center\">\n");
      out.write("            <div class=\"spinner-border position-relative text-primary\" style=\"width: 6rem; height: 6rem;\" role=\"status\"></div>\n");
      out.write("            <img src=\"img/drop2.png\" class=\"text-primary position-absolute top-50 start-50 translate-middle\" alt=\"\" width=\"35px\">\n");
      out.write("        </div>\n");
      out.write("        <!-- Spinner End -->\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <!-- Brand & Contact Start -->\n");
      out.write("        <div class=\"container-fluid py-4 px-5 wow fadeIn\" data-wow-delay=\"0.1s\">\n");
      out.write("            <div class=\"row align-items-center top-bar\">\n");
      out.write("                <div class=\"col-lg-4 col-md-12 text-center text-lg-start\">\n");
      out.write("                    <a href=\"\" class=\"navbar-brand m-0 p-0\">\n");
      out.write("                        <h1 class=\"fw-bold text-primary m-0\"><img src=\"img/drop2.png\" alt=\"\" width=\"35px\"></i> Blood Bank\n");
      out.write("                        </h1>\n");
      out.write("                        <!-- <img src=\"img/logo.png\" alt=\"Logo\"> -->\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-8 col-md-7 d-none d-lg-block\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <div class=\"d-flex align-items-center justify-content-end\">\n");
      out.write("                                <div class=\"flex-shrink-0 btn-lg-square border rounded-circle\">\n");
      out.write("                                    <i class=\"far fa-clock text-primary\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"ps-3\">\n");
      out.write("                                    <p class=\"mb-2\">Opening Hour</p>\n");
      out.write("                                    <h6 class=\"mb-0\">Mon - Fri, 8:00 - 9:00</h6>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <div class=\"d-flex align-items-center justify-content-end\">\n");
      out.write("                                <div class=\"flex-shrink-0 btn-lg-square border rounded-circle\">\n");
      out.write("                                    <i class=\"fa fa-phone text-primary\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"ps-3\">\n");
      out.write("                                    <p class=\"mb-2\">Call Us</p>\n");
      out.write("                                    <h6 class=\"mb-0\">+91 98765 4321</h6>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <div class=\"d-flex align-items-center justify-content-end\">\n");
      out.write("                                <div class=\"flex-shrink-0 btn-lg-square border rounded-circle\">\n");
      out.write("                                    <i class=\"far fa-envelope text-primary\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"ps-3\">\n");
      out.write("                                    <p class=\"mb-2\">Email Us</p>\n");
      out.write("                                    <h6 class=\"mb-0\">bloodbank@gmail.com</h6>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Brand & Contact End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Navbar Start -->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg bg-primary navbar-dark sticky-top py-lg-0 px-lg-5 wow fadeIn\"\n");
      out.write("            data-wow-delay=\"0.1s\">\n");
      out.write("            <a href=\"#\" class=\"navbar-brand ms-3 d-lg-none\">MENU</a>\n");
      out.write("            <button type=\"button\" class=\"navbar-toggler me-3\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n");
      out.write("                <div class=\"navbar-nav me-auto p-3 p-lg-0\">\n");
      out.write("                    <a href=\"webhome.jsp\" class=\"nav-item nav-link\">Home</a>\n");
      out.write("                    <a href=\"donate.jsp\" class=\"nav-item nav-link\">Donate</a><!-- About Us -->\n");
      out.write("                    <a href=\"request.jsp\" class=\"nav-item nav-link\">Request</a><!-- Services -->\n");
      out.write("<!--                    <a href=\"process.jsp\" class=\"nav-item nav-link\">Team</a>-->\n");
      out.write("                   \n");
      out.write("                    <a href=\"contact.jsp\" class=\"nav-item nav-link\">Contact Us</a>\n");
      out.write("                </div>\n");
      out.write("                <a href=\"login.jsp\" class=\"btn btn-sm btn-light rounded-pill py-2 px-4 d-none d-lg-block\">Log In</a>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- Navbar End -->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

            String c = (String)request.getAttribute("loginfailed");
            if(c != null)
            {
                
      out.write("\n");
      out.write("                    <div class=\"alert alert-danger alert-dismissible show wow fadeIn mb-0\" data-wow-delay=\"0.1s\" role=\"alert\">\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<strong>Login Failed!</strong> Please enter correct Username and Password.\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\" aria-label=\"Close\"></button>\n");
      out.write("                    </div>\n");
      out.write("                ");

            }
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Login Start -->\n");
      out.write("        <div class=\"container-xxl py-5\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"text-center mx-auto mb-3 wow fadeInUp\" data-wow-delay=\"0.1s\" style=\"max-width: 600px;\">\n");
      out.write("                    <h6 class=\"section-title bg-white text-center text-primary px-3\">Log In</h6>\n");
      out.write("                    <!-- <h1 class=\"display-6 mb-4\">Enter Username and Password</h1> -->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row g-0 justify-content-center\">\n");
      out.write("                    <div class=\"col-lg-8 wow fadeInUp\" data-wow-delay=\"0.1s\">\n");
      out.write("                        <!-- <p class=\"text-center mb-4\">The contact form is currently inactive. Get a functional and working contact form with Ajax & PHP in a few minutes. Just copy and paste the files, add a little code and you're done. <a href=\"https://htmlcodex.com/contact-form\">Download Now</a>.</p> -->\n");
      out.write("                        <form action=\"LoginChecker\" method=\"post\">\n");
      out.write("                            <div class=\"row g-3\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <div class=\"form-floating\">\n");
      out.write("                                        <input type=\"text\" name=\"username\" class=\"form-control\"  id=\"username\" placeholder=\"User Name\" required>\n");
      out.write("                                        <label for=\"username\">User Name</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <div class=\"form-floating\">\n");
      out.write("                                        <input type=\"password\" name=\"password\" class=\"form-control\" id=\"password\" placeholder=\"Password\" required>\n");
      out.write("                                        <label for=\"password\">Password</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-12 text-center\">\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-primary rounded-pill py-3 px-5 mx-1\" value=\"Log In\">\n");
      out.write("                                    <input type=\"reset\" class=\"btn btn-primary rounded-pill py-3 px-5 mx-1\" value=\"Reset\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Login -->\n");
      out.write("\n");
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("        <!-- Footer Start -->\n");
      out.write("        <div class=\"container-fluid bg-dark text-body footer mt-5 pt-5 wow fadeIn\" data-wow-delay=\"0.1s\">\n");
      out.write("            <div class=\"container py-5\">\n");
      out.write("                <div class=\"row g-5\">\n");
      out.write("                    <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                            <h5 class=\"text-light mb-4\">Address</h5>\n");
      out.write("                            <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt me-3\"></i>Choudhary Complex, Rau</p>\n");
      out.write("                            <p class=\"mb-2\"><i class=\"fa fa-phone-alt me-3\"></i>+91 98765 4321</p>\n");
      out.write("                            <p class=\"mb-2\"><i class=\"fa fa-envelope me-3\"></i>bloodbank@gmail.com</p>\n");
      out.write("                            <div class=\"d-flex pt-2\">\n");
      out.write("                                <a class=\"btn btn-square btn-outline-secondary rounded-circle me-1\" ><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                                <a class=\"btn btn-square btn-outline-secondary rounded-circle me-1\" ><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                                <a class=\"btn btn-square btn-outline-secondary rounded-circle me-1\" ><i class=\"fab fa-youtube\"></i></a>\n");
      out.write("                                <a class=\"btn btn-square btn-outline-secondary rounded-circle me-0\" ><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                            <h5 class=\"text-light mb-4\">Quick Links</h5>\n");
      out.write("                            <a class=\"btn btn-link\" href=\"webhome.jsp\">Home</a>\n");
      out.write("                            <a class=\"btn btn-link\" href=\"donate.jsp\">Donate</a>\n");
      out.write("                            <a class=\"btn btn-link\" href=\"request.jsp\">Request</a>\n");
      out.write("<!--                            <a class=\"btn btn-link\" href=\"process.jsp\">Team</a>-->\n");
      out.write("                            <a class=\"btn btn-link\" href=\"login.jsp\">Administrator Login</a>\n");
      out.write("                        </div>\n");
      out.write("<!--                    <div class=\"col-lg-5 col-md-\">\n");
      out.write("                        <h5 class=\"text-light mb-4\">Gallery</h5>\n");
      out.write("                        <div class=\"row g-2\">\n");
      out.write("                            <div class=\"col-4\">\n");
      out.write("                                <img class=\"img-fluid rounded\" src=\"img/g1.jpg\" alt=\"Image\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-4\">\n");
      out.write("                                <img class=\"img-fluid rounded\" src=\"img/g2.jpg\" alt=\"Image\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-4\">\n");
      out.write("                                <img class=\"img-fluid rounded\" src=\"img/g3.jpg\" alt=\"Image\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-4\">\n");
      out.write("                                <img class=\"img-fluid rounded\" src=\"img/g4.jpg\" alt=\"Image\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-4\">\n");
      out.write("                                <img class=\"img-fluid rounded\" src=\"img/g5.jpg\" alt=\"Image\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-4\">\n");
      out.write("                                <img class=\"img-fluid rounded\" src=\"img/g6.jpg\" alt=\"Image\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>-->\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("<!--            <div class=\"container-fluid copyright\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 text-center text-md-start mb-3 mb-md-0\">\n");
      out.write("                            &copy; <a href=\"#\">Blood Bank Management Interface</a>, All Right Reserved.\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 text-center text-md-end\">\n");
      out.write("                            /*** This template is free as long as you keep the footer author’s credit link/attribution link/backlink. If you'd like to use the template without the footer author’s credit link/attribution link/backlink, you can purchase the Credit Removal License from \"https://htmlcodex.com/credit-removal\". Thank you for your support. ***/\n");
      out.write("                            Designed By <a href=\"https://htmlcodex.com\">HTML Codex</a>\n");
      out.write("                            <br>Distributed By: <a class=\"border-bottom\" href=\"https://themewagon.com\"\n");
      out.write("                                target=\"_blank\">ThemeWagon</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>-->\n");
      out.write("        </div>\n");
      out.write("        <!-- Footer End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Back to Top -->\n");
      out.write("        <a href=\"#\" class=\"btn btn-lg btn-primary btn-lg-square rounded-circle back-to-top\"><i class=\"bi bi-arrow-up\"></i></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- JavaScript Libraries -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"lib/wow/wow.min.js\"></script>\n");
      out.write("        <script src=\"lib/easing/easing.min.js\"></script>\n");
      out.write("        <script src=\"lib/waypoints/waypoints.min.js\"></script>\n");
      out.write("        <script src=\"lib/counterup/counterup.min.js\"></script>\n");
      out.write("        <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"lib/lightbox/js/lightbox.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Template Javascript -->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
