package TelaCadastro;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadastroPessoa extends JFrame {
	JLabel lblNome = new JLabel("Nome: ");
	JLabel lblEndereco = new JLabel("Endereço: ");
	JLabel lblTelefone = new JLabel("Telefone: ");
	JLabel lblCpf = new JLabel("CPF: ");
	JLabel lblSexo = new JLabel("Sexo: ");
	JTextField txtNome = new JTextField(null, 20);
	JTextField txtEndereco = new JTextField(null, 20);
	JTextField txtTelefone = new JTextField(null, 20);
	JTextField txtCpf = new JTextField(null, 20);
	
	String[] sexo = {"Masculino", "Feminino"};
	JComboBox cboSexo = new JComboBox(sexo);
	JButton btnGravar = new JButton("Gravar");
	JButton btnFechar = new JButton("Fechar");
	
	public TelaCadastroPessoa() {
		Container c = getContentPane();
		setLayout(new GridLayout(0, 2));
		setTitle("Cadastro de Pessoa");
		c.add(lblNome);
		c.add(txtNome);
		c.add(lblEndereco);
		c.add(txtEndereco);
		c.add(lblTelefone);
		c.add(txtTelefone);
		c.add(lblEndereco);
		c.add(txtEndereco);
		c.add(lblCpf);
		c.add(txtCpf);
		c.add(lblSexo);
		c.add(cboSexo);
		c.add(btnGravar);
		c.add(btnFechar);
		setVisible(true);
		pack();
	}
}
