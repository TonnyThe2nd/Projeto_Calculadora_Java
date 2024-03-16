import java.util.EventListener;

public class Calculadora extends javax.swing.JFrame {
    public Calculadora() {
        initComponents();
    }

    //COMPONENTES PARA O FRAME
    private javax.swing.JButton cincoBttn;
    private javax.swing.JTextField contaField;
    private javax.swing.JButton dividirBttn;
    private javax.swing.JButton doisBttn;
    private javax.swing.JButton elevarBttn;
    private javax.swing.JButton fatBttn;
    private javax.swing.JButton igualBttn;
    private javax.swing.JButton somaBttn;
    private javax.swing.JButton subtrairBttn;
    private javax.swing.JButton noveBttn;
    private javax.swing.JButton oitoBttn;
    private javax.swing.JButton quatroBttn;
    private javax.swing.JButton raizBttn;
    private javax.swing.JButton seisBttn;
    private javax.swing.JButton seteBttn;
    private javax.swing.JButton tresBttn;
    private javax.swing.JButton umBttn;
    private javax.swing.JButton vezesBttn;
    private javax.swing.JButton virgulaBttn;
    private javax.swing.JButton zeroBttn; 
    private javax.swing.JButton apagarBttn;  
    private javax.swing.JButton reiniciarBttn;
    private java.awt.Font fonte;

    //VARIAVEIS DE CONTROLE
    boolean soma = false;
    boolean sub = false;
    boolean vezes = false;
    boolean div = false;
    boolean virgula = false;
    String primeiroValor;
    String segundoValor;

    //CALCULAR FATORIAL
    private int fat(int val){
        int valor = 1;
        for(int i=1; i <= val;i++){
            valor*=i;
        }
        return valor;
    }
    //ADICIONAR BOTÕES A CONTA
    private void umBttnActionPerformed(){
        contaField.setText(contaField.getText() + "1");
    }
    private void doisBttnActionPerformed(){
        contaField.setText(contaField.getText() +"2");
    }
    private void tresBttnActionPerformed(){
        contaField.setText(contaField.getText() +"3");
    }
    private void cincoBttnActionPerformed(){
        contaField.setText(contaField.getText() +"5");
    }
    private void seisBttnActionPerformed(){
        contaField.setText(contaField.getText() +"6");
    }
    private void seteBttnActionPerformed(){
        contaField.setText(contaField.getText() +"7");
    }
    private void oitoBttnActionPerformed(){
        contaField.setText(contaField.getText() +"8");
    }
    private void noveBttnActionPerformed(){
        contaField.setText(contaField.getText() +"9");
    }
    private void zeroBttnActionPerformed(){
        contaField.setText(contaField.getText() +"0");
    }
    private void quatroBttnActionPerformed(){
        contaField.setText(contaField.getText() +"4");
    }
    //SOMAR VALORES
    private void somaBttnActionPerformed(){
        soma = true;
        sub = false;
        vezes = false;
        div = false;
        primeiroValor = contaField.getText();
        contaField.setText("");
    }
    //SUBTRAIR VALORES
    private void subtrairBttnActionPerformed(){
        sub = true;
        soma = false;
        vezes = false;
        div = false;
        primeiroValor = contaField.getText();
        contaField.setText("");
    }
    //MULTIPLICAR VALORES
    private void vezesBttnrActionPerformed(){
        vezes = true;
        sub = false;
        soma = false;
        div = false;
        primeiroValor = contaField.getText();
        contaField.setText("");
    }
    //DIVIDIR VALORES
    private void dividirBttnActionPerformed(){
        div = true;
        sub = false;
        soma = false;
        vezes = false;
        primeiroValor = contaField.getText();
        contaField.setText("");
    }
    //CALCULAR FATORIAL DO NÚMERO SELECIONADO
    private void fatBttnActionPerformed(){
        sub = false;
        soma = false;
        vezes = false;
        div = false;
        primeiroValor = contaField.getText();
        int resultado = fat(Integer.valueOf(primeiroValor));
        contaField.setText("" + resultado );
    }
    //ELEVAR O NÚMERO SELECIONADO A 2
    private void elevarBttnActionPerformed(){
        sub = false;
        soma = false;
        vezes = false;
        div = false;
        primeiroValor = contaField.getText();
        contaField.setText("" + Math.pow(Integer.valueOf(primeiroValor),2));
    }
    //CALCULAR A RAIZ DO NÚMERO SELECIONADO
    private void raizBttnActionPerformed(){
        sub = false;
        soma = false;
        vezes = false;
        div = false;
        primeiroValor = contaField.getText();
        if(virgula == true){
            contaField.setText(""+Math.sqrt(Integer.valueOf(primeiroValor)));
        }else{
            contaField.setText(""+Math.sqrt(Double.valueOf(primeiroValor)));
        }
    }
    //ADICIONAR VIRGULA E TRANSFORMAR A CONTA EM VALOR REAL
    private void virgulaBttnActionPerformed(){
        contaField.setText(contaField.getText() + ".");
        virgula = true;
    }

