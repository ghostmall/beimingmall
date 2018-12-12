package cn.ptms.tike.entity;

public class SecInfoSheetKey {
    private String orderpro;

    private String ordertak;

    public String getOrderpro() {
        return orderpro;
    }

    public void setOrderpro(String orderpro) {
        this.orderpro = orderpro == null ? null : orderpro.trim();
    }

    public String getOrdertak() {
        return ordertak;
    }

    public void setOrdertak(String ordertak) {
        this.ordertak = ordertak == null ? null : ordertak.trim();
    }
}