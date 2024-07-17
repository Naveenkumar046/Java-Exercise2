import java.util.*;
public class Holiday1{
  public static void main(String[] args){
    Holiday obj1=new Holiday("Independance Day",10,"August");
    Holiday obj2=new Holiday("Diwali",10,"october");
   Holiday arr[]={obj1,obj2};
  
    System.out.println("Month: "+obj1.getMonth());
     System.out.println("Equal or not : "+obj1.inSameMonth(obj2));
 System.out.println("avg: "+Holiday.avgDate(arr));
  
   

}


}

class Holiday{
  private String name;
  private int day;
  private String month;

 public Holiday(String name,int day,String month){
  this.name=name;
  this.day=day;
  this.month=month;

} 

public void setName(String name){
  this.name=name;
}
public String getName(){
   return name;
}


public void setDay(int day){
  this.day=day;
}
public int getDay(){
   return day;
}


public void setMonth(String month){
  this.month=month;
}
public String getMonth(){
   return month;
}


public boolean inSameMonth(Holiday a){

    return month.equals(a.month);

}
 
public static double avgDate(Holiday[] arr){
 int sum=0;
 for(int i=0;i<arr.length;i++){
  sum+=arr[i].day;

  }

 return (double) sum/arr.length;
}




}