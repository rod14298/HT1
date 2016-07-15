/**
 * Isaac Rodriguez 14298
 * * Julian Lopez 14084
 * 13.07.2016
 */
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.text.*;
import java.lang.*;
/**---------------------------Se crea la Clase-------------------------------
*
*/
public class gui extends JPanel{
	
    /**--------------------------Variables---------------------------------------
    *
    */
    private JLabel jLCambioemi, jLNombreemi, jLNumeroemi, jLvol, jLMemorias, jLApagado, jLNumvol, jLVol;  
    private JButton jBemiMas, jBemiMenos, jBVolMas, jBVolMenos, jBApagado,jBfrec, jBGuardar;
    private JPanel panelC, panelW, panelE, panelVol, panelApagado, panelCemi,panelMemorias, panelNomEmi, panelNom;
    private Color Mycolor;
    private JButton [] matrizJBMemorias = new JButton[12];
    private Radio radio= new Radio();
    private boolean guardar=false;
	
    public gui() {
        setLayout(new BorderLayout());
        /**------------------------Componentes de la GUI---------------
                        *
                        */
        jLCambioemi = new JLabel ("emi"); 	//Se crean e inicializan los labels 
        jLNombreemi = new JLabel ("emi:"); 	//Se crean e inicializan los labels 
        jLNumeroemi = new JLabel (); 			//Se crean e inicializan los labels 
        jLvol = new JLabel ("vol"); 		//Se crean e inicializan los labels 
        jLMemorias = new JLabel ("Memoria"); 		//Se crean e inicializan los labels 
        jLApagado = new JLabel ("Power"); 			//Se crean e inicializan los labels   
        jLNumvol= new JLabel (); 			//Se crean e inicializan los labels   
        jLVol= new JLabel ("vol:"); 			//Se crean e inicializan los labels   
        jBemiMas = new JButton("+");			//Aqui se crea un objeto tipo boton
        jBemiMenos = new JButton("-");			//Aqui se crea un objeto tipo boton
        jBVolMas = new JButton("+");				//Aqui se crea un objeto tipo boton
        jBVolMenos = new JButton("-");				//Aqui se crea un objeto tipo boton
        jBApagado = new JButton("o/- OFF ");				//Aqui se crea un objeto tipo boton
        jBfrec = new JButton(radio.getFrec());				//Aqui se crea un objeto tipo boton
        jBGuardar = new JButton("Guardar");				//Aqui se crea un objeto tipo boton
		
        for (int i = 0; i< matrizJBMemorias.length; i++){	// se recorre la matriz de Jlabel, esta matriz contiene solo casillas para formar el calendario grafico
			matrizJBMemorias[i]= new JButton(""+i);
        }
		
    Mycolor = new Color(50,150,243);		//Color del Radio
    /**------------------Paneles---------------------------------------------
                    *
                    */

    //------------------Paneles----------------------
    panelW= new JPanel();							//este panel contien todos los objetos que se colocaran para mostrar la informacion del doctor y enfermera
    panelW.setBackground (Mycolor);				//se le asigana un color, para diferenciar el panel
    panelW.setPreferredSize (new Dimension(110, 0));//se le asigna una dimension especifica
    panelCemi= new JPanel();
    panelCemi.setPreferredSize (new Dimension(70, 100));
    panelCemi.setBackground (Color.red);
    panelCemi.add(jLCambioemi);
    panelCemi.add(jBemiMas);
    panelCemi.add(jBemiMenos);
    panelW.add(panelCemi);
    //------------------Paneles----------------------
    panelE= new JPanel();							//este panel contiene todos los objetos necesarios para mostrar la informacion del doctor y cambiar de dia.
    panelE.setBackground (Mycolor);				//se le asigana un color, para diferenciar el panel
    panelE.setPreferredSize (new Dimension(180, 0));//se le asigna una dimension especifica al panel principal	
    panelVol= new JPanel();
    panelVol.setBackground (Color.red);
    panelVol.setPreferredSize (new Dimension(70, 100));
    panelVol.add(jLvol);
    panelVol.add(jBVolMas);
    panelVol.add(jBVolMenos);
    panelApagado= new JPanel();
    panelApagado.setBackground (Color.red);
    panelApagado.setPreferredSize (new Dimension(90, 70));
    panelApagado.add(jLApagado);
    panelApagado.add(jBApagado);
    panelE.add(panelVol);
    panelE.add(panelApagado);
			
    //------------------Paneles----------------------
    panelC = new JPanel();
    panelC.setLayout(new BorderLayout());			//se le da layout de borderlayout al panel para que permite colocar los demas objetos en las 5 posiciones			
    panelC.setBackground (Mycolor);
    panelMemorias= new JPanel();
    panelMemorias.setBackground (Mycolor);
    //panelMemorias.add(jLMemorias);
    JPanel panelBMemoria = new JPanel ();				
    GridLayout gl4 = new GridLayout(2, 6);			//se crea una tabla para colocar los numeros del calendario
    panelBMemoria.setLayout(gl4);						//se adiere la tabla al panel
    for (int i = 0; i< matrizJBMemorias.length; i++){	// se recorre la matriz de Jlabel, esta matriz contiene solo casillas para formar el calendario grafico
        panelBMemoria.add(matrizJBMemorias[i]);
    }
panelMemorias.add(panelBMemoria);
panelNom= new JPanel();
panelNom.setLayout(new BorderLayout());			//se le da layout de borderlayout al panel para que permite colocar los demas objetos en las 5 posiciones			
JPanel panelEspacio= new JPanel();
panelEspacio.add(jBfrec);
panelEspacio.add(new JLabel ("                                "));
panelEspacio.add(jBGuardar);
panelEspacio.setBackground (Mycolor);
panelNomEmi= new JPanel();
panelNomEmi.setBackground (Mycolor);
panelNomEmi.add(jLNombreemi);
panelNomEmi.add(jLNumeroemi);
panelNomEmi.add(new JLabel ("                     "));
panelNomEmi.add(jLVol);
panelNomEmi.add(jLNumvol);
panelNom.add(panelEspacio, BorderLayout.NORTH);
panelNom.add(panelNomEmi, BorderLayout.CENTER);
panelC.add(panelNom, BorderLayout.NORTH);
panelC.add(panelMemorias, BorderLayout.SOUTH);
//----------------------------------------
add(panelW, BorderLayout.WEST); 
add(panelE, BorderLayout.EAST); 
add(panelC, BorderLayout.CENTER);
//------------------Linseners----------------------
MemoriaButtonListener blistener1 = new MemoriaButtonListener();	//se crea un objeto detipo listener
for (int i = 0; i< matrizJBMemorias.length; i++){		//
    matrizJBMemorias[i].addActionListener(blistener1);		//s
}
			
ButtonListenerVol blistener2 = new ButtonListenerVol();	//se crea un objeto detipo listener
jBVolMas.addActionListener(blistener2);
jBVolMenos.addActionListener(blistener2);
			
ButtonListeneremi blistener3 = new ButtonListeneremi();	//se crea un objeto detipo listener
jBemiMenos.addActionListener(blistener3);
jBemiMas.addActionListener(blistener3);
			
ButtonListener blistener4 = new ButtonListener();	//se crea un objeto detipo listener
jBApagado.addActionListener(blistener4);
jBfrec.addActionListener(blistener4);
jBGuardar.addActionListener(blistener4);
}	
    /**---------------------------- Inner classs:Botton litener------------------------------------- 
            *
            */
    /**
    * Esta clase se utliza para detectar cuando se presiona un botton de la memoria
    */
private class MemoriaButtonListener implements ActionListener{	
		
public void actionPerformed (ActionEvent event){
JButton b = (JButton) event.getSource();
            if( radio.getEncendido()== true){
                String n = b.getText();
                if (guardar==true){
                    radio.guardaremi(radio.getemi(),Integer.parseInt(n));
                        System.out.print("guardo ");
}
else{
                        radio.cargaremi(Integer.parseInt(n));
                        System.out.print("cargo ");
                        jLNumeroemi.setText(String.valueOf(radio.getemi()));
}
                guardar=false;	
}
}
}
    /**
    * Esta clase se utliza para detectar cuando se presiona un botton del vol
    */
private class ButtonListenerVol implements ActionListener{	

public void actionPerformed (ActionEvent event){
JButton b = (JButton) event.getSource();
            if( radio.getEncendido()== true){  
                String n = b.getText();
                if(n.equals("+")){
                        radio.subirvol();
}
                if(n.equals("-")){
                        radio.bajarvol();
}
                jLNumvol.setText(String.valueOf(radio.getvol()));
}
}
}
    /**Esta clase se utliza para detectar cuando se presiona un botton para cambiar de emi
    *
    */
private class ButtonListeneremi implements ActionListener{	
public void actionPerformed (ActionEvent event){
JButton b = (JButton) event.getSource();
            if( radio.getEncendido()== true){ 
                String n = b.getText();
                if(n.equals("+")){
                        radio.adelantaremi();
}
                if(n.equals("-")){
                        radio.atrasaremi();
}
                jLNumeroemi.setText(String.valueOf(radio.getemi()));
                guardar=false;
}
}
}
    /**
        * Esta clase se utliza para detectar cuando se presiona un botton para apagar la radio, cambar fm o am, guardar estacion
        */
private class ButtonListener implements ActionListener{	
public void actionPerformed (ActionEvent event){
JButton b = (JButton) event.getSource();
String n = b.getText();
    // apgar y encender
if(n.equals("o/- OFF ")){
    radio.encenderApagar();
    jBApagado.setText("o/- ON "); 
                    jLNumeroemi.setText(String.valueOf(radio.getemi()));
                    jLNumvol.setText(String.valueOf(radio.getvol()));
}
            if(n.equals("o/- ON ")){
                radio.encenderApagar();
                jBApagado.setText("o/- OFF ");
                jLNumvol.setText("");
                jLNumeroemi.setText("");
}
            if( radio.getEncendido()== true){ 
    // cambio de frec
                if(n.equals("AM") || n.equals("FM")){
                        radio.cambiarFrec();
                        jBfrec.setText(radio.getFrec());
                        jLNumeroemi.setText(String.valueOf(radio.getemi()));
}
    // Guardar
                if(n.equals("Guardar")){
                        guardar=true;
}
else{
                        guardar=false;
}	
}
}
}
}

