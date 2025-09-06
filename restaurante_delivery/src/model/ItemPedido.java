package model;

import java.util.List;

public class ItemPedido {
    private int id;
    private int clienteId;
    private List<ItemPedido> itens;
    private double valorTotal;
    private String status;

    public ItemPedido(int id, int clienteId, List<ItemPedido> itens, double valorTotal, String status) {
        this.id = id;
        this.clienteId = clienteId;
        this.itens = itens;
        this.valorTotal = valorTotal;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
