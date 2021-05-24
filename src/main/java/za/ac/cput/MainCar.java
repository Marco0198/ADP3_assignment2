package za.ac.cput;
/*
 author marco mulonday
 219049505
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.*;

public class MainCar {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------");
        System.out.println("******************  COLLECTION  ******************************");
        System . out.println("---------------------------------------------------------------");
  
        // usi n g collection
        Collec t ion<Car> carCollection = new HashSet<>();
        Car C1 = new Car("polo", "W");
        Car C2=new Car("sandero", "Renauld");
        Car C3=new Car("C200", "mercedes"); 
        Car C4=new Car("mustang " , "ford");  
        Car C5=new Car("Gwagon", "mercedes");

        // adding value to carCollection using  collection
        System.out.println("\n"+"adding element using Collection "+"\n");

        carCollection.add(C1);
        carCollection.add(C2);
        carCollection.add(C3);
        carCollection.add(C4);  
        carCollection.add(C5);  
   
        System.out.println(carCollection.toString());
        Sy stem.out.println("-----------------------------------------------"+"\n");
        System.out.println("the object C4 has been removed "+"\n");
        //removing  the 4th element to carCollection using  collection
        carCollection.remove(C4)
         //this is t he output after removing
         S tem.ou t
              
          bool e
            (find){
         

           System.out.println("i did not find what you are looking for");
       }


        ys tem.out.println("******************  MAP  ******************************");
        System.out. println("-- - ----------------------------------------------------");

  
         //usi n g map
        Map<St r ing,Car> mapCar=new HashMap<>();
  
        Car C6= n ew Car("velar", "rangrover")

        r C8=new Car("t-croos", "vw");
        Car C9=new Car("kaa", " f ord");  

        / adding element ussing  the 
        tem.out.println("\n"+"ad ding
         
         
        mapCar.put(C6.getName(),C 6);

        mapCar.put(C8.getName(),C8);
           mapCar.put(C9.getName(),C9);  
           mapCar.put(C10.getName(),C10);  
 
           System.out.println(mapCar.toString());
        System.out.println("-- ---------------------------------------------"+"\n");
        System.out.println("the object C6 has been removed "+"\n");
        // removing  using remove untion on the map


        // this the output of the  mapCar without polo
        System.out.pr i ntln( mapCar);
  
  
        / bool ean find2=mapCar.containsKey("GTI");
        if  (find2){
            System.out.println("i find what your are looking for "+find2);
        }
        else{
            System.out.println("i did not find what you are looking for");
        }

        Sy stem.out.println("**********************  SET **************************");
        System.out.print l n(" ----------------------------------------------------");

  
        //using   set
        Set<Car >  setCars=new  LinkedHashSet<>();
  
        Car C12=new Car("alto", "suzuki");
        Car C13=new Car("rio", "kia");
        Car C14=new Car("vivo",   "vw");  

        // adding element using the Set
        System.out.println("\n"+"adding element usind Set "+"\n");



        setCars.add(C12);
  
  

        System.out. intln( tCars.toString());
        System.out.println("-----------------------------------------------"+"\n");
        System.out.println("the object C13 has been removed "+"\n");

        // removing  on the  setCar

        setCars.remove(C13);

        // this is th e output after removing C13
        Sy em.out. println( setCars);
  
        / bool ean find3= setCars.contains(C12);
        if  (find3){
            System.out.println("i find what your are looking for "+find3);
        }
        else{
            System.out.println("i did not find what you are looking for");
        }

        Sy stem.out.println("*********************** LIST **********************");
        System.out.println ( "---------------------------------------------------");

  
        //using   list
        List<Ca r > listCars=new LinkedList<>();
  
        Car C20=new Car("brio", "honda");
        Car C21=new Car("A200", "mercedes");
        Car C22=new Car("polo", "vw");
        Car C23=new Car("picant o ", "kia");  

        // adding element using the Set

        System.out.println("\n"+"adding element using List "+"\n");


        listCars.add(C23);
  
  
  
        System.out.println(listCars.toString());
        System.out.println("-----------------------------------------------"+"\n");
        System.out.println("the object c23 has been removed"+"\n");
        // removing  on the  setCar

        listCars.remove(C23);

        // this is the output after removing C13
        System.out.pr intln( listCars);
  
        // how to find element using list  
        / bool ean find4= listCars.contains(C23);
        if  (find4){
            System.out.println("i find what your are looking for "+find4);
        }
        else{
            System.out.println("i did not find what you are looking for");
        }

    }
}
