package exer1;

public class Main {
    public static void main (String[] args){
        ValidadorCPF validador = new ValidadorCPF();

        String[] cpfs = {"11122233344", "2221111333314414"};

        for (String cpf: cpfs){
            try{
                validador.validar(cpf);
                System.out.println("O CPF " + cpf + "ta certin");
            } catch (CPFInvalidoException e){
                System.out.println("Erro no CPF " + cpf + ":" + e.getMessage());
            }
        }
    }

}
