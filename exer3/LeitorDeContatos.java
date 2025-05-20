package exer3;

import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LeitorDeContatos {
    public static void main(String[] args){
        List<Contato> contatos = new ArrayList<>();

        try{
            BufferedReader br = new BufferedReader(new FileReader("contatos.txt"));
            String linha;
            while ((linha = br.readLine()) !null){
                String[] dados = linha.split(",");

                if(dados.length) == 2 {
                    Contato contato = new Contato(dados[0], dados.trim());
                }
            }
        }
    }

}
