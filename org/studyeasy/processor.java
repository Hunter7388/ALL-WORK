package org.studyeasy;

public class processor {
	private String brand;
	private String series;
	private int generation;
	private int cores;
	private int thread;
	private String cacheMemory;
	private String frequency;
	private String Minfrequency;
	private String Maxfrequency;
	public processor() {
		
		this.brand = "intel";
		this.series = "yu7hh";
		this.generation = 5;
		this.cores = 2;
		this.thread = 4;
		this.cacheMemory = "3mb";
		this.frequency = "3.5ghz";
		Minfrequency = "3.5ghz";
		Maxfrequency = "3.5";
	}
	public processor(String brand, String series, int generation, int cores, int thread, String cacheMemory,
			String frequency, String minfrequency, String maxfrequency) {
		
		this.brand = brand;
		this.series = series;
		this.generation = generation;
		this.cores = cores;
		this.thread = thread;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
		Minfrequency = minfrequency;
		Maxfrequency = maxfrequency;
	}
	@Override
	public String toString() {
		return "processor [brand=" + brand + ", series=" + series + ", generation=" + generation + ", cores=" + cores
				+ ", thread=" + thread + ", cacheMemory=" + cacheMemory + ", frequency=" + frequency + ", Minfrequency="
				+ Minfrequency + ", Maxfrequency=" + Maxfrequency + "]";
	}
	public String getBrand() {
		return brand;
	}
	public String getSeries() {
		return series;
	}
	public int getGeneration() {
		return generation;
	}
	public int getCores() {
		return cores;
	}
	public int getThread() {
		return thread;
	}
	public String getCacheMemory() {
		return cacheMemory;
	}
	public String getFrequency() {
		return frequency;
	}
	public String getMinfrequency() {
		return Minfrequency;
	}
	public String getMaxfrequency() {
		return Maxfrequency;
	}
	
	
	
	}

