
package model;


public class Mensalidade {
    
    private int id;
    private float valor_pago;
    private String data_vencimento;
    private String data_pagamento;

    public int getId() { return id; }
    public void setId(int id) { this.id = id;     }

    public float getValorPago() { return valor_pago; }
    public void setValorPago(float valor_pago) { this.valor_pago = valor_pago; }

    public String getDataVencimento() { return data_vencimento; }
    public void setDataVencimento(String data_vencimento) { this.data_vencimento = data_vencimento; }
    
    public String getDataPagamento() { return data_pagamento; }
    public void setDataPagamento(String data_pagamento) { this.data_pagamento = data_pagamento; }

    @Override
    public String toString() {
        return "Mensalidade{" + "id=" + id + 
                ", nome=" + valor_pago + ", estado='" + data_vencimento + '\'' + '}';
    }
    
}
