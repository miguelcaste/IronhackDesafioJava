package control;

public class Main {
	// Desaf�o 1: Encuentra el m�ximo
	public static Integer maximum(int[] numList) {
		// TODO Auto-generated method stub
		Integer maximum=numList[0];
		  for(int i=0; i < numList.length; i++){
		    if(numList[i] > maximum){
		    maximum = numList[i];
		    }
		  }
		    return(maximum);

	}

	// Desaf�o 2: Imprimir N�mero en Letras
	// Dos formas de hacerlo
	// Switch y If
	// Creo que deb�a de devolver String pero ser�a con return
	public static void printNumberInWord(int num) {
		switch (num) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 7:
			System.out.println("SEVEN");
			break;
		case 8:
			System.out.println("EIGTH");
			break;
		case 9:
			System.out.println("NINE");
			break;
		default:
			System.out.println("OTHER");
			break;
		}
		
//		if(num==1) {
//			System.out.println("ONE");
//		}
//		else {
//			if(num==2) {
//				System.out.println("TWO");
//			}
//			else {
//				if(num==3) {
//					System.out.println("THREE");				
//				}
//				else {
//					if(num==4) {
//						System.out.println("FOUR");
//					}
//					else {
//						if(num==5) {
//							System.out.println("FIVE");
//						}
//						else {
//							if(num==6) {
//								System.out.println("SIX");				
//							}
//							else {
//								if(num==7) {
//									System.out.println("SEVEN");
//								}
//								else {
//									if(num==8) {
//										System.out.println("EIGTH");
//									}
//									else {
//										if(num==9) {
//											System.out.println("NINE");				
//										}
//										else {
//											System.out.println("OTHER");
//										}
//									}
//									
//								}
//							}
//						}
//						
//					}
//				}
//			}
//		}
				
	}
	
	// Desaf�o 3: Comprobar Par/Impar
	public static void checkOddEven (int num) {
		if(num%2==1) {// Odd Number
			System.out.println("Odd Number");
		}
		else {//Even Number
			System.out.println("Even Number");
		}
	}
	
	
	
	// Desaf�o 4: Calcula la media
	public static double average (Integer[] numList) {
		int sum=0;
		
		for (int i = 0; i < numList.length; i++) {
			sum+=numList[i];
		}
		double average=((double)sum)/numList.length;
		return average;
	}
	
	
	
	public static void main(String[] args) {
		// Desaf�o 1: Encuentra el m�ximo
//		int[] numberList = {3, 63, 17, 29};
		//System.out.println("Maximun of the list is:�"+maximum(numberList));

		// Desaf�o 2: Imprimir N�mero en Letras (faltaria hacerlo con return)
//		int i=4;
//		printNumberInWord(i);
		
		// Desaf�o 3: Comprobar Par/Impar
		int i=3;
		checkOddEven(i);
		
		// Desaf�o 4: Calcula la media
//		Integer[] numberList = {1, 2, 3, 4};
//		System.out.println("The average is "+average(numberList));   
		   
		   
		   
	}



}
