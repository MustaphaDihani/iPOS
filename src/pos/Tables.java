/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pos;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Tables {
    private int id;
    private String TableNom;

    Tables(int id, String TableNom) {
         this.id=id;
        this.TableNom=TableNom;
    }

    public int getId() {
        return id;
    }

    public String getTableNom() {
        return TableNom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTableNom(String TableNom) {
        this.TableNom = TableNom;
    }
    

}
