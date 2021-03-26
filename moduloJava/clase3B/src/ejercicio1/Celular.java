package ejercicio1;

public class Celular implements Precedable{
    private int num;
    private String titular;

    public Celular(int num, String titular) {
        this.num = num;
        this.titular = titular;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public int precedeA(Object o) {
        if(o instanceof Celular) {
            return this.num - ((Celular) o).num;
        }
        else return 0;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "num=" + num +
                '}';
    }
}
