<%-- 
    Document   : request
    Created on : Mar 9, 2024, 9:20:12 PM
    Author     : Vikas Raghuvanshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Request Blood</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="keywords">
    <meta content="" name="description">

    <!-- Favicon -->
    <link href="img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;500;600;700&display=swap" rel="stylesheet">

    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="lib/animate/animate.min.css" rel="stylesheet">
    <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
    <link href="lib/lightbox/css/lightbox.min.css" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Template Stylesheet -->
    <link href="css/style.css" rel="stylesheet">
</head>

<body>
    <!-- Spinner Start -->
    <div id="spinner" class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
        <div class="spinner-border position-relative text-primary" style="width: 6rem; height: 6rem;" role="status"></div>
        <img src="img/drop2.png" class="text-primary position-absolute top-50 start-50 translate-middle" alt="" width="35px"></img>
    </div>
    <!-- Spinner End -->


    <!-- Topbar Start -->
<!--    <div class="container-fluid bg-light px-0 wow fadeIn" data-wow-delay="0.1s">
        <div class="row gx-0 align-items-center d-none d-lg-flex">
            <div class="col-lg-6 px-5 text-start">
                <ol class="breadcrumb mb-0">
                    <li class="breadcrumb-item"><a class="small text-secondary" href="#">Home</a></li>
                    <li class="breadcrumb-item"><a class="small text-secondary" href="#">Career</a></li>
                    <li class="breadcrumb-item"><a class="small text-secondary" href="#">Terms</a></li>
                    <li class="breadcrumb-item"><a class="small text-secondary" href="#">Privacy</a></li>
                </ol>
            </div>
            <div class="col-lg-6 px-5 text-end">
                <small>Follow us:</small>
                <div class="h-100 d-inline-flex align-items-center">
                    <a class="btn-square text-primary border-end rounded-0" href=""><i class="fab fa-facebook-f"></i></a>
                    <a class="btn-square text-primary border-end rounded-0" href=""><i class="fab fa-twitter"></i></a>
                    <a class="btn-square text-primary border-end rounded-0" href=""><i class="fab fa-linkedin-in"></i></a>
                    <a class="btn-square text-primary pe-0" href=""><i class="fab fa-instagram"></i></a>
                </div>
            </div>
        </div>
    </div>  -->
    <!-- Topbar End -->


    <!-- Brand & Contact Start -->
    <div class="container-fluid py-4 px-5 wow fadeIn" data-wow-delay="0.1s">
        <div class="row align-items-center top-bar">
            <div class="col-lg-4 col-md-12 text-center text-lg-start">
                <a href="" class="navbar-brand m-0 p-0">
                    <h1 class="fw-bold text-primary m-0"><img src="img/drop2.png" alt="" width="35px"></img>Blood Bank</h1>
                    <!-- <img src="img/logo.png" alt="Logo"> -->
                </a>
            </div>
            <div class="col-lg-8 col-md-7 d-none d-lg-block">
                <div class="row">
                    <div class="col-4">
                        <div class="d-flex align-items-center justify-content-end">
                            <div class="flex-shrink-0 btn-lg-square border rounded-circle">
                                <i class="far fa-clock text-primary"></i>
                            </div>
                            <div class="ps-3">
                                <p class="mb-2">Opening Hour</p>
                                <h6 class="mb-0">Mon - Fri, 8:00 - 9:00</h6>
                            </div>
                        </div>
                    </div>
                    <div class="col-4">
                        <div class="d-flex align-items-center justify-content-end">
                            <div class="flex-shrink-0 btn-lg-square border rounded-circle">
                                <i class="fa fa-phone text-primary"></i>
                            </div>
                            <div class="ps-3">
                                <p class="mb-2">Call Us</p>
                                <h6 class="mb-0">+91 98765 4321</h6>
                            </div>
                        </div>
                    </div>
                    <div class="col-4">
                        <div class="d-flex align-items-center justify-content-end">
                            <div class="flex-shrink-0 btn-lg-square border rounded-circle">
                                <i class="far fa-envelope text-primary"></i>
                            </div>
                            <div class="ps-3">
                                <p class="mb-2">Email Us</p>
                                <h6 class="mb-0">bloodbank@gmail.com</h6>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Brand & Contact End -->


    <!-- Navbar Start -->
        <nav class="navbar navbar-expand-lg bg-primary navbar-dark sticky-top py-lg-0 px-lg-5 wow fadeIn"
             data-wow-delay="0.1s">
            <a href="#" class="navbar-brand ms-3 d-lg-none">MENU</a>
            <button type="button" class="navbar-toggler me-3" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarCollapse">
                <div class="navbar-nav me-auto p-3 p-lg-0">
                    <a href="webhome.jsp" class="nav-item nav-link">Home</a>
                    <a href="donate.jsp" class="nav-item nav-link active">Donate</a><!-- About Us -->
                    <a href="request.jsp" class="nav-item nav-link">Request</a><!-- Services -->
