
package main;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import misclases.LaunchVehicles;
import misclases.RoboticSpacecraft;
import misclases.MannedSpacecraft;
import misclases.Satellite;

/**
 * Clase principal para crear las naves de forma dinámica
 *
 * @author Kevin Luis Flórez Lozada
 */
public class ShipBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * variable para controlar las iteraciones en la creación de naves
         */
        boolean continued = true;
        /**
         * variable para creacion del tipo de nave en el switch
         */
        int decision = 0;
        /**
         * atributos String de todas las clases
         */
        String name,propulsionSystem,fuel,energySystem,         ///spacecrat
                payload,                                        ///launchvehicle
                instruments,                                    ///roboticspacecraft
                destination;                                    ///satellite
        /**
         * atributos float de todas las clases
         */
        float power,speed,weight,height,width,depth,            ///spacecrat
                thrust,                                         ///launchvehicle, roboticspacecraft                                        
                orbit;                                          ///mannedspacecraft
        /**
         * atributos int de todas las clases
         */   
        int boosterRockets,                                     ///launchvehicle
                engines,                                        ///roboticspacecraft
                crewMembers;                                    ///mannedspacecraft
        /**
         * declaracion de variable que contendra un indice para los ArrayList
         */
        int index;
        /**
         * titulo personalizado para los dialog
         */
        String titleDialog = "Centro de fabricación ACE";
        /**
         * icono personalizado dibujo de nave
         */
        ImageIcon icon = new ImageIcon("src/images/spacecraft.png");
       
        /**
         * declaracion de los arraylist para cada tipo de clase 
         */
        ArrayList<LaunchVehicles> launchers = new ArrayList<>();
        ArrayList<RoboticSpacecraft> robotics = new ArrayList<>();
        ArrayList<MannedSpacecraft> manned = new ArrayList<>();
        ArrayList<Satellite> satellites = new ArrayList<>();
       
        /**
         * do while principal,para definir la creación de más naves
         */
        do{
            /**
             * do while para controlar la elección del tipo de nave
             */
            do{
                /**
                 * contenido del showInputDialog (componente, mensaje, titulo, tipo_mensaje, icono, opciones, seleccion)
                 */
                /**
                 * objeto de selección para tipo de nave
                 */
                String[] optionsTypeCraft = {"Launch Vehicle", "Robotic Spacecraft", "Manned Spacecraft", "Satellite"};
                /**
                 * seleccion del tipo de nave
                 */
                String typeCraft = (String) JOptionPane.showInputDialog(null,"Seleccione Un tipo de nave",
                   titleDialog, JOptionPane.QUESTION_MESSAGE, icon, optionsTypeCraft, optionsTypeCraft[0]);
                /**
                 * asignando valor a decision para el switch
                 */
                if(typeCraft.equals("Launch Vehicle")){
                    decision = 1;
                    System.out.println("Creando: Launch Vehicle...");
                }else if(typeCraft.equals("Robotic Spacecraft")){
                    decision = 2;
                    System.out.println("Creando: Robotic Spacecraft...");
                }else if(typeCraft.equals("Manned Spacecraft")){
                    decision = 3;
                    System.out.println("Creando: Manned Spacecraft...");
                }else if(typeCraft.equals("Satellite")){
                    decision = 4;
                    System.out.println("Creando: Satellite...");
                }else{
                    decision = 0;
                }
            }while(decision == 0);
            
            /**
             * atributos comunes a todas las clases heredados de Spacecraft
             */
            /**
             * objetos de seleccion para: propulsionSystem, fuel, energySystem
             */
            String[] optionsPropulsionSystem = {"cohete","ionico","quimico","nuclear","propulsion a chorro"};
            String[] optionsFuel = {"Queroseno+O(liq)","C2H8N2+NO","H(liq)+O(liq)","UDMH+N2O4","N(liq)+O(liq)","MMH+NO","N2H4+Amina","N(comp)+N2H4","PuO2","NO+Amina","Queroseno+H(liq)","NO4+UDMH","Aerozina50+NO4","N2O4+MMH"};
            String[] optionsEnergySystem = {"baterias de plutonio-238","celdas solares","baterias de ion-Li"};
            /**
             * ingreso nombre nave
             */
            name = JOptionPane.showInputDialog("NOMBRE de la Nave:").toUpperCase();
            /**
             * ingreso potencia nave
             */
            power = Float.parseFloat(JOptionPane.showInputDialog("POTENCIA de la nave:"));
            /**
             * ingreso velocidad nave
             */
            speed = Float.parseFloat(JOptionPane.showInputDialog("VELOCIDAD de la nave (km/h):"));
            /**
             * seleccion del sistema de propulsión
             */
            propulsionSystem = (String) JOptionPane.showInputDialog(null,"SISTEMA DE PROPULSIÓN a usar:",
                titleDialog, JOptionPane.QUESTION_MESSAGE, icon, optionsPropulsionSystem, optionsPropulsionSystem[0]);
            /**
             * ingreso peso nave
             */
            weight = Float.parseFloat(JOptionPane.showInputDialog("PESO de la nave (kg):"));
            
            JOptionPane.showMessageDialog(null, "A continuación describa las DIMENSIONES de la nave");
            /**
             * ingreso altura nave
             */
            height = Float.parseFloat(JOptionPane.showInputDialog("ALTURA de la nave (m):"));
            /**
             * ingreso anchura nave
             */
            width = Float.parseFloat(JOptionPane.showInputDialog("ANCHURA de la nave (m):"));
            /**
             * ingreso profundida
             */
            depth = Float.parseFloat(JOptionPane.showInputDialog("PROFUNDIDAD de la nave (m):"));
            /**
             * seleccion del combustible
             */
            fuel = (String) JOptionPane.showInputDialog(null,"COMBUSTIBLE a usar:",
                   titleDialog, JOptionPane.QUESTION_MESSAGE, icon, optionsFuel, optionsFuel[0]);
            /**
             * seleccion del sistema de energia
             */            
            energySystem = (String) JOptionPane.showInputDialog(null,"SISTEMA ENERGÉTICO requerido:",
                   titleDialog, JOptionPane.QUESTION_MESSAGE, icon, optionsEnergySystem, optionsEnergySystem[0]);

            /**
             * switch para captura de atributos particulares de los diferentes tipos de naves
             */
            switch(decision){
                /**
                 * caso para la clase LaunchVehicles
                 */
                case 1:
                    /**
                     * objeto de selección para carga
                     */
                    String[] optionsPayload = {"Sondas","Satelites","Naves Roboticas","Naves Tripuladas","Materiales"};
                    /**
                     * selección de carga
                     */
                    payload = (String) JOptionPane.showInputDialog(null,"CARGA de la Nave:",
                    titleDialog, JOptionPane.QUESTION_MESSAGE, icon, optionsPayload, optionsPayload[0]);
                    /**
                     * ingreso del numero de cohetes
                     */
                    boosterRockets = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de COHETES IMPULSORES:"));
                    /**
                     * ingreso de empuje
                     */
                    thrust = Float.parseFloat(JOptionPane.showInputDialog("EMPUJE de la nave:"));
                    /**
                     * Creando objeto de la clase LaunchVehicles con el constructor completo
                     */
                    LaunchVehicles lv = new LaunchVehicles(payload, boosterRockets, thrust, name, power, speed, propulsionSystem, weight, height, width, depth, fuel, energySystem);
                    /**
                     * agregando nuevo objeto lv al ArrayList launchers
                     */
                    launchers.add(lv);
                    /**
                     * asignando a index valor equivalente al indice del ultimo elemento
                     */
                    index = launchers.size()-1;
                    /**
                     * impresión de algunos datos y método de la nueva nave creada
                     */
                    JOptionPane.showMessageDialog(null, "Nave: "+launchers.get(index).name+
                        "\nPropulsión: "+launchers.get(index).propulsionSystem+
                        "\nCombustible: "+launchers.get(index).fuel+
                        "\nEnergia: "+launchers.get(index).energySystem+
                        "\nCarga: "+launchers.get(index).getPayload(), titleDialog, 
                        JOptionPane.INFORMATION_MESSAGE, icon);
                                        
                    break;
                /**
                 * caso para la clase RoboticSpacecraft
                 */
                case 2:
                    /**
                     * objeto de selección para instrumento
                     */
                    String[] optionsInstrument = {"Telescopio","Brazo Robotico","Abastecedor","Sensores"};
                    /**
                     * selección de instrumento
                     */
                    instruments = (String) JOptionPane.showInputDialog(null,"INSTRUMENTOS utiles de la Nave:",
                    titleDialog, JOptionPane.QUESTION_MESSAGE, icon, optionsInstrument, optionsInstrument[0]);
                    /**
                     * ingreso del numero de motores
                     */
                    engines = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de MOTORES:"));
                    /**
                     * ingreso de empuje
                     */
                    thrust = Float.parseFloat(JOptionPane.showInputDialog("EMPUJE de la nave:"));
                    /**
                     * Creando objeto de la clase RoboticSpacecraft con el constructor completo
                     */
                    RoboticSpacecraft rs = new RoboticSpacecraft(instruments, engines, thrust, name, power, speed, propulsionSystem, weight, height, width, depth, fuel, energySystem);
                    /**
                     * agregando nuevo objeto rs al ArrayList robotics
                     */
                    robotics.add(rs);
                    /**
                     * asignando a index valor equivalente al indice del ultimo elemento
                     */
                    index = robotics.size()-1;  
                    /**
                     * impresión de algunos datos y método de la nueva nave creada
                     */
                    JOptionPane.showMessageDialog(null, "Nave: "+robotics.get(index).name+
                        "\nPropulsión: "+robotics.get(index).propulsionSystem+
                        "\nCombustible: "+robotics.get(index).fuel+
                        "\nEnergia: "+robotics.get(index).energySystem+
                        "\nInstrumentos: "+robotics.get(index).getInstruments(), titleDialog, 
                        JOptionPane.INFORMATION_MESSAGE, icon);
                    
                    break;
                /**
                 * caso para la clase MannedSpacecraft
                 */
                case 3:
                    /**
                     * ingreso de orbita objetivo
                     */
                    orbit = Float.parseFloat(JOptionPane.showInputDialog("ORBITA ideal en (km):"));
                    /**
                     * ingreso cantidad de tripulantes
                     */
                    crewMembers = Integer.parseInt(JOptionPane.showInputDialog("Numero de TRIPULANTES:"));
                    /**
                     * ingreso del numero de motores
                     */
                    engines = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de MOTORES:"));
                    /**
                     * Creando objeto de la clase MannedSpacecraft con el constructor completo
                     */
                    MannedSpacecraft ms = new MannedSpacecraft(orbit, crewMembers, engines, name, power, speed, propulsionSystem, weight, height, width, depth, fuel, energySystem);
                    /**
                     * agregando nuevo objeto ms al ArrayList manned
                     */
                    manned.add(ms);
                    /**
                     * impresión de algunos datos y método de la nueva nave creada
                     */
                    index = manned.size()-1; 
                    /**
                     * impresión de algunos datos y método de la nueva nave creada
                     */
                    JOptionPane.showMessageDialog(null, "Nave: "+manned.get(index).name+
                        "\nPropulsión: "+manned.get(index).propulsionSystem+
                        "\nCombustible: "+manned.get(index).fuel+
                        "\nEnergia: "+manned.get(index).energySystem+
                        "\nOrbita: "+manned.get(index).getOrbit(), titleDialog, 
                        JOptionPane.INFORMATION_MESSAGE, icon);

                    break;
                /**
                 * caso para la clase Satellite
                 */
                case 4:
                    /**
                     * objeto de selección para destino
                     */
                    String[] optionsDestination = {"Estrellas", "Planetas", "Observación interestelar", "Otro"};
                    /**
                     * selección de destino
                     */
                    destination = (String) JOptionPane.showInputDialog(null,"DESTINO del Satélite:",
                    titleDialog, JOptionPane.QUESTION_MESSAGE, icon, optionsDestination, optionsDestination[0]);
                    /**
                     * Creando objeto de la clase Satellite con el constructor completo
                     */
                    Satellite st = new Satellite(destination, name, power, speed, propulsionSystem, weight, height, width, depth, fuel, energySystem);
                    /**
                     * agregando nuevo objeto st al ArrayList satellites
                     */
                    satellites.add(st);
                    /**
                     * impresión de algunos datos y método de la nueva nave creada
                     */
                    index = satellites.size()-1; 
                    /**
                     * impresión de algunos datos y método de la nueva nave creada
                     */
                    JOptionPane.showMessageDialog(null, "Nave: "+satellites.get(index).name+
                        "\nPropulsión: "+satellites.get(index).propulsionSystem+
                        "\nCombustible: "+satellites.get(index).fuel+
                        "\nEnergia: "+satellites.get(index).energySystem+
                        "\nDestino: "+satellites.get(index).getDestination(), titleDialog, 
                        JOptionPane.INFORMATION_MESSAGE, icon);

                    break;
                default:
                    System.out.println("No selecciono nada, *probablemente esto nunca se va ejecutar");
            }
            /**
             * mensaje por consola para validar creación
             */
            System.out.println("nave creada exitosamente!");
 
            /**
             * validaciion para continuar o salir
             * contenido del showConfirmDialog (componente, mensaje, titulo, botones, tipo_mensaje, icono)
             */
            /**
             * captura de respuesta para continuar o finalizar la creación de naves
             */
            int response =  JOptionPane.showConfirmDialog(null, "Desea crear otra Nave?", titleDialog, 
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
            //yes=0, no=1
            if(JOptionPane.OK_OPTION !=  response){
                continued = false;
            }
        }while(continued);
        /**
         * captura de respuesta para mostrar por consola los ArrayList de naves 
         */
        int ships = JOptionPane.showConfirmDialog(null, "Ver listado de Naves?", titleDialog, 
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
            //yes=0, no=1
            if(JOptionPane.OK_OPTION ==  ships){
                System.out.println("\n");
                /**
                 * validando que no este vacio launchers antes de imprimirlo
                 */
                if(launchers.size() != 0){
                    System.out.println("::listado de naves de lanzadera::");
                    for(LaunchVehicles l: launchers){
                        System.out.println("Nave: "+l.name+" - Carga: "+l.getPayload());
                        l.launchLoad();
                    }
                    System.out.println("\n");
                }
                
                /**
                 * modificacion del "if" y "for" sugeridas por el IDE
                 * Se me hace familiar a las arrowFunction en JavaScript
                 */
                /**
                 * validando que no este vacio robotics antes de imprimirlo
                 */
                if(!robotics.isEmpty()){
                    System.out.println("::listado de naves roboticas::");
                    robotics.forEach((r) -> {
                        System.out.println("Nave: "+r.name+" - Instrumentos: "+r.getInstruments());
                        r.repair();
                    });
                    System.out.println("\n");
                }
                /**
                 * validando que no este vacio manned antes de imprimirlo
                 */
                if(!manned.isEmpty()){
                    System.out.println("::listado de naves tripuladas::");
                    manned.forEach((m) -> {
                        System.out.println("Nave: "+m.name+" - Orbita: "+m.getOrbit());
                        m.validateOrbit(365);
                    });
                    System.out.println("\n");
                }
                /**
                 * validando que no este vacio satellites antes de imprimirlo
                 */
                if(!satellites.isEmpty()){
                    System.out.println("::listado de satélites::");
                    satellites.forEach((s) -> {
                        System.out.println("Nave: "+s.name+" - Destino: "+s.getDestination());
                        s.endOperation(s.getDestination());
                    });
                    System.out.println("\n");
                }
            }
       
        /**
         * referencia bibliografica:
         * https://mkyong.com/swing/java-swing-joptionpane-showinputdialog-example/
         * https://www.w3schools.com/java/ref_string_equals.asp
         * https://mkyong.com/swing/java-swing-how-to-make-a-confirmation-dialog/
         */
    }
    
}
