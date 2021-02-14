package org.lilian.katas;

public class GridDisplayer implements LifeDisplayer {

	@Override
	public void display(int[][] life, int generation) {
		System.out.println(String.format("Génération %d :", generation));
		for (int[] rows : life) {
			System.out.println(" _ _ _ _ _");
			for (int value : rows) {
				System.out.print("|");
				System.out.print(value == 1 ? "*" : " ");
			}
			System.out.println("|");
		}
		System.out.println(" _ _ _ _ _");

	}

}
