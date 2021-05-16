package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {


    @Test
    public void testAddToCollection()
    {
        Collection<Car> carCollection = new HashSet<>();
        Car C1 = new Car("polo", "W");
        Car C2 = new Car("sandero", "Renauld");
        Car C3 = new Car("C200", "mercedes");
        carCollection.add(C1);
        carCollection.add(C2);
        carCollection.add(C3);

    }
        @Test
        public void testForRemoveToCollection ()
        {
            Collection<Car> carCollection = new HashSet<>();
            Car C1 = new Car("polo", "W");
            Car C2 = new Car("sandero", "Renauld");

            carCollection.add(C1);
            carCollection.add(C2);
            carCollection.remove(C2);
        }
        @Test
        public void testFindToCollection ()
        {
            Collection<Car> carCollection = new HashSet<>();
            Car C1 = new Car("polo", "W");

            carCollection.add(C1);
            // find using colloction
            boolean find = carCollection.contains(C1);
            if (find) {
                System.out.println("i find what your are looking for " + find);
            } else {
                System.out.println("i did not find what you are looking for");
            }
        }
         @Test
         public void testAddToMap ()
         {
            Map<String,Car> mapCar=new HashMap<>();

            Car C6=new Car("velar", "rangrover");
            Car C7=new Car("GTI", "vw");

            mapCar.put(C6.getName(),C6);
            mapCar.put(C7.getName(),C7);

        }
        @Test
         public void testRemoveToMap ()
        {
            Map<String,Car> mapCar=new HashMap<>();

            Car C6=new Car("velar", "rangrover");
            Car C7=new Car("GTI", "vw");

            mapCar.put(C6.getName(),C6);
            mapCar.put(C7.getName(),C7);


            mapCar.remove("velar",C6);

        }
           @Test
           public void testFindToMap (){
               Map<String,Car> mapCar=new HashMap<>();

               Car C6=new Car("velar", "rangrover");
               Car C7=new Car("GTI", "vw");

               mapCar.put(C6.getName(),C6);
               mapCar.put(C7.getName(),C7);


               // find using map
               boolean find2=mapCar.containsKey("GTI");
               if  (find2){
                   System.out.println("i find what your are looking for "+find2);
               }
               else{
                   System.out.println("i did not find what you are looking for");
               }
           }
           @Test
            public void testAddToSet()
            {
             Set<Car> setCars=new  LinkedHashSet<>();

             Car C12=new Car("alto", "suzuki");
             Car C13=new Car("rio", "kia");

             setCars.add(C13);
             setCars.add(C12);
             }
           @Test
           public void testRemoveToSet (){
             Set<Car> setCars=new  LinkedHashSet<>();

             Car C12=new Car("alto", "suzuki");
             Car C13=new Car("rio", "kia");

             setCars.add(C13);
             setCars.add(C12);

             setCars.remove(C13);

         }
            @Test
            public void testFindToSet () {
             Set<Car> setCars=new  LinkedHashSet<>();

             Car C12=new Car("alto", "suzuki");
             Car C13=new Car("rio", "kia");

             setCars.add(C13);
             setCars.add(C12);
             boolean find3= setCars.contains(C12);
             if  (find3){
                 System.out.println("i find what your are looking for "+find3);
             }
             else{
                 System.out.println("i did not find what you are looking for");
             }


             }
             @Test
             public void testAddToList(){

             List<Car> listCars=new LinkedList<>();

             Car C20=new Car("brio", "honda");
             Car C21=new Car("A200", "mercedes");

             listCars.add(C20);
             listCars.add(C21);

            }
          @Test
         public void testRemoveToList (){

          List<Car> listCars=new LinkedList<>();

           Car C20=new Car("brio", "honda");
           Car C21=new Car("A200", "mercedes");

           listCars.add(C20);
           listCars.add(C21);

           listCars.remove(C20);


         }
         @Test
       public void testFindToList () {

             List<Car> listCars = new LinkedList<>();

             Car C20 = new Car("brio", "honda");
             Car C21 = new Car("A200", "mercedes");

             listCars.add(C20);
             listCars.add(C21);
             boolean find4 = listCars.contains(C21);
             if (find4) {
                 System.out.println("i find what your are looking for " + find4);
             } else {
                 System.out.println("i did not find what you are looking for");
             }


         }


    }