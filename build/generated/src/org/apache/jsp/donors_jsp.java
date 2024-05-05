package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import db.DBConnector;

public final class donors_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Donors</title>\n");
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
      out.write("        <!-- Table Style -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .my-button{\n");
      out.write("                font-size: small;\n");
      out.write("                line-height: normal;\n");
      out.write("                background: white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");

            String username = (String) session.getAttribute("username");
            if (username == null || username.trim().equals("")) {
             //   response.sendRedirect("login.jsp");
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Spinner Start -->\n");
      out.write("        <div id=\"spinner\" class=\"show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center\">\n");
      out.write("            <div class=\"spinner-border position-relative text-primary\" style=\"width: 6rem; height: 6rem;\" role=\"status\"></div>\n");
      out.write("            <img src=\"img/drop2.png\" class=\"text-primary position-absolute top-50 start-50 translate-middle\" alt=\"\" width=\"35px\">\n");
      out.write("        </div>\n");
      out.write("        <!-- Spinner End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("       \n");
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
      out.write("             data-wow-delay=\"0.1s\">\n");
      out.write("            <a href=\"#\" class=\"navbar-brand ms-3 d-lg-none\">MENU</a>\n");
      out.write("            <button type=\"button\" class=\"navbar-toggler me-3\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n");
      out.write("                <div class=\"navbar-nav me-auto p-3 p-lg-0\">\n");
      out.write("                    <a href=\"adminhome.jsp\" class=\"nav-item nav-link\">Dashboard</a>\n");
      out.write("                    <a href=\"donors.jsp\" class=\"nav-item nav-link active\">Donors</a>\n");
      out.write("                    <a href=\"receivers.jsp\" class=\"nav-item nav-link\">Receivers</a><!-- Services -->\n");
      out.write("                    <!-- <a href=\"project.html\" class=\"nav-item nav-link\">Projects</a> -->\n");
      out.write("                    <div class=\"nav-item dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">Requests</a><!-- Pages -->\n");
      out.write("                        <div class=\"dropdown-menu border-0 rounded-0 rounded-bottom m-0\">\n");
      out.write("                            <a href=\"donorsrequests.jsp\" class=\"dropdown-item\">Donors</a><!-- Features -->\n");
      out.write("                            <a href=\"patientrequests.jsp\" class=\"dropdown-item\">Patients</a><!-- Our Team -->\n");
      out.write("                            <!-- <a href=\"testimonial.html\" class=\"dropdown-item\">Testimonial</a>\n");
      out.write("                            <a href=\"404.html\" class=\"dropdown-item\">404 Page</a> -->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"bbhistory.jsp\" class=\"nav-item nav-link\">History</a>\n");
      out.write("                    <!--<a href=\"contact.html\" class=\"nav-item nav-link\">Contact Us</a>-->\n");
      out.write("                </div>\n");
      out.write("                <a href=\"logout.jsp\" class=\"btn btn-sm btn-light rounded-pill py-2 px-4 d-none d-lg-block\">Log Out</a>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- Navbar End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            String a = (String) request.getAttribute("donoradditionfailed");
            if (a != null) {
        
      out.write("\n");
      out.write("        <div class=\"alert alert-danger alert-dismissible show wow fadeIn mb-0\" data-wow-delay=\"0.1s\" role=\"alert\">\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<strong>Donor Addition Failed!</strong> Fill the details correctly.\n");
      out.write("            <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\" aria-label=\"Close\"></button>\n");
      out.write("        </div>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            String b = (String) request.getAttribute("donoradditionsuccess");
            if (b != null) {
        
      out.write("\n");
      out.write("        <div class=\"alert alert-success alert-dismissible show wow fadeIn mb-0\" data-wow-delay=\"0.1s\" role=\"alert\">\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<strong>Donor is added to the list successfully!</strong>\n");
      out.write("            <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\" aria-label=\"Close\"></button>\n");
      out.write("        </div>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            String c = (String) request.getAttribute("donordeletionsuccess");
            if (c != null) {
        
      out.write("\n");
      out.write("        <div class=\"alert alert-success alert-dismissible show wow fadeIn mb-0\" data-wow-delay=\"0.1s\" role=\"alert\">\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<strong>Donor is deleted successfully!</strong>\n");
      out.write("            <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\" aria-label=\"Close\"></button>\n");
      out.write("        </div>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            String d = (String) request.getAttribute("donordeletionfailed");
            if (d != null) {
        
      out.write("\n");
      out.write("        <div class=\"alert alert-danger alert-dismissible show wow fadeIn mb-0\" data-wow-delay=\"0.1s\" role=\"alert\">\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<strong>Donor deletion failed!</strong>\n");
      out.write("            <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\" aria-label=\"Close\"></button>\n");
      out.write("        </div>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Page Header Start -->\n");
      out.write("        <div class=\"container-fluid page-header py-5 mb-5 wow fadeIn\" data-wow-delay=\"0.1s\">\n");
      out.write("            <div class=\"container text-center py-5\">\n");
      out.write("                <h1 class=\"display-4 text-white animated slideInDown mb-3\">Donors</h1>\n");
      out.write("                <nav aria-label=\"breadcrumb animated slideInDown\">\n");
      out.write("                    <ol class=\"breadcrumb justify-content-center mb-0\">\n");
      out.write("                        <li class=\"breadcrumb-item\"><a class=\"text-white\" href=\"#\">Home</a></li>\n");
      out.write("                        <li class=\"breadcrumb-item\"><a class=\"text-white\" href=\"#\">Pages</a></li>\n");
      out.write("                        <li class=\"breadcrumb-item text-primary active\" aria-current=\"page\">Donors</li>\n");
      out.write("                    </ol>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Page Header End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- List Heading Start -->\n");
      out.write("        <div class=\"container-xxl pt-2\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"text-center mx-auto wow fadeInUp\" data-wow-delay=\"0.1s\" style=\"max-width: 600px;\">\n");
      out.write("                    <h6 class=\"section-title bg-white text-center text-primary px-3 mb-4\">List of Donors</h6>\n");
      out.write("                    <!-- <h1 class=\"display-6 mb-4\">If You Have Any Query, Please Feel Free Contact Us</h1> -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- List Heading End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--Pagination Table Start-->\n");
      out.write("        <div class=\"container wow fadeInUp\" data-wow-delay=\"0.1s\">\n");
      out.write("            <div class=\" header_wrap mt-0\">\n");
      out.write("                <div class=\"num_rows\">\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <!--\t\tShow Numbers Of Rows \t\t-->\n");
      out.write("                        <select class=\"form-control\" name=\"state\" id=\"maxRows\">\n");
      out.write("                            <option value=\"10\">10 Rows</option>\n");
      out.write("                            <option value=\"15\">15 Rows</option>\n");
      out.write("                            <option value=\"20\">20 Rows</option>\n");
      out.write("                            <option value=\"50\">50 Rows</option>\n");
      out.write("                            <option value=\"70\">70 Rows</option>\n");
      out.write("                            <option value=\"100\">100 Rows</option>\n");
      out.write("                            <option value=\"5000\">Show ALL Rows</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"tb_search\">\n");
      out.write("                    <!-- Icon trigger modal -->\n");
      out.write("                    <a href=\"#\" class=\"btn btn-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\">\n");
      out.write("                        + Add Donor\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"tb_search-2\">\n");
      out.write("                    <input type=\"text\" id=\"search_input_all\" onkeyup=\"FilterkeyWord_all_table()\" placeholder=\"Search..\"\n");
      out.write("                           class=\"form-control\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container col-lg-12 px-0 my-4\">\n");
      out.write("                <table class=\"table table-striped table-class\" id=\"table-id\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"col\" class=\"col-lg-1\">ID</th>\n");
      out.write("                            <th scope=\"col\" class=\"col-lg-1\">Aadhar</th>\n");
      out.write("                            <th scope=\"col\" class=\"col-lg-3\">Name</th>\n");
      out.write("                            <th scope=\"col\" class=\"col-lg-1\">Age</th>\n");
      out.write("                            <th scope=\"col\" class=\"col-lg-1\">Gender</th>\n");
      out.write("                            <th scope=\"col\" class=\"col-lg-1\">Blood Group</th>\n");
      out.write("                            <th scope=\"col\" class=\"col-lg-1\">City</th>\n");
      out.write("                            <th scope=\"col\" class=\"col-lg-1\">Contact</th>\n");
      out.write("                            <th scope=\"col\" class=\"col-lg-1\">Units Donated</th>\n");
      out.write("                            <th scope=\"col\" class=\"col-lg-1\">Action</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");

                            try {
                                Statement st = DBConnector.getStatement();

//                                        String query = "Select did,aadhar,name,age,blood_group,units_donated from successful_donation";
                                String query = "Select * from successful_donation";

                                ResultSet rs = st.executeQuery(query);

                                while (rs.next()) {
                        
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString(8));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString(9));
      out.write("</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <form action=\"DeleteDonorChecker\" method=\"post\">\n");
      out.write("                                            <input type=\"hidden\" name=\"did\" value=\"");
      out.print(rs.getString(1));
      out.write("\" >\n");
      out.write("                                            <button class=\"my-button\"><i class=\"fa fa-trash text-primary\"></i></button>\n");
      out.write("                                        </form>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                        ");

                                }
                            } catch (SQLException e) {
                                System.out.println(e);
                            }
                        
      out.write("\n");
      out.write("                    <tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div> <!-- End of Container -->\n");
      out.write("\n");
      out.write("        <div class=\"container-xxl pb-5 wow fadeInUp\" data-wow-delay=\"0.2s\">\n");
      out.write("            <div class='pagination-container'>\n");
      out.write("                <nav>\n");
      out.write("                    <ul class=\"pagination mb-5\">\n");
      out.write("                        <!--\tHere the JS Function Will Add the Rows -->\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"rows_count\">Showing 11 to 20 of 91 entries</div>\n");
      out.write("        </div>\n");
      out.write("        <!--Pagination Table End-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\"\n");
      out.write("             aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Donor Record Insertion\n");
      out.write("                        </h5>\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"\n");
      out.write("                                aria-label=\"Close\"></button>\n");
      out.write("                    </div>\n");
      out.write("                    <form action=\"DonorRecordChecker\" method=\"post\">\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                            <div class=\"row g-3\">\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"form-floating\">\n");
      out.write("                                        <input type=\"text\" pattern=\"[0-9]{12}\" oninvalid=\"InvalidMsgAadhar(this);\" maxlength=\"12\" onkeypress=\"return onlyNumberKey(event)\" name=\"aadhar\" oninput=\"InvalidMsgAadhar(this);\" class=\"form-control\" id=\"aadhar\" placeholder=\"Enter Aadhar\" required />\n");
      out.write("                                        <label for=\"aadhar\">Enter Aadhar</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"form-floating\">\n");
      out.write("                                        <input type=\"text\" name=\"username\" class=\"form-control\" id=\"name\" placeholder=\"Enter Name\" required>\n");
      out.write("                                        <label for=\"name\">Enter Name</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"form-floating\">\n");
      out.write("                                        <input type=\"number\" name=\"age\" class=\"form-control\" id=\"age\" placeholder=\"Age\" max=\"150\" min=\"18\" oninvalid=\"this.setCustomValidity('Please enter age between 18-150.')\" oninput=\"this.setCustomValidity('')\" required>\n");
      out.write("                                        <label for=\"age\">Age (Only 18+ allowed)</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"form-floating\">\n");
      out.write("                                        <select name=\"gender\" class=\"form-control\" id=\"gender\">\n");
      out.write("                                            <option value=\"Male\">Male\n");
      out.write("                                            </option>\n");
      out.write("                                            <option value=\"Female\">Female\n");
      out.write("                                            </option>\n");
      out.write("                                        </select>\n");
      out.write("                                        <label for=\"gender\">Gender</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <div class=\"form-floating\">\n");
      out.write("                                        <select name=\"bgroup\" class=\"form-control\" id=\"bgroup\">\n");
      out.write("                                            <option value=\"O+\">O+\n");
      out.write("                                            </option>\n");
      out.write("                                            <option value=\"O-\">O-\n");
      out.write("                                            </option>\n");
      out.write("                                            <option value=\"A+\">A+\n");
      out.write("                                            </option>\n");
      out.write("                                            <option value=\"A-\">A-\n");
      out.write("                                            </option>\n");
      out.write("                                            <option value=\"B+\">B+\n");
      out.write("                                            </option>\n");
      out.write("                                            <option value=\"B-\">B-\n");
      out.write("                                            </option>\n");
      out.write("                                            <option value=\"AB+\">AB+\n");
      out.write("                                            </option>\n");
      out.write("                                            <option value=\"AB-\">AB-\n");
      out.write("                                            </option>\n");
      out.write("                                        </select>\n");
      out.write("                                        <label for=\"bgroup\">Blood Group</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-12\">\n");
      out.write("                                    <div class=\"form-floating\">\n");
      out.write("                                        <input type=\"text\" name=\"address\" class=\"form-control\" id=\"address\" placeholder=\"Address\" required>\n");
      out.write("                                        <label for=\"address\">Address</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-6\">\n");
      out.write("                                    <div class=\"form-floating\">\n");
      out.write("                                        <input type=\"text\" pattern=\"[0-9]{10}\" oninvalid=\"InvalidMsgContact(this);\" maxlength=\"10\" onkeypress=\"return onlyNumberKey(event)\" name=\"contact\" oninput=\"InvalidMsgContact(this);\" class=\"form-control\" id=\"contact\" placeholder=\"Contact\" required />\n");
      out.write("                                        <label for=\"contact\">Contact</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"form-floating\">\n");
      out.write("                                        <input type=\"number\" name=\"units_donated\" class=\"form-control\" id=\"units_donated\" placeholder=\"Units Donated\" max=\"5\" min=\"1\" oninvalid=\"this.setCustomValidity('Please enter units between 1-5.')\" oninput=\"this.setCustomValidity('')\" required>\n");
      out.write("                                        <label for=\"units_donated\">Units Donated</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-light\" data-bs-dismiss=\"modal\">Close</button>\n");
      out.write("                            <button class=\"btn btn-light\" type=\"reset\" >Reset</button>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\" >Insert Record</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--Modal-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Footer Start -->\n");
      out.write("        <div class=\"container-fluid bg-dark text-body footer mt-5 pt-5 wow fadeIn\" data-wow-delay=\"0.1s\">\n");
      out.write("            <div class=\"container py-5\">\n");
      out.write("                <div class=\"row g-5\">\n");
      out.write("                    <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                        <h5 class=\"text-light mb-4\">Address</h5>\n");
      out.write("                        <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt me-3\"></i>Choudhary Complex , Rau</p>\n");
      out.write("                        <p class=\"mb-2\"><i class=\"fa fa-phone-alt me-3\"></i>+91 98765 4321</p>\n");
      out.write("                        <p class=\"mb-2\"><i class=\"fa fa-envelope me-3\"></i>bloodbank@gmail.com</p>\n");
      out.write("                        <div class=\"d-flex pt-2\">\n");
      out.write("                            <a class=\"btn btn-square btn-outline-secondary rounded-circle me-1\" ><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                            <a class=\"btn btn-square btn-outline-secondary rounded-circle me-1\" ><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                            <a class=\"btn btn-square btn-outline-secondary rounded-circle me-1\" ><i class=\"fab fa-youtube\"></i></a>\n");
      out.write("                            <a class=\"btn btn-square btn-outline-secondary rounded-circle me-0\" ><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <h5 class=\"text-light mb-4\">Quick Links</h5>\n");
      out.write("                        <a class=\"btn btn-link\" href=\"adminhome.jsp\">Dashboard</a>\n");
      out.write("                        <a class=\"btn btn-link\" href=\"donors.jsp\">Donors</a>\n");
      out.write("                        <a class=\"btn btn-link\" href=\"receivers.jsp\">Receivers</a>\n");
      out.write("                        <a class=\"btn btn-link\" href=\"donorsrequests.jsp\">Donors Requests</a>\n");
      out.write("                        <a class=\"btn btn-link\" href=\"patientrequests.jsp\">Patient Requests</a>\n");
      out.write("                        <a class=\"btn btn-link\" href=\"bbhistory.jsp\">History</a>\n");
      out.write("                    </div>\n");
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
      out.write("                    <!-- <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <h5 class=\"text-light mb-4\">Newsletter</h5>\n");
      out.write("                        <p>Dolor amet sit justo amet elitr clita ipsum elitr est.</p>\n");
      out.write("                        <div class=\"position-relative mx-auto\" style=\"max-width: 400px;\">\n");
      out.write("                            <input class=\"form-control bg-transparent border-secondary w-100 py-3 ps-4 pe-5\" type=\"text\" placeholder=\"Your email\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-primary py-2 position-absolute top-0 end-0 mt-2 me-2\">SignUp</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div> -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container-fluid copyright\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 text-center text-md-start mb-3 mb-md-0\">\n");
      out.write("                            &copy; <a href=\"#\">Blood Bank Management Interface</a>, All Right Reserved.\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 text-center text-md-end\">\n");
      out.write("                            <!--/*** This template is free as long as you keep the footer author’s credit link/attribution link/backlink. If you'd like to use the template without the footer author’s credit link/attribution link/backlink, you can purchase the Credit Removal License from \"https://htmlcodex.com/credit-removal\". Thank you for your support. ***/-->\n");
      out.write("                            Designed By <a href=\"https://htmlcodex.com\">HTML Codex</a>\n");
      out.write("                            <br>Distributed By: <a class=\"border-bottom\" href=\"https://themewagon.com\"\n");
      out.write("                                                   target=\"_blank\">ThemeWagon</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Footer End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Back to Top -->\n");
      out.write("        <a href=\"#\" class=\"btn btn-lg btn-primary btn-lg-square rounded-circle back-to-top\"><i\n");
      out.write("                class=\"bi bi-arrow-up\"></i></a>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <!--My JS-->\n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            function onlyNumberKey(evt) {\n");
      out.write("                var ASCIICode = (evt.which) ? evt.which : evt.keyCode\n");
      out.write("                if (ASCIICode > 31 && (ASCIICode < 48 || ASCIICode > 57))\n");
      out.write("                    return false;\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function InvalidMsgAadhar(textbox) {\n");
      out.write("                if (textbox.validity.patternMismatch){\n");
      out.write("                    textbox.setCustomValidity\n");
      out.write("                        ('Please enter 12 digit Aadhar Number');\n");
      out.write("                } else {\n");
      out.write("                    textbox.setCustomValidity('');\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function InvalidMsgContact(textbox) {\n");
      out.write("                if (textbox.validity.patternMismatch){\n");
      out.write("                    textbox.setCustomValidity\n");
      out.write("                        ('Please enter 10 digit Mobile Number');\n");
      out.write("                } else {\n");
      out.write("                    textbox.setCustomValidity('');\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
      out.write("\n");
      out.write("        <!--Table JS-->\n");
      out.write("        <script src='//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.2/jquery.min.js'></script>\n");
      out.write("        <script src='//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js'></script>\n");
      out.write("        <script src=\"./script.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
