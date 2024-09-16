package com.exam.model;

import java.util.random.*;
import java.util.Random;

public class lista {
	private int id;
	private Random rnd;
	private int listaNum[];
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRnd() {
		return rnd.nextInt(0,50000);
	}
	public void setRnd(Random rnd) {
		this.rnd = rnd;
	}
	public int[] getListaNum() {
		return listaNum;
	}
	public void setListaNum(int[] listaNum) {
		this.listaNum = listaNum;
	}
	
	public void Generador() {
		int num = getRnd();
		for(int i=0; i<5 ; i++) {
			listaNum[i]=num;
		}
	}
}
