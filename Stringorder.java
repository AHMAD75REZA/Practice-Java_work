class Stringorder{
	static String name[] = {"Madras", "Dehli", "Ahmedabad", "calcutta", "Bombay"};
		public static void main(String args[]){
			int size = name.length;
			string temp = null;
			for ( int i=0; i<size; i++ ){
				for(int j=i+1; j<size; j++)
				
				if(name[j].compareTo(name[i])<0){
				//swap the strings
				temp = name[i];
				name[i] = name[j];
				name[j] = temp;
				}
			}
		}
		for (int i = 0; i<size; i++){
			System.out.println(name[i]);
		}
	}
}