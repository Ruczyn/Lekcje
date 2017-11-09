package main;
import java.util.Scanner;

class Main {
	
	char tab[][] = new char[3][3];
	Scanner scanner;
	
	
	public Main() {
		for(int i = 0; i < tab.length; i++)
			for(int j = 0; j < tab[i].length; j++)
			{tab[i][j] = '.';}
		scanner = new Scanner(System.in);
		
	}
			
			
	public static void main(String args[]) {
		Main m = new Main();
		m.game();
	}
	
	public void game() {
		print();
		for(int i = 0; i < 9; i++) {
			if(i % 2 == 0) ask('x');
			else ask('o');
		print();
		}
	}
	
	private void print() {
		for(char[] t : tab) {
			for(char e :t) {
				System.out.print(e);
			}
			System.out.println();
			
			}
		
		
		
	}
	
	private void ask(char c) {
		boolean good = false;
	do {
		System.out.print(c);
		System.out.print(" >> ");
		try {
		int row = scanner.nextInt();
		int col = scanner.nextInt();
			if(row > 0 && row < 4 && col > 0 && row < 4 && tab[row-1][col-1] == '.') {
				tab[row-1][col-1] = c;
				good = true;
			}else System.out.println("Błąd");
		}catch(Exception e) {
			System.out.println("Wpisz dwie liczby);
			scanner.reset();
		}
	}while (!good);
	}
	
	
	public void finalize() {
		scanner.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}