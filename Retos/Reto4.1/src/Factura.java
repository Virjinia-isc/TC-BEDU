public class Factura {

    private String folio;
    private String cliente;
    private double total;

    public Factura(String folio, String cliente, double total){
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    @Override
    public  String toString(){
        return "Factura [folio=" + folio + ", cliente=" + cliente + ", total=$" + total + "]";
    }
}