package entidades;

import java.time.LocalDate;


public class horasContrato {
    private LocalDate data;
    private Double valorPorHora;
    private Integer hora;
    
    public horasContrato() {
    }
    public horasContrato(LocalDate data, Double valorPorHora, Integer hora) {
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.hora = hora;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public Double getValorPorHora() {
        return valorPorHora;
    }
    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
    public Integer getHora() {
        return hora;
    }
    public void setHora(Integer hora) {
        this.hora = hora;
    }
    
    public double totalvalorporhora(){    
        return valorPorHora*hora;
    }
    
}
