package JogoDaMoeda.Pessoa;

public class Copiador extends Pessoa {
    Copiador() {
        setPlay(1);
    }

    @Override
    public void setLastPlay(int play) {
        setPlay(play);
    }
}
