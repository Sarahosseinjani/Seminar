import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class register extends javax.swing.JFrame {

	 Seminar s=new Seminar();
	 start st=new start();
    public register() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
     void initComponents() {

        name = new javax.swing.JLabel();
        nam = new javax.swing.JTextField();
        age = new javax.swing.JLabel();
        Age = new javax.swing.JTextField();
        Id = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        pas = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        sav = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        name.setText("نام و نام خانوادگی ");

        nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namActionPerformed(evt);
            }
        });

        age.setText("سن");

        Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeActionPerformed(evt);
            }
        });

        Id.setText("شماره دانشجویی");

        number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });

        pas.setText("رمز");

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uniNameActionPerformed(evt);
            }
        });

        sav.setText("ذخیره");
        sav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pas)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Id))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(nam)
                            .addComponent(Age)
                            .addComponent(number))))
                .addContainerGap(162, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sav)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Id)
                    .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(pas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(sav)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>                        

     void namActionPerformed(java.awt.event.ActionEvent evt) {                                    
        
    }                                   

    void AgeActionPerformed(java.awt.event.ActionEvent evt) {                                    
        
    }                                   

     void numberActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
    }                                      

     void uniNameActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
    }                                       

     void savActionPerformed(java.awt.event.ActionEvent evt) { 
    	 
    	 String name=nam.getText();
         int password=Integer.parseInt(pass.getText());
         int age=Integer.parseInt(Age.getText());
         int id=Integer.parseInt(number.getText());
         DateTimeFormatter dtf= DateTimeFormatter.ofPattern("HH:mm:ss");
   	     LocalDateTime now=LocalDateTime.now();
   	     String date=dtf.format(now);
   	     int f=s.check(id);
   	     
   	     if(f==1) {
   	    	JOptionPane.showMessageDialog(Id,"شما قبلا ثبت نام کرده اید","خطا",JOptionPane.INFORMATION_MESSAGE);
   	     }
   	     else {
         s.add(name, password, age, id,date);
         
         st.save(name, password, age, id,date);
         }
        
    }
     

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    javax.swing.JTextField Age;
    javax.swing.JLabel age;
    javax.swing.JTextField nam;
    javax.swing.JLabel name;
    javax.swing.JTextField number;
    javax.swing.JLabel Id;
    javax.swing.JButton sav;
    javax.swing.JLabel pas;
    javax.swing.JTextField pass;
    // End of variables declaration                   
}

