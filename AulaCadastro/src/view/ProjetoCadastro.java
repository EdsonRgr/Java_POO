package view;

import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

public class ProjetoCadastro extends JFrame {

	JTextField txtNome = new JTextField("");
	JLabel lblNome = new JLabel("Nome :") ;
	
	JTextField txtEnd = new JTextField("");
	JLabel lblEnd = new JLabel("Endere�o :");
	
	JTextField txtCidade = new JTextField("");
	JLabel lblCidade = new JLabel("Cidade :");
	
	JTextField txtBairro = new JTextField("");
	JLabel lblBairro = new JLabel("Bairro :");
	
	JTextField txtTel = new JTextField("");
	JLabel lblTel = new JLabel("Telefone :");
	
	JTextField txtRg = new JTextField("");
	JLabel lblRg = new JLabel("RG :");
			
	
	JLabel lblSexo = new JLabel("Sexo :");

	//ButtonGroup gruporadio = new ButtonGroup();
	//ButtonGroup.add(rbMasc);
	//ButtonGroup.add(rbFemi);
	
	JRadioButton rbMasc = new JRadioButton("Masculino");
	JRadioButton rbFemi = new JRadioButton("Feminino");
	
	
	JLabel lblCep = new JLabel("CEP : ");
	JTextField txtCep = new JTextField("");
	
	JLabel lblEstado = new JLabel ("ESTADO :");
	
	JLabel lblCel = new JLabel ("Celular :");
	JTextField txtCel = new JTextField("");
	
	JLabel lblCpf = new JLabel ("Cpf :");
	JTextField txtCpf = new JTextField("");
	
	JButton btnSalvar = new JButton("Salvar ");
	JButton btnImprimir = new JButton("Imprimir");
	
	
	
	
	
	
	
	public ProjetoCadastro() {
		super ("Cadastro");
		
		Container paine = getContentPane(); //Criando o Container
		paine.setLayout(null); // adicionando um layout no container
		
		
		paine.add(txtNome);
		txtNome.setBounds(90, 20, 240, 40); //(coluna, linha,espa�o,altura )
		paine.add(lblNome);
		lblNome.setBounds(20, 30, 80, 20);
		
		paine.add(txtEnd);
		txtEnd.setBounds(90, 70, 240, 40); //(coluna, linha,espa�o,altura )
		paine.add(lblEnd);
		lblEnd.setBounds(20, 80, 80, 20);
		
		paine.add(txtCidade);
		txtCidade.setBounds(90, 120, 240, 40); //(coluna, linha,espa�o,altura )
		paine.add(lblCidade);
		lblCidade.setBounds(20, 130, 80, 20);
		
		paine.add(txtBairro);
		txtBairro.setBounds (90, 170, 240, 40); //(coluna, linha,espa�o,altura )
		paine.add(lblBairro);
		lblBairro.setBounds(20, 180, 80, 20);
		
		paine.add(txtTel);
		txtTel.setBounds(90, 220, 150, 40); //(coluna, linha,espa�o,altura )
		paine.add(lblTel);
		lblTel.setBounds(20, 230, 80, 20);
		
		paine.add(txtRg);
		txtRg.setBounds(90, 270, 150, 40); //(coluna, linha,espa�o,altura )
		paine.add(lblRg);
		lblRg.setBounds(20, 280 , 80, 20);
		
		paine.add(lblSexo);
		lblSexo.setBounds(350, 20 ,  80 , 40);
		
		paine.add(rbMasc);
		rbMasc.setBounds(400, 20, 90, 40);
		paine.add(rbFemi);
		rbFemi.setBounds(490, 20, 90, 40);
		
		paine.add(lblCep);
		lblCep.setBounds(350, 70, 80, 40);
		paine.add(txtCep);
		txtCep.setBounds(400, 70, 150, 40);
		
		paine.add(lblEstado);
		lblEstado.setBounds(350, 120, 80, 40);
		
		paine.add(lblCel);
		lblCel.setBounds(350, 220 , 80, 40);
		paine.add(txtCel);
		txtCel.setBounds(400, 220, 150, 40); //(coluna, linha,espa�o,altura )
		
		paine.add(lblCpf);
		lblCpf.setBounds(350, 270,80 , 40);
		paine.add(txtCpf);
		txtCpf.setBounds(400, 270, 150, 40); //(coluna, linha,espa�o,altura )
		
		paine.add(btnSalvar);
		btnSalvar.setBounds(240, 320, 120, 40);
		
		paine.add(btnImprimir);
		btnImprimir.setBounds(370, 320, 120, 40);
		
		
		
		
		
		this.setSize(600,400); // comando que define o tamanho da janela
		this.setVisible(true); // comando que define a visuali��o da janela 
		this.setResizable(false);//comando que nao permite a altera��o no tamanha da janela
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//comando que define que a janela seja encerrada
	}
	
	
	public static void main(String[] args) {
		ProjetoCadastro calc = new ProjetoCadastro();

	}

}