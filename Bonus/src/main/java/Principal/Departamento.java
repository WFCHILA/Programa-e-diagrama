package Principal;

import java.math.BigDecimal;

public class Departamento {
    private int id;
    private BigDecimal vendasTotais;
    private String telefone;
    private String email;

    public Departamento(int id, BigDecimal vendasTotais) {
        this.id = id;
        this.vendasTotais = vendasTotais;
        this.telefone = telefone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getVendasTotais() {
        return vendasTotais;
    }

    public void setVendasTotais(BigDecimal vendasTotais) {
        this.vendasTotais = vendasTotais;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "id=" + id +
                ", vendasTotais=" + vendasTotais +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
