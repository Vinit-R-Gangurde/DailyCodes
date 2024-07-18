
//Collections


//1]----------------------------------

//1]List

//1.1]ArrayList

//Array list is Dyanamic means the size of array list is fraxible
//we can put any type of data in array

// import java.util.*;
// class DemoArrayList{

//     public static void main(String[] args) {
        
//         ArrayList obj1=new ArrayList();
   
//         obj1.add(10);
//         obj1.add(20.4f);
//         obj1.add("vinit");
//         obj1.add(10);

//         System.out.println(obj1);

//         //public int size();
//          System.out.println(obj1.size());
        
//          // public boolean isEmpty();
//         System.out.println(obj1.isEmpty());

//         // public boolean contains(java.lang.Object);
//          System.out.println(obj1.contains("vinit"));

//         // public int indexOf(java.lang.Object);
//         System.out.println(obj1.indexOf("vinit"));
     
//         // public int lastIndexOf(java.lang.Object);
//          System.out.println(obj1.lastIndexOf(10));

//         //  public E get(int);
//           System.out.println(obj1.get(1));

//         //  public E set(int, E);
//           System.out.println(obj1.set(2,"uday"));
//           System.out.println(obj1);

//         //   public void add(int, E);
//            obj1.add(2,"vinit");
//            System.out.println(obj1);

//         //   public E remove(int);
//           System.out.println(obj1.remove(2));
//           System.out.println(obj1);

//         //   public void clear();
//         //   obj1.clear();
//         //   System.out.println(obj1);

//         //   public boolean addAll(java.util.Collection<? extends E>);
//                ArrayList obj2=new ArrayList();
//                obj2.add("pratik");
//                obj2.add(23.4f);
//                obj2.add(50);
//                obj2.add(60);

//             //    System.out.println(obj1.addAll(obj2));
//             //    System.out.println(obj1);
               

//             //   public boolean addAll(int, java.util.Collection<? extends E>);
//             System.out.println(obj1);
//             System.out.println(obj1.addAll(2,obj2));
//             System.out.println(obj1);
                  
//         //   protected void removeRange(int, int);
//             //    obj2.removeRange(2,4);
//             //    System.out.println(obj1);          
    
            
            
//         // convert arraylist to array
//             Object arr[]=obj1.toArray();

//             for(Object data : arr){
//                 System.out.print(data);
//             }
//     }

    
// }


//2]---------------------------

// import java.util.*;
// class CricketPlayer{

//     String name=null;
//     int jerNo=0;
//     CricketPlayer(String name,int jerNo){
//         this.name=name;
//         this.jerNo=jerNo;
//     }

//     public String toString(){

//         return name + " " + jerNo; 
//     }

// }

// class ArrayListDemo{

//     public static void main(String[] args) {
        
//         ArrayList obj1=new ArrayList();

//         obj1.add(new CricketPlayer("virat", 9));
//         obj1.add(new CricketPlayer("rohit", 17));
//         obj1.add(new CricketPlayer("KLRahul", 1));

//         System.out.println(obj1);

//     }
// }


//3]-------------------------------------
//1.2]Link list
//we can add a different type of data

import java.util.*;

class LinkListDemo{

    
    public static void main(String[] args) {
        
        LinkedList ll=new LinkedList();



        //   public void addFirst(E);
           ll.addFirst(23);
           ll.addFirst("vinit");
        
           //   public void addLast(E);
            ll.addLast(35.3f);

           System.out.println(ll);
        //   1]public E getFirst();
         System.out.println(ll.getFirst());

         //   2]public E getLast();
         System.out.println(ll.getLast());
//   public E removeFirst();
//   public E removeLast();

//   public boolean contains(java.lang.Object);
//   public int size();
//   public boolean add(E);
//   public boolean remove(java.lang.Object);
//   public boolean addAll(java.util.Collection<? extends E>);
//   public boolean addAll(int, java.util.Collection<? extends E>);

    }
}