import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.lang.Object;
import java.util.List;
import java.util.UUID;


public class View implements ActionListener {
    
	private JFrame formLP = new JFrame();
	
    private JPanel pMain = new JPanel();
	private JPanel pButton = new JPanel();
	
	private JLabel lblNome = new JLabel("Nome:");
    private JLabel lblIdade = new JLabel("Idade:");
    private JLabel lblEndereco = new JLabel("Endereço:");
    
	private JTextField txtNome = new JTextField(12);
	private JTextField txtIdade = new JTextField(12);
	private JTextField txtEndereco = new JTextField(12);
	
	private JButton btnOk = new JButton();
    private JButton btnLimpar = new JButton();
    private JButton btnMostrar = new JButton();
    private JButton btnSair = new JButton();

    private List<Aluno> alunos = new ArrayList<Aluno>();
    private GridLayout grid = new GridLayout(3, 2, 10, 10);
        
        
        View(){
	    
	    formLP.setSize(495,138);
	    formLP.setLocation(200,200);
	    formLP.setTitle("Atividade LP");
	    formLP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
        pMain.add(lblNome);
        pMain.add(txtNome);
        lblNome.setBounds(10, 11, 61, 14);
        txtNome.setBounds(123, 8, 110, 20);
        
        pMain.add(lblEndereco);
	    pMain.add(txtEndereco);
        lblEndereco.setBounds(10, 67, 78, 20);
        txtEndereco.setBounds(123, 67, 110, 20);
	        
		pMain.add(lblIdade);
        pMain.add(txtIdade);
        lblIdade.setBounds(10, 36, 102, 20);
        txtIdade.setBounds(123, 39, 110, 20);

        pMain.add(pButton);
        pButton.setBounds(255, 11, 214, 116);
        pButton.setLayout(new GridLayout(3,2,10,10));
        
        pButton.add(btnOk);
        btnOk.setText("OK");
        btnOk.addActionListener(this);
        
        pButton.add(btnLimpar);
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(this);
        
        pButton.add(btnMostrar);
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(this);
        
        pButton.add(btnSair);
        btnSair.setText("Sair");
        btnSair.addActionListener(this);

        pMain.setLayout(null);
        formLP.getContentPane().add(pMain);
            
	    formLP.setVisible(true);
        }
        
        public void actionPerformed(ActionEvent e){
            String c = e.getActionCommand();
            if("OK".equals(c)){
                alunos.add(new Aluno(txtEndereco.getText(),txtNome.getText(),Integer.parseInt(txtIdade.getText())));
                txtNome.setText("");
                txtIdade.setText("");
                txtEndereco.setText("");
                
            }
            if("Mostrar".equals(c)){
                String msg = "";
                for(Aluno aluno : alunos){
                    
                    msg += "Id:" + aluno.getUuid() + ", ";
                    msg += "Nome:" + aluno.getNome() + ", ";
                    msg += "\n";
                }
                JOptionPane.showMessageDialog(null, msg);

            }
            if("Limpar".equals(c)){
                alunos.clear();
            }
            if("Sair".equals(c)){
                formLP.dispose();                
            }
            
        }
    
	public static void main(String[] args) {
	    
	    View view = new View();
	    
	    
	}
}