<!--                    <a href="process.jsp" class="nav-item nav-link">Team</a>-->
                    <!-- <div class="nav-item dropdown">
                        <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Requests</a>
                        <div class="dropdown-menu border-0 rounded-0 rounded-bottom m-0">
                            <a href="donorsrequests.html" class="dropdown-item">Donors</a>
                            <a href="patientrequests.html" class="dropdown-item">Patients</a>
                        </div>
                    </div> -->
                    <a href="contact.jsp" class="nav-item nav-link">Contact Us</a>
                </div>
                <a href="login.jsp" class="btn btn-sm btn-light rounded-pill py-2 px-4 d-none d-lg-block">Log In</a>
            </div>
        </nav>

    <!-- Navbar End -->

    <%
        String c = (String)request.getAttribute("patientregistrationfailed");
        if(c != null){
            %>
                <div class="alert alert-danger alert-dismissible show wow fadeIn mb-0" data-wow-delay="0.1s" role="alert">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<strong>Registration Failed!</strong> Details Mismatch or User already registered.
                        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                </div>
            <%
        }
    %>

    <!-- Page Header Start -->
    <div class="container-fluid page-header py-5 mb-5 wow fadeIn" data-wow-delay="0.1s">
        <div class="container text-center py-5">
            <h1 class="display-4 text-white animated slideInDown mb-3">Request</h1>
            <nav aria-label="breadcrumb animated slideInDown">
                <ol class="breadcrumb justify-content-center mb-0">
                    <li class="breadcrumb-item"><a class="text-white" href="#">Home</a></li>
                    <li class="breadcrumb-item"><a class="text-white" href="#">Pages</a></li>
                    <li class="breadcrumb-item text-primary active" aria-current="page">Request</li>
                </ol>
            </nav>
        </div>
    </div>
    <!-- Page Header End -->

    
