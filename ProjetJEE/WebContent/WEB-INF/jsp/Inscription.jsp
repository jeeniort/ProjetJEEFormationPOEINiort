<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="entete.jsp"%>
<h1>Inscription</h1>
<form>
  <div class="form-group">
    <label for="nom">Nom</label>
    <input type="text" class="form-control" id="nom" placeholder="Nom" required>
  </div>
  <br>
  <div class="form-group">
    <label for="prenom">Prénom</label>
    <input type="text" class="form-control" id="prenom" placeholder="Prénom" required>
  </div>
  <br>
  <div class="form-group">
    <label for="prenom">Email</label>
    <input type="text" class="form-control" id="email" placeholder="email" required>
  </div>
  <br>
   <div class="form-group">
    <label for="exampleInputPassword1">Mot de passe</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Mot de passe">
  </div>
  <br>
   <div class="form-group">
    <label for="exampleInputPassword1">Confirmation Mot de passe</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Confirmer Mot de passe">
  </div>
 
  
 <p> <tr><button class="btn" type="submit">Envoyer</button></tr></p>
 <br>
 
          <textarea cols="40" rows="5" class="form-control" aria-label="With textarea" placeholder="Ajouter un commentaire svp"></textarea>
          
  </div>
</form>
<%@ include file="piedDePage.html"%>

</body>
</html>