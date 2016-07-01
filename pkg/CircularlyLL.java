
package pkg;


public class CircularlyLL {
    protected DNodeC cursor;
    protected int size;
    
     public CircularlyLL(){
         cursor = null;
         size = 0;
         
     }
     public int size(){
         return size;
     }
     
     public DNodeC getCursor(){
         return cursor; 
     }
     public void advance(){
         cursor = cursor.getNext();
     }
     public void retreat(){
         cursor = cursor.getPrev();
     }
     
    public void add(DNodeC node){
         if (cursor == null){
             node.setNext(node);
             node.setPrev(node);
             cursor = node;
            
         }
         else {
            /* node.setNext(cursor.getNext());
             node.setPrev(cursor.getPrev());
             node.setNext(cursor.getNext());
             cursor.getNext().setPrev(node);
             node.setPrev(cursor);
             cursor.setNext(node);*/
             
           /*  cursor.getPrev().setNext(node);
             node.setPrev(cursor.getPrev());
             node.setNext(cursor);
             cursor.setPrev(node);
             */
             
             cursor.getPrev().setNext(node);
             node.setPrev(cursor.getPrev());
             node.setNext(cursor);
             cursor.setPrev(node);
         }
         size++;
     }
     
     public DNodeC remove(){
         if (size <= 1) {
             cursor = null;
             size = 0;
             return null;
         }
         
         /*
        cursor.
         
         
         cursor.getPrev().setNext(cursor.getNext());
         cursor.getNext().setPrev(cursor.getPrev());        
                 old.setNext(null);
          old.setPrev(null);
          advance();*/
          DNodeC old = cursor.getNext();
          
        cursor.setNext(old.getNext());
         old.getNext().setPrev(cursor);
         old.setNext(null);
         old.setPrev(null);
         size--;
         return old;
                 
     }
     
     public String toString(){
         if (cursor == null){
             return "[ ]";
             
         }
         String s = "[..." + cursor.getElement();
         DNodeC old = cursor;
         for (advance(); old != cursor; advance()){
             s += ", " + cursor.getElement();
         }
         return s + "...]";
     }

 /*   void add(DNodeC node) {
       if (cursor == null){
             node.setNext(node);
             node.setPrev(node);
             cursor = node;
            
         }
         else {
             node.setNext(cursor.getNext());
             cursor.getNext().setPrev(node);
             node.setPrev(cursor);
             cursor.setNext(node);
             
         }
         size++;
    }*/
     
}
