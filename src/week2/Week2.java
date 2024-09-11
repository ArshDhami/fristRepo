/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week2;

/**
 *
 * @author arshb
 */
public class Week2 {
    private String Name;
    
    public String getName() {
            return Name;
        }
     public void setName(String name) {
            this.Name = name;
        }
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello");
    
    Week2[] s1=new Week2[5];
    for(int i=0; i<5;i++)
    {
        s1[i]=new Week2();
    }
    String [] names={"abc","shf","jfjh","hsdchs","hsdgcjh"};
    for(int i=0; i<5;i++)
    {
        s1[i].setName(names[i]);
        
    }
    System.out.println("Names are: ");
     
    for(int i=0; i<5;i++)
    {
        System.out.println(s1[i].getName());
    }
    }

   
}

    
    