<!-- To register Start -->
        <div class="container-xxl py-5">
            <div class="container">
                <div class="text-center mx-auto mb-3 wow fadeInUp" data-wow-delay="0.1s" style="max-width: 600px;">
                    <h6 class="section-title bg-white text-center text-primary px-3">Form</h6>
                    <h1 class="display-6 mb-4">Fill the form to request for blood</h1>
                </div>
                <div class="row g-0 justify-content-center">
                    <div class="col-lg-8 wow fadeInUp" data-wow-delay="0.5s">
                        <form action="RequestBloodChecker" method="post">
                            <div class="row g-3">
                                <div class="col-md-6">
                                    <div class="form-floating">
                                        <input type="text" pattern="[0-9]{12}" oninvalid="InvalidMsgAadhar(this);" maxlength="12" onkeypress="return onlyNumberKey(event)" name="aadhaar" oninput="InvalidMsgAadhar(this);" class="form-control" id="aadhar" placeholder="Enter Aadhar" required />
                                        <label for="aadhar">Enter Aadhar</label>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-floating">
                                        <input type="text" name="username" class="form-control"  id="name" placeholder="Enter Name" required>
                                        <label for="name">Enter Name</label>
                                    </div>
                                </div>
                                <div class="col-12">
                                    <div class="form-floating">
                                        <input type="number" name="age" class="form-control" id="age" placeholder="Age" max="100" min="1" oninvalid="this.setCustomValidity('Please enter age between 1-150.')" oninput="this.setCustomValidity('')" required>
                                        <label for="age">Age </label>
                                    </div>
                                </div>
                                <div class="col-12">
                                    <div class="form-floating">
                                        <select name="gender" class="form-control" id="gender">
                                            <option value="Male">Male
                                            </option>
                                            <option value="Female">Female
                                            </option>
                                        </select>
                                        <label for="gender">Gender</label>
                                    </div>
                                </div>
                                <div class="col-12">
                                    <div class="form-floating">
                                        <select name="bgroup" class="form-control" id="bgroup">
                                            <option value="O+">O+
                                            </option>
                                            <option value="O-">O-
                                            </option>
                                            <option value="A+">A+
                                            </option>
                                            <option value="A-">A-
                                            </option>
                                            <option value="B+">B+
                                            </option>
                                            <option value="B-">B-
                                            </option>
                                            <option value="AB+">AB+
                                            </option>
                                            <option value="AB-">AB-
                                            </option>
                                        </select>
                                        <label for="bgroup">Blood Group</label>
                                    </div>
                                </div>
                                <div class="col-12">
                                    <div class="form-floating">
                                        <input type="text" name="address" class="form-control" id="address" maxlength="25" placeholder="Address" required>
                                        <label for="address">Address</label>
                                    </div>
                                </div>
                                <div class="col-12">
                                    <div class="form-floating">
                                        <input type="text" pattern="[0-9]{10}" oninvalid="InvalidMsgContact(this);" maxlength="10" onkeypress="return onlyNumberKey(event)" name="contact" oninput="InvalidMsgContact(this);" class="form-control" id="contact" placeholder="Contact" required />
                                        <label for="contact">Contact</label>
                                    </div>
                                </div>
                                <div class="col-12">
                                    <div class="form-floating">
                                        <input type="number" name="units" class="form-control" id="units" placeholder="Units" max="100" min="1" oninvalid="this.setCustomValidity('Please enter units between 1-100.')" oninput="this.setCustomValidity('')" required>
                                        <label for="units">Units Required</label>
                                    </div>
                                </div>
                                <div class="col-12 text-center">
                                    <input class="btn btn-primary rounded-pill py-3 px-5 mx-1" type="submit" value="Request">
                                    <button class="btn btn-primary rounded-pill py-3 px-5 mx-1" type="reset">Reset</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- To register End -->
    

  
        <!-- Footer Start -->
        <div class="container-fluid bg-dark text-body footer mt-5 pt-5 wow fadeIn" data-wow-delay="0.1s">
            <div class="container py-5">
                <div class="row g-5">
                    <div class="col-lg-4 col-md-6">
                        <h5 class="text-light mb-4">Address</h5>
                        <p class="mb-2"><i class="fa fa-map-marker-alt me-3"></i>Choudhary Complex, Rau</p>
                        <p class="mb-2"><i class="fa fa-phone-alt me-3"></i>+91 98765 4321</p>
                        <p class="mb-2"><i class="fa fa-envelope me-3"></i>bloodbank@gmail.com</p>
                        <div class="d-flex pt-2">
                            <a class="btn btn-square btn-outline-secondary rounded-circle me-1" ><i class="fab fa-twitter"></i></a>
                            <a class="btn btn-square btn-outline-secondary rounded-circle me-1" ><i class="fab fa-facebook-f"></i></a>
                            <a class="btn btn-square btn-outline-secondary rounded-circle me-1" ><i class="fab fa-youtube"></i></a>
                            <a class="btn btn-square btn-outline-secondary rounded-circle me-0" ><i class="fab fa-linkedin-in"></i></a>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <h5 class="text-light mb-4">Quick Links</h5>
                        <a class="btn btn-link" href="webhome.jsp">Home</a>
                        <a class="btn btn-link" href="donate.jsp">Donate</a>
                        <a class="btn btn-link" href="request.jsp">Request</a>
