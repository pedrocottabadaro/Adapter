public class ValorDistancia implements Distancia{
    private float valor;
    @Override
    public float getDistancia() {
        return this.valor;
    }

    @Override
    public void setDistancia(Float valor) {
        this.valor=valor;
    }
}
