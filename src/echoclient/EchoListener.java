/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echoclient;

/**
 *
 * @author Michael
 */
public interface EchoListener {

    /**
     *  Observer pattern notify()
     * @param data
     */
    public void messageArrived(String data);
}
