
$('document').ready(function(){
	$('table #editButton').on('click', function(event){
		event.preventDefault();
		
	/*	countries/findById/?id=1
		attr mean attribute
		*/
		
		//update country
		var href = $(this).attr('href');
		$.get(href, function(country, status){
			$('#idEdit').val(country.id);
			$('#descriptionEdit').val(country.description);
			$('#capitalEdit').val(country.capital);
			$('#codeEdit').val(country.code);
			$('#continentEdit').val(country.continent);
			$('#nationalityEdit').val(country.nationality);
			
		});
		$('#editModal').modal();
	});
	
	//DELETE COUNTRY
		$('table #deleteButton').on('click', function(event){
		event.preventDefault();
		
		var href= $(this).attr('href');
		
		$('#confirmDeleteButton').attr('href', href);
		
		$('#deleteModal').modal();
	});
});