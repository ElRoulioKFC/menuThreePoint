package menuThreePoint;

public class CharCreator {
private char c;
private double x;
private double y;
private Boolean lower;

private CharCreator(char c,double x, double y,Boolean lower) {
	this.c = c;
	this.x = x;
	this.y = y;
	this.lower = lower;
}
public static CharCreator getChar(int i) {//get a ~ size of each ASCII character ...some are coming soon
	switch(i) {
	case 32 :
		return new CharCreator(' ',0.7,1.0,false);
	case 65 :
		return new CharCreator('A',1.2,1.5,false);
	case 66 :
		return new CharCreator('B',0.9,1.5,false);
	case 67 :
		return new CharCreator('C',1.2,1.5,false);
	case 68 :
		return new CharCreator('D',1.3,1.5,false);
	case 69 :
		return new CharCreator('E',0.8,1.5,false);
	case 70 :
		return new CharCreator('F',0.8,1.5,false);
	case 71 :
		return new CharCreator('G',1.2,1.5,false);
	case 72 :
		return new CharCreator('H',1.1,1.5,false);
	case 73 :
		return new CharCreator('I',0.3,1.5,false);
	case 74 :
		return new CharCreator('J',0.4,1.5,true);
	case 75 :
		return new CharCreator('K',1.0,1.5,false);
	case 76 :
		return new CharCreator('L',1.0,1.5,false);
	case 77 :
		return new CharCreator('M',1.5,1.5,false);
	case 78 :
		return new CharCreator('N',1.2,1.5,false);
	case 79 :
		return new CharCreator('O',1.3,1.5,false);
	case 80 :
		return new CharCreator('P',1.0,1.5,false);
	case 81 :
		return new CharCreator('Q',1.4,1.5,true);
	case 82 :
		return new CharCreator('R',1.1,1.5,false);
	case 83 :
		return new CharCreator('S',0.9,1.5,false);
	case 84 :
		return new CharCreator('T',1.3,1.5,false);
	case 85 :
		return new CharCreator('U',1.1,1.5,false);
	case 86 :
		return new CharCreator('V',1.3,1.5,false);
	case 87 :
		return new CharCreator('W',1.6,1.5,false);
	case 88 :
		return new CharCreator('X',1.2,1.5,false);
	case 89 :
		return new CharCreator('Y',1.2,1.5,false);
	case 90 :
		return new CharCreator('Z',1.0,1.5,false);
		
		
	case 97 :
		return new CharCreator('a',1.0,1.0,false);
	case 98 :
		return new CharCreator('b',1.1,1.5,false);
	case 99 :
		return new CharCreator('c',0.9,1.0,false);
	case 100 :
		return new CharCreator('d',1.0,1.5,false);
	case 101 :
		return new CharCreator('e',0.9,1.0,false);
	case 102 :
		return new CharCreator('f',0.4,1.5,false);
	case 103 :
		return new CharCreator('g',0.9,1.0,true);
	case 104 :
		return new CharCreator('h',0.9,1.6,false);
	case 105 :
		return new CharCreator('i',0.3,1.4,false);
	case 106 :
		return new CharCreator('j',0.4,1.5,true);
	case 107 :
		return new CharCreator('k',0.9,1.6,false);
	case 108 :
		return new CharCreator('l',0.3,1.5,false);
	case 109 :
		return new CharCreator('m',1.6,1.0,false);
	case 110 :
		return new CharCreator('n',0.9,1.0,false);
	case 111 :
		return new CharCreator('o',1.0,1.0,false);
	case 112 :
		return new CharCreator('p',1.0,1.0,true);
	case 113 :
		return new CharCreator('q',1.0,1.0,true);
	case 114 :
		return new CharCreator('r',0.4,1.0,false);
	case 115 :
		return new CharCreator('s',0.8,1.0,false);
	case 116 :
		return new CharCreator('t',0.4,1.2,false);
	case 117 :
		return new CharCreator('u',1.0,1.0,false);
	case 118 :
		return new CharCreator('v',1.1,1.0,false);
	case 119 :
		return new CharCreator('w',1.5,1.0,false);
	case 120 :
		return new CharCreator('x',1.0,1.0,false);
	case 121 :
		return new CharCreator('y',1.0,1.0,true);
	case 122 :
		return new CharCreator('z',1.0,1.0,false);	
	default:
		return new CharCreator('?',1.0,1.0,false);
	}
}


}
