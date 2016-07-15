/**
 * Julio Isaac Rodriguez 14298
 * Julian Lopez 14084
 * 13.07.2016
 */

public class Radio implements InterfazRadio{

    /** =====================
    *  **** VARIABLES ****
    *  =====================
    */
	
    private double emi = MIN_AM;
    private double emi_m = MIN_FM;
    private boolean state = false;
    private String frec= "AM";
    private int vol=0;
    double[] memoria_AM = new double [12];
    double[] memoria_FM = new double [12];
    /**
    *Constructor 
    *inicializa las memorias del radio
    */
    public Radio(){
        for (int i=0; i<12; i++){
            memoria_AM[i]=0;
            memoria_FM[i]=0;
        }
}

/**===================
** **** Getters ****
** ===================
**/
@Override
public double getemi() {
    return emi;
}

@Override
public String getFrec() {
    return frec;
}

@Override
public int getvol() {
    return vol;
}
@Override
public boolean getEncendido(){
    return state; 
}
/**===================
* **** METODOS ****
* ===================
*/
/**
* Metodo Utilizado para Encender o Apagar la radio
*/
	@Override
public void encenderApagar() {
    // cambia state de radio (ON-OFF)
    if (state==true){
        state=false;
    }
    else {
        state=true;
    }
}
/**
* Se utiliza para cambiar frecuencia de am a fm
*/
	@Override
public void cambiarFrec() {
    // cambia la frec (AM-FM)
		
    if (frec=="AM"){
        frec="FM";
    }
    else {
        frec="AM";
    }	
		
    // cambio de emisora y memoria de emisora
    emi += emi_m;
    emi_m = emi - emi_m;
    emi -= emi_m;
		
    //redondear
    int cifras=(int) Math.pow(10,2);
    emi=Math.rint(emi*cifras)/cifras;
}
        
/**
*Adelanta la emisora, dependiendo si es am o fm
*/
	@Override
public void adelantaremi() {
    // Adelanta la emisora segun se encuentre en AM o FM
    if (frec=="AM" && emi != MAX_AM){
        emi += 10;
    }
    if (frec=="FM" && emi < MAX_FM){
        emi += 0.2;
			
        //redondear
        int cifras=(int) Math.pow(10,2);
        emi=Math.rint(emi*cifras)/cifras;
    }
}
/**
*Atrasa la emisora, depende si es am o fm
*/
	@Override
public void atrasaremi() {
    // Adelanta la emisora segun se encuentre en AM o FM
    if (frec=="AM" && emi != MIN_AM){
        emi -= 10;
    }
    if (frec=="FM" && emi > MIN_FM){
        emi -= 0.2;
        //redondear
        int cifras=(int) Math.pow(10,2);
        emi=Math.rint(emi*cifras)/cifras;
    }	
}
/**
*Guarda la emisora, utiliza una variable de tipo doble para guardar el numero de la emisora y una variable int para 
*la memoria en la que se quiere guardar
*/
	@Override
public void guardaremi(double emi, int posicion) {
    // guarda emisora actual en la posicion especificada
    if (frec=="AM"){
        memoria_AM[posicion]=this.emi;
    }
if (frec=="FM"){
    memoria_FM[posicion]=this.emi;
}
}
/**
    *Carga la emisora, utiliza un int para la identifacar la memoria
    */
public void cargaremi(int posicion) {
    // carga la emi guardada en memoria segun posicion
    // si no hay emi guardada no hace nada
    if (frec=="AM" && memoria_AM[posicion] > 1){
        emi = memoria_AM[posicion];
    }
if (frec=="FM" && memoria_FM[posicion] > 1){
    emi = memoria_FM[posicion];
}
}
/**
*Sube el volumen de uno en uno, mas 10
*/
	@Override
public void subirvol() {
    // Aumenta el vol (maximo 10)
    if (vol<10){
        vol+=1;
    }
}
/**
*Baja el volumen de uno en uno, min 0
*/
	@Override
public void bajarvol() {
    // Disminuye el vol (minimo 0)
    if (vol>0){
        vol-=1;
    }
}

/**
 * fin
 */
        
}

