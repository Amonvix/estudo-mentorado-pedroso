package Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");					// cria um objeto WINDOW
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	// define o fechamento do programa ao clicar em fechar
		janela.setSize(300, 200);									// informa o tamanho da janela exibida
		janela.setLayout(new FlowLayout());							// cria um layout para o botão com base no texto
		janela.setLocationRelativeTo(null);							// define a posição da janela com base em outra janela (Null centraliza a janela na tela)
		
		JButton botao = new JButton("Aperte com carinho");			// cria o Objeto BUTTON com a mensagem informada
		janela.add(botao);											// adiciona o objeto botão à janela		
		
		// ActionListener é o metodo usado para coletar o evento (clique do mouse), e responder com a ação correspondente
		botao.addActionListener(e -> 
		{System.out.println("Te AMO!!!");
		});
		
		
		
		
		
		janela.setVisible(true);									// define a janela como visivel para o operador da aplicação
	}
}
