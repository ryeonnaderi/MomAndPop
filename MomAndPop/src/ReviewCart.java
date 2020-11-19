import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

public class ReviewCart extends JPanel {
	private String TXT_ITEM = "Item";
	private String TXT_DESC = "Description";
	private String TXT_QUANTITY = "Quantity";
	private String TXT_PRICE = "Price";
	private DefaultTableModel itemsModel;
	private JTable table;
	
	/**
	 * Create the panel.
	 */
	public ReviewCart() {
		setBackground(SystemColor.control);
		setBounds(136, 0, 1108, 671);
		
		itemsModel = new DefaultTableModel();
		itemsModel.addColumn(TXT_ITEM);
		itemsModel.addColumn(TXT_DESC);
		itemsModel.addColumn(TXT_QUANTITY);
		itemsModel.addColumn(TXT_PRICE);
		setLayout(null);
		
		
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setBounds(435, 608, 237, 31);
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setFont(new Font("Nirmala UI", Font.PLAIN, 25));
		add(lblTotal);
		
		JLabel lblReviewCart = new JLabel("Review Cart");
		lblReviewCart.setBounds(435, 49, 237, 31);
		lblReviewCart.setHorizontalAlignment(SwingConstants.CENTER);
		lblReviewCart.setFont(new Font("Nirmala UI", Font.PLAIN, 30));
		add(lblReviewCart);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(209, 141, 689, 388);
		add(scrollPane);
		
		table = new JTable();
		table.getTableHeader().setReorderingAllowed(false);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Item", "Description", "Quantity", "Price"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Integer.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		setVisible(false);

	}
}
