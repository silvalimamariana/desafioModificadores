public class PrincipalAluno {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Jo", 10, 9, 8);
        Aluno aluno2 = new Aluno("Lucas", 10, 8, 9);
        Aluno aluno3 = new Aluno("Charles", 7, 6, 5);

        System.out.println("Aluno 1");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Primeira nota: " + aluno1.getNota1());
        System.out.println("Segunda nota: " + aluno1.getNota2());
        System.out.println("Terceira nota: " + aluno1.getNota3());
        System.out.println("Média das avaliações: " + aluno1.calcularMedia() + "\n");

        System.out.println("Aluno 2");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Primeira nota: " + aluno2.getNota1());
        System.out.println("Segunda nota: " + aluno2.getNota2());
        System.out.println("Terceira nota: " + aluno2.getNota3());
        System.out.println("Média das avaliações: " + aluno2.calcularMedia() + "\n");

        System.out.println("Aluno 3");
        System.out.println("Nome: " + aluno3.getNome());
        System.out.println("Primeira nota: " + aluno3.getNota1());
        System.out.println("Segunda nota: " + aluno3.getNota2());
        System.out.println("Terceira nota: " + aluno3.getNota3());
        System.out.println("Média das avaliações: " + aluno3.calcularMedia());

    }

}
