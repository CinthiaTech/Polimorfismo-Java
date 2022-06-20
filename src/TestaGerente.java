public class TestaGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setCpf("99999");
        g1.setSalario(5000);
        System.out.println("O nome do funcionário é " + g1.getNome());
        System.out.println("Seu CPF é " + g1.getCpf());
        System.out.println("Sua bonificação é de " + g1.bonificação());

        boolean autenticou = g1.autentica(2222);

        g1.setSenha(2222);
        boolean autentica = g1.autentica(2222);
        System.out.println("Autenticou!");
    }

}