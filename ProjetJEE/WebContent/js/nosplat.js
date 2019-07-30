	let idAffiche = -1;
		function AfficherDetail(idPlat) {			
			$.getJSON("rest/plats/"+idPlat, function(data){
				if(idAffiche != -1)
					{
						$("#PlatCarousel").empty();
					}
				if(data.id != 0 && idAffiche != data.id)
					{
						$("#PlatCarousel").empty();
						idAffiche = data.id;
						ajouterBaliseDetailPlat(data);
					}
				else
					{
					idAffiche = -1;
					}
			});
			$.getJSON("rest/plats/"+idPlat+"/commentaire", function(data){
				if(data.length > 0)
					{					
						ajouterBaliseCom(data);
					}
			});
		}
		
		
		function ajouterBaliseDetailPlat(data) {
			var listIngredientHTML = "";
			var listIngredientTab = data.listIngredient.split('&&');
	

		    for(var i=0;i<listIngredientTab.length;i++)
		    	{
		    	listIngredientHTML = listIngredientHTML + '	<div class="col-12">'  +listIngredientTab[i] + '</div>';
		    	}
		   
			
			
			var newContent = '<div class="col-md-12 note" id="card' + data.id + '">' +
			'	<div class="card">' +
			'	<div class="card-header">' +
			'	<h3><u>' + data.nom + '</u></h3>' +
			'	<div class="col-12">'  + data.presentation + '</div>' +
			'	<div class="col-10">Niveau '  + data.niveau + ' et '+data.cout + '. Pour '  + data.nbConvive + ' personnes.</div>' +
			'	<p><u>Prix restaurant : ' + data.prix +' euros</u></p>' +
			'	</div>' +
			'	<div class="card-body">' +
				listIngredientHTML +
			'	</div>' +
			'	<div class="card-footer">' +
			'	</div>' +
			'	</div>' +
			'</div>';
			$("#PlatCarousel").append(newContent);
			}
		
		
		function ajouterBaliseCom(data) {
			var newCommentairecontent = '<div class="row">' +
			'<div class"col-12"><h3><u id="NoteAvg" class="NoteAvg"> Moyenne : </u></h3></div>';
			var sumNote = 0;
			console.log(data.length);
			   for(var j=0;j<data.length;j++)
		    	{
				   sumNote += data[j].note;
				   console.log (sumNote);
				   var newCommentairecontent = '<div class="col-md-12 note" id="card' + data[j].id + '">' +
					'	<div class="card">' +
					'	<div class="card-header">' +
					 //'	<div class="col-5">' + data[i].utilsateur.nom + '</div>' +
					'	<div class="col-2">'  + data[j].note + '</div>' +
					'	</div>' +
					'	<div class="card-body">' +
					data[j].commentaire +
					'	</div>' +
					'	<div class="card-footer">' +
					'	</div>' +
					'	</div>' +
					'</div>';
		    	}
			   
			   
			   var newCommentairecontent =  newCommentairecontent+'</div>';
			   let avg = sumNote/data.length;
			   console.log(avg);
			   $("#NoteAvg").append(avg);
				$("#CommentaireCarousel").append(newCommentairecontent);

			   
			}