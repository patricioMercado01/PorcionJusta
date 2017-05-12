package LegionGatito.PorcionJusta.GUI;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class PanelCombo extends JPanel{
	JComboBox cmbListaPacientes;
	
	public PanelCombo(){
		initSeleccion();
	}
	
	public void initSeleccion(){
		String[] pacientes = {"Ana","Isabel","Ignacio","David"};
		this.cmbListaPacientes = new JComboBox(pacientes);
		this.add(cmbListaPacientes);
		
	}
}
