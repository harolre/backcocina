function elegirOpcion()
{
    var div=document.querySelector('input[name = "receta"]:checked').value;
    var cambio;
    if(div==="crearReceta")
    {
        div = document.getElementById("crearReceta");
        cambio=document.getElementById("modificarReceta");
        cambio.style.display='none';
        cambio= document.getElementById("eliminarReceta");
        cambio.style.display='none';
    }
    else if(div==="modificarReceta")
    {
        div = document.getElementById("modificarReceta");
        cambio=document.getElementById("crearReceta");
        cambio.style.display='none';
        cambio= document.getElementById("modificarReceta");
        cambio.style.display='none';
    }
    else
    {
        div = document.getElementById("eliminarReceta");
        cambio=document.getElementById("crearReceta");
        cambio.style.display='none';
        cambio= document.getElementById("modificarReceta");
        cambio.style.display='none';
    }
    div.style.display = 'block';
}