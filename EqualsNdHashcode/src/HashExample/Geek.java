/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashExample;

import java.io.*;
import java.util.*;

class Geek {
    String name;
    int id;
    Geek(String name, int id) {
        this.name = name;
        this.id = id;
    }

   

    @Override
    public int hashCode() {
        return this.id;
    }

}
