package pkg;

/**
 *
 * 
 */
import java.util.*;

public class Puzzle{
public static void main(String[] args){
CircularlyLL l = create(20);

killR(l); 
System.out.println((l.getCursor()).toString());
}

static CircularlyLL create(int numPpl){
    CircularlyLL list = new CircularlyLL();
for(int i = 1; i<=numPpl; i++){
    DNodeC d = new DNodeC(i, null, null);
list.add(d);
}
return list;
}

static void killR(CircularlyLL list){
for(int i = 1; i < list.size(); i++){
  
    list.remove();
     list.advance();
     
}
    if (list.size() == 1){
    return;}
    
    else killR(list);
}

    

}