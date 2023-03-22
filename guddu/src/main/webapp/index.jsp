<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home</title>
    <!-- bootstrap icon -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
    <link rel="stylesheet" href="./portfolio/assets/css/line-awesome.min.css">
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  </head>
  <body>
     <nav class="navbar navbar-expand-lg navbar-dark bg-dark sticky-top" id="top_nav">
        <div class="container-fluid">
          <a class="navbar-brand ml-0" href="#">
            <img src="./images/icons8-india-488.png" alt="" class="img-fluid">
          </a>
          <span class="navbar-toggler border border-0"><h3 style="color: chartreuse;">GUDDU KUMAR SINGH</h3></span>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse " id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0 ">
              <li class="nav-item">
                <a class="nav-link active " aria-current="page" href="./home/#">HOME</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="./portfolio.jsp">PORTFOLIO</a>
              </li>
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                 SERVICES
                </a>
                <ul class="dropdown-menu">
                  <li><a class="dropdown-item" href="#">Software Development</a></li>
                  <li><a class="dropdown-item" href="#">Web Development</a></li>
          
                  <li><a class="dropdown-item" href="#">UI/UX Designing</a></li>
                </ul>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="./contact/">CONTACT</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="./about/about.html">ABOUT</a>
              </li>
            </ul>
            <form class="d-flex" role="search">
              <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
              <button class="btn btn-outline-primary" type="submit">Search</button>
            </form>
          </div>
        </div>
      </nav>

      <!-- 2..carousel -->
      <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="false">
        <div class="carousel-indicators">
          <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
          <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
          <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
        </div>
        <div class="carousel-inner">
          <div class="carousel-item active">
            <img src="./images/ui.jpg" class="d-block w-100" alt="...">
            <div class="carousel-caption d-none d-md-block">
              <h3 style="text-shadow: 0px 0px 2px#2a2929;color: #ff0048;">UI/UX Designing</h3>
              <p style="background: #000000;">If we want users to like our software, we should design it to behave like a likeable person: respectful, generous and helpful.</p>
            </div>
          </div>
          <div class="carousel-item">
            <img src="./images/sof.jpg" class="d-block w-100" alt="...">
            <div class="carousel-caption d-none d-md-block">
              <h3 style="text-shadow: 0px 0px 2px#2a2929;color: #ff0048;">Software Development</h3>
              <p style="background: #1e1e1e;">Providing the simplest solution for the most complex problem, We try best, and we make sure we deliver best.</p>
            </div>
          </div>
          <div class="carousel-item">
            <img src="./images/web.jpg" class="d-block w-100" alt="...">
            <div class="carousel-caption d-none d-md-block">
              <h3 style="text-shadow: 0px 0px 2px#2a2929;color: #ff0048;">Web Development</h3>
              <p style="background: #1f1f1f;">Take your business to the next level with our web design company. We are here to help you achieve greatness through your website..</p>
            </div>
          </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Next</span>
        </button>
      </div>
