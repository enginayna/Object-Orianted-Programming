package ArrayList;

import java.util.ArrayList;

public class Singers {
	
	private ArrayList<String> singerList = new ArrayList<String>();
	
	public Singers() {
		
	}
	public void printSingerList() {
		System.out.println("There are " + singerList.size() + " singers.");
		for (int i = 0; i < singerList.size(); i++) {
			System.out.print((i+1) + ". Singer : " + singerList.get(i) + "\n");
		}
	}
	public void addSinger(String name) {
		singerList.add(name);
		int index = singerList.indexOf(name);
		System.out.println(singerList.get(index) + " was add.");
	}
	public void changeSinger(int index, String name){
		String temp = singerList.get(index);
			singerList.set(index, name);
			System.out.println(temp + " was deleted." 
			+ singerList.get(index) + " was add.");
			
	}
	public void deleteSinger(String name) {
		singerList.remove(name);
		int index = singerList.indexOf(name);
		System.out.println(singerList.get(index) + " was deleted");
	}
	public void deleteSinger(int number) {
		String name = singerList.get(number);
		singerList.remove(name);
		System.out.println(singerList.get(number) + " was deleted");
	}
	public void searchSinger(String name) {
		int index = singerList.indexOf(name);
		
		if(index<singerList.size()) {
			singerList.get(index);
			System.out.println("Singer was find");
			System.out.println("Singer is a " + singerList.get(index));
		}
		else {
			System.out.println("Singer was not find");
		}
	}
}
