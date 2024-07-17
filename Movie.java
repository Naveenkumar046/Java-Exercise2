import java.util.*;

public class Movie{
private String title;
private String studio;
private String rating;

public Movie(String title, String studio, String rating){
this.title = title;
this.studio = studio;
this.rating = rating;
}

public Movie(String title, String studio){
this.title = title;
this.studio = studio;
this.rating = "PG";
}

public static Movie[] getPG(Movie[] arr){
int count=0;
for(int i=0;i<arr.length;i++){
if(arr[i].rating.equals("PG")){
count++;
}
}
Movie[] arr2 = new Movie[count];
int index=0;
for(int i=0;i<arr.length;i++){
if(arr[i].rating.equals("PG")){
arr2[index]=arr[i];
index++;
}
}
return arr2;
}

 public static void main(String[] args){
Movie obj1 = new Movie("Casino Royale", "Eon Production", "PG-13");
Movie[] arr2 = new Movie[3];
arr2[0] = new Movie("VIP","AVM Productions","PG");
arr2[1] = new Movie("VIP 2","LLK Productions", "RK");
arr2[2] = new Movie("Leo","KH11 Productions","PG");
Movie[] arr3 = getPG(arr2);
for(Movie k:arr3){
System.out.println(k.title+" - "+k.studio);
}
}


}