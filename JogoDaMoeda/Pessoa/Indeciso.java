package JogoDaMoeda.Pessoa;

public class Indeciso extends Pessoa {
    public int helper;

    Indeciso() {
        this.helper = 0;
    }

    @Override
    public void setLastPlay(int play) {
        if (helper == 0) {
            setPlay(1);
            helper = 1;
        } else {
            setPlay(0);
            helper = 0;
        }
    }
}
