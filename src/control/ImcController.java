package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MainViewer;

public class ImcController implements ActionListener{
	
	private MainViewer context;
	public ImcController() {
		
	}
	
	public ImcController(MainViewer context) {
		if(this.context == null ) { 
			this.context = context;	
		}
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(context.getPesoTextField().getText());
		System.out.println(context.getAlturaTextField().getText());
		
		context.getResultPane().setText("Peso =" + context.getPesoTextField().getText() + "  | Altura  = " + context.getAlturaTextField().getText());
		
	}

}
