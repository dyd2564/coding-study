package arrayInArray;

import java.util.Arrays;

public class ArrayInArrayExample2 {
	public static void main(String[] args) {
		
		String[][] players = {
				{"±Ë¡¯ºˆ", "±Ëøµ±«", "±ËπŒ¿Á", "»´√∂"}, // 0
				{"¿Ã¿Áº∫", "»≤¿Œπ¸", "±«√¢»∆"},		 // 1
				{"¿Ãµø∞Ê", "º’»ÔπŒ"}, 				 // 2
				{"»≤¿«¡∂"}						 // 3
		};
		System.out.println(players.length);		 // 4
		System.out.println(players[0].length);   // 4
		System.out.println(players[1].length);   // 3
		System.out.println(players[2].length);   // 2
		System.out.println(players[2].length);   // 1
		
		String[] wing = players[2];
		System.out.println(Arrays.toString(wing)); // ¿Ãµø∞Ê, º’»ÔπŒ
		System.out.println(players[1][2]); // ±«√¢»∆
		System.out.println("==============±∏∫–º±==============");
		System.out.println(Arrays.deepToString(players));
		
		System.out.println("==============±∏∫–º±==============");
		
		for (int i = 0; i < players.length; i++) {
			for (int j = 0; j < players[i].length; j++) {
				System.out.print(players[i][j] + " ");
			}System.out.println();
		}
	}
}
