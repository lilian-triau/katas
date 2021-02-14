package org.lilian.katas;

import java.util.Arrays;

public class FlatDisplayer implements LifeDisplayer {

	@Override
	public void display(int[][] life, int generation) {
		System.out.println(String.format("Génération %d :\n%s", generation, Arrays.deepToString(life)));
	}

}
