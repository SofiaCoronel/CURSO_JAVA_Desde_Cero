package ClasePracticaPrimerPrcialLab2;

abstract  class Animales{
    public abstract void caminar();

    public abstract boolean volar(){
        return false;
    }
}
class caballo extends Animales {

    @Override
    public void caminar() {

    }

    @Override
    public boolean volar() {
        return false;
    }
}


