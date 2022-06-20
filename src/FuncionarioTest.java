public class FuncionarioTest {
    private String nome;
    private String cpf;
    private double salario;
    private int TipoFuncionario = 0; // 0-funcionario - 1-gerente - 2-diretor


    public void setTipoFuncionariipoFuncionario(int tipoFuncionario) {
        this.TipoFuncionario = tipoFuncionario;
    }

    public int getpotipoFuncionario() {
        return TipoFuncionario;
    }

    public double bonificação() {

        if (this.TipoFuncionario == 0) { // 0 = funcionario comum - regra básica
            return this.salario * 0.1;
        } else if (this.TipoFuncionario == 1) {// 1-gerente - regra de um salário de bonificação
            return this.salario;
        } else { //2 - diretor = regra mais 1k
           return this.salario = +1000;
        }

    }


    //criar atributos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
