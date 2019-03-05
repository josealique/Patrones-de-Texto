import java.util.List;

public class Find {
    String texto;

    public Find(String s) {
        this.texto = s;
    }

    public boolean match(String stringPat) {
        if (texto.contains(stringPat)){
            return true;
        }
        return false;
    }
}
