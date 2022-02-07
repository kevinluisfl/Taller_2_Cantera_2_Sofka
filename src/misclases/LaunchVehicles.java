
package misclases;

/**
 * clase de construcción vehículos de lanzadera
 *
 * @author Kevin Luis Flórez Lozada
 */
public class LaunchVehicles extends Spacecraft {
    /**
     * ATTRIBUTES
     */
    /**
     * carga útil
     */
    protected String payload;
    /**
     * cohetes impulsores
     */
    protected int boosterRockets;
    /**
     * empuje
     */
    protected float thrust;
    
    /**
     * CONSTRUCTORS
     */
    /**
     * constructor por default
     */
    public LaunchVehicles() {
    }
    /**
     * constructor con atributos propios de la clase
     * @param payload carga útil
     * @param boosterRockets cohetes impulsores
     * @param thrust empuje
     */
    public LaunchVehicles(String payload, int boosterRockets, float thrust) {
        this.payload = payload;
        this.boosterRockets = boosterRockets;
        this.thrust = thrust;
    }
    /**
     * constructor sobrecargado con atributos propios y de la clase padre(o  madre)
     * @param payload carga útil
     * @param boosterRockets cohetes impulsores
     * @param thrust empuje
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
    public LaunchVehicles(String payload, int boosterRockets, float thrust, String name, float power, float speed, String propulsionSystem, float weight, float height, float width, float depth, String fuel, String energySystem) {
        super(name, power, speed, propulsionSystem, weight, height, width, depth, fuel, energySystem);
        this.payload = payload;
        this.boosterRockets = boosterRockets;
        this.thrust = thrust;
    }
    
    /**
     * GETTERS AND SETTERS
     */
    /**
     * getter payload
     * @return retorna el valor de payload tipo String
     */
    public String getPayload() {
        return payload;
    }
    /**
     * setter payload
     * @param payload recibe un valor String para asignar a this.payload
     */
    public void setPayload(String payload) {
        this.payload = payload;
    }
    /**
     * getter boosterRockets
     * @return retorna el valor de boosterRockets tipo int
     */
    public int getBoosterRockets() {
        return boosterRockets;
    }
    /**
     * setter boosterRockets
     * @param boosterRockets recibe un valor int para asignar a this.boosterRockets
     */
    public void setBoosterRockets(int boosterRockets) {
        this.boosterRockets = boosterRockets;
    }
    /**
     * getter thrust
     * @return retorna el valor de thrust tipo float
     */
    public float getThrust() {
        return thrust;
    }
    /**
     * setter thrust
     * @param thrust recibe un valor float para asignar a this.thrust
     */
    public void setThrust(float thrust) {
        this.thrust = thrust;
    }
    
    /**
     * Métodos propios de la clase
     */
    /**
     * método lanzamiento de carga
     */    
    public void launchLoad(){
        System.out.println("Lanzamiento de carga en proceso...");
    }
    /**
     * método validación de gravedad
     */
    public void validateGravity(){
        System.out.println("Se vencio la atraccion gravitatoria, soltando carga...");
    }

    /**
     * Métodos abstractos implementados heredados de la clase Spacecraft
     */
    /**
     * implementación método turnOn para la clase LaunchVehicles
     */
    @Override
    public void turnOn() {
        System.out.println("Comienza ignicion y cuenta regresiva para despegue...");
    }
    /**
     * implementación método turnOff para la clase LaunchVehicles
     */
    @Override
    public void turnOff() {
        System.out.println("Cortando flujo de combustible a los cohetes...");
    }
}
