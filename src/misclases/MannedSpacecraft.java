
package misclases;

/**
 * clase de construcción de naves tripuladas
 *
 * @author Kevin Luis Flórez Lozada
 */
public class MannedSpacecraft extends Spacecraft implements IOrbit{
    /**
     * ATTRIBUTES
     */
    /**
     * orbita objetivo
     */
    protected float orbit;
    /**
     * miembros de tripulación
     */
    protected int crewMembers;
    /**
     * motores
     */
    protected int engines;
    
    /**
     * CONSTRUCTORS
     */
    /**
     * constructor por default
     */
    public MannedSpacecraft(){
    }
    /**
     * constructor con atributos propios de la clase
     * @param orbit orbita
     * @param crewMembers miembros tripulación
     * @param engines motores
     */
    public MannedSpacecraft(float orbit, int crewMembers, int engines) {
        this.orbit = orbit;
        this.crewMembers = crewMembers;
        this.engines = engines;
    }
    /**
     * constructor sobrecargado con atributos propios y de la clase padre
     * @param orbit orbita
     * @param crewMembers miembros tripulación
     * @param engines motores
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
    public MannedSpacecraft(float orbit, int crewMembers, int engines, String name, float power, float speed, String propulsionSystem, float weight, float height, float width, float depth, String fuel, String energySystem) {
        super(name, power, speed, propulsionSystem, weight, height, width, depth, fuel, energySystem);
        this.orbit = orbit;
        this.crewMembers = crewMembers;
        this.engines = engines;
    }
    
    /**
     * GETTERS AND SETTERS
     */
    /**
     * getter orbit
     * @return retorna el valor de orbit tipo float
     */
    public float getOrbit() {
        return orbit;
    }
    /**
     * setter orbit
     * @param orbit recibe un valor float para asignar a this.orbit
     */
    public void setOrbit(float orbit) {
        this.orbit = orbit;
    }
    /**
     * getter crewMembers
     * @return retorna el valor de crewMembers tipo int
     */
    public int getCrewMembers() {
        return crewMembers;
    }
    /**
     * setter crewMembers
     * @param crewMembers recibe un valor int para asignar a this.crewMembers
     */
    public void setCrewMembers(int crewMembers) {
        this.crewMembers = crewMembers;
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
     * Métodos propios de la clase
     */
    /**
     * método de verificación estado tripulación
     */
    public void verifyCrewStatus(){
        System.out.println("La tripulacion se encuentra estable");
    }
    /**
     * método para realizar acoplamiento
     */
    public void performDocking(){
        System.out.println("preparando compuertas de acople...");
    }

    /**
     * Métodos abstractos implementados heredados de la clase Spacecraft
     */
    /**
     * implementación método turnOn para la clase MannedSpacecraft
     */
    @Override
    public void turnOn() {
        System.out.println("Iniciando motores primarios de estabilizacion y acople...");
    }
    /**
     * implementación método turnOff para la clase MannedSpacecraft
     */
    @Override
    public void turnOff() {
        System.out.println("Apagando motores...");
    }
    /**
     * sobrecarga método validateOrbit para la clase MannedSpacecraft
     */
    public void validateOrbit(float orbit){
        if(this.orbit < orbit){
            System.out.println("Orbita sobrepasada por "+(orbit-this.orbit)+" km , corrigiendo orbita...");
        }else if(this.orbit > orbit){
            System.out.println("Mantener curso. "+"Orbita actual: "+orbit+" km - Orbita objetivo: "+this.orbit+" km");
        }else{
            System.out.println("Orbita alcanzada!, deteniendo curso...");
        }
    }

    /**
     * Métodos implementados de la interface IOrbit
     */
    /**
     * implementación método correctOrbit para la clase MannedSpacecraft
     */
    @Override
    public void correctOrbit() {
        System.out.println("Encendiendo propulsores de correccion...");
    }

}
