package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import db.DBConnector;

public final class adminhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Admin home</title>\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("    <meta content=\"\" name=\"keywords\">\n");
      out.write("    <meta content=\"\" name=\"description\">\n");
      out.write("\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link href=\"img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("    <!-- Google Web Fonts -->\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;500;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Icon Font Stylesheet -->\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Libraries Stylesheet -->\n");
      out.write("    <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"lib/lightbox/css/lightbox.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Customized Bootstrap Stylesheet -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Template Stylesheet -->\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("        #my-function{\n");
      out.write("            padding-top:0.625rem;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    ");

        String username = (String) session.getAttribute("username");
        if(username==null || username.trim().equals("")){
           response.sendRedirect("login.jsp");
        }
    
      out.write("\n");
      out.write("    \n");
      out.write("    <!-- Spinner Start -->\n");
      out.write("<!--    <div id=\"spinner\" class=\"show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center\">\n");
      out.write("        <div class=\"spinner-border position-relative text-primary\" style=\"width: 6rem; height: 6rem;\" role=\"status\"></div>\n");
      out.write("        <img src=\"img/drop2.png\" class=\"text-primary position-absolute top-50 start-50 translate-middle\" alt=\"\" width=\"35px\">\n");
      out.write("    </div>  -->\n");
      out.write("    <!-- Spinner End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Topbar Start -->\n");
      out.write("<!--    <div class=\"container-fluid bg-light px-0 wow fadeIn\" data-wow-delay=\"0.1s\">\n");
      out.write("        <div class=\"row gx-0 align-items-center d-none d-lg-flex\">\n");
      out.write("            <div class=\"col-lg-6 px-5 text-start\">\n");
      out.write("                <ol class=\"breadcrumb mb-0\">\n");
      out.write("                    <li class=\"breadcrumb-item\"><a class=\"small text-secondary\" href=\"#\">Home</a></li>\n");
      out.write("                    <li class=\"breadcrumb-item\"><a class=\"small text-secondary\" href=\"#\">Career</a></li>\n");
      out.write("                    <li class=\"breadcrumb-item\"><a class=\"small text-secondary\" href=\"#\">Terms</a></li>\n");
      out.write("                    <li class=\"breadcrumb-item\"><a class=\"small text-secondary\" href=\"#\">Privacy</a></li>\n");
      out.write("                </ol>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-6 px-5 text-end\">\n");
      out.write("                <small>Follow us:</small>\n");
      out.write("                <div class=\"h-100 d-inline-flex align-items-center\">\n");
      out.write("                    <a class=\"btn-square text-primary border-end rounded-0\" href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                    <a class=\"btn-square text-primary border-end rounded-0\" href=\"\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                    <a class=\"btn-square text-primary border-end rounded-0\" href=\"\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("                    <a class=\"btn-square text-primary pe-0\" href=\"\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>  -->\n");
      out.write("    <!-- Topbar End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Brand & Contact Start -->\n");
      out.write("    <div class=\"container-fluid py-4 px-5 wow fadeIn\" data-wow-delay=\"0.1s\">\n");
      out.write("        <div class=\"row align-items-center top-bar\">\n");
      out.write("            <div class=\"col-lg-4 col-md-12 text-center text-lg-start\">\n");
      out.write("                <a href=\"\" class=\"navbar-brand m-0 p-0\">\n");
      out.write("                    <h1 class=\"fw-bold text-primary m-0\"><img src=\"img/drop2.png\" alt=\"\" width=\"35px\"></img>Blood Bank</h1>\n");
      out.write("                    <!-- <img src=\"img/logo.png\" alt=\"Logo\"> -->\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-8 col-md-7 d-none d-lg-block\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-4\">\n");
      out.write("                        <div class=\"d-flex align-items-center justify-content-end\">\n");
      out.write("                            <div class=\"flex-shrink-0 btn-lg-square border rounded-circle\">\n");
      out.write("                                <i class=\"far fa-clock text-primary\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"ps-3\">\n");
      out.write("                                <p class=\"mb-2\">Opening Hour</p>\n");
      out.write("                                <h6 class=\"mb-0\">Mon - Fri, 8:00 - 9:00</h6>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-4\">\n");
      out.write("                        <div class=\"d-flex align-items-center justify-content-end\">\n");
      out.write("                            <div class=\"flex-shrink-0 btn-lg-square border rounded-circle\">\n");
      out.write("                                <i class=\"fa fa-phone text-primary\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"ps-3\">\n");
      out.write("                                <p class=\"mb-2\">Call Us</p>\n");
      out.write("                                <h6 class=\"mb-0\">+91 98765 4321</h6>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-4\">\n");
      out.write("                        <div class=\"d-flex align-items-center justify-content-end\">\n");
      out.write("                            <div class=\"flex-shrink-0 btn-lg-square border rounded-circle\">\n");
      out.write("                                <i class=\"far fa-envelope text-primary\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"ps-3\">\n");
      out.write("                                <p class=\"mb-2\">Email Us</p>\n");
      out.write("                                <h6 class=\"mb-0\">bloodbank@gmail.com</h6>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Brand & Contact End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Navbar Start -->\n");
      out.write("    <nav class=\"navbar navbar-expand-lg bg-primary navbar-dark sticky-top py-lg-0 px-lg-5 wow fadeIn\" data-wow-delay=\"0.1s\">\n");
      out.write("        <a href=\"#\" class=\"navbar-brand ms-3 d-lg-none\">MENU</a>\n");
      out.write("        <button type=\"button\" class=\"navbar-toggler me-3\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n");
      out.write("            <div class=\"navbar-nav me-auto p-3 p-lg-0\">\n");
      out.write("                <a href=\"adminhome.jsp\" class=\"nav-item nav-link active\">DashBoard</a>   \n");
      out.write("                <a href=\"donors.jsp\" class=\"nav-item nav-link\">Donors</a>     <!--About us-->\n");
      out.write("                <a href=\"receivers.jsp\" class=\"nav-item nav-link\">Receivers</a>    <!--Services-->\n");
      out.write("<!--                <a href=\"project.jsp\" class=\"nav-item nav-link\">Projects</a>       PROJECT-->\n");
      out.write("                <div class=\"nav-item dropdown\">\n");
      out.write("                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">Requests</a>\n");
      out.write("                    <div class=\"dropdown-menu border-0 rounded-0 rounded-bottom m-0\">\n");
      out.write("                        <a href=\"donorsrequests.jsp\" class=\"dropdown-item\">Donors</a>\n");
      out.write("                        <a href=\"patientrequests.jsp\" class=\"dropdown-item\">Patients</a>\n");
      out.write("<!--                        <a href=\"testimonial.html\" class=\"dropdown-item\">Testimonial</a>\n");
      out.write("                        <a href=\"404.html\" class=\"dropdown-item\">404 Page</a>-->\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("                <a href=\"bbhistory.jsp\" class=\"nav-item nav-link\">History</a>\n");
      out.write("            </div>\n");
      out.write("            <a href=\"logout.jsp\" class=\"btn btn-sm btn-light rounded-pill py-2 px-4 d-none d-lg-block\">LogOut</a>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <!-- Navbar End -->\n");
      out.write("\n");
      out.write("        ");

            String c = (String)request.getAttribute("loginsuccessful");
            if(c != null)
            {
                
      out.write("\n");
      out.write("                    <div class=\"alert alert-success alert-dismissible show wow fadeIn\" data-wow-delay=\"0.1s\" role=\"alert\">\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<strong>Login Successful!</strong> Welcome Admin.\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\" aria-label=\"Close\"></button>\n");
      out.write("                    </div>\n");
      out.write("                ");

            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

            String a = (String)request.getAttribute("message2");
            if(a != null) 
            {
                
      out.write("\n");
      out.write("                    <div class=\"alert alert-danger alert-dismissible show wow fadeIn\" data-wow-delay=\"0.1s\" role=\"alert\">\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<strong>Updation Failed!</strong> Fill the details correctly.\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\" aria-label=\"Close\"></button>\n");
      out.write("                    </div>\n");
      out.write("                ");

            }
        
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            String b = (String)request.getAttribute("message1");
            if(b != null)
            {
                
      out.write("\n");
      out.write("                    <div class=\"alert alert-success alert-dismissible show wow fadeIn\" data-wow-delay=\"0.1s\" role=\"alert\">\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<strong>Updation Successful!</strong>\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\" aria-label=\"Close\"></button>\n");
      out.write("                    </div>\n");
      out.write("                ");

            }
        
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!-- Carousel Start -->\n");
      out.write("<!--    <div class=\"container-fluid p-0 mb-5 wow fadeIn\" data-wow-delay=\"0.1s\">\n");
      out.write("        <div id=\"header-carousel\" class=\"carousel slide\" data-bs-ride=\"carousel\">\n");
      out.write("            <div class=\"carousel-indicators\">\n");
      out.write("                <button type=\"button\" data-bs-target=\"#header-carousel\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\">\n");
      out.write("                    <img class=\"img-fluid\" src=\"img/carousel-1.jpg\" alt=\"Image\">\n");
      out.write("                </button>\n");
      out.write("                <button type=\"button\" data-bs-target=\"#header-carousel\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\">\n");
      out.write("                    <img class=\"img-fluid\" src=\"img/carousel-2.jpg\" alt=\"Image\">\n");
      out.write("                </button>\n");
      out.write("                <button type=\"button\" data-bs-target=\"#header-carousel\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\">\n");
      out.write("                    <img class=\"img-fluid\" src=\"img/carousel-3.jpg\" alt=\"Image\">\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    <img class=\"w-100\" src=\"img/carousel-1.jpg\" alt=\"Image\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                        <div class=\"p-3\" style=\"max-width: 900px;\">\n");
      out.write("                            <h4 class=\"text-white text-uppercase mb-4 animated zoomIn\">Donate Blood</h4>\n");
      out.write("                            <h1 class=\"display-1 text-white mb-0 animated zoomIn\">Be the reason for someone's heartbeat</h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"w-100\" src=\"img/carousel-2.jpg\" alt=\"Image\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                        <div class=\"p-3\" style=\"max-width: 900px;\">\n");
      out.write("                            <h4 class=\"text-white text-uppercase mb-4 animated zoomIn\">Proud to be Blood Donor</h4>\n");
      out.write("                            <h1 class=\"display-1 text-white mb-0 animated zoomIn\">You can become a superhero too.</h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"w-100\" src=\"img/carousel-3.jpg\" alt=\"Image\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                        <div class=\"p-3\" style=\"max-width: 900px;\">\n");
      out.write("                            <h4 class=\"text-white text-uppercase mb-4 animated zoomIn\">Save life</h4>\n");
      out.write("                            <h1 class=\"display-1 text-white mb-0 animated zoomIn\">The gift of blood is a gift to someone's life</h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#header-carousel\"\n");
      out.write("                data-bs-slide=\"prev\">\n");
      out.write("                <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"visually-hidden\">Previous</span>\n");
      out.write("            </button>\n");
      out.write("            <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#header-carousel\"\n");
      out.write("                data-bs-slide=\"next\">\n");
      out.write("                <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"visually-hidden\">Next</span>\n");
      out.write("            </button>\n");
      out.write("        </div>\n");
      out.write("    </div>  -->\n");
      out.write("    <!-- Carousel End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Availability Start -->\n");
      out.write("    <div class=\"container-xxl py-4\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row g-4\">\n");
      out.write("                ");

                    try{
                    Statement st = DBConnector.getStatement();
                    String query = "Select * from blood_availability";
                    ResultSet rs = st.executeQuery(query);
                    
                    while(rs.next()){
                    
                
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 wow fadeInUp\" data-wow-delay=\"0.1s\">\n");
      out.write("                        <div class=\"fact-item bg-light rounded text-center h-100 p-5\">\n");
      out.write("                            <img src=\"img/drop2.png\" alt=\"\" width=\"50px\">\n");
      out.write("                            <h3 class=\"mb-3 mt-3\">");
      out.print(rs.getString(1));
      out.write("</h3>\n");
      out.write("                            <h1 class=\"display-5 mb-0\" data-toggle=\"counter-up\">");
      out.print(rs.getString(2));
      out.write("</h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                ");

                  }
                    } catch(SQLException e){
                        System.out.println(e);
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> \n");
      out.write("    <!-- Availability End -->\n");
      out.write("\n");
      out.write(" \n");
      out.write("    \n");
      out.write("    <!-- TO Add Start -->\n");
      out.write("    <div class=\"container-xxl py-5\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"text-center mx-auto mb-5 wow fadeInUp\" data-wow-delay=\"0.1s\" style=\"max-width: 600px;\">\n");
      out.write("                <h6 class=\"section-title bg-white text-center text-primary px-3 mb-4\">Updation</h6>\n");
      out.write("<!--                <h1 class=\"display-6 mb-4\">If You Have Any Query, Please Feel Free Contact Us</h1>-->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row g-0 justify-content-center\">\n");
      out.write("                <div class=\"col-lg-8 wow fadeInUp\" data-wow-delay=\"0.5s\">\n");
      out.write("                   \n");
      out.write("                    <form action=\"QuantityUpdationChecker\" method=\"post\">\n");
      out.write("                        <div class=\"row g-3\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"form-floating\">\n");
      out.write("                                    <select name=\"bgroup\" class=\"form-control\" id=\"mySelect\">\n");
      out.write("                                        <option value=\"O+\">O+</option>\n");
      out.write("                                        <option value=\"O-\">O-</option>\n");
      out.write("                                        <option value=\"A+\">A+</option>\n");
      out.write("                                        <option value=\"A-\">A-</option>\n");
      out.write("                                        <option value=\"B+\">B+</option>\n");
      out.write("                                        <option value=\"B-\">B-</option>\n");
      out.write("                                        <option value=\"AB+\">AB+</option>\n");
      out.write("                                        <option value=\"AB-\">AB-</option> \n");
      out.write("                                    </select>\n");
      out.write("                                    <label for=\"mySelect\">Blood Group</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"form-floating\">\n");
      out.write("                                        <input type=\"number\" name=\"units\" class=\"form-control\" id=\"units\" placeholder=\"Units\" max=\"1000\" min=\"1\" oninvalid=\"this.setCustomValidity('Please enter units between 1-1000.')\" oninput=\"this.setCustomValidity('')\" required>\n");
      out.write("                                        <label for=\"units\">Units to Update</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <div class=\"form-floating\">\n");
      out.write("                                        <select name=\"function\" class=\"form-control text-center\" id=\"my-function\" >\n");
      out.write("                                            <option value=\"add\">Add</option>\n");
      out.write("                                            <option value=\"remove\">Remove</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-12 text-center mt-4\">\n");
      out.write("                                    <button class=\"btn btn-primary rounded-pill py-3 px-5 mx-1\" type=\"submit\">Update</button>\n");
      out.write("                                    <button class=\"btn btn-primary rounded-pill py-3 px-5 mx-1\" type=\"reset\">Reset</button>\n");
      out.write("                                </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- TO Add End -->\n");
      out.write("    \n");
      out.write("        \n");
      out.write("\n");
      out.write("    <!-- Footer Start -->\n");
      out.write("    <div class=\"container-fluid bg-dark text-body footer mt-5 pt-5 wow fadeIn\" data-wow-delay=\"0.1s\">\n");
      out.write("        <div class=\"container py-5\">\n");
      out.write("            <div class=\"row g-5\">\n");
      out.write("                <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                    <h5 class=\"text-light mb-4\">Address</h5>\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt me-3\"></i>Choudhary complex, Rau</p>\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-phone-alt me-3\"></i>+91 98765 4321</p>\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-envelope me-3\"></i>bloodbank@gmail.com</p>\n");
      out.write("                    <div class=\"d-flex pt-2\">\n");
      out.write("                        <a class=\"btn btn-square btn-outline-secondary rounded-circle me-1\" href=\"\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                        <a class=\"btn btn-square btn-outline-secondary rounded-circle me-1\" href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                        <a class=\"btn btn-square btn-outline-secondary rounded-circle me-1\" href=\"\"><i class=\"fab fa-youtube\"></i></a>\n");
      out.write("                        <a class=\"btn btn-square btn-outline-secondary rounded-circle me-0\" href=\"\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                    <h5 class=\"text-light mb-4\">Quick Links</h5>\n");
      out.write("                    <a class=\"btn btn-link\" href=\"adminhome.jsp\">Dashboard</a>\n");
      out.write("                    <a class=\"btn btn-link\" href=\"donors.jsp\">Donors</a>\n");
      out.write("                    <a class=\"btn btn-link\" href=\"receivers.jsp\">Receivers</a>\n");
      out.write("                    <a class=\"btn btn-link\" href=\"donorsrequests.jsp\">Donors Request</a>\n");
      out.write("                    <a class=\"btn btn-link\" href=\"patientrequests.jsp\">Patient Request</a>\n");
      out.write("                    <a class=\"btn btn-link\" href=\"bbhistory.jsp\">History</a>\n");
      out.write("                </div>\n");
      out.write("<!--                <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                    <h5 class=\"text-light mb-4\">Gallery</h5>\n");
      out.write("                    <div class=\"row g-2\">\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <img class=\"img-fluid rounded\" src=\"img/g1.jpg\" alt=\"Image\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <img class=\"img-fluid rounded\" src=\"img/g2.jpg\" alt=\"Image\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <img class=\"img-fluid rounded\" src=\"img/g3.jpg\" alt=\"Image\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <img class=\"img-fluid rounded\" src=\"img/g4.jpg\" alt=\"Image\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <img class=\"img-fluid rounded\" src=\"img/g5.jpg\" alt=\"Image\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <img class=\"img-fluid rounded\" src=\"img/g6.jpg\" alt=\"Image\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>-->\n");
      out.write("<!--                <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                    <h5 class=\"text-light mb-4\">Newsletter</h5>\n");
      out.write("                    <p>Dolor amet sit justo amet elitr clita ipsum elitr est.</p>\n");
      out.write("                    <div class=\"position-relative mx-auto\" style=\"max-width: 400px;\">\n");
      out.write("                        <input class=\"form-control bg-transparent border-secondary w-100 py-3 ps-4 pe-5\" type=\"text\" placeholder=\"Your email\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary py-2 position-absolute top-0 end-0 mt-2 me-2\">SignUp</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>  -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("<!--        <div class=\"container-fluid copyright\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6 text-center text-md-start mb-3 mb-md-0\">\n");
      out.write("                        &copy; <a href=\"#\">Blood Bank Management Interface</a>, All Right Reserved.\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6 text-center text-md-end\">\n");
      out.write("                        /*** This template is free as long as you keep the footer author’s credit link/attribution link/backlink. If you'd like to use the template without the footer author’s credit link/attribution link/backlink, you can purchase the Credit Removal License from \"https://htmlcodex.com/credit-removal\". Thank you for your support. ***/\n");
      out.write("                        Designed By <a href=\"https://htmlcodex.com\">HTML Codex</a>\n");
      out.write("                        <br>Distributed By: <a class=\"border-bottom\" href=\"https://themewagon.com\" target=\"_blank\">ThemeWagon</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>-->\n");
      out.write("    </div>\n");
      out.write("    <!-- Footer End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Back to Top -->\n");
      out.write("    <a href=\"#\" class=\"btn btn-lg btn-primary btn-lg-square rounded-circle back-to-top\"><i class=\"bi bi-arrow-up\"></i></a>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!-- JavaScript Libraries -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <script src=\"lib/wow/wow.min.js\"></script>\n");
      out.write("    <script src=\"lib/easing/easing.min.js\"></script>\n");
      out.write("    <script src=\"lib/waypoints/waypoints.min.js\"></script>\n");
      out.write("    <script src=\"lib/counterup/counterup.min.js\"></script>\n");
      out.write("    <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"lib/lightbox/js/lightbox.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Template Javascript -->\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
