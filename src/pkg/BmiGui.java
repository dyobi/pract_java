package pkg;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class BMIGUI2 extends Frame implements ActionListener {		// ActionListener => Event
															// Event (1) 선언
	
	private Button b1 = new Button("BMI 계산");
	private Label la1 = new Label("당신의 키는");
	private Label la2 = new Label("당신의 몸무게는");

	private TextField tf1 = new TextField();
	private TextField tf2 = new TextField();
	private TextField tf3 = new TextField();
	
	public BMIGUI2 () {
		
		this.setLayout(null);	//	-> 내맘대로 디자인한다 (Pixel 단위)
		
		b1.setSize(100, 70);
		b1.setLocation(200, 300);
		this.add(b1);
		b1.addActionListener(this);
															// Event (2) 추가
		
		la1.setSize(90, 30);
		la1.setLocation(20, 70);
		this.add(la1);
		
		tf1.setSize(70, 30);
		tf1.setLocation(120, 70);
		this.add(tf1);
		
		la2.setSize(90, 30);
		la2.setLocation(20, 100);
		this.add(la2);
		
		tf2.setSize(70, 30);
		tf2.setLocation(120, 100);
		this.add(tf2);
		
		tf3.setSize(400, 50);
		tf3.setLocation(20, 400);
		this.add(tf3);
		
		this.setSize(500, 500);
		this.setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e1) {
				dispose();
				System.exit(0);
			}
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {			// Event (3) 처리함수

		if (e.getSource() == b1) {
			try {
				int ki = Integer.parseInt(tf1.getText());
				int mom = Integer.parseInt(tf2.getText());
				double mki = ki/100.0;
				double bmi = mom / Math.pow(mki, 2);
				
				String res;
				
				if (bmi >= 30.0)
					res = "비만";
				else if (bmi >= 25.0)
					res = "과체중";
				else if (bmi >= 20.0)
					res = "보통";
				else res = "저체중";
				
				tf3.setText("당신의 bmi 지수는 " + bmi +"이며 " + res + "이군요");
			} catch (NumberFormatException ex) {
				tf3.setText("키와 몸무게에 숫자를 넣어주세요");
			} catch (Exception ex2) {
				tf3.setText(ex2.getMessage());
			}
		}
		
	}
	
}

public class BmiGui {

	public static void main(String[] args) {

		new BMIGUI2();

	}

}