<!-- courcel end -->
<marquee behavior="" direction="" style="color: #ff0048; margin-top: 10px"><h3>WELCOME TO MY WEBSITE. This website is currently under maintenance</h3></marquee>
    <!-- 3.. tagline -->
   <div class="container-fluid">
      <div class="row">
          <div class="col-12">
            <h3 class="display-6 text-center mt-2 mb-2">“If you want people to take your advice, you need to solve more problems than you create.” <br>GUDDU KUMAR SINGH</h3>
          </div>
      </div> 
   

    <!-- 4.feature -->
   <div class="row justify-content-evenly pt-3 pb-3">
       <div class="col-md-3 text-center mt-5">
         <h1><i class="bi bi-file-earmark-easel text-primary"></i></h1>
         <h5>Built for UI/UX Designing</h5>
         <p>As a designer, it’s important to think beyond apps and websites. Even if you’re working primarily in the digital space, remember that you’re literally surrounded by design. From architecture to fashion, right down to the simplest everyday objects like a hairbrush or toothbrush, virtually everything has been designed for human use. Design really is everywhere, so take inspiration from your surroundings.</p>
       </div>
      <div class="col-md-3 text-center mt-5">
         <h1> <i class="bi bi-file-earmark-code text-danger"></i></h1>
         <h5>Built for Software Development</h5>
         <p>Software developers are the creative, brainstorming masterminds behind computer programs of all sorts. While some software developers may focus on a specific program or app, others create giant networks or underlying systems that help trigger and power other programs. This is why there are two main classifications of developers: applications software developers and systems software developers.</p>
      </div>
      <div class="col-md-3 text-center mt-5">
          <h1><i class="bi bi-file-code text-success"></i></h1>
          <h5>Built for Web Development</h5>
          <p>Solves complex problems while creating some of the most advanced applications in the industry. Communicates with other front-end developers within the company on best practices, new technologies. Excellent knowledge of JavaScript/TypeScript, HTML and CSS. Provides mentorship and supervise developers. Guides technical teams to deliver flexible and scalable solutions. 
          </p>
      </div>
   </div>
  <!-- footer -->
   <hr>

   <!-- growth -->
  <div class="row justify-content-evenly pt-3 pb-5">
     <div class="col-md-5 pt-3">
      <img src="./images/0x0.jpg" class="img-fluid" alt="">
     </div>

     <div class="col-md-5 pt-3">
        <h5 class="mt-3">UI/UX Designing</h5>
        <div class="progress">
          <div class="progress-bar progress-bar-striped" role="progressbar" aria-label="Default striped example" style="width: 85%" aria-valuenow="10" aria-valuemin="0" aria-valuemax="100"></div>
        </div>

        <h5 class="mt-3">Software Development</h5>
        <div class="progress">
          <div class="progress-bar progress-bar-striped bg-success" role="progressbar" aria-label="Success striped example" style="width: 70%" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
        </div>

        <h5 class="mt-3">Web Development</h5>
        <div class="progress">
          <div class="progress-bar progress-bar-striped bg-info" role="progressbar" aria-label="Info striped example" style="width: 80%" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"></div>
        </div>

        <h5 class="mt-3">SEO</h5>
        <div class="progress">
          <div class="progress-bar progress-bar-striped bg-warning" role="progressbar" aria-label="Warning striped example" style="width: 75%" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100"></div>
        </div>

        <h5 class="mt-3">Marketing</h5>
        <div class="progress">
          <div class="progress-bar progress-bar-striped bg-danger" role="progressbar" aria-label="Danger striped example" style="width: 90%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
        </div>
     </div>
  </div>

<!-- contact -->
<div class="row justify-content-evenly pt-2 pb-5" style="background-color: #f1f1f1;">
  <div class="col-md-5 mt-5">
    <h3 class="mb-4">Contact Form</h3>
    <form>
      <div class="mb-3">
        <label for="name" class="form-label">Full Name</label>
        <input type="text" class="form-control" id="name" aria-describedby="emailHelp">
      </div>
      <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Email Address</label>
        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
        <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
      </div>

      <div class="mb-3">
        <label for="exampleFormControlTextarea1" class="form-label">Message</label>
        <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
      </div>
      <button type="submit" class="btn btn-primary">Submit</button>
    </form>
  </div>

  <div class="col-md-5 mt-5">
    <h3 class="mb-4">Address</h3>
    <p>wakad pune, Maharashtra<br>
    India-411033 <br>
    <i class="bi bi-telephone"></i> <label for="text">8360294684</label> <br> <i class="bi bi-envelope-at"></i> <a class="text-decoration-none" href="https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox?compose=new">guddu31711@gmail.com</a> <br> <i class="bi bi-globe"></i><a class="text-decoration-none" href="https://www.learnwithguddu.com/"> www.learnwithguddu.com</a></p>
    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d30251.738060722186!2d73.7436412821143!3d18.59804176603198!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bc2b97aaf571bed%3A0xc67346ba5a76673!2sWakad%2C%20Pimpri-Chinchwad%2C%20Maharashtra!5e0!3m2!1sen!2sin!4v1675891055878!5m2!1sen!2sin" style="width:100%;" height="250" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
  </div>
