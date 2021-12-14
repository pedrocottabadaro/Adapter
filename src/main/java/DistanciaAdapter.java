public class DistanciaAdapter extends ValorDistancia{
    private Distancia distancia;

    public DistanciaAdapter(Distancia distancia){
        this.distancia = distancia;
    }

    public Float recuperarDistancia() {
        float distanciaMilhas = (float) (this.getDistancia()/0.621371);
        distancia.setDistancia(distanciaMilhas);
        return distancia.getDistancia();
    }

    public void salvarDistancia() {
        float distanciaKM = (float) ((distancia.getDistancia()*1.60934));
        this.setDistancia(distanciaKM);
    }
}