    //BOTÃO PARA REINICIAR TODA A CONTA
    private void reiniciarBttnActionPerformed(){
        contaField.setText("");
        primeiroValor = "";
        segundoValor = "";
    }

    //BOTÃO PARA APAGAR ULTIMO VALOR DIGITADO
    private void apagarBttnActionPerformed(){
        String textoAtual = contaField.getText();
        if(!textoAtual.isEmpty()){
            String novoTexto = textoAtual.substring(0, textoAtual.length()-1);
            contaField.setText(novoTexto);
        }

        
    }

    //BOTÃO PARA EXIBIR O RESULTADO DA CONTA
    private void igualBttnActionPerformed(){
        segundoValor = contaField.getText();
        if(sub == true){
            if(virgula == true){
                contaField.setText("" + (Double.valueOf(primeiroValor) - Double.valueOf(segundoValor)));
            }else{
                contaField.setText("" + (Integer.valueOf(primeiroValor) - Integer.valueOf(segundoValor)));
            }
        }else if(soma == true){
            if(virgula == true){
                contaField.setText("" + (Double.valueOf(primeiroValor) + Double.valueOf(segundoValor)));
            }else{
                contaField.setText("" + (Integer.valueOf(primeiroValor) + Integer.valueOf(segundoValor)));
            }
        }else if(div == true){
            contaField.setText("" + (Double.valueOf(primeiroValor) /Double.valueOf(segundoValor)));
        }else if(vezes == true){
            if(virgula == true){
                contaField.setText("" + (Double.valueOf(primeiroValor) * Double.valueOf(segundoValor)));
            }else{
                contaField.setText("" + (Integer.valueOf(primeiroValor) * Integer.valueOf(segundoValor)));
            }
        }
        soma = false;
        sub = false;
        vezes = false;
        div = false;
        
    }
    //CONFIGURAÇÕES DO FRAME

    private void initComponents() {
        contaField = new javax.swing.JTextField();
        oitoBttn = new javax.swing.JButton();
        noveBttn = new javax.swing.JButton();
        seteBttn = new javax.swing.JButton();
        cincoBttn = new javax.swing.JButton();
        seisBttn = new javax.swing.JButton();
        doisBttn = new javax.swing.JButton();
        quatroBttn = new javax.swing.JButton();
        umBttn = new javax.swing.JButton();
        virgulaBttn = new javax.swing.JButton();
        zeroBttn = new javax.swing.JButton();
        igualBttn = new javax.swing.JButton();
        tresBttn = new javax.swing.JButton();
        fatBttn = new javax.swing.JButton();
        somaBttn = new javax.swing.JButton();
        dividirBttn = new javax.swing.JButton();
        elevarBttn = new javax.swing.JButton();
        subtrairBttn = new javax.swing.JButton();
        vezesBttn = new javax.swing.JButton();
        raizBttn = new javax.swing.JButton();
        apagarBttn = new javax.swing.JButton();
        reiniciarBttn = new javax.swing.JButton();
        fonte = new java.awt.Font("Segoe UI", 1, 14);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); 


