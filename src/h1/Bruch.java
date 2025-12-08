package h1;

public class Bruch {

    int zaehler = 0;
    int nenner = 0;

    Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    private int ggT(int x, int y) {

        int z;

        if (x > y) {
            z = x;
        } else {
            z = y;
        }

        while (true) {
            if (x % z == 0 && y % z == 0) {
                return z;
            }
            else {
                z--;
            }

        }

    }

    public void shorten(){

        int a = ggT(nenner, zaehler);
        nenner = nenner/a;
        zaehler = zaehler/a;

    }

    public boolean hasSameValueAs(Bruch b){

        if (this.zaehler/this.nenner == b.zaehler/b.nenner){
            return true;
        }
        else{
            return false;
        }

    }

    public void print(){
        System.out.println(zaehler);
        System.out.println("-------");
        System.out.println(nenner);
    }

}
