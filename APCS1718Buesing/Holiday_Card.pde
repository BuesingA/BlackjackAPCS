void setup()
{
size(600,600);

}

void draw()
{
  
  background sky = new background();
  sky.drawground();
  SnowFlake mySnow = new SnowFlake();
  mySnow.display(); 
}