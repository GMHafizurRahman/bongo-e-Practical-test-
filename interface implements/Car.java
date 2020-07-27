/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qsn_2_designpattern;

/**
 *
 * @author Hafizur
 */
public class Car implements Vehicle {

    @Override
    public int set_num_of_wheels() {
        return 0;
    }

    @Override
    public int set_num_of_passengers() {
         return 0;
    }

    @Override
    public boolean has_gas() {
         return true;
    }

}
