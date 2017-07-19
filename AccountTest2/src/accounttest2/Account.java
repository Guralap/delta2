/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounttest2;

/**
 *
 * @author 1691677
 */
public class Account {

    private String name;
    public Account(){
    
    }
    public Account(String name){
    this.name= name;
    }
    public void setName(String name){
            this.name = name;
    }
public String getName(){

   return name;
  }
}
