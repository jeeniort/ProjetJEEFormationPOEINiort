<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="entete.jsp"%>
	<div class="container-fluid">
		<div class="row">
			<div class="col-10 offset-1">
				<h1>Mon Compte</h1>
				<div class="row">	
				<form action="/ServletdeConnexion" method="post">
					<div class="form-group">
						<label for="nom">Changer email</label> <input type="email"
							class="form-control" id="Mail" name ="Mail"
							placeholder="${sessionScope.utilisateur.email}" required>
					</div>
					<div class="form-group">
						<label for="nom">Ancien mot de passe</label> <input type="password"
							class="form-control" id="AncienMotdePasse" name="AncienMotdePasse"
							placeholder="Entrez l'ancien mot de passe svp" required>
					</div>
					<div class="form-group">
						<label for="nom">Nouveau mot de passe</label> <input type="password"
							class="form-control" id="NouveauMotdePasse" name="NouveauMotdePasse"
							placeholder="Entrez le nouveau mot de passe svp" required>
					</div>
					<div class="form-group">
						<label for="nom">Confirmation nouveau mot de passe</label> <input
							type="password" class="form-control" id="confirmationNouveauMotdePasse"  name="confirmationNouveauMotdePasse"
							placeholder="Entrez le nouveau mot de passe svp" required>
					</div>
					<p>
						<input type="submit" class="btn btn-primary"
							style="margin-left: 450px" />
					</p>
				</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>