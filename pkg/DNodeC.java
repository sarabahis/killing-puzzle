
package pkg;


public class DNodeC {
    
   protected Integer element;
  protected DNodeC  prev, next;
  
  public DNodeC(int s, DNodeC p, DNodeC n) {
    element = new Integer(s);
    prev    = p;
    next    = n;
  }
  
  /** Accessor to the element of this node */
  public Integer getElement(){ return element; }
  
  /** Accessor to the next of this node */
  public DNodeC getNext(){ return next; }
  
  /** Accessor to the prev of this node */
  public DNodeC getPrev(){ return prev; }
  
  /** Setter for the element of this node */
  public void setElement(Integer s) { element = s; }
  
  /** Setter for the next of this node */
  public void setNext(DNodeC n) { next = n; }
  
  /** Setter for the prev of this node */
  public void setPrev(DNodeC p) { prev = p; }

  public String toString(){
      return element.toString();
  }
  

   
}


