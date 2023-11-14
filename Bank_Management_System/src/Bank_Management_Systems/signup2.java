package Bank_Management_Systems;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class signup2 extends JFrame implements ActionListener {
    JTextField occupationTextField,Birth_CertificateTextField,National_IDTextField;
    JButton next;
    JRadioButton SYes,SNo,EYes,ENo;
    JComboBox religionCB,categoryCB,incomeCB,educational_QualificationCB;
    String formNumber;


    signup2(String formNumber){

        this.formNumber = formNumber;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FROM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,300,30);
        add(additionalDetails);

        JLabel religionJl = new JLabel("Religion: ");
        religionJl.setFont(new Font("Raleway",Font.BOLD,20));
        religionJl.setBounds(100,140,200,30);
        add(religionJl);

        String [] valReligion = {"Muslim","Hindu","Buddhist","Christian","Other"};
        religionCB = new JComboBox(valReligion);
        religionCB.setBounds(300,140,400,30);
        religionCB.setBackground(Color.WHITE);
        add(religionCB);

        JLabel categoryJl = new JLabel("Category: ");
        categoryJl.setFont(new Font("Raleway",Font.BOLD,20));
        categoryJl.setBounds(100,190,200,30);
        add(categoryJl);

        String [] valCategory = {"General","OBC","SC","ST","Other"};
        categoryCB = new JComboBox(valCategory);
        categoryCB.setBounds(300,190,400,30);
        categoryCB.setBackground(Color.WHITE);
        add(categoryCB);

        JLabel incomeJL = new JLabel("Monthly Income: ");
        incomeJL.setFont(new Font("Raleway",Font.BOLD,20));
        incomeJL.setBounds(100,240,200,30);
        add(incomeJL);

        String [] valIncome = {"null","< 10000","< 20000","< 30000","< 40000","< 50000","< 60000","< 70000","< 80000","< 90000","< 100000","upto 100000"};
        incomeCB = new JComboBox(valIncome);
        incomeCB.setBounds(300,240,400,30);
        incomeCB.setBackground(Color.WHITE);
        add(incomeCB);

        JLabel educational_QualificationJL1 = new JLabel("Educational");
        educational_QualificationJL1.setFont(new Font("Raleway",Font.BOLD,20));
        educational_QualificationJL1.setBounds(100,290,200,30);
        add(educational_QualificationJL1);

        JLabel educational_QualificationJL2 = new JLabel("Qualification: ");
        educational_QualificationJL2.setFont(new Font("Raleway",Font.BOLD,20));
        educational_QualificationJL2.setBounds(100,315,200,30);
        add(educational_QualificationJL2);

        String [] Valeducational_Qualification = {"Non Graduation","Graduate","Post Graduate","Doctorate","Other"};
        educational_QualificationCB = new JComboBox(Valeducational_Qualification);
        educational_QualificationCB.setBounds(300,315,400,30);
        educational_QualificationCB.setBackground(Color.WHITE);
        add(educational_QualificationCB);

        JLabel occupationJL = new JLabel("Occupation: ");
        occupationJL.setFont(new Font("Raleway",Font.BOLD,20));
        occupationJL.setBounds(100,390,200,30);
        add(occupationJL);

        occupationTextField = new JTextField();
        occupationTextField.setFont(new Font("Raleway",Font.BOLD,14));
        occupationTextField.setBounds(300,390,400,30);
        add(occupationTextField);

        JLabel Birth_CertificateJL = new JLabel("Birth Certificate No: ");
        Birth_CertificateJL.setFont(new Font("Raleway",Font.BOLD,20));
        Birth_CertificateJL.setBounds(100,440,200,30);
        add(Birth_CertificateJL);

        Birth_CertificateTextField = new JTextField();
        Birth_CertificateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        Birth_CertificateTextField.setBounds(300,440,400,30);
        add(Birth_CertificateTextField);

        JLabel National_IDJL = new JLabel("NID No: ");
        National_IDJL.setFont(new Font("Raleway",Font.BOLD,20));
        National_IDJL.setBounds(100,490,200,30);
        add(National_IDJL);

        National_IDTextField = new JTextField();
        National_IDTextField.setFont(new Font("Raleway",Font.BOLD,14));
        National_IDTextField.setBounds(300,490,400,30);
        add(National_IDTextField);

        JLabel senior_CitizenJL = new JLabel("Senior Citizen: ");
        senior_CitizenJL.setFont(new Font("Raleway",Font.BOLD,20));
        senior_CitizenJL.setBounds(100,540,200,30);
        add(senior_CitizenJL);

        SYes = new JRadioButton("Yes");
        SYes.setBounds(300,540,100,30);
        SYes.setBackground(Color.WHITE);
        add(SYes);

        SNo = new JRadioButton("No");
        SNo.setBounds(450,540,100,30);
        SNo.setBackground(Color.WHITE);
        add(SNo);

        ButtonGroup seniorButtonGroup = new ButtonGroup();
        seniorButtonGroup.add(SYes);
        seniorButtonGroup.add(SNo);

        JLabel existing_ACJL = new JLabel("Exisiting Account: ");
        existing_ACJL.setFont(new Font("Raleway",Font.BOLD,20));
        existing_ACJL.setBounds(100,590,200,30);
        add(existing_ACJL);

        EYes = new JRadioButton("Yes");
        EYes.setBounds(300,590,100,30);
        EYes.setBackground(Color.WHITE);
        add(EYes);

        ENo = new JRadioButton("No");
        ENo.setBounds(450,590,100,30);
        ENo.setBackground(Color.WHITE);
        add(ENo);

        ButtonGroup exisitingButtonGroup = new ButtonGroup();
        exisitingButtonGroup.add(EYes);
        exisitingButtonGroup.add(ENo);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(Color.WHITE);

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ac){

        String religion = (String) religionCB.getSelectedItem();
        String category = (String) categoryCB.getSelectedItem();
        String income = (String) incomeCB.getSelectedItem();
        String educational_Qualification = (String) educational_QualificationCB.getSelectedItem();

        String senior_Citizen = null;
        if(SYes.isSelected()){
            senior_Citizen = "Yes";
        } else if (SNo.isSelected()) {
            senior_Citizen = "No";
        }

        String existing_AC = null;
        if(EYes.isSelected()){
            existing_AC = "Yes";
        } else if (SNo.isSelected()) {
            existing_AC = "No";
        }

        String occupation = occupationTextField.getText();
        String  birth_Certificate = Birth_CertificateTextField.getText();
        String  national_ID = National_IDTextField.getText();

        try {
            if(religion == (null)){
                JOptionPane.showMessageDialog(null,"Religion is Required");
            } else if (category == (null)) {
                JOptionPane.showMessageDialog(null,"Category is Required");
            }else if (income == (null)) {
                JOptionPane.showMessageDialog(null,"Income is Required");
            }else if (educational_Qualification == (null)) {
                JOptionPane.showMessageDialog(null,"Educational Qualification is Required");
            }else if (occupation.equals("")) {
                JOptionPane.showMessageDialog(null,"Occupation is Required");
            }else if (birth_Certificate.equals("")) {
                JOptionPane.showMessageDialog(null,"Birth Certificate Number is Required");
            }else if (national_ID.equals("")) {
                JOptionPane.showMessageDialog(null,"National ID Number is Required");
            }else if (senior_Citizen == (null)) {
                JOptionPane.showMessageDialog(null,"Senior Citizen is Missing");
            }else if (existing_AC == (null)) {
                JOptionPane.showMessageDialog(null,"Existing Account is Missing");
            }else {
                conn c = new conn();
                String query = "insert into signupTwo(Form_No,Religion,Category,Monthly_Income,E_Qualification,Occupation,Birth_Certificate_Number,National_ID,Senior_Citizen,Existing_Account) values('"+formNumber+"','"+religion+"','"+category+"','"+income+"','"+educational_Qualification+"','"+occupation+"','"+birth_Certificate+"','"+national_ID+"','"+senior_Citizen+"','"+existing_AC+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new signup3(formNumber).setVisible(true);
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public static void main(String[]args){
        new signup2("");
    }
}
