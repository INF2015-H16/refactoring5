/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring5;

import java.util.Date;

/**
 *
 * @author zzaier
 */
public class Normal extends Client{
    String normal_id;

    String lastName;
    String firstName;
    Date dateBirth;

    public Normal(String ln, String fn, Date db) {
        this.lastName = ln;
        this.firstName = fn;
        this.dateBirth = db;
        this.normal_id = createNormalId(ln, fn, db);
    }

    public String createNormalId(String lName, String fName, Date date) {
        String end = concatDate(date);
        return lName.substring(0, 3) + fName.charAt(0) + end;
    }

    private String concatDate(Date date) {
        return date.getYear() + "-" + date.getMonth();
    }

    public String getNormalId() {
        return normal_id;
    }

    public void setNormalId(String tenant_id) {
        this.normal_id = tenant_id;
    }

    public void isInvitedBy(Preferred owner) {
        owner.normals.add(this);
    }
    
}
