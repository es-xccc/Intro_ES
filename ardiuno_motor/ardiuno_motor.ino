int motorIn1 = 4;
int motorIn2 = 5;
int EnableA = 2;
int val;

void setup() {
  // put your setup code here, to run once:
Serial.begin(9600);
pinMode(motorIn1,OUTPUT);
pinMode(motorIn2,OUTPUT);
pinMode(EnableA,OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
val=Serial.read();
if(val=='F')
{
  analogWrite(EnableA,250);
  digitalWrite(motorIn1,HIGH);
  digitalWrite(motorIn2,LOW);

 
}
if(val=='B')
{
  analogWrite(EnableA,250);
  digitalWrite(motorIn1,LOW);
  digitalWrite(motorIn2,HIGH);
 
}
if(val=='S'){
analogWrite(EnableA,250);
digitalWrite(motorIn1,LOW);
digitalWrite(motorIn2,LOW);
}
  
}
