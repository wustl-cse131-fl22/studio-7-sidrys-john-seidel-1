package studio7;

public class Die {


private int n  ; 
//private int randomNumber ; 

public Die(int n){
	this.n = n;
}
public int Num (int n) {
int randomNumber = (int)(Math.random()* n) + 1;
return randomNumber;
}
}
