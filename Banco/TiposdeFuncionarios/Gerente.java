package TiposdeFuncionarios;
import Base.FuncionarioAutenticavel;

public class Gerente extends FuncionarioAutenticavel {
    @Override
    public double getBonificacao() {
        System.out.println("Procurando bonificaão do cargo gerente");
        return super.getSalario();
    }
}
