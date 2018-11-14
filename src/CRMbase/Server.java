/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRMbase;

import java.io.File;

/**
 *
 * @author Otávio Morais
 */

public class Server {
    static String url = " ";
    
    static String getUrl(){
        return url;
    }
    
    static boolean checarEstado(){
        return arky.files.download(url+"/test.arky", "test.arky");
    }
    
}
