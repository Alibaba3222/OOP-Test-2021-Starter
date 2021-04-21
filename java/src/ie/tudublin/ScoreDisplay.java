	package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	String score = "DEFGABcd";
	char answer = myStr.charAt(0);
	system.out.println(answer);

	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	ArrayList<Note> notes = new ArrayList<Note>();

	void loadScore();1
    {

        int i = 0;
        while(i < score.length())
        {
            char c = score.charAt(i);
            Note n = new Note(c, 1);
            notes.add(n);
            i ++;
		
		}

	while()

	public void setup() 
	{
		
	}

	public void draw()
	{
		background(255);
		
	}

	void drawNotes()
	{
	}
}
