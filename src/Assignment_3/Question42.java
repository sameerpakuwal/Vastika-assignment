package Assignment_3;

public class Question42 {

	
	public static void main(String[] args) {
		String  Lines = "Hello I am Yash shrestha. I live in australia, kingsland. I am 5 years old, i like to play football. ";
		Lines = Lines.toLowerCase();
		int counter =0;
		String [] words = Lines.split(" ");
		words = Lines.split(" ");
		for (int i = 0; i < words.length-1; i++) {
			counter =1;
			for (int j = 0; j < i; j++) {
				if((words[j]).equalsIgnoreCase(words[i])) {
					
					counter++;
					words[j] = "0";
				}
			}
			
			if ((counter>1)&& words[i] !="0") {
				System.out.println("The duplicate word is "+words[i]);
			}
		}

	}

}
