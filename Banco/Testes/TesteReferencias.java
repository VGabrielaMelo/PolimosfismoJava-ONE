package Testes;
import Base.FuncionarioPrincipal;
import TiposdeFuncionarios.Gerente;

public class TesteReferencias {
    public static void main(String[] args) {
        FuncionarioPrincipal g1 = new Gerente();

        g1.setNome("Gabriela Melo");
        String nome = g1.getNome();
        
        System.out.println(nome);
    }
}