/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zzaier
 */
public class Preferred extends Client {

    List<Normal> normals = new ArrayList<Normal>();
    String photoUrl;

    public Preferred(String lastName, String firstName) {
        String preferredID = lastName.toUpperCase().trim().substring(1, 3)
                + firstName.toUpperCase().trim().substring(1, 3);
        System.out.println("New Preferred: " + preferredID);
    }

    public void setPhotoUrl(String photoName) {
        this.photoUrl = "/photos/preferred/mad/" + photoName;
    }
}
