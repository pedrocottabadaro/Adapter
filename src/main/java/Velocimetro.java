public class Velocimetro {
    Distancia distanciaValor;
    DistanciaAdapter adapter;

    public Velocimetro(){
        distanciaValor = new ValorDistancia();
        adapter= new DistanciaAdapter(distanciaValor);
    }
    public void setDistancia(float valor){
        distanciaValor.setDistancia(valor);
        adapter.salvarDistancia();
    }
    public float getMilhas(){
        return adapter.recuperarDistancia();
    }
    public float getKM(){
        return distanciaValor.getDistancia();
    }
}
