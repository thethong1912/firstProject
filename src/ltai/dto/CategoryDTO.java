/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltai.dto;

import java.util.Vector;

/**
 *
 * @author Win 10
 */
public class CategoryDTO {

    String id, name,address;
    boolean colloborating;

    public Vector toVector() {
        Vector v = new Vector();
        v.add(id);
        v.add(name);
        v.add(address);
        v.add(colloborating);
        return v;
    }

    public CategoryDTO() {
    }

    public CategoryDTO(String id, String name, String address, boolean colloborating) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.colloborating = colloborating;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isColloborating() {
        return colloborating;
    }

    public void setColloborating(boolean colloborating) {
        this.colloborating = colloborating;
    }

    
    
}
