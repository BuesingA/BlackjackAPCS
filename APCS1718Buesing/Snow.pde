//SnowFlake snowFlake;
//SnowFlake[]mySnow=new SnowFlake[10];

public class SnowFlake{

  float x = (float)Math.random()*width;
  float y = (float)Math.random()*height;
  float r = (float)Math.random()*20;
  float speed=(float)(Math.random()*5)+1;
  
//  void setupsnow(){

//  snowFlake = new SnowFlake();
  
//  for(int i=0; i<mySnow.length; i++){
//    mySnow[i]=new SnowFlake();
//  }
//}



  public SnowFlake(){
  }

  public void display(){
   fill(255);
   ellipse(x, y, r, r);
   y+=speed;
   if(y > height-50){
     y = 0;
     x = (float)Math.random()*width;
   }
  }
  
//  void drawSnow(){
        
//  background(0);
//  snowFlake.display();
  
//  for(int i=0; i<mySnow.length; i++){
//    mySnow[i].display();
//  }
//}
}
