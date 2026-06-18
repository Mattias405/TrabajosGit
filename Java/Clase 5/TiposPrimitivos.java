public class TiposPrimitivos {

    public static void main(String[] args) {

        // Inferencia de tipos con var
        var numeroEntero = 20;
        System.out.println("numeroEntero = " + numeroEntero);

        var numeroFloat = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat);

        var numeroDouble = 10.0;
        System.out.println("numeroDouble = " + numeroDouble);

        // Tipo primitivo char
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);

        // Asignación con código Unicode
        char varCaracter = '\u0024';
        System.out.println("varCaracter = " + varCaracter);

        // Valor decimal del juego de caracteres Unicode
        char varCaracterDecimal = 36;
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);

        // Asignación directa del símbolo
        char varCaracterSimbolo = '$';
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);

        // Inferencia de tipos con var
        var varCaracter1 = '\u0024';
        System.out.println("varCaracter1 = " + varCaracter1);

        var varCaracterDecimal1 = (char)36;
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);

        var varCaracterSimbolo1 = '$';
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);

        int varEnteroChar = '$';
        System.out.println("VarEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);
    }
}