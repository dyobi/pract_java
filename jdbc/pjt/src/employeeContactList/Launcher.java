package employeeContactList;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Launcher extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private static Dao dao;

//	Launch the application ----------------------------------------------
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dao = new Dao();
					Launcher frame = new Launcher();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//	Create the frame ----------------------------------------------------
	public Launcher() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		Button Set ------------------------------------------------------
		JButton btnInsert = new JButton("INSERT");
		btnInsert.setBounds(6, 6, 226, 82);
		contentPane.add(btnInsert);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(238, 6, 226, 82);
		contentPane.add(btnUpdate);
		
		JButton btnSelect = new JButton("SELECT ALL");
		btnSelect.setBounds(238, 92, 226, 82);
		contentPane.add(btnSelect);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(6, 92, 226, 82);
		contentPane.add(btnDelete);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(340, 518, 124, 38);
		contentPane.add(btnExit);
		
//		Output Area ------------------------------------------------------
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 186, 458, 320);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		textArea.setText("  TelTable5 Database :)");
		textArea.setColumns(10);
		
//		Functions --------------------------------------------------------
		btnSelect.addActionListener(new SelectActionListener(textArea, dao));
		btnDelete.addActionListener(new DeleteActionListener(textArea, dao));
		btnUpdate.addActionListener(new UpdateActionListener(textArea, dao));
		btnInsert.addActionListener(new InsertActionListener(textArea, dao));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

	}
}

//		--------------------------------------------------------------------------------------------------------

class SelectActionListener implements ActionListener {
	
	private JTextArea	textArea;
	private Dao			dao;
	private ArrayList<UserWrapper>	res;
	private String		text_form = "ID\tNAME\tTEL\tDATE\n-----------------------------------------------\n";
	private String		text_info;
	
	public SelectActionListener(JTextArea textArea, Dao dao) {
		this.textArea = textArea;
		this.dao = dao;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			text_info = "";
			res = dao.getAllInfo();
			for (int i = 0; i < res.size(); i++) {
				text_info = text_info + String.valueOf(res.get(i).getId()) + "\t" + res.get(i).getName() + "\t" 
						+ res.get(i).getTel() + "\t" + res.get(i).getHireDate().toString() + "\n"; 
			}
			textArea.setText(text_form + text_info);
		} catch (SQLException e1) {
			textArea.setText("DB connection went wrong.");
		}
	}
	
}

class DeleteActionListener implements ActionListener {
	
	private JTextArea	textArea;
	private Dao			dao;
	
	public DeleteActionListener(JTextArea textArea, Dao dao) {
		this.textArea = textArea;
		this.dao = dao;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int id = Integer.parseInt(JOptionPane.showInputDialog("Input id you wanna delete :"));
			dao.deleteUser(id);
			textArea.setText("Successfully deleted at ID" + id + ".");
		} catch (SQLException e1) {
			textArea.setText("DB connection went wrong.");
		}
	}
	
}

class UpdateActionListener implements ActionListener {
	
	private JTextArea	textArea;
	private Dao			dao;
	
	public UpdateActionListener(JTextArea textArea, Dao dao) {
		this.textArea = textArea;
		this.dao = dao;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int id = Integer.parseInt(JOptionPane.showInputDialog("Input your id :"));
			String tel = JOptionPane.showInputDialog("What's your new phone number :");
			dao.updateUser(id, tel);
			textArea.setText("Successfully updated : [ " + id + " / " + tel + " ].");
		} catch (SQLException e1) {
			textArea.setText("DB connection went wrong.");
		}
	}
	
}

class InsertActionListener implements ActionListener {
	
	private JTextArea	textArea;
	private Dao			dao;
	
	public InsertActionListener(JTextArea textArea, Dao dao) {
		this.textArea = textArea;
		this.dao = dao;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int id = Integer.parseInt(JOptionPane.showInputDialog("Input new id :"));
			String name = JOptionPane.showInputDialog("What's your name :");
			String tel = JOptionPane.showInputDialog("What's your phone number :");
			String date = JOptionPane.showInputDialog("What's the date today :\nex) dd/mmm/yy");
			int res = dao.insertUser(id, name, tel, date);
			textArea.setText(res == 1 ? "Successfully inserted." : "Please input valid information.");
		} catch (SQLException e1) {
			textArea.setText("DB connection went wrong.");
		}
	}
	
}
