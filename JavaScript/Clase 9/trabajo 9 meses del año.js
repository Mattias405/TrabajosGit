//evitar repetir el codigo
let meses = 6
switch(meses) {
    case 1:
        console.log("hoy es enero")
        break;
    case 2:
        console.log("hoy es febrero")
        break;
    case 3:
        console.log("hoy es marzo")
        break;
    case 4:
        console.log("hoy es abril")
        break;
    case 5:
        console.log("hoy es mayo")
        break;
    case 6:
        console.log("hoy es junio")
        break;
    case 7:
        console.log("hoy es julio")
        break;
    case 8:
        console.log("hoy es agosto")
        break;
    case 9:
        console.log("hoy es septiembre")
        break;
    case 10:
        console.log("hoy es octubre")
        break;
    case 11:
        console.log("hoy es noviembre")
        break;
    case 12:
        console.log("hoy es diciembre")
        break;
    default:
        console.log("error al ingresar numero del mes")
        break;

}
//opcion mejorada

let meses = ["enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"]
function getDay(n){
    if(n < 1 || n > 12){
        throw new Error("out of range");
    }
    return meses[n-1]
}
console.log(getDay(6));