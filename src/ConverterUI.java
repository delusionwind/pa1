import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;

/**
 * the UI format in GUI of the distance converter
 * @author Napon Kittisiriprasert
 */
public class ConverterUI extends JFrame{
	private JButton convertButton, clearButton;
	private JComboBox<Unit> unit1, unit2;
	private JLabel equal;
	private JTextField input1, input2;
	private JPanel contents, container;
	private JMenu unitMenu;
	private JMenuBar unitMenuBar;
	private UnitConverter unitconverter;
	
	/**
	 * constructor of the UI
	 * @param uc the unit converter class
	 */
	public ConverterUI( UnitConverter uc ) {
		this.unitconverter = uc;
		
		this.setTitle("Length Converter");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
	}
	
	/**
	 * the components of the GUI for constructor
	 */
	private void initComponents() {
		convertButton = new JButton("Convert!!");
		clearButton = new JButton("Clear");
		equal = new JLabel("=");
		input1 = new JTextField(7);
		input2 = new JTextField(7);
		input2.setEditable(false);
		
		Unit[] lengths = unitconverter.getUnits(UnitType.LENGTH);
		unit1 = new JComboBox<Unit>( lengths );
		unit2 = new JComboBox<Unit>( lengths );
		
		unitMenuBar = new JMenuBar();
		
		unitMenu = new JMenu("Unit Type");
		UnitType[] unitTypes = UnitFactory.getInstance().getUnitTypes();
		for(UnitType ut : unitTypes) {
			JMenuItem menuItem = new JMenuItem(ut.toString());
			menuItem.addActionListener( new UnitChangeAction());
			unitMenu.add(menuItem);
		}
		unitMenu.addSeparator();
		JMenuItem exitItem = new JMenuItem("Exit");
		exitItem.addActionListener(new ExitAction());
		unitMenu.add(exitItem);
		
		
		unitMenuBar.add(unitMenu);
		
		contents = new JPanel();
		contents.setLayout(new FlowLayout());
		
		contents.add(input1);
		contents.add(unit1);
		contents.add(equal);
		contents.add(input2);
		contents.add(unit2);
		
		contents.add ( convertButton );
		ActionListener listener = new ConvertButtonListener();
		convertButton.addActionListener( listener );
		input1.addActionListener( listener );
		input2.addActionListener( listener );
		
		contents.add ( clearButton );
		listener = new ClearButtonListener();
		clearButton.addActionListener( listener );
		
		this.setJMenuBar(unitMenuBar);
		this.add(contents);
	}
	/**
	 * method to be call by the application to run the distance converter
	 */
	public void run() {
		this.pack();
		this.setVisible(true);
	}
	
	/**
	 * action listener for convert button and text field enter
	 * to convert the distance by from the selected format of left to right or right to left
	 */
	class ConvertButtonListener implements ActionListener {
		public void actionPerformed( ActionEvent evt ) {
			String s = input1.getText().trim();
			if ( evt.getSource() == input2 ) {
				s = input2.getText().trim();
			}
			//System.out.println("actionPerformed: input=" + s);
			if ( s.length() > 0 ) {
				try {
					double value = Double.valueOf( s );
					Unit fromUnit = (Unit) unit1.getSelectedItem();
					Unit toUnit = (Unit) unit2.getSelectedItem();
					if ( evt.getSource() != input2 ) {
						double result = unitconverter.convert(value, fromUnit, toUnit);
						input2.setText( String.format("%f", result) );
					} else {
						double result = unitconverter.convert(value, toUnit, fromUnit);
						input1.setText( String.format("%f", result) );
					}
				} catch ( Exception e ) {
					
				}
			} 
			
		}
	}
	/**
	 * action listener for clear button to clear text in both input text field
	 */
	class ClearButtonListener implements ActionListener {
		public void actionPerformed( ActionEvent evt ) {
			input1.setText("");
			input2.setText("");
		}
	}
	
	/**
	 * exit action for the JMenuBar.
	 */
	class ExitAction extends AbstractAction {
		public ExitAction() {
			super("Exit");
		}

		public void actionPerformed(ActionEvent evt) {
			System.exit(0);
			
		}
	}
	
	class UnitChangeAction extends AbstractAction {
		public void actionPerformed(ActionEvent evt) {
			
		}
	}
}
