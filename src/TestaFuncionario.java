public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionário nico = new Funcionário();

        nico.setNome("Nickolas");
        nico.setCpf("333.666.333-23");
        nico.setSalario(3000);

        System.out.println("O nome do funcionário é " + nico.getNome());
        System.out.println("O valor de sua bonificação é " + nico.bonificação());
        System.out.println("O valor de seu salário é " + nico.getSalario());
    }

}