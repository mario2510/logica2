/**
 *
 */
public class PostoCombustivel {

    private int quantidadeDeLitros;
    private int tipoCombustivel;

    public PostoCombustivel() {
    }

    /**
     *
     * @param quantidadeDeLitros
     * @param tipoCombustivel
     */
    public PostoCombustivel(int quantidadeDeLitros, int tipoCombustivel) {
        this.quantidadeDeLitros = quantidadeDeLitros;
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getQuantidadeDeLitros() {
        return quantidadeDeLitros;
    }

    public void setQuantidadeDeLitros(int quantidadeDeLitros) {
        this.quantidadeDeLitros = quantidadeDeLitros;
    }

    public int getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(int tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    /**
     *
     * @return
     */
    public String verificarValorAPagar() {
        if(this.tipoCombustivel == 1) {
            return "Valor a pagar: R$" + this.calcularValor();
        } else if(this.tipoCombustivel == 2) {
            return "Valor a pagar: R$" + this.quantidadeDeLitros * 3.68;
        } else if(this.tipoCombustivel == 3) {
            return "Valor a pagar: R$" + this.quantidadeDeLitros * 3.71;
        } else if(this.tipoCombustivel == 4) {
            //pega ratão da prova!
            return "Valor a pagar gasolina: R$" + this.quantidadeDeLitros * 4.49
                 + "\nValor a pagar alcool: R$" + this.quantidadeDeLitros * 3.68;
        }
        return "Inválido!";
    }

    /**
     *
     * @return
     */
    public String verificarValorAPagarr() {
        switch(this.tipoCombustivel) {
            case 1:
                return "Valor a pagar: R$" + this.calcularValor();
            case 2:
                return "Valor a pagar: R$" + this.quantidadeDeLitros * 3.68;
            case 3:
                return "Valor a pagar: R$" + this.quantidadeDeLitros * 3.71;
            case 4:
                return "Valor a pagar gasolina: R$" + this.quantidadeDeLitros * 4.49
                        + "\nValor a pagar alcool: R$" + this.quantidadeDeLitros * 3.68;
            default:
                return "Inválido!";
        }
    }

    /**
     *
     * @return
     */
    public double calcularValor() {
        if(this.tipoCombustivel == 1) {
            return this.quantidadeDeLitros * 4.49;
        } else if(this.tipoCombustivel == 2) {
            return this.quantidadeDeLitros * 3.68;
        } else if(this.tipoCombustivel == 3) {
            return this.quantidadeDeLitros * 3.71;
        } else if(this.tipoCombustivel == 4) {
            return this.quantidadeDeLitros * 4.49 + this.quantidadeDeLitros * 3.68;
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return "\nQuantidadeDeLitros = " + this.quantidadeDeLitros
             + "\nTipoCombustivel = " + this.tipoCombustivel
             + "\nVerificar valor a pagar = R$" + this.verificarValorAPagar();
    }
}
