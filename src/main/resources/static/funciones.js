function eliminar(codigoS){
	swal({
  title: "Estas seguro de eliminar?",
  text: "¡Una vez eliminado, no podrás recuperarlo!",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((OK) => {
  if (OK) {
	  $.ajax({
		  url:"/eliminar/"+codigoS,succes : function(res){
			  console.log(res);
		  }
	  });
    swal("¡Supervisor eliminado correctamente!", {
      icon: "success",
    }).then((ok)=>
    {
		if(ok){
			location.href="/listar";
		}
	});
  } else {
    swal("Eliminacion cancelada!");
  }
});
	
	
	
	
}