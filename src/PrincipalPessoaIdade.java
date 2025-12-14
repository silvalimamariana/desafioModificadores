public class PrincipalPessoaIdade {

    public static void main(String[] args) {

        IdadePessoa idade = new IdadePessoa();

        idade.setNome("Charles");
        idade.setIdade(22);

        System.out.println("O nome é " + idade.getNome() + " com a idade " + idade.getIdade());
        idade.verificaIdade();

    }

}
