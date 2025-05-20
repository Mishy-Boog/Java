package exer1;

public class ValidadorCPF {
    public void validar(String cpf) throws CPFInvalidoException{
        if(cpf == null || cpf.length() != 11 || !cpf.matches("[0-9]+")){
            throw new CPFInvalidoException("O CPF precisar ter 11 digitos numericos");
        }
    }

}
