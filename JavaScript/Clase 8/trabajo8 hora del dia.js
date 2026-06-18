//hora del dia
let horaDia = 12
let mensaje;
if(horaDia >= 6 && horaDia <= 11){
    mensaje = "good moning"
}
else if(horaDia >= 12 && horaDia <= 16){
    mensaje = "good afternoom"
}
else if(horaDia >= 17 && horaDia <= 19){
    mensaje = "good evening"
}
else if(horaDia >= 20 && horaDia <= 23){
    mensaje = "good night"
}
else{
    mensaje = "valor incorrecto"
}