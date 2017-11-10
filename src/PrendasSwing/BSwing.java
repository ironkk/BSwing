package PrendasSwing;

import Utilidades.Fichero;

/**
 *
 * @author ironkk
 */
public class BSwing {

    public static ListaPrendas misPrendas;
    public static Fichero miFichero;

    public static void main(String[] args) {       
        miFichero = new Fichero("misprendas.xml");
        misPrendas = (ListaPrendas) miFichero.leer();

        if (misPrendas == null) {
            misPrendas = new ListaPrendas();
        }
        Menu m = new Menu();
        m.setLocationRelativeTo(null);
        m.setVisible(true);
    }

}
