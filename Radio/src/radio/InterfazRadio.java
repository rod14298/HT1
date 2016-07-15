/**
 * Julio Isaac Rodriguez 14298
 * Julian Lopez 14084
 * 13.07.2016
 * HDT1
 */
public interface InterfazRadio {
	
    final int CONST_CAMBIO_AM = 10;
    final double CONST_CAMBIO_FM = 0.2;
    final int MAX_AM = 1610;
    final int MIN_AM = 530;
    final double MAX_FM = 107.9;
    final double MIN_FM = 87.9;


    /**
	 * Metodo que permite encender y apagar la radio cambiando el
	 * state de su variable boolean (true=encendido, false=apagado)
	 */
    public void encenderApagar();

    /**
	 * Metodo que permite cambiar la frec entre AM y FM.
	 */
    public void cambiarFrec();

    /**
	 *  Carga la emi almacena en uno de los 12 botones
	 * @param posicion Entero de 1 a 12 
	 */
    public void cargaremi(int posicion);

    /**
	 * Metodo que permite cambiar a frecs mayores
	 */
    public void adelantaremi();

    /**
	 * Metodo que permite cambiar a frecs menores
	 */
    public void atrasaremi();

    /**
	 * Metodo que permite guardar emis
	 * @param emi
	 * @param posicion
	 */
    public void guardaremi(double emi, int posicion);

    /**
	 * Metodo que permite subir el vol
	 */
    public void subirvol();

    /**
	 * Metodo que permite bajar el vol
	 */
    public void bajarvol();

    //Retorna la emi actual seleccionada (dependiendo si es AM o FM)
    public double getemi();
    //Retorna el state actual de Encendido (true=encendido, false=apagado)
    public boolean getEncendido();
    //Retorna la frec actual AM o FM
    public String getFrec();

    public int getvol();
    
    public String toString();

}
