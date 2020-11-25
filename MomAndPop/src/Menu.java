import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import java.awt.Component;
import javax.swing.JComboBox;

public class Menu extends JFrame {

	PizzaType pizzaTypePnl;
	Toppings topPnl;
	Sides side;
	Drinks drinks;
	ReviewCart cart;
	ContactInfo ci;
	PickUp pu;
	OrderConfirmed oc;
	Delivery d;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */


	/**
	 * Initialize the contents of the frame.
	 */
	public Menu() {
		//frame of main menu
		setTitle("Mom and Pop Pizzeria");
		getContentPane().setBackground(Color.RED);
		setBounds(100, 100, 1250, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setBackground(Color.RED);
		setResizable(false);
		
		//main menu panel
		JPanel menu = new JPanel();
		menu.setBackground(new Color(250, 235, 215));
		menu.setBorder(null);
		menu.setBounds(136, 0, 1108, 671);
		getContentPane().add(menu);
		menu.setLayout(null);
		
		//PizzaType Next Button
		JButton btnNext = new JButton("NEXT");
		btnNext.setForeground(Color.WHITE);
		btnNext.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnNext.setFocusable(false);
		btnNext.setBorderPainted(false);
		btnNext.setBackground(Color.RED);
		btnNext.setBounds(867, 600, 201, 40);
		
		JLabel menuTxt = new JLabel("CHOOSE A CATEGORY ON THE LEFT TO GET STARTED");
		menuTxt.setFont(new Font("Nirmala UI", Font.BOLD, 33));
		menuTxt.setHorizontalAlignment(SwingConstants.CENTER);
		menuTxt.setBounds(0, 274, 1108, 123);
		menu.add(menuTxt);
		
		//Place Order on Pickup Page
		JButton btnPickUpPO = new JButton("Place Order");
		btnPickUpPO.setForeground(Color.WHITE);
		btnPickUpPO.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnPickUpPO.setFocusable(false);
		btnPickUpPO.setBorderPainted(false);
		btnPickUpPO.setBackground(Color.RED);
		btnPickUpPO.setBounds(867, 600, 201, 40);
		
		//Place Button on Delivery Page
		JButton btnDPO = new JButton("Place Order");
		btnDPO.setForeground(Color.WHITE);
		btnDPO.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnDPO.setFocusable(false);
		btnDPO.setBorderPainted(false);
		btnDPO.setBackground(Color.RED);
		btnDPO.setBounds(867, 600, 201, 40);
		
		//Delivery Button on Contact Info
		JButton btnDelivery = new JButton("Delivery");
		btnDelivery.setForeground(Color.WHITE);
		btnDelivery.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnDelivery.setFocusable(false);
		btnDelivery.setBorderPainted(false);
		btnDelivery.setBackground(Color.RED);
		btnDelivery.setBounds(867, 600, 201, 40);
		
		//Pick Up Button on Contact Info
		JButton btnPickup = new JButton("Pickup");
		btnPickup.setForeground(Color.WHITE);
		btnPickup.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnPickup.setFocusable(false);
		btnPickup.setBorderPainted(false);
		btnPickup.setBackground(Color.RED);
		btnPickup.setBounds(453, 600, 201, 40);
		
		//Back Button on Contact Info
		JButton btnCIBack = new JButton("Back");
		btnCIBack.setForeground(Color.WHITE);
		btnCIBack.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnCIBack.setFocusable(false);
		btnCIBack.setBorderPainted(false);
		btnCIBack.setBackground(Color.RED);
		btnCIBack.setBounds(37, 600, 201, 40);
		
		//Back Button on PickUp Page
		JButton btnPUBack = new JButton("Back");
		btnPUBack.setForeground(Color.WHITE);
		btnPUBack.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnPUBack.setFocusable(false);
		btnPUBack.setBorderPainted(false);
		btnPUBack.setBackground(Color.RED);
		btnPUBack.setBounds(37, 600, 201, 40);
		
		//Back Button on Delivery Page
		JButton btnDBack = new JButton("Back");
		btnDBack.setForeground(Color.WHITE);
		btnDBack.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnDBack.setFocusable(false);
		btnDBack.setBorderPainted(false);
		btnDBack.setBackground(Color.RED);
		btnDBack.setBounds(37, 600, 201, 40);
		
		//Add to Cart Button on Toppings Page
		JButton btnATC = new JButton("ADD TO CART");
		btnATC.setForeground(Color.WHITE);
		btnATC.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnATC.setFocusable(false);
		btnATC.setBorderPainted(false);
		btnATC.setBackground(Color.RED);
		btnATC.setBounds(867, 600, 201, 40);
		
		//Add to Cart Button on Sides Page
		JButton btnSATC = new JButton("ADD TO CART");
		btnSATC.setForeground(Color.WHITE);
		btnSATC.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnSATC.setFocusable(false);
		btnSATC.setBorderPainted(false);
		btnSATC.setBackground(Color.RED);
		btnSATC.setBounds(867, 600, 201, 40);
		
		//Continue Button for Review Cart Page
		JButton btnContinue = new JButton("Continue");
		btnContinue.setForeground(Color.WHITE);
		btnContinue.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnContinue.setFocusable(false);
		btnContinue.setBorderPainted(false);
		btnContinue.setBackground(Color.RED);
		btnContinue.setBounds(867, 600, 201, 40);
		
		//Back Button on Pizza Type Page
		JButton btnPTBack = new JButton("BACK");
		btnPTBack.setForeground(Color.WHITE);
		btnPTBack.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnPTBack.setFocusable(false);
		btnPTBack.setBorderPainted(false);
		btnPTBack.setBackground(Color.RED);
		btnPTBack.setBounds(37, 600, 201, 40);

		//Pizza Side Button
		JButton btnPizza = new JButton("Pizza");
		btnPizza.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnPizza.setIcon(new ImageIcon(Menu.class.getResource("/imgs/pizza.png")));
		btnPizza.setRequestFocusEnabled(false);
		btnPizza.setForeground(Color.WHITE);
		btnPizza.setBackground(Color.RED);
		btnPizza.setBorderPainted(false);
		btnPizza.setFocusable(false);
		btnPizza.setFont(new Font("Nirmala UI", Font.BOLD, 22));
		btnPizza.setBounds(0, 198, 136, 39);
		getContentPane().add(btnPizza);
		
		//Sides Side Button
		JButton btnSides = new JButton("Sides");
		btnSides.setIcon(new ImageIcon(Menu.class.getResource("/imgs/sides.png")));
		btnSides.setForeground(Color.WHITE);
		btnSides.setRequestFocusEnabled(false);
		btnSides.setBackground(Color.RED);
		btnSides.setBorderPainted(false);
		btnSides.setFocusable(false);
		btnSides.setFont(new Font("Nirmala UI", Font.BOLD, 22));
		btnSides.setBounds(0, 248, 136, 39);
		getContentPane().add(btnSides);
		
		//Drinks Side Button
		JButton btnDrinks = new JButton("Drinks");
		btnDrinks.setIcon(new ImageIcon(Menu.class.getResource("/imgs/drinks.png")));
		btnDrinks.setForeground(Color.WHITE);
		btnDrinks.setRequestFocusEnabled(false);
		btnDrinks.setBackground(Color.RED);
		btnDrinks.setBorderPainted(false);
		btnDrinks.setFocusable(false);
		btnDrinks.setFont(new Font("Nirmala UI", Font.BOLD, 22));
		btnDrinks.setBounds(0, 298, 136, 39);
		getContentPane().add(btnDrinks);
		
		//Checkout Bottom Left Button
		JButton btnCheckout = new JButton();
		btnCheckout.setIcon(new ImageIcon(Menu.class.getResource("/imgs/cart.png")));
		btnCheckout.setFocusable(false);
		btnCheckout.setRequestFocusEnabled(false);
		btnCheckout.setBorder(null);
		btnCheckout.setBorderPainted(false);
		btnCheckout.setBackground(Color.RED);
		btnCheckout.setBounds(0, 609, 136, 62);
		getContentPane().add(btnCheckout);
		
		//Logo
		JLabel logo = new JLabel("");
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setIcon(new ImageIcon(Menu.class.getResource("/imgs/logo.png")));
		logo.setBounds(0, 0, 136, 124);
		getContentPane().add(logo);
		
		//--------------------------------------------ATC Buttons on Drinks--------------------------------------------
		//Pepsi
		JButton btnAddToCartPepsi = new JButton("");	
		btnAddToCartPepsi.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnAddToCartPepsi.setForeground(Color.WHITE);
		btnAddToCartPepsi.setFocusable(false);
		btnAddToCartPepsi.setBounds(new Rectangle(100, 0, 0, 0));
		btnAddToCartPepsi.setBorderPainted(false);
		btnAddToCartPepsi.setBackground(Color.RED);
		btnAddToCartPepsi.setBounds(505, 131, 40, 31);
		
		//Diet Pepsi
		JButton btnAddToCartDietPepsi = new JButton("");
		btnAddToCartDietPepsi.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnAddToCartDietPepsi.setForeground(Color.WHITE);
		btnAddToCartDietPepsi.setFocusable(false);
		btnAddToCartDietPepsi.setBounds(new Rectangle(100, 0, 0, 0));
		btnAddToCartDietPepsi.setBorderPainted(false);
		btnAddToCartDietPepsi.setBackground(Color.RED);
		btnAddToCartDietPepsi.setBounds(505, 274, 40, 31);
		
		//Sunkist
		JButton btnAddToCartSunkist = new JButton("");
		btnAddToCartSunkist.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnAddToCartSunkist.setForeground(Color.WHITE);
		btnAddToCartSunkist.setFocusable(false);
		btnAddToCartSunkist.setBounds(new Rectangle(100, 0, 0, 0));
		btnAddToCartSunkist.setBorderPainted(false);
		btnAddToCartSunkist.setBackground(Color.RED);
		btnAddToCartSunkist.setBounds(505, 422, 40, 31);
		
		//Diet Sunkist
		JButton btnAddToCartDietSunkist = new JButton("");
		btnAddToCartDietSunkist.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnAddToCartDietSunkist.setForeground(Color.WHITE);
		btnAddToCartDietSunkist.setFocusable(false);
		btnAddToCartDietSunkist.setBounds(new Rectangle(100, 0, 0, 0));
		btnAddToCartDietSunkist.setBorderPainted(false);
		btnAddToCartDietSunkist.setBackground(Color.RED);
		btnAddToCartDietSunkist.setBounds(505, 559, 40, 31);
		
		//Root Beer
		JButton btnAddToCartAW = new JButton("");
		btnAddToCartAW.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnAddToCartAW.setForeground(Color.WHITE);
		btnAddToCartAW.setFocusable(false);
		btnAddToCartAW.setBounds(new Rectangle(100, 0, 0, 0));
		btnAddToCartAW.setBorderPainted(false);
		btnAddToCartAW.setBackground(Color.RED);
		btnAddToCartAW.setBounds(1019, 131, 40, 31);
		
		//Diet Root Beer
		JButton btnAddToCartDietAW = new JButton("");
		btnAddToCartDietAW.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnAddToCartDietAW.setForeground(Color.WHITE);
		btnAddToCartDietAW.setFocusable(false);
		btnAddToCartDietAW.setBounds(new Rectangle(100, 0, 0, 0));
		btnAddToCartDietAW.setBorderPainted(false);
		btnAddToCartDietAW.setBackground(Color.RED);
		btnAddToCartDietAW.setBounds(1019, 274, 40, 31);
		
		//Sierra Mist
		JButton btnAddToCartSierraMist = new JButton("");
		btnAddToCartSierraMist.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnAddToCartSierraMist.setForeground(Color.WHITE);
		btnAddToCartSierraMist.setFocusable(false);
		btnAddToCartSierraMist.setBounds(new Rectangle(100, 0, 0, 0));
		btnAddToCartSierraMist.setBorderPainted(false);
		btnAddToCartSierraMist.setBackground(Color.RED);
		btnAddToCartSierraMist.setBounds(1019, 422, 40, 31);
		
		//Lemonade
		JButton btnAddToCartLemonade = new JButton("");
		btnAddToCartLemonade.setIcon(new ImageIcon(Drinks.class.getResource("/imgs/cart.png")));
		btnAddToCartLemonade.setForeground(Color.WHITE);
		btnAddToCartLemonade.setFocusable(false);
		btnAddToCartLemonade.setBounds(new Rectangle(100, 0, 0, 0));
		btnAddToCartLemonade.setBorderPainted(false);
		btnAddToCartLemonade.setBackground(Color.RED);
		btnAddToCartLemonade.setBounds(1019, 559, 40, 31);
		
		//--------------------------------------------Panels--------------------------------------------
		//Pizza Type: Size, Crust, Sauce, Cheese
		pizzaTypePnl = new PizzaType();
		pizzaTypePnl.setBounds(136, 0, 1108, 671);
		pizzaTypePnl.add(btnNext);
		getContentPane().add(pizzaTypePnl);		
		
		//Toppings: Meats and Veggies
		topPnl = new Toppings();
		topPnl.setVisible(false);
		topPnl.setBounds(136, 0, 1108, 671);
		topPnl.add(btnATC);
		topPnl.add(btnPTBack);
		getContentPane().add(topPnl);
		
		//Sides
		side = new Sides();
		side.setVisible(false);
		side.setBounds(136, 0, 1108, 671);
		side.add(btnSATC);
		getContentPane().add(side);
		
		//Drinks
		drinks = new Drinks();
		drinks.setVisible(false);
		drinks.setBounds(136, 0, 1108, 671);
		drinks.add(btnAddToCartPepsi);
		drinks.add(btnAddToCartDietPepsi);
		drinks.add(btnAddToCartSunkist);
		drinks.add(btnAddToCartDietSunkist);
		drinks.add(btnAddToCartAW);
		drinks.add(btnAddToCartDietAW);
		drinks.add(btnAddToCartLemonade);
		drinks.add(btnAddToCartSierraMist);
		getContentPane().add(drinks);
		
		//Cart
		cart = new ReviewCart();
		cart.setVisible(false);
		cart.setBounds(136, 0, 1108, 671);
		cart.add(btnContinue);
		getContentPane().add(cart);
		
		//Contact Information
		ci = new ContactInfo();
		ci.setVisible(false);
		ci.setBounds(136, 0, 1108, 671);
		ci.add(btnCIBack);
		ci.add(btnDelivery);
		ci.add(btnPickup);
		getContentPane().add(ci);
		
		//Pickup
		pu = new PickUp();
		pu.setVisible(false);
		pu.setBounds(136, 0, 1108, 671);
		pu.add(btnPUBack);
		pu.add(btnPickUpPO);
		getContentPane().add(pu);
		
		//Delivery
		d = new Delivery();
		d.setVisible(false);
		d.setBounds(136, 0, 1108, 671);
		d.add(btnDBack);
		d.add(btnDPO);
		getContentPane().add(d);
		
		//Order Confirmed
		oc = new OrderConfirmed();
		oc.setVisible(false);
		oc.setBounds(136, 0, 1108, 671);
		getContentPane().add(oc);
		
		//--------------------------------------------Drinks Add to Cart Methods--------------------------------------------
		//Pepsi
		btnAddToCartPepsi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				cart.model.addRow(new Object[] {"Pepsi", drinks.getPepsiSize(), drinks.cbQuantityPepsi.getSelectedIndex()+1, drinks.cbQuantityPepsi.getSelectedIndex()+1 * 1.00});
				drinks.rbPepsi();
			}
		});
		
		//Diet Pepsi
		btnAddToCartDietPepsi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				cart.model.addRow(new Object[] {"Diet Pepsi", drinks.getDietPepsiSize(), drinks.cbQuantityDietPepsi.getSelectedIndex()+1, drinks.cbQuantityDietPepsi.getSelectedIndex()+1 * 1.00});
				drinks.rbDietPepsi();
			}
		});
		
		//Sunkist
		btnAddToCartSunkist.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				cart.model.addRow(new Object[] {"Sunkist", drinks.getSunkistSize(), drinks.cbQuantitySunkist.getSelectedIndex()+1, drinks.cbQuantitySunkist.getSelectedIndex()+1 * 1.00});
				drinks.rbSunkist();
			}
		});
		
		//Diet Sunkist
		btnAddToCartDietSunkist.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				cart.model.addRow(new Object[] {"Diet Sunkist", drinks.getDietSunkistSize(), drinks.cbQuantityDietSunkist.getSelectedIndex()+1, drinks.cbQuantityDietSunkist.getSelectedIndex()+1 * 1.00});
				drinks.rbDietSunkist();
			}
		});
		
		//Root Beer
		btnAddToCartAW.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				cart.model.addRow(new Object[] {"Root Beer", drinks.getRootBeerSize(), drinks.cbQuantityAW.getSelectedIndex()+1, drinks.cbQuantityAW.getSelectedIndex()+1 * 1.00});
				drinks.rbRootBeer();
			}
		});
		
		//Diet Root Beer
		btnAddToCartDietAW.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				cart.model.addRow(new Object[] {"Diet Root Beer", drinks.getDietRootBeerSize(), drinks.cbQuantityDietAW.getSelectedIndex()+1, drinks.cbQuantityDietAW.getSelectedIndex()+1 * 1.00});
				drinks.rbDietRootBeer();
			}
		});
		
		//Sierra Mist
		btnAddToCartSierraMist.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				cart.model.addRow(new Object[] {"Sierra Mist", drinks.getSierraMistSize(), drinks.cbQuantitySierraMist.getSelectedIndex()+1, drinks.cbQuantitySierraMist.getSelectedIndex()+1 * 1.00});
				drinks.rbSierraMist();
			}
		});
		
		//Lemonade
		btnAddToCartLemonade.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				cart.model.addRow(new Object[] {"Lemonade", drinks.getLemonadeSize(), drinks.cbQuantityLemonade.getSelectedIndex()+1, drinks.cbQuantityLemonade.getSelectedIndex()+1 * 1.00});
				drinks.rbLemonade();
			}
		});



		//--------------------------------------------Button Clicks Methods--------------------------------------------
		//If Pizza was click
		btnPizza.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnPizza.isEnabled() == true) {
					//Change/reset colors
					btnPizza.setBackground(Color.decode("#FF3030"));
					btnSides.setBackground(Color.red);
					btnDrinks.setBackground(Color.red);
					btnCheckout.setBackground(Color.red);
					
					//Shows toppings
					pizzaTypePnl.setVisible(true);
					menu.setVisible(false);
					side.setVisible(false);
					drinks.setVisible(false);
					cart.setVisible(false);
					topPnl.setVisible(false);
					ci.setVisible(false);
				}
				
				//Clears everything selected
				pizzaTypePnl.clearPizza();
				topPnl.clearTop();
				drinks.rbPepsi();
				drinks.rbDietPepsi();
				drinks.rbSunkist();
				drinks.rbDietSunkist();
				drinks.rbRootBeer();
				drinks.rbDietRootBeer();
				drinks.rbSierraMist();
				drinks.rbLemonade();
				side.clearAll();
			}
		});
		
		//If Sides was clicked
		btnSides.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (btnSides.isEnabled() == true) {
					btnSides.setBackground(Color.decode("#FF3030"));
					btnPizza.setBackground(Color.red);
					btnDrinks.setBackground(Color.red);
					btnCheckout.setBackground(Color.red);
					
					//Shows sides
					side.setVisible(true);
					pizzaTypePnl.setVisible(false);
					menu.setVisible(false);
					cart.setVisible(false);
					drinks.setVisible(false);
					topPnl.setVisible(false);
					ci.setVisible(false);
				}
				
				//Clears Everything
				pizzaTypePnl.clearPizza();
				topPnl.clearTop();
				drinks.rbPepsi();
				drinks.rbDietPepsi();
				drinks.rbSunkist();
				drinks.rbDietSunkist();
				drinks.rbRootBeer();
				drinks.rbDietRootBeer();
				drinks.rbSierraMist();
				drinks.rbLemonade();
				side.clearAll();
				
			}
		});
		
		
		//If Drinks was clicked
		btnDrinks.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnDrinks.isEnabled() == true) {
					btnDrinks.setBackground(Color.decode("#FF3030"));
					btnSides.setBackground(Color.red);
					btnPizza.setBackground(Color.red);
					btnCheckout.setBackground(Color.red);
					
					//Shows drinks
					drinks.setVisible(true);
					pizzaTypePnl.setVisible(false);
					menu.setVisible(false);
					side.setVisible(false);
					cart.setVisible(false);
					topPnl.setVisible(false);
					ci.setVisible(false);
				}
				
				//Clears everything
				pizzaTypePnl.clearPizza();
				topPnl.clearTop();
				drinks.rbPepsi();
				drinks.rbDietPepsi();
				drinks.rbSunkist();
				drinks.rbDietSunkist();
				drinks.rbRootBeer();
				drinks.rbDietRootBeer();
				drinks.rbSierraMist();
				drinks.rbLemonade();
				side.clearAll();
			}
		});
		
		//If Checkout was clicked
		btnCheckout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (btnCheckout.isEnabled() == true) {
					btnCheckout.setBackground(Color.decode("#FF3030"));
					btnSides.setBackground(Color.red);
					btnDrinks.setBackground(Color.red);
					btnPizza.setBackground(Color.red);
					
					//shows cart page
					cart.setVisible(true);
					drinks.setVisible(false);
					pizzaTypePnl.setVisible(false);
					menu.setVisible(false);
					side.setVisible(false);
					topPnl.setVisible(false);
					ci.setVisible(false);
				}
				
				cart.getSum();
				cart.setTotal();
			}
		});	
		
		//PizzaType Next Button
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				topPnl.setVisible(true);
				pizzaTypePnl.setVisible(false);
			}
		});
				
		//Back Button on Pizza Topping Page Method
		btnPTBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				pizzaTypePnl.setVisible(true);
				topPnl.setVisible(false);
						
			}
		});
		
		//Continue Button on Review Cart Page
		btnContinue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				ci.setVisible(true);
				cart.setVisible(false);				
			}
		});
		
		//Back Button on Contact Information
		btnCIBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				ci.setVisible(false);
				cart.setVisible(true);
			}
		});
		
		//Delivery Button on Contact Information
		btnDelivery.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				d.setVisible(true);
				ci.setVisible(false);
				
			}
		});
		
		//Back Button on Delivery
		btnDBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				d.setVisible(false);
				ci.setVisible(true);
				
			}
		});
		
		//Pickup Button on Contact Information
		btnPickup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				pu.setVisible(true);
				ci.setVisible(false);
				
			}
		});
		
		//Back Button on Pickup Page
		btnPUBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				pu.setVisible(false);
				ci.setVisible(true);
			}
		});
		
		//Place Order Button on Delivery Page
		btnDPO.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				d.setVisible(false);
				oc.setVisible(true);
				oc.scrollPane.setViewportView(cart.table);
				btnPizza.setEnabled(false);
				btnSides.setEnabled(false);
				btnDrinks.setEnabled(false);
				btnCheckout.setEnabled(false);
				oc.lblTotal.setText("Total: $" + cart.total);
			}
		});
		//Place Order Button on Pickup Page
		btnPickUpPO.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				pu.setVisible(false);
				oc.setVisible(true);
				oc.scrollPane.setViewportView(cart.table);
				btnPizza.setEnabled(false);
				btnSides.setEnabled(false);
				btnDrinks.setEnabled(false);
				btnCheckout.setEnabled(false);
				oc.lblTotal.setText("Total: $" + cart.total);
			}
		});
		
		//Add to Cart Button for Pizza
		btnATC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				double base = pizzaTypePnl.base;
				double mul = pizzaTypePnl.multiplier;
				int top = topPnl.toppingCount();
				double price = mul * top + base;
				cart.model.addRow(new Object[] {"Pizza", pizzaTypePnl.desc() + topPnl.desc(), "1", price});
				topPnl.setVisible(false);
				menu.setVisible(true);
				pizzaTypePnl.clearPizza();
				topPnl.clearTop();
			}
		});
		
		//Add to Cart Button for Sides
		btnSATC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				addToCart();
				side.clearAll();
			}
		});

		
	}
	//Add to cart Method for Sides
	public void addToCart() {
		if (side.cbBS.isSelected() == true) {
			cart.model.addRow(new Object[] {"BreakSticks", "", side.cbB.getSelectedIndex()+1, (side.cbB.getSelectedIndex()+1) * 4.00 });
		}
		if (side.cbBSB.isSelected() == true) {
			cart.model.addRow(new Object[] {"BreakStick Bites", "", side.cbBSb.getSelectedIndex()+1, (side.cbBSb.getSelectedIndex()+1) * 2.00 });
			
		}
		if (side.cbBCC.isSelected() == true) {
			cart.model.addRow(new Object[] {"Big Chocolate Cookie", "", side.cbBC.getSelectedIndex()+1, (side.cbBC.getSelectedIndex()+1) * 4.00 });
		}
		
	}
}
