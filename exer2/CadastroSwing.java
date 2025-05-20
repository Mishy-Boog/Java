package exer2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CadastroSwing extends JFrame {
    private JTextField nomeField, emailField, idadeField;

    public CadastroSwing() {
        setTitle("Sistema de cadastro");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JPanel panel = new JPanel(new GridLayout(4, 2));

        panel.add(new JLabel("Nome:"));
        nomeField = new JTextField();
        panel.add(nomeField);

        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        panel.add(new JLabel("Idade:"));
        idadeField = new JTextField();
        panel.add(idadeField);

        JButton cadastrarButton = new JButton("Cadastrar");
        panel.add(cadastrarButton);

        panel.add(new JLabel(""));

        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String email = emailField.getText();
                String idade = idadeField.getText();

                JOptionPane.showMessageDialog(null,
                        "Nome: " + nome + "\nEmail: " + email + "\nIdade: " + idade,
                        "Dados cadastrados",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        add(panel);
        setVisible(true);
    }
    public static void main (String[]args){
        new CadastroSwing();
    }
}
