package sodoku.oop.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import sodoku.oop.model.Node;

public class SodokuLabel extends JLabel {

	private static final long serialVersionUID = 342985043921778242L;

	private Node node;
	private boolean isSelected;

	public SodokuLabel(Node node, boolean isSelected) {
		super();
		this.node = node;
		this.isSelected = isSelected;
		if (node.getValue()!=0){
			this.setText("" + node.getValue());
		}
		this.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		this.setHorizontalAlignment(SwingConstants.CENTER);
		this.setOpaque(true);
		this.setBackground();
		this.setForeground();
	}

	public boolean isSelected() {
		return isSelected;
	}
	
	public void setNode(Node node){
		this.node = node;
		if (node.getValue()!=0){
			this.setText("" + node.getValue());
		}
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	public Node getNode() {
		return node;
	}
	
	public void setBackground(){
		if (!isSelected){
			if (this.node.getZone() % 2 == 0) {
				this.setBackground(Color.CYAN);
			}else{
				this.setBackground(Color.YELLOW);
			}
		}else{
			this.setBackground(Color.LIGHT_GRAY);
		}
	}
	
	public void setForeground(){
		if (this.node.isReserved()){
			this.setForeground(Color.RED);
		}else{
			this.setForeground(Color.BLACK);
		}
	}
}
