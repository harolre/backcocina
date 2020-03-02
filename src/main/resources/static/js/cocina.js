function elegirOpcion()
{
    var div=document.querySelector('input[name = "cocina"]:checked').value;
    var cambio;
    if(div==="crearCocina")
    {
        div = document.getElementById("crearCocina");
        cambio=document.getElementById("modificarCocina");
        cambio.style.display='none';
        cambio= document.getElementById("eliminarCocina");
        cambio.style.display='none';
    }
    else if(div==="modificarCocina")
    {
        div = document.getElementById("modificarCocina");
        cambio=document.getElementById("crearCocina");
        cambio.style.display='none';
        cambio= document.getElementById("eliminarCocina");
        cambio.style.display='none';
    }
    else
    {
        div = document.getElementById("eliminarCocina");
        cambio=document.getElementById("crearCocina");
        cambio.style.display='none';
        cambio= document.getElementById("modificarCocina");
        cambio.style.display='none';
    }
    div.style.display = 'block';
}