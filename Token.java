public class Token {
    enum TipoToken { NUMERO, META, CARACTER }

    public Token() {}

    TipoToken tipo;
    char tk;
    int value;

    static Token tokMeta(char c){
        Token metaCaracter = new Token();
        metaCaracter.tipo = TipoToken.META;
        metaCaracter.tk = c;
        return metaCaracter;
    }

    static Token tokCaracter(char c){
        Token caracter = new Token();
        caracter.tipo = TipoToken.CARACTER;
        caracter.tk = c;
        return caracter;
    }

    static Token tokNumero(int valor){
        Token num = new Token();
        num.tipo = TipoToken.NUMERO;
        num.value = valor;
        return num;
    }
}