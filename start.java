import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class start extends javax.swing.JFrame {
   String n;
   int i=0;
   
    public start() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        nameS = new javax.swing.JTextField();
        hourStart = new javax.swing.JLabel();
        hourS = new javax.swing.JTextField();
        hourEnd = new javax.swing.JLabel();
        hourE = new javax.swing.JTextField();
        population = new javax.swing.JLabel();
        popu = new javax.swing.JTextField();
        listInfo = new javax.swing.JButton();
        listPer = new javax.swing.JButton();
        search = new javax.swing.JButton();
        attendance = new javax.swing.JButton();
        add = new javax.swing.JButton();
        out = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jLabel1.setText("سمینار");

        name.setText("اسم سمینار");

        nameS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameSActionPerformed(evt);
            }
        });

        hourStart.setText("ساعت شروع");

        hourS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourSActionPerformed(evt);
            }
        });

        hourEnd.setText("ساعت پایان");

        hourE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourEActionPerformed(evt);
            }
        });

        population.setText("ظرفیت");

        popu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popuActionPerformed(evt);
            }
        });

        listInfo.setText("لیست اطلاعات دانشجویان");
        listInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listInfoActionPerformed(evt);
            }
        });

        listPer.setText("لیست افراد حاضر");
        listPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listPerActionPerformed(evt);
            }
        });

        search.setText("جست و جو");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        attendance.setText("چک کردن حضور فرد");
        attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendanceActionPerformed(evt);
            }
        });

        add.setText("ثبت نام ");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        out.setText("خروج");
        out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outActionPerformed(evt);
            }
        });

        jLabel2.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listInfo)
                            .addComponent(attendance))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listPer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(name)
                                .addGap(18, 18, 18)
                                .addComponent(nameS, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hourStart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hourS)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(population)
                                .addGap(18, 18, 18)
                                .addComponent(popu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(hourEnd)
                                .addGap(18, 18, 18)
                                .addComponent(hourE, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(out, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(nameS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(population)
                    .addComponent(popu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourStart)
                    .addComponent(hourS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourEnd)
                    .addComponent(hourE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listInfo)
                    .addComponent(listPer)
                    .addComponent(search))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attendance)
                    .addComponent(add))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(out, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>                        

     void listInfoActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        ListInfo l=new ListInfo();
        l.setVisible(true);
    }                                        

     void searchActionPerformed(java.awt.event.ActionEvent evt) {                                       
      search s=new search();
      s.setVisible(true);
    }                                      

     void outActionPerformed(java.awt.event.ActionEvent evt) {  
    	 saveOut();
        Welcome w=new Welcome();
        setVisible(false);
        w.setVisible(true);
    }                                   

     void addActionPerformed(java.awt.event.ActionEvent evt) { 
    	 if(i>=Integer.parseInt(popu.getText())) {
    		 
        JOptionPane.showMessageDialog(add,"ظرفیت پر است","ارور",JOptionPane.ERROR_MESSAGE);
    	 }
    	 else {
        register r=new register();
        r.setVisible(true);
        i++;
        }
    	 
    }                                   

     void listPerActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
        List li=new List();
        
        li.setVisible(true);
       
    }                                       

     void attendanceActionPerformed(java.awt.event.ActionEvent evt) {                                           
       Check c=new Check();
       c.setVisible(true);
       
    }                                          

   public  void nameSActionPerformed(java.awt.event.ActionEvent evt) {                                      
        
    }                                     

   public  void popuActionPerformed(java.awt.event.ActionEvent evt) {                                     
        
    }                                    

   public  void hourSActionPerformed(java.awt.event.ActionEvent evt) {                                      
        
    }                                     

    public void hourEActionPerformed(java.awt.event.ActionEvent evt) {                                      
       
    }                                     
 public void save(String nam,int pass,int age,int id,String date) {
    
    	try{
    		   FileWriter out=new FileWriter("file.txt",true);
    		         
    				out.write(nam+","+pass+","+age+","+id+","+date+",,");
    			    
    			out.close();
    			}
    			
    		
    		 catch (IOException e) {
					
					e.printStackTrace();
				}

    }
    public String saveOut() {
      
       try{
    	   
 		   FileWriter out=new FileWriter(nameS.getText()+".txt",true);
 			 	Seminar s=new Seminar();
 			 	s.load();
 	            for(int i=0;i<s.s.size();i++) {
 	            	s.loadList(i);
 	            	out.write(s.name+","+s.pass+","+s.age+","+s.id+","+s.dat+",,");
 	            }
 	            out.write("*******");
 				out.write(nameS.getText()+","+popu.getText()+","+hourS.getText()+","+hourE.getText());
 			
 			out.close();
 			}
 			
 			
 			 catch (IOException e) {
				
				e.printStackTrace();
			}
       return n;
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
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
     javax.swing.JButton add;
     javax.swing.JButton attendance;
     javax.swing.JTextField hourE;
     javax.swing.JLabel hourEnd;
     javax.swing.JTextField hourS;
     javax.swing.JLabel hourStart;
     javax.swing.JButton jButton1;
     javax.swing.JLabel jLabel1;
     javax.swing.JLabel jLabel2;
     javax.swing.JButton listInfo;
     javax.swing.JButton listPer;
     javax.swing.JLabel name;
     javax.swing.JTextField nameS;
     javax.swing.JButton out;
     javax.swing.JTextField popu;
     javax.swing.JLabel population;
     javax.swing.JButton search;
    // End of variables declaration                   
}
