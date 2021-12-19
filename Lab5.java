package Labor;
import java.util.ArrayList; 
import java.util.Iterator; 
import java.util.Scanner; 	
	public class Lab5 {
		public static void Laboratory5 (String[] args){
			Scanner in = new Scanner(System.in); 
			ArrayList<Integer>list = new ArrayList<Integer>(); 
			int inputInt; 
			int n; 
			int k; 
			System.out.print("Введите количество элементов: "); 
			k = in.nextInt(); 
			for (int i = 0; i < k; i++) { 
				System.out.print("Введите элемент: "); 
				inputInt = in.nextInt(); 
				list.add(inputInt); 
			} 
			for (int i = 0; i < list.size(); i++) { 
				System.out.print(list.get(i)+" "); 
			} 
			System.out.println("Введите число, которое нужно удалить:"); 
			n = in.nextInt(); 
			System.out.println(""); 
			Iterator iterator = list.iterator(); 
			while(iterator.hasNext()) { 
				if(iterator.next().equals(n)) { 
					iterator.remove(); 
				} 
			} 
			for (int i = 0; i < list.size(); i++) { 
				System.out.print(list.get(i)+" "); 
			}
			in.close();
		}
	}