package projetoThreadJava;

import java.awt.Dimension;
import java.awt.GridBagConstraints;

import javax.swing.JDialog;

public class TelaTempoThread extends JDialog {

	private static final long serialVersionUID = 1L;

	public TelaTempoThread() {
		setTitle("Minha tela tempo com Thread");
		setSize(new Dimension(240,240));
		
		//Centraliza
		setLocationRelativeTo(null);
		
		//Nao permite aumentar e diminuir a tela
		setResizable(false);
		
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		
		
		setVisible(true);
	}
}
