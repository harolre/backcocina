function elegirOpcion()
{
    var div=document.querySelector('input[name = "cocinero"]:checked').value;
    var cambio;
    if(div==="crearCocinero")
    {
        div = document.getElementById("crearCocinero");
        cambio=document.getElementById("modificarCocinero");
        cambio.style.display='none';
        cambio= document.getElementById("eliminarCocinero");
        cambio.style.display='none';
    }
    else if(div==="modificarCocinero")
    {
        div = document.getElementById("modificarCocinero");
        cambio=document.getElementById("crearCocinero");
        cambio.style.display='none';
        cambio= document.getElementById("eliminarCocinero");
        cambio.style.display='none';
    }
    else
    {
        div = document.getElementById("eliminarCocinero");
        cambio=document.getElementById("crearCocinero");
        cambio.style.display='none';
        cambio= document.getElementById("modificarCocinero");
        cambio.style.display='none';
    }
    div.style.display = 'block';
}