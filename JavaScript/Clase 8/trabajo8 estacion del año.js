//calcular estacion del año
let mes = 6;
let estacion;
if(mes == 1 || mes == 2 || mes == 12){
    estacion = "Verano";
}
else if(mes == 3 || mes == 4 || mes ==5){
    estacion = "otoño";
}
else if(mes == 6 || mes == 7 || mes == 8){
    estacion = "invierno";
}
else if(mes == 9 || mes == 10 || mes == 11){
    estacion = "primavera";
}
else{
    estacion = "valor incorrecto"
}
console.log("el valor correspónde a la estacion de: ",estacion);