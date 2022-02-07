
package misclases;

/**
 * clase de construcción naves robóticas
 *
 * @author Kevin Luis Flórez Lozada
 */
public class RoboticSpacecraft extends Spacecraft implements IUtilities, IOrbit {
    /**
     * ATTRIBUTES
     */
    /**
     * instrumentos
     */
    protected String instruments;
    /**
     * motores
     */
    protected int engines;
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
    public RoboticSpacecraft(){
    }
    /**
     * constructor con atributos propios de la clase
     * @param instruments instrumentos
     * @param engines motorers
     * @param thrust empuje
     */
    public RoboticSpacecraft(String instruments, int engines, float thrust) {
        this.instruments = instruments;
        this.engines = engines;
        this.thrust = thrust;
    }
    /**
     * constructor sobrecargado con atributos propios y de la clase padre
     * @param instruments instrumentos
     * @param engines motorers
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
    public RoboticSpacecraft(String instruments, int engines, float thrust, String name, float power, float speed, String propulsionSystem, float weight, float height, float width, float depth, String fuel, String energySystem) {
        super(name, power, speed, propulsionSystem, weight, height, width, depth, fuel, energySystem);
        this.instruments = instruments;
        this.engines = engines;
        this.thrust = thrust;
    }
    
    /**
     * GETTERS AND SETTERS
     */
    /**
     * getter instruments
     * @return retorna el valor de instruments tipo String
     */
    public String getInstruments() {
        return instruments;
    }
    /**
     * setter instruments
     * @param instruments recibe un valor String para asignar a this.instruments
     */
    public void setInstruments(String instruments) {
        this.instruments = instruments;
    }
    /**
     * getter engines
     * @return retorna el valor de engines tipo int
     */
    public int getEngines() {
        return engines;
    }
    /**
     * setter engines
     * @param engines recibe un valor int para asignar a this.engines
     */
    public void setEngines(int engines) {
        this.engines = engines;
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
     * método validación de objetivo
     */
    public void validateTarget(){
        System.out.println("Objetivo no alcanzado ...");
    }
    /**
     * método preparación de herramientas
     */
    public void prepareTools(){
        System.out.println("Activando herramientas...");
    }
    /**
     * método para inicio de tareas
     */
    public void startTasks(){
        System.out.println("Comenzando tareas programadas...");
    }
    /**
     * método para verificar energia
     */
    public void verifyEnergy(){
        System.out.println("Energia al 80%");
    }

    /**
     * Métodos abstractos implementados heredados de la clase Spacecraft
     */
    /**
     * implementación método turnOn para la clase RoboticSpacecraft
     */
    @Override
    public void turnOn() {
        System.out.println("Encendiendo motores e iniciando sistemas...");
    }
    /**
     * implementación método turnOff para la clase RoboticSpacecraft
     */
    @Override
    public void turnOff() {
        System.out.println("Energia al 0%, apagando sistemas...");
    }  
    /**
     * sobreescritura método validateOrbit para la clase RoboticSpacecraft
     */
    @Override
    public void validateOrbit(){
        System.out.println("Alcanzando estabilidad de orbita, desplegar instrumentos...");
    }
    
    /**
     * Métodos implementados de la interface IUtilities
     */
    /**
     * implementación método repair para la clase RoboticSpacecraft
     */
    @Override
    public void repair() {
        System.out.println("recibiendo informe de daño, comenzar reparacion...");
    }
    /**
     * implementación método maintenance para la clase RoboticSpacecraft
     */
    @Override
    public void maintenance() {
        System.out.println("haciendo diagnostico para correcciones...");
    }

    /**
     * Métodos implementados de la interface IOrbit
     */
    /**
     * implementación método correctOrbit para la clase RoboticSpacecraft
     */
    @Override
    public void correctOrbit() {
        System.out.println("recibiendo instrucciones para correccion de orbita...");
    }
 
}