<!--                        <a class="btn btn-link" href="process.jsp">Team</a>-->
                        <a class="btn btn-link" href="login.jsp">Administrator Login</a>
                    </div>
<!--                    <div class="col-lg-5 col-md-">
                        <h5 class="text-light mb-4">Gallery</h5>
                        <div class="row g-2">
                            <div class="col-4">
                                <img class="img-fluid rounded" src="img/g1.jpg" alt="Image">
                            </div>
                            <div class="col-4">
                                <img class="img-fluid rounded" src="img/g2.jpg" alt="Image">
                            </div>
                            <div class="col-4">
                                <img class="img-fluid rounded" src="img/g3.jpg" alt="Image">
                            </div>
                            <div class="col-4">
                                <img class="img-fluid rounded" src="img/g4.jpg" alt="Image">
                            </div>
                            <div class="col-4">
                                <img class="img-fluid rounded" src="img/g5.jpg" alt="Image">
                            </div>
                            <div class="col-4">
                                <img class="img-fluid rounded" src="img/g6.jpg" alt="Image">
                            </div>
                        </div>
                    </div>-->
                 
                </div>
            </div>
<!--            <div class="container-fluid copyright">
                <div class="container">
                    <div class="row">
                        <div class="col-md-6 text-center text-md-start mb-3 mb-md-0">
                            &copy; <a href="#">Blood Bank Management Interface</a>, All Right Reserved.
                        </div>
                        <div class="col-md-6 text-center text-md-end">
                            /*** This template is free as long as you keep the footer author’s credit link/attribution link/backlink. If you'd like to use the template without the footer author’s credit link/attribution link/backlink, you can purchase the Credit Removal License from "https://htmlcodex.com/credit-removal". Thank you for your support. ***/
                            Designed By <a href="https://htmlcodex.com">HTML Codex</a>
                            <br>Distributed By: <a class="border-bottom" href="https://themewagon.com"
                                                   target="_blank">ThemeWagon</a>
                        </div>
                    </div>
                </div>
            </div>-->
        </div>
        <!-- Footer End -->


    <!-- Back to Top -->
    <a href="#" class="btn btn-lg btn-primary btn-lg-square rounded-circle back-to-top"><i class="bi bi-arrow-up"></i></a>


    <!--My JS-->
    <script>
    function onlyNumberKey(evt) {
                var ASCIICode = (evt.which) ? evt.which : evt.keyCode
                if (ASCIICode > 31 && (ASCIICode < 48 || ASCIICode > 57))
                    return false;
                return true;
            }
            
            function InvalidMsgAadhar(textbox) {
                if (textbox.validity.patternMismatch){
                    textbox.setCustomValidity
                        ('Please enter 12 digit Aadhar Number');
                } else {
                    textbox.setCustomValidity('');
                }
                return true;
            }
            
            function InvalidMsgContact(textbox) {
                if (textbox.validity.patternMismatch){
                    textbox.setCustomValidity
                        ('Please enter 10 digit Mobile Number');
                } else {
                    textbox.setCustomValidity('');
                }
                return true;
            }
     </script>
    
    
    <!-- JavaScript Libraries -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="lib/wow/wow.min.js"></script>
    <script src="lib/easing/easing.min.js"></script>
    <script src="lib/waypoints/waypoints.min.js"></script>
    <script src="lib/counterup/counterup.min.js"></script>
    <script src="lib/owlcarousel/owl.carousel.min.js"></script>
    <script src="lib/lightbox/js/lightbox.min.js"></script>

    <!-- Template Javascript -->
    <script src="js/main.js"></script>
</body>

</html>