</div>

   <!-- faq -->
  <div class="row justify-content-evenly pt-5 pb-5">
     <div class="col-md-10">
      <h3 class="text-center pb-4">FAQ</h3>
      <div class="accordion accordion-flush border" id="accordionFlushExample">
        <div class="accordion-item">
          <h2 class="accordion-header" id="flush-headingOne">
            <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseOne" aria-expanded="false" aria-controls="flush-collapseOne">
              Accordion Item #1
            </button>
          </h2>
          <div id="flush-collapseOne" class="accordion-collapse collapse" aria-labelledby="flush-headingOne" data-bs-parent="#accordionFlushExample">
            <div class="accordion-body">Placeholder content for this accordion, which is intended to demonstrate the <code>.accordion-flush</code> class. This is the first item's accordion body.</div>
          </div>
        </div>
        <div class="accordion-item">
          <h2 class="accordion-header" id="flush-headingTwo">
            <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseTwo" aria-expanded="false" aria-controls="flush-collapseTwo">
              Accordion Item #2
            </button>
          </h2>
          <div id="flush-collapseTwo" class="accordion-collapse collapse" aria-labelledby="flush-headingTwo" data-bs-parent="#accordionFlushExample">
            <div class="accordion-body">Placeholder content for this accordion, which is intended to demonstrate the <code>.accordion-flush</code> class. This is the second item's accordion body. Let's imagine this being filled with some actual content.</div>
          </div>
        </div>
        <div class="accordion-item">
          <h2 class="accordion-header" id="flush-headingThree">
            <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseThree" aria-expanded="false" aria-controls="flush-collapseThree">
              Accordion Item #3
            </button>
          </h2>
          <div id="flush-collapseThree" class="accordion-collapse collapse" aria-labelledby="flush-headingThree" data-bs-parent="#accordionFlushExample">
            <div class="accordion-body">Placeholder content for this accordion, which is intended to demonstrate the <code>.accordion-flush</code> class. This is the third item's accordion body. Nothing more exciting happening here in terms of content, but just filling up the space to make it look, at least at first glance, a bit more representative of how this would look in a real-world application.</div>
          </div>
        </div>
      </div>
     </div>
   </div> 

   <!-- footer -->
  <div class="row justify-content-evenly bg-dark text-white pt-2 pb-3 text-center">
      <div class="col-md-3 pt-3">
         <h5 class="pb-2">LearnWithGuddu</h5>
         <p>
          Talk with an <br> admissions advisor today. <br> Fill out the <br> form to receive <br> information about
         </p>
      </div>

      <div class="col-md-3 pt-4">
         <h5 class="pb-2">Impotant Links</h5>
         <p>
          <a href="#" class="link-light text-decoration-none">Home</a><br>
          <a href="#" class="link-light text-decoration-none">About Us</a><br>
          <a href="#" class="link-light text-decoration-none">Contact Us</a><br>
          <a href="#" class="link-light text-decoration-none">Our Team</a><br>
          <a href="#" class="link-light text-decoration-none">Our Client</a><br>
         </p>
    </div>
      
      <div class="col-md-3 pt-4">
        <h5 class="pb-2">Contact Us</h5>
        <p>wakad pune, Maharashtra<br>
          India-411033 <br>
          <i class="bi bi-telephone"></i> <label for="text">8360294684</label> <br> <i class="bi bi-envelope-at"></i> <a class="text-decoration-none" href="https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox?compose=new">guddu31711@gmail.com</a> <br> <i class="bi bi-globe"></i><a class="text-decoration-none" href="https://www.learnwithguddu.com/"> www.learnwithguddu.com</a></p>
      </div>

      <div class="col-md-3 pt-4 text-center">
          <h5 class="pb-2">Social media</h5>
          <div class="social-icons text-center">
            <a class="text-decoration-none" href="https://www.linkedin.com/in/guddu-kumar-singh" target="blank"><i class="lab la-linkedin"></i> Linkedin</a><br>
            <a class="text-decoration-none" href="https://www.learnwithguddu.com" target="blank"><i class="lab la-dribbble"></i> Website</a><br>
            <a class="text-decoration-none" href="https://github.com/guddu31" target="blank"><i class="lab la-github"></i> GitHub</a><br>
            <a class="text-decoration-none" href="https://www.youtube.com/channel/UCuMg0UI8255y0V6hCLGqTEg" target="blank"><i class="lab la-youtube"></i>YouTube</a><br>
            <a class="text-decoration-none" href="https://www.instagram.com/guddu_kumar_singh2" target="blank"><i class="lab la-instagram"></i>Instagram</a>
        </div>
      </div>
  </div>

  <!-- copyright -->
   <div class="row bg-secondary text-white text-center p-2">
    <div class="col-12 text-center">
      <p>
        Copyright 2023 by LearnWithGuddu. All Right Reserved.
      </p>
    </div>
   </div>


<!-- container end -->
 </div> 


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
  </body>
</html>