        reiniciarBttn.setFont(fonte);
        reiniciarBttn.setText("CE");
        reiniciarBttn.addActionListener(e -> reiniciarBttnActionPerformed());

        apagarBttn.setFont(fonte);
        apagarBttn.setText("<-");
        apagarBttn.addActionListener(e -> apagarBttnActionPerformed());

        oitoBttn.setFont(fonte);
        oitoBttn.setText("8");
        oitoBttn.addActionListener(e -> oitoBttnActionPerformed());

        noveBttn.setFont(fonte);
        noveBttn.setText("9");
        noveBttn.addActionListener(e -> noveBttnActionPerformed());

        seteBttn.setFont(fonte);
        seteBttn.setText("7");
        seteBttn.addActionListener(e -> seteBttnActionPerformed());

        cincoBttn.setFont(fonte);
        cincoBttn.setText("5");
        cincoBttn.addActionListener(e -> cincoBttnActionPerformed());

        seisBttn.setFont(fonte);
        seisBttn.setText("6");
        seisBttn.addActionListener(e -> seisBttnActionPerformed());

        doisBttn.setFont(fonte);
        doisBttn.setText("2");
        doisBttn.addActionListener(e -> doisBttnActionPerformed());

        quatroBttn.setFont(fonte);
        quatroBttn.setText("4");
        quatroBttn.addActionListener(e -> quatroBttnActionPerformed());

        umBttn.setFont(fonte);
        umBttn.setText("1");
        umBttn.addActionListener(e -> umBttnActionPerformed());

        virgulaBttn.setFont(fonte);
        virgulaBttn.setText(",");
        virgulaBttn.addActionListener(e -> virgulaBttnActionPerformed());


        zeroBttn.setFont(fonte);
        zeroBttn.setText("0");
        zeroBttn.addActionListener(e -> zeroBttnActionPerformed());

        igualBttn.setFont(fonte);
        igualBttn.setText("=");
        igualBttn.addActionListener(e -> igualBttnActionPerformed());

        tresBttn.setFont(fonte);
        tresBttn.setText("3");
        tresBttn.addActionListener(e -> tresBttnActionPerformed());

        fatBttn.setFont(fonte);
        fatBttn.setText("FAT");
        fatBttn.addActionListener(e -> fatBttnActionPerformed());

        somaBttn.setFont(fonte);
        somaBttn.setText("+");
        somaBttn.addActionListener(e -> somaBttnActionPerformed());

        dividirBttn.setFont(fonte);
        dividirBttn.setText("/");
        dividirBttn.addActionListener(e -> dividirBttnActionPerformed());

        elevarBttn.setFont(fonte);
        elevarBttn.setText("²");
        elevarBttn.addActionListener(e -> elevarBttnActionPerformed());

        subtrairBttn.setFont(fonte);
        subtrairBttn.setText("-");
        subtrairBttn.addActionListener(e -> subtrairBttnActionPerformed());

        vezesBttn.setFont(fonte);
        vezesBttn.setText("*");
        vezesBttn.addActionListener(e -> vezesBttnrActionPerformed());

        raizBttn.setFont(fonte);
        raizBttn.setText("Raiz");
        raizBttn.addActionListener(e -> raizBttnActionPerformed());

        contaField.setFont(new java.awt.Font("Segoe UI", 1, 20));
        contaField.setEditable(false);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(quatroBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cincoBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(seteBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oitoBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(zeroBttn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(umBttn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doisBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apagarBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(noveBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subtrairBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(seisBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(somaBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(virgulaBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(igualBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tresBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dividirBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fatBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(elevarBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(raizBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vezesBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(10, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(contaField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reiniciarBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reiniciarBttn, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(contaField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fatBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elevarBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vezesBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(raizBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oitoBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noveBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seteBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtrairBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cincoBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seisBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quatroBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(somaBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doisBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(umBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tresBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dividirBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zeroBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(virgulaBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(igualBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apagarBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }                              
}   
