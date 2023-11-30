/*
* File: Controller.java
* Author: Meggyesi Réka
* Copyright: 2023, Meggyesi Réka
* Group: Szoft II/1/E
* Date: 2023-11-30
* Github: https://github.com/meggyesireka
* Licenc: GNU GPL
*/

public class Controller implements Controllable {
    @Override
    public void start() {
        System.out.println("A funkció elindult.");
    }

    @Override
    public void stop() {
        System.out.println("A funkció leállt.");
    }

    @Override
    public void restart() {
        System.out.println("A funkció újraindult.");
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.start();
        controller.stop();
        controller.restart();
    }
}
