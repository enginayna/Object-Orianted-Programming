package PolimorphismSimple;

public class TestHuman {
public static void main(String[] args) {
	Human human = new Human();
	Turkish turk = new Turkish();
	System.out.println(human.toString());
	System.out.println();
	System.out.println(turk.toString());
}
}
