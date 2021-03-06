/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRMbase;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 11821915
 */
public class Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    private int ID;
    
    public Cliente(int id) {
        initComponents();
        setVisual();
        if(id!=-1){ //se nao esta cadastrando novo cliente
            
        }
        this.ID=id;
    }

    final void setVisual(){
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoNome = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        labelEndereco = new javax.swing.JLabel();
        campoSaldo = new javax.swing.JTextField();
        labelSaldo = new javax.swing.JLabel();
        botaoInserir = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        historico = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        botaoNovaCompra = new javax.swing.JButton();
        campoNumero = new javax.swing.JTextField();
        labelNumero = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        botaoSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cliente");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        campoNome.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N

        labelNome.setText("Nome:");

        campoEndereco.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N

        labelEndereco.setText("Endereço:");

        campoSaldo.setEditable(false);
        campoSaldo.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        campoSaldo.setText("0");

        labelSaldo.setText("Saldo:");

        botaoInserir.setBackground(new java.awt.Color(255, 255, 255));
        botaoInserir.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        botaoInserir.setText("+");

        botaoRemover.setBackground(new java.awt.Color(255, 255, 255));
        botaoRemover.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        botaoRemover.setText("-");

        historico.setEditable(false);
        historico.setColumns(20);
        historico.setRows(5);
        jScrollPane1.setViewportView(historico);

        jLabel1.setText("Histórico de compras:");

        botaoNovaCompra.setBackground(new java.awt.Color(255, 255, 255));
        botaoNovaCompra.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        botaoNovaCompra.setText("Registrar nova compra");

        campoNumero.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N

        labelNumero.setText("Telefone:");

        campoEmail.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N

        labelEmail.setText("E-mail:");

        botaoSalvar.setBackground(new java.awt.Color(255, 255, 255));
        botaoSalvar.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botaoNovaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelSaldo)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campoSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(botaoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelNome, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campoNome, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campoEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(labelNumero)
                                    .addGap(222, 222, 222)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelEmail)
                                .addComponent(campoEmail)))))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumero)
                    .addComponent(labelEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelSaldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(campoSaldo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoRemover))
                    .addComponent(botaoNovaCompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_formWindowOpened

    /*
    *nome
    *endereco
    *tel
    *email
    *saldo
    *historico(multi)
    */
    private String gerarTexto(){
        
        String s="";
        s+=campoNome.getText().toUpperCase()+"\n"+campoEndereco.getText().toUpperCase()+"\n"+campoNumero.getText()+"\n"+
            campoEmail.getText()+"\n"+campoSaldo.getText()+"\n"+historico.getText();
        return s;
    }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if(this.ID!=-1 && !gerarTexto().equals(arky.files.read(CRMbase.pasta.toString()+"/"+this.ID+".arky"))){ //igual as informacoes do arquivo?
            int resp= JOptionPane.showConfirmDialog(this, "Há alterações não salvas! deseja salvar?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
              botaoSalvarActionPerformed(null);
            }
            else {
               setVisible(false);
            } 
        } else setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        // TODO add your handling code here:
        if(campoNome.getText().length()!=0){
            if(this.ID==-1){
                arky.files.write(CRMbase.pasta.toString()+"/"+CRMbase.proxID+".arky", gerarTexto(), false);
                CRMbase.proxID++;
                CRMbase.atualizarNomes();
            } else {
                arky.files.write(CRMbase.pasta.toString()+"/"+this.ID+".arky", gerarTexto(), false);
                CRMbase.atualizarNomes();
            }
            setVisible(false);
        } else JOptionPane.showMessageDialog(this, "Insira o nome do cliente.");
    }//GEN-LAST:event_botaoSalvarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botaoInserir;
    public javax.swing.JButton botaoNovaCompra;
    public javax.swing.JButton botaoRemover;
    public javax.swing.JButton botaoSalvar;
    public javax.swing.JTextField campoEmail;
    public javax.swing.JTextField campoEndereco;
    public javax.swing.JTextField campoNome;
    public javax.swing.JTextField campoNumero;
    public javax.swing.JTextField campoSaldo;
    public javax.swing.JTextArea historico;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel labelEmail;
    public javax.swing.JLabel labelEndereco;
    public javax.swing.JLabel labelNome;
    public javax.swing.JLabel labelNumero;
    public javax.swing.JLabel labelSaldo;
    // End of variables declaration//GEN-END:variables
}
