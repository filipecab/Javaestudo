package entidades;
import java.util.ArrayList;
import java.util.List;

public class funcionario {
    private String nome;
    private Enumerados nivel;
    private double salario;

    private Cliente cliente;
    private List<horasContrato> contratos=new ArrayList<>();

    
    

    public funcionario() {
    }

    
    public funcionario(String nome, Enumerados nivel, Double salario, Cliente cliente) {
        this.nome = nome;
        this.nivel = nivel;
        this.salario = salario;
        this.cliente = cliente;
    }
    


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Enumerados getNivel() {
        return nivel;
    }


    public void setNivel(Enumerados nivel) {
        this.nivel = nivel;
    }


    public Double getSalario() {
        return salario;
    }


    public void setSalario(Double salario) {
        this.salario = salario;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public List<horasContrato> getContratos() {
        return contratos;
    }


    


    public void adcContrato(horasContrato contrato){
        this.contratos.add(contrato);        
    }
    public void remvContrato(horasContrato contrato){
        this.contratos.remove(contrato);
    }
    public double totalValor(int ano, int mes){
        double soma=salario;
        
        for (horasContrato x:contratos){
            if (x.getData().getYear()==ano && x.getData().getMonthValue()==mes){
                soma+=x.totalvalorporhora();
            }
            return soma;
        }

    }

    
    

    
}
