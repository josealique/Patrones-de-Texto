public class Token {
    private char caracter;

    private Token(){}

    public Token(char caracter) {
        this.caracter = caracter;
    }

    static Token caracter(char c){
        Token token = new Token();
        token.caracter = c;
        return token;
    }


}