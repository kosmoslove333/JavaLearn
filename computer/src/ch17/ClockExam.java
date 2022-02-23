package ch17;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClockExam extends JFrame implements Runnable{

	private JPanel contentPane;
	private Calendar cal;
	private String str;
	private JLabel lblTime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClockExam frame = new ClockExam();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClockExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblTime = new JLabel("New label");
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTime, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		Thread t= new Thread(this); //백그라운드 스레드를 생성
		t.start(); //스레드 작업 요청 => 런 함수가 실
	}
// 알트 시프트 와이 줄바꿈
	@Override
	public void run() { //백그라운드 스레드가 실행하는 코드
		while(true) {
			cal = Calendar.getInstance();
			
			//String.format("출력형식", 출력할 값) 02d 숫자 2자리, 빈자리는 0으로 채
			str = String.format("%02d:%02d:%02d", cal.get(Calendar.HOUR_OF_DAY),cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
			lblTime.setText(str); //레이블에 텍스트를 입력
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		
	}

}
