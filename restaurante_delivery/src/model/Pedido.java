package model;

import java.util.List;

public class Pedido {
    private int id;
    private int clienteId;
    private List<ItemPedido> itens;
    private double valorTotalPedidoPedido;
    private String status;

    public Pedido(int id, int clienteId, List<ItemPedido> itens, double valorTotalPedidoPedido, String status) {
        this.id = id;
        this.clienteId = clienteId;
        this.itens = itens;
        this.valorTotalPedidoPedido = valorTotalPedidoPedido;
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

    public double getvalorTotalPedidoPedido() {
        return valorTotalPedidoPedido;
    }

    public void setvalorTotalPedidoPedido(double valorTotalPedidoPedido) {
        this.valorTotalPedidoPedido = valorTotalPedidoPedido;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
