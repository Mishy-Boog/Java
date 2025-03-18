public class Main {
    public static void main(String[] args) {
        //Definindo instancias
        conta c1 = new conta();
        conta c2 = new conta();


        //Definindo nome das instancias
        c1.setNome("Fulano de Tal");
        c2.setNome("Ciclano de Taltal");

        c1.setCPF("111 222 333 44");
        c2.setCPF("999 888 777 66");

        //Realizando depositos
        c1.depositar(100);
        c2.depositar(200);

        //Imprimindo valores
        System.out.println("c1 - Nome:" + c1.getNome());
        System.out.println("c1 - Saldo:" + c1.getSaldo());
        System.out.println("c1 - CPF:" + c1.getCPF());
        System.out.println("c2 - Nome:" + c2.getNome());
        System.out.println("c2 - Saldo:" + c2.getSaldo());
        System.out.println("c2 - CPF" + c2.getCPF());
    }
}
