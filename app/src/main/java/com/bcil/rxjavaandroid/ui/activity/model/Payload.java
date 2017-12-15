package com.bcil.rxjavaandroid.ui.activity.model;

import com.google.gson.annotations.SerializedName;

public class Payload{

	@SerializedName("forkee")
	private Forkee forkee;

	public void setForkee(Forkee forkee){
		this.forkee = forkee;
	}

	public Forkee getForkee(){
		return forkee;
	}

	@Override
 	public String toString(){
		return 
			"Payload{" + 
			"forkee = '" + forkee + '\'' + 
			"}";
		}
}