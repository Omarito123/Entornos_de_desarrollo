package cuentas;
/**
 * 
 * @author Omar
 * @version 18/02/2024
 */
public class CCuenta {

    /**Getter de nombre
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**Setter de nombre
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**Getter de cuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**Setter de cuenta
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**Getter de saldo
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**Setter de saldo
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**Geter de tipoInteres
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**Setter de tipoInteres
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    /**
     * Constructor vacío
     */
    public CCuenta()
    {
    }
    /**
     * Constructor con parámetros
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * 
 * @return saldo 
 */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * Método ingresar
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Método retirar
 * @param cantidad
 * @throws Exception 
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
