/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Community {

    public int getCId() {
        return cid;
    }

    public void setCId(int communityId) {
        this.cid = communityId;
    }

    public String getCName() {
        return cName;
    }

    public void setCName(String communityName) {
        this.cName = communityName;
    }

    public String getHId() {
        return hId;
    }

    public void setHId(String houseId) {
        this.hId = houseId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
      int cid;
      String cName;
      String hId;
      String city;
    
}
