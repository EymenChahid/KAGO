package my_project.control;

import KAGO_framework.control.ViewController;
import my_project.model.House;
import my_project.model.Tree;
import my_project.model.Fence;
import my_project.model.Sun;
import my_project.model.Cloud;


/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern.
 * Hinweise:
 * - Der Konstruktor sollte nicht geändert werden.
 * - Sowohl die startProgram()- als auch die updateProgram(...)-Methoden müssen vorhanden sein und ihre Signatur sollte
 *   nicht geändert werden
 * - Zusätzliche Methoden sind natürlich gar kein Problem
 */
public class ProgramController {

    //Attribute


    // Referenzen
    private final ViewController viewController;
    private  Tree secondTree;
    private House firstHouse;
    private Tree firstTree;
    private Tree thirdTree;
    private Tree fourthTree;
    private Tree fifthTree;
    private Tree sixthTree;
    private Tree eightTree;
    private Fence firstFence;
    private Sun firstSun;
    private Cloud firstCloud;
    private Cloud secondCloud;


    public ProgramController(ViewController viewController){
        this.viewController = viewController;
    }

    public void startProgram() {


        firstSun = new Sun();
        firstTree = new Tree(5);
        secondTree = new Tree(100);
        thirdTree = new Tree(200);
        fourthTree = new Tree(300);
        fifthTree = new Tree(500);
        sixthTree = new Tree(400);
        eightTree = new Tree(600);
        firstHouse = new House(200, 360, 200, 240);
        firstFence = new Fence();
        firstCloud = new Cloud(500,90,100,70);
        secondCloud = new Cloud(200,90,100,70);




        viewController.draw(firstTree);
        viewController.draw(secondTree);
        viewController.draw(thirdTree);
        viewController.draw(fourthTree);
        viewController.draw(fifthTree);
        viewController.draw(sixthTree);
        viewController.draw(eightTree);
        viewController.draw(firstHouse);
        viewController.draw(firstFence);
        viewController.draw(firstSun);
        viewController.draw(firstCloud);
        viewController.draw(secondCloud);

    }

    public void updateProgram(double dt){

    }
}
