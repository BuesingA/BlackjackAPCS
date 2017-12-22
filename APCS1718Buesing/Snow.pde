SnowFlake snowFlake;
SnowFlake[]mySnow=new SnowFlake[10];
void setupsnow(){

  snowFlake = new SnowFlake();
  
  for(int i=0; i<mySnow.length; i++){
    mySnow[i]=new SnowFlake();
  }
}

void drawsnow(){
  
  background(0);
  snowFlake.display();
  
  for(int i=0; i<mySnow.length; i++){
    mySnow[i].display();
  }
}
public class SnowFlake{

  float x = (float)Math.random()*width;
  float y = (float)Math.random()*height;
  float r = (float)Math.random()*20;
  float speed=(float)(Math.random()*5)+1;
  
  public SnowFlake(){
  }

  public void display(){
   fill(255);
   ellipse(x, y, r, r);
   y+=speed;
   if(y > height){
     y = 0;
     x = (float)Math.random()*width;
   }
  }
}