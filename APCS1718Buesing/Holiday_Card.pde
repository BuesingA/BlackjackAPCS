
SnowFlake[] snowflakes = new SnowFlake[10];

background sky = new background();

void setup()
{
 
  for(int i=0; i<snowflakes.length; i++){
    snowflakes[i] = new SnowFlake();
  }

  size(600,600);

}

void draw()
{
 sky.drawground();
  for (int i = 0; i < snowflakes.length; i++) {
    snowflakes[i].display();
  }
  //try {
  //  Thread.sleep(200L);
  //} catch (Exception e) {
  //}
}
