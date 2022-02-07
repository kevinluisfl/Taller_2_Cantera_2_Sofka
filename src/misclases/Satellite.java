
package misclases;

/**
 * clase de construcción de satélites
 *
 * @author Kevin Luis Flórez Lozada
 */
public class Satellite extends Spacecraft{
    /**
     * ATTRIBUTES
     */
    /**
     * destino
     */
    protected String destination;
    
    /**
     * CONSTRUCTORS
     */
    /**
     * constructor por default
     */
    public Satellite(){
    }
    /**
     * constructor con atributos propios de la clase
     * @param destination destino
     */
    public Satellite(String destination){
        this.destination = destination;
    }
    /**
     * constructor sobrecargado con atributos propios y de la clase padre
     * @param destination destino
     * @param name nombre
     * @param power potencia
     * @param speed velocidad
     * @param propulsionSystem sistema de propulsión
     * @param weight peso
     * @param height altura
     * @param width anchura
     * @param depth profundidad
     * @param fuel combustible
     * @param energySystem sistema de energia
     */
    public Satellite(String destination, String name, float power, float speed, String propulsionSystem, float weight, float height, float width, float depth, String fuel, String energySystem) {
        super(name, power, speed, propulsionSystem, weight, height, width, depth, fuel, energySystem);
        this.destination = destination;
    }
    
    /**
     * GETTERS AND SETTERS
     */
    /**
     * getter destination
     * @return retorna el valor de destination tipo String
     */
    public String getDestination(){
        return destination;
    }
    /**
     * setter destination
     * @param destination recibe un valor String para asignar a this.destination
     */
    public void setDestination(String destination){
        this.destination = destination;
    }
    
    /**
     * Métodos propios de la clase
     */
    /**
     * 
     * @param des recibe un valor String para decidir fin de operación
     */
    public void endOperation(String des){
        if(des.equals("Estrellas") || des.equals("Planetas")){
            System.out.println("Precipitarse a objetivo por gravedad!");
        }        
        else if(des.equals("Observación interestelar")){
            System.out.println("Trayectoria interestelar eterna!");
        }       
        else{
            System.out.println("Destino no conocido");
        }
    }

    /**
     * Métodos abstractos implementados heredados de la clase Spacecraft
     */
    /**
     * implementación método turnOn para la clase Satellite
     */
    @Override
    public void turnOn() {
        System.out.println("Desplegando paneles para energizar...");
    }
    /**
     * implementación método turnOff para la clase Satellite
     */
    @Override
    public void turnOff() {
        System.out.println("Fin operación, esperando destino...");
    }
}
