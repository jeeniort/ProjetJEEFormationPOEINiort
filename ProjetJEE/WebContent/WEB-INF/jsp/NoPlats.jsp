<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nos plats</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

</head>
<body class="container">
	<div class="col-10">
<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner" onclick="AfficherDetail()">
    <div id="1111" class="carousel-item active" >
      <img class="d-block w-100"  src="<%=request.getContextPath()%>/image/burger_avocat_bacon.jpg" alt="First slide">
      <div class="carousel-caption d-none d-md-block">
    	<h5>Cake à la banane et pépites de chocolat</h5>
 	  </div>
    </div>
    <div id="2222" class="carousel-item">
      <img class="d-block w-100" src="<%=request.getContextPath()%>/image/cake_banane_chocolat.jpg" alt="Cake à la banane et pépites de chocolat">
      <div class="carousel-caption d-none d-md-block">
    	<h5>Cake à la banane et pépites de chocolat</h5>
 	  </div>
    </div>
    <div id="333" class="carousel-item">
      <img class="d-block w-100"  src="<%=request.getContextPath()%>/image/chiktaye_morue_guadeloupe.jpg" alt="Chiktaye de morue Guadeloupe">
      <div class="carousel-caption d-none d-md-block">
    	<h5>Chiktaye de morue Guadeloupe</h5>
 	  </div>
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
</div>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script type="text/javascript">
function AfficherDetail(){
	var elements = document.getElementsByClassName("active");

	var idElement = elements[1].id;
	console.log(idElement);
}
	
	// grace a l'id IDELEMENT
	// REquete Javascript pour recuperer les informations du plats
	// + RFecuperation de ses avis, note moyenne
	

</script>
</body>
</html>