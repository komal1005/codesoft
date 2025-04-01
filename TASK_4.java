import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.io.*;

public class TASK_4 extends JFrame {

	private JPanel contentPane;
	public JTextField textField;
	public Image i;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TASK_4 frame = new TASK_4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}

	public TASK_4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 909, 644);
		
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Currency Converter");
		lblNewLabel.setForeground(new Color(72, 61, 139));
		lblNewLabel.setBackground(new Color(139, 0, 139));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 60));
		lblNewLabel.setBounds(429, 26, 526, 59);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Select input currency");
		lblNewLabel_1.setForeground(new Color(255, 20, 147));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(286, 112, 361, 52);
		contentPane.add(lblNewLabel_1);
		
		Choice choice = new Choice();
		choice.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		choice.setForeground(new Color(210, 105, 30));
		choice.add("US Dollar");
		choice.add("Indian Rupee");
		choice.add("Egyptian Pound");
		choice.add("Euro");
		choice.add("Canadian Dollar");
		choice.add("Hong kong Dollar");
		choice.add("Chinese Yaun(offshore)");
		choice.setBounds(720, 124, 318, 40);
		contentPane.add(choice);
		
		JLabel lblNewLabel_2 = new JLabel("Amount");
		lblNewLabel_2.setForeground(new Color(255, 20, 147));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblNewLabel_2.setBounds(286, 192, 211, 47);
		contentPane.add(lblNewLabel_2);
		
		Choice choice_1 = new Choice();
		choice_1.setForeground(new Color(210, 105, 30));
		choice_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		choice_1.add("US Dollar");
		choice_1.add("Indian Rupee");
		choice_1.add("Egyptian Pound");
		choice_1.add("Euro");
		choice_1.add("Canadian Dollar");
		choice_1.add("Hong kong Dollar");
		choice_1.add("Chinese Yaun(offshore)");
		choice_1.setBounds(720, 265, 318, 40);
		contentPane.add(choice_1);
		
		textField = new JTextField();
		textField.setForeground(new Color(60, 179, 113));
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField.setBounds(720, 202, 318, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Select output currency");
		lblNewLabel_3.setForeground(new Color(255, 20, 147));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblNewLabel_3.setBounds(286, 265, 361, 52);
		contentPane.add(lblNewLabel_3);
		
		TextField textField_1 = new TextField();
		textField_1.setForeground(new Color(60, 179, 113));
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField_1.setBounds(732, 459, 306, 40);
		contentPane.add(textField_1);
		
		Button button_1 = new Button("Clear");
		button_1.setForeground(new Color(255, 140, 0));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choice.select("US Dollar");
		        choice_1.select("US Dollar");
				textField_1.setText(" ");
				textField.setText(" ");
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		button_1.setBounds(627, 550, 186, 47);
		contentPane.add(button_1);
		
		Button button = new Button("Convert");
		button.setForeground(new Color(255, 127, 80));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a,b,c=0;
				a=Double.valueOf(textField.getText());
				try{
					if(choice.getSelectedIndex()==0 & choice_1.getSelectedIndex()==1){
						c= a*85.51;}
					if(choice.getSelectedIndex()==0 & choice_1.getSelectedIndex()==2){
						c= a*46.50;}
					if(choice.getSelectedIndex()==0 & choice_1.getSelectedIndex()==3){
						c= a*0.92;}
					if(choice.getSelectedIndex()==0 & choice_1.getSelectedIndex()==4){
						c= a*1.36;}
					if(choice.getSelectedIndex()==0 & choice_1.getSelectedIndex()==5){
						c= a*7.82;}
					if(choice.getSelectedIndex()==0 & choice_1.getSelectedIndex()==6){
						c= a*7.27;}
					if(choice.getSelectedIndex()==1 & choice_1.getSelectedIndex()==0){
						c= a*0.012;}
					if(choice.getSelectedIndex()==1 & choice_1.getSelectedIndex()==2){
						c= a*0.56;}
					if(choice.getSelectedIndex()==1 & choice_1.getSelectedIndex()==3){
						c= a*0.011;}
					if(choice.getSelectedIndex()==1 & choice_1.getSelectedIndex()==4){
						c= a*0.016;}
					if(choice.getSelectedIndex()==1 & choice_1.getSelectedIndex()==5){
						c= a*0.094;}
					if(choice.getSelectedIndex()==1 & choice_1.getSelectedIndex()==6){
						c= a*0.087;}
					if(choice.getSelectedIndex()==2 & choice_1.getSelectedIndex()==0){
						c= a*0.021;}
					if(choice.getSelectedIndex()==2 & choice_1.getSelectedIndex()==1){
						c= a*1.76;}
					if(choice.getSelectedIndex()==2 & choice_1.getSelectedIndex()==3){
						c= a*0.019;}
					if(choice.getSelectedIndex()==2 & choice_1.getSelectedIndex()==4){
						c= a*0.029;}
					if(choice.getSelectedIndex()==2 & choice_1.getSelectedIndex()==5){
						c= a*0.17;}
					if(choice.getSelectedIndex()==2 & choice_1.getSelectedIndex()==6){
						c= a*0.15;}
					if(choice.getSelectedIndex()==3 & choice_1.getSelectedIndex()==0){
						c= a*1.08;}
					if(choice.getSelectedIndex()==3 & choice_1.getSelectedIndex()==1){
						c= a*90.39;}
					if(choice.getSelectedIndex()==3 & choice_1.getSelectedIndex()==2){
						c= a*51.37;}
					if(choice.getSelectedIndex()==3 & choice_1.getSelectedIndex()==4){
						c= a*1.47;}
					if(choice.getSelectedIndex()==3 & choice_1.getSelectedIndex()==5){
						c= a*8.48;}
					if(choice.getSelectedIndex()==3 & choice_1.getSelectedIndex()==6){
						c= a*7.86;}
					if(choice.getSelectedIndex()==4 & choice_1.getSelectedIndex()==0){
						c= a*1.08;}
					if(choice.getSelectedIndex()==4 & choice_1.getSelectedIndex()==1){
						c= a*90.40;}
					if(choice.getSelectedIndex()==4 & choice_1.getSelectedIndex()==2){
						c= a*51.37;}
					if(choice.getSelectedIndex()==4 & choice_1.getSelectedIndex()==3){
						c= a*1.47;}
					if(choice.getSelectedIndex()==4 & choice_1.getSelectedIndex()==5){
						c= a*8.48;}
					if(choice.getSelectedIndex()==4 & choice_1.getSelectedIndex()==6){
						c= a*7.86;}
					if(choice.getSelectedIndex()==5 & choice_1.getSelectedIndex()==0){
						c= a*0.74;}
					if(choice.getSelectedIndex()==5 & choice_1.getSelectedIndex()==1){
						c= a*61.42;}
					if(choice.getSelectedIndex()==5 & choice_1.getSelectedIndex()==2){
						c= a*34.89;}
					if(choice.getSelectedIndex()==5 & choice_1.getSelectedIndex()==3){
						c= a*0.68;}
					if(choice.getSelectedIndex()==5 & choice_1.getSelectedIndex()==4){
						c= a*5.76;}
					if(choice.getSelectedIndex()==5 & choice_1.getSelectedIndex()==6){
						c= a*5.34;}
					if(choice.getSelectedIndex()==6 & choice_1.getSelectedIndex()==0){
						c= a*0.160762;}
					if(choice.getSelectedIndex()==6 & choice_1.getSelectedIndex()==1){
						c= a*9.689100;}
					if(choice.getSelectedIndex()==6 & choice_1.getSelectedIndex()==2){
						c= a*0.095673;}
					if(choice.getSelectedIndex()==6 & choice_1.getSelectedIndex()==3){
						c= a*0.116292;}
					if(choice.getSelectedIndex()==6 & choice_1.getSelectedIndex()==4){
						c= a*0.176855;}
					if(choice.getSelectedIndex()==6 & choice_1.getSelectedIndex()==5){
						c= a*0.590495;}
					textField_1.setText(String.valueOf(c));
				    }catch(Exception x)
				{System.out.println("Error");}
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		button.setBounds(530, 357, 355, 52);
		contentPane.add(button);
		
		JLabel lblNewLabel_4 = new JLabel("Converted Amount");
		lblNewLabel_4.setForeground(new Color(255, 20, 147));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblNewLabel_4.setBounds(292, 452, 333, 47);
		contentPane.add(lblNewLabel_4);
	}
}