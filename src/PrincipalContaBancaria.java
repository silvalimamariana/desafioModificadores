public class PrincipalContaBancaria {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.setTitular("Xavier");
        conta.setNumeroConta(422);
        conta.setSaldo(2000);

        System.out.println("Nome títular: " + conta.getTitular());
        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());

    }

